import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class reservation_add extends HttpServlet {
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
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		// webブラウザのFormからパラメータを取得
		String titleStr = req.getParameter("title");
		String nameStr = req.getParameter("name");
		String explanStr = req.getParameter("explan");
		try {
			// MySQL Driver ローディング
			Class.forName(DRIVER);
			// MySQL への接続
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			// SQL 格納
			// stmt
			// =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			stmt = con.createStatement();
			// SQL 実行 顧客クエリー検索

			StringBuffer query = new StringBuffer();

			// 検索結果 表示
			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
			sb.append("<head><title>テンプレート登録</title></head>");
			sb.append("<body bgcolor='#ffffff'>");
			sb.append("");
			sb.append("<center>");
			sb.append("<CAPTION><FONT SIZE='+3'COLOR='#0000FF'>");
			sb.append("<B>");
			sb.append("＜＜テンプレート登録 ＞＞");
			sb.append("</B></FONT></CAPTION>");
			sb.append("<BR><BR><BR>");

			// SQL 実行 名簿テーブル追加
			query = new StringBuffer();
			query.append("INSERT INTO temp_tbl");
			query.append("(user_id,temp_title,temp_name,temp_view)");
			query.append(" VALUES('");
			query.append(1);
			query.append("','");
			query.append(titleStr);
			query.append("','");
			query.append(nameStr);
			query.append("','");
			query.append(explanStr);
			query.append("')");
			stmt.executeUpdate(query.toString());
			sb.append("<center><h1>");
			sb.append("追加完了しました。");
			sb.append("</h1>");

			sb.append("</center><br><br>");
			sb.append("<HR><A HREF='/JV27/class_insert.html'>");
			sb.append("テンプレートに戻る ");
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