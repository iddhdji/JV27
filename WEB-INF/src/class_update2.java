import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_update2 extends HttpServlet {
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

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");

		// webブラウザのFormからパラメータを取得
		String gakusekiStr = req.getParameter("GAKUSEKI");

		try {
			// MySQL Driver ローディング
			Class.forName(DRIVER);
			// MySQL への接続
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			// SQL 格納
			stmt = con.createStatement();

			// SQL 実行
			StringBuffer query = new StringBuffer();
			query.append("select * FROM class_table WHERE gakuseki_no ='");
			query.append(gakusekiStr);
			query.append("'");
			ResultSet rs = stmt.executeQuery(query.toString());

			// 検索結果取得
			String cla_name, syussekiStr, simei_1Str, simei_2Str, kana_1Str, kana_2Str, umareStr;
			while (rs.next()) {
				cla_name = rs.getString("class_no");
				syussekiStr = rs.getString("syusseki_no");
				gakusekiStr = rs.getString("gakuseki_no");
				simei_1Str = rs.getString("simei_1");
				simei_2Str = rs.getString("simei_2");
				kana_1Str = rs.getString("kana_1");
				kana_2Str = rs.getString("kana_2");
				umareStr = rs.getString("umare");
				// 入力データの変換
				req.setAttribute("class", cla_name);
				req.setAttribute("syusseki", syussekiStr);
				req.setAttribute("gakuseki", gakusekiStr);
				req.setAttribute("simei_1", simei_1Str);
				req.setAttribute("simei_2", simei_2Str);
				req.setAttribute("kana_1", kana_1Str);
				req.setAttribute("kana_2", kana_2Str);
				req.setAttribute("umare", umareStr);

			}

			ServletContext sc = getServletContext();
			sc.getRequestDispatcher("/class_update.jsp").forward(req, res);

			// 切断
			stmt.close();
			con.close();
		}
		// 例外処理
		catch (SQLException ex) {
			PrintWriter out;
			res.setContentType("text/html;charset=UTF-8");
			out = res.getWriter();
			out.println(" --- SQL Exception --" + "<BR>");
			out.println("Message : " + "<BR>");
			while (ex != null) {
				out.println(ex.getMessage() + "<BR>");
				ex = ex.getNextException();
			}
		} catch (Exception ex) {
			PrintWriter out;
			res.setContentType("text/html;charset=UTF-8");
			out = res.getWriter();
			ex.printStackTrace(out);
		}
	}
}
