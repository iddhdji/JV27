import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_update3 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		/**
		 * ＤＢ：ＵＲＬ
		 */
		final String URL = "jdbc:mysql://localhost/nhs90534db?useUnicode=true&characterEncoding=UTF-8";
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

		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		// webブラウザのFormからパラメータを取得
		String classStr = req.getParameter("CLASS_NO");
		String syussekiStr = req.getParameter("SYUSSEKI");
		String gakusekiStr = req.getParameter("GAKUSEKI");
		String simei_1Str = req.getParameter("SIMEI_1");
		String simei_2Str = req.getParameter("SIMEI_2");
		String kana_1Str = req.getParameter("KANA_1");
		String kana_2Str = req.getParameter("KANA_2");
		String umareStr = req.getParameter("UMARE");
		try {
			// MySQL Driver ローディング
			Class.forName(DRIVER);
			// MySQL への接続
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			// SQL 格納
			stmt = con.createStatement();

			// SQL 実行 名簿テーブル更新
			StringBuffer query = new StringBuffer();
			query.append("UPDATE class_table SET class_no = '");
			query.append(classStr);
			query.append("',syusseki_no = '");
			query.append(syussekiStr);
			query.append("',simei_1 = '");
			query.append(simei_1Str);
			query.append("',simei_2 = '");
			query.append(simei_2Str);
			query.append("',kana_1 = '");
			query.append(kana_1Str);
			query.append("',kana_2 = '");
			query.append(kana_2Str);
			query.append("',umare = '");
			query.append(umareStr);
			query.append("' WHERE gakuseki_no = '");
			query.append(gakusekiStr);
			query.append("'");
			stmt.executeUpdate(query.toString());

			// 更新結果 表示
			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
			sb.append("<head><title>名簿変更</title></head>");
			sb.append("<body bgcolor='#ffffff'>");
			sb.append("update3.java");
			sb.append("<center>");
			sb.append("<CAPTION><FONT SIZE='+3'COLOR='#0000FF'>");
			sb.append("<B>");
			sb.append("＜＜名簿変更 ＞＞");
			sb.append("</B></FONT></CAPTION>");
			sb.append("<BR><BR><BR>");
			sb.append("<h1>");
			sb.append("名簿変更完了しました。");
			sb.append("</h1>");
			sb.append("</center><br><br>");
			sb.append("<HR><A HREF='/JV27/update.html'>");
			sb.append("名簿変更に戻る");
			sb.append("</A>");
			sb.append("<A HREF='/JV27/meibo.html'>");
			sb.append("ホームへ戻る");
			sb.append("</A>");
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