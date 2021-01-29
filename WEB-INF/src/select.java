import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class select extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		/**
		 * ＤＢ：ＵＲＬ
		 */
		final String URL =

		"jdbc:mysql://localhost/nhs90534db?useUnicode=true&characterEncoding=UTF-8";
		/**
		 * ＤＢ：ユーザ
		 */
		final String USER = "root";
		/**
		 * ＤＢ：パスワード
		 */
		final String PASSWORD = "";
		/**
		 * ＤＢ：ドライバ
		 */
		final String DRIVER = "org.gjt.mm.mysql.Driver";

		Connection con = null;
		Statement stmt = null;
		String home_tel, simei, seibetu, ketueki, umare, k_tel, info;
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		// webブラウザのFormからパラメータを取得
		String kubunStr = req.getParameter("KUBUN");

		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head><title>名簿検索</title></head>");
		sb.append("<body bgcolor='#ffffff'>");
		sb.append("select.java");
		sb.append("<center>");
		sb.append("<CAPTION><FONT SIZE='+3' COLOR='#0000FF'>");
		sb.append("<B>");
		sb.append("＜ ＜ 名簿検索 ＞ ＞");
		sb.append("</B></FONT></CAPTION>");
		sb.append("<BR><BR><BR>");
		sb.append(" <font size='+2' color='deeppink'>");
		if (kubunStr.equals("0")) {
			sb.append("学校関係");
		} else {
			if (kubunStr.equals("1")) {
				sb.append("バイト関係");
			} else {
				if (kubunStr.equals("2")) {
					sb.append("その他");
				}
			}
		}
		sb.append(" </font>");
		sb.append("<br><br>");
		sb.append("<table border='1' bordercolor='darkblue'>");
		sb.append(" <tr>");
		sb.append(" <td bgcolor='darkblue'>");
		sb.append(" <font color='white'>");
		sb.append("氏名");
		sb.append(" </font>");
		sb.append(" </td>");
		sb.append(" <td bgcolor='darkblue'>");
		sb.append(" <font color='white'>");
		sb.append("性別");
		sb.append(" </font>");
		sb.append(" </td>");
		sb.append(" <td bgcolor='darkblue'>");
		sb.append(" <font color='white'>");
		sb.append("血液型");
		sb.append(" </font>");
		sb.append(" </td>");
		sb.append(" <td bgcolor='darkblue'>");
		sb.append(" <font color='white'>");
		sb.append("生年月日");
		sb.append(" </font>");
		sb.append(" </td>");
		sb.append(" <td bgcolor='darkblue'>");
		sb.append(" <font color='white'>");
		sb.append("自宅Tel");
		sb.append(" </font>");
		sb.append(" </td>");
		sb.append(" <td bgcolor='darkblue'>");
		sb.append(" <font color='white'>");
		sb.append("携帯Tel");
		sb.append(" </font>");
		sb.append(" </td>");
		sb.append(" <td bgcolor='darkblue'>");
		sb.append(" <font color='white'>");
		sb.append("コメント");
		sb.append(" </font>");
		sb.append(" </td>");
		sb.append(" </tr>");

		try {
			// MySQL Driver ローディング
			Class.forName(DRIVER);
			// MySQL への接続
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			// SQL 格納
			stmt = con.createStatement();
			// SQL 実行
			StringBuffer query = new StringBuffer();
			query.append(" SELECT * FROM meibo_table WHERE kubun = '");
			query.append(kubunStr);
			query.append("' ORDER BY umare");
			ResultSet rs = stmt.executeQuery(query.toString());

			// 検索結果 取得
			while (rs.next()) {
				home_tel = rs.getString("home_tel");
				simei = rs.getString("simei");
				seibetu = rs.getString("seibetu");
				ketueki = rs.getString("ketueki");
				umare = rs.getString("umare");
				k_tel = rs.getString("k_tel");
				info = rs.getString("info");

				sb.append(" <tr>");
				sb.append(" <td>");
				sb.append(simei);
				sb.append(" </td>");
				sb.append(" <td>");
				if (seibetu.equals("1")) {
					sb.append("男性");
				} else {
					sb.append("女性");
				}
				sb.append(" </td>");
				sb.append(" <td>");
				sb.append(ketueki);
				sb.append(" </td>");
				sb.append(" <td>");
				sb.append(umare);
				sb.append(" </td>");
				sb.append(" <td>");
				sb.append(home_tel);
				sb.append(" </td>");
				sb.append(" <td>");
				sb.append(k_tel);
				sb.append(" </td>");
				sb.append(" <td>");
				sb.append(info);
				sb.append(" </td>");
				sb.append(" </tr>");
			}
			sb.append("</table><br>");
			sb.append("</center><br><br>");
			sb.append("<HR><A HREF='/JV27/select.html'>");
			sb.append("名簿検索に戻る");
			sb.append("</A> ");
			sb.append("<A HREF='/JV27/meibo.html'>");
			sb.append("ホームへ戻る");
			sb.append("</A> ");
			sb.append("</body>");
			sb.append("</html>");
			out.println(sb.toString());
			// 切断
			stmt.close();
			con.close();
		}
		// 例外処理
		catch (SQLException ex) {
			out.println(" --- SQL Exception --" + "<BR>");
			out.println("Message : " + "<BR>");
			while (ex != null) {
				out.println(ex.getMessage() + "<BR>");
				ex = ex.getNextException();
			}
		} catch (Exception ex) {
			ex.printStackTrace(out);
		}
	}
}
