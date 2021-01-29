import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class delete2 extends HttpServlet {
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
		String syussekiStr = req.getParameter("SYUSSEKI");

		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head><title>名簿削除</title></head>");
		sb.append("<body bgcolor='#ffffff'>");
		sb.append("delete2.java");
		sb.append("<center>");
		sb.append("<CAPTION><FONT SIZE='+3' COLOR='#0000FF'>");
		sb.append("<B>");
		sb.append("＜＜ 名簿削除 ＞＞");
		sb.append("</B></FONT></CAPTION>");
		sb.append("<BR><BR><BR>");
		try {
			// MySQL Driver ローディング
			Class.forName(DRIVER);
			// MySQL への接続
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			// SQL 格納
			stmt = con.createStatement();

			// SQL 実行 名簿テーブル・レコード削除
			StringBuffer query = new StringBuffer();
			query.append("DELETE FROM class_table WHERE syusseki_no ='");
			query.append(syussekiStr);
			query.append("'");
			stmt.executeUpdate(query.toString());
			sb.append("<h1>");
			sb.append("名簿削除完了しました。");
			sb.append("</h1>");
			sb.append("</center><br><br>");
			sb.append("<HR><A HREF='/JV27/delete.html'>");
			sb.append("名簿削除に戻る");
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