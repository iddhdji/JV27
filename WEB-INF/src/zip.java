import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;

public class zip extends HttpServlet {
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

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");

		PrintWriter out;
		out = res.getWriter();

		// webブラウザのFormからパラメータを取得
		String paramStr = req.getParameter("param");
		String zipStr = req.getParameter("zip_no");
		String zip_addresStr = req.getParameter("zip_address");

		// レスポンス用CSV
		StringBuffer res_csv = new StringBuffer();

		// ヒットフラグ
		int hit_flg = 0;
		try {
			// MySQL Driver ローディング
			Class.forName(DRIVER);
			// MySQL への接続
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			// SQL 格納
			stmt = con.createStatement();
			// SQL 実行
			StringBuffer query = new StringBuffer();
			query.append(" SELECT * FROM zip_table WHERE zip_no = '");
			query.append(zipStr);
			query.append("'");
			ResultSet rs = stmt.executeQuery(query.toString());
			Cookie[] cookies = req.getCookies();
			while (rs.next()) {
				zipStr = rs.getString("zip_no");
				zip_addresStr = rs.getString("zip_address");

			} // 書き込み処理
			out.println(zip_addresStr);
		}

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