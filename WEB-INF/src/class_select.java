import java.sql.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_select extends HttpServlet {
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
		String syussekiStr, gakusekiStr, simei_1Str, simei_2Str, kana_1Str, kana_2Str, umareStr, cla_name;
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		// webブラウザのFormからパラメータを取得
		String selectStr = req.getParameter("SELECT_ID");
		String classStr = req.getParameter("CLASS_NO");
		String gakunenStr = req.getParameter("GAKUNEN_NO");
		String teacherStr = req.getParameter("TEACHER_NO");
		String simeiStr = req.getParameter("SIMEI");

		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head><title>クラス名簿検索</title></head>");
		sb.append("<body bgcolor='#ffffff'>");
		sb.append("select.java");
		sb.append("<center>");
		sb.append("<CAPTION><FONT SIZE='+3' COLOR='#0000FF'>");
		sb.append("<B>");
		sb.append("＜ ＜ クラス名簿検索 ＞ ＞");
		sb.append("</B></FONT></CAPTION>");
		sb.append("<BR><BR><BR>");
		sb.append("検索結果　クラス:");
		sb.append(" <font size='+2' color='deeppink'>");
		if (selectStr.equals("1")) {
			sb.append(classStr);
			// if (kubunStr.equals("0")) {
			// sb.append("学校関係");
			// } else {
			// if (kubunStr.equals("1")) {
			// sb.append("バイト関係");
			// } else {
			// if (kubunStr.equals("2")) {
			// sb.append("その他");
			// }
			// }
			// }
			sb.append(" </font>");
			sb.append("<br><br>");
			sb.append("<table border='1' bordercolor='darkblue'>");
			sb.append(" <tr>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("出席");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("学籍");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("氏名（性）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("氏名（名）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("カナ（性）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("カナ（名）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("生年月日");
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
				query.append(" SELECT * FROM class_table WHERE class_no = '");
				query.append(classStr);
				query.append("' ORDER BY syusseki_no");
				ResultSet rs = stmt.executeQuery(query.toString());

				// 検索結果 取得
				while (rs.next()) {
					syussekiStr = rs.getString("syusseki_no");
					gakusekiStr = rs.getString("gakuseki_no");
					simei_1Str = rs.getString("simei_1");
					simei_2Str = rs.getString("simei_2");
					kana_1Str = rs.getString("kana_1");
					kana_2Str = rs.getString("kana_2");
					umareStr = rs.getString("umare");

					sb.append(" <tr>");
					sb.append(" <td>");
					sb.append(syussekiStr);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(gakusekiStr);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(simei_1Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(simei_2Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(kana_1Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(kana_2Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(umareStr);
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

			// ここから学年を選択した場合

		} else if (selectStr.equals("2")) {
			sb.append(gakunenStr);
			sb.append("年");
			// if (kubunStr.equals("0")) {
			// sb.append("学校関係");
			// } else {
			// if (kubunStr.equals("1")) {
			// sb.append("バイト関係");
			// } else {
			// if (kubunStr.equals("2")) {
			// sb.append("その他");
			// }
			// }
			// }
			sb.append(" </font>");
			sb.append("<br><br>");
			sb.append("<table border='1' bordercolor='darkblue'>");
			sb.append(" <tr>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("クラス");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("出席");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("学籍");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("氏名（性）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("氏名（名）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("カナ（性）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("カナ（名）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("生年月日");
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
				query.append(" SELECT * FROM class_table WHERE class_no like '___");
				query.append(gakunenStr);
				query.append("____' ORDER BY class_no,syusseki_no");
				ResultSet rs = stmt.executeQuery(query.toString());

				// 検索結果 取得
				while (rs.next()) {
					cla_name = rs.getString("class_no");
					syussekiStr = rs.getString("syusseki_no");
					gakusekiStr = rs.getString("gakuseki_no");
					simei_1Str = rs.getString("simei_1");
					simei_2Str = rs.getString("simei_2");
					kana_1Str = rs.getString("kana_1");
					kana_2Str = rs.getString("kana_2");
					umareStr = rs.getString("umare");

					sb.append(" <tr>");
					sb.append(" <td>");
					sb.append(cla_name);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(syussekiStr);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(gakusekiStr);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(simei_1Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(simei_2Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(kana_1Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(kana_2Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(umareStr);
					sb.append(" </td>");
					sb.append(" </tr>");
					;
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

			// ここから担任を選択した場合

		} else if (selectStr.equals("3")) {
			sb.append(teacherStr);
			// if (kubunStr.equals("0")) {
			// sb.append("学校関係");
			// } else {
			// if (kubunStr.equals("1")) {
			// sb.append("バイト関係");
			// } else {
			// if (kubunStr.equals("2")) {
			// sb.append("その他");
			// }
			// }
			// }
			sb.append(" </font>");
			sb.append("<br><br>");
			sb.append("<table border='1' bordercolor='darkblue'>");
			sb.append(" <tr>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("クラス");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("出席");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("学籍");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("氏名（性）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("氏名（名）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("カナ（性）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("カナ（名）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("生年月日");
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
				query.append("SELECT * FROM class_table WHERE class_no = ANY (");
				query.append("SELECT class_no FROM tannin_table WHERE teacher_no = ANY (");
				query.append("SELECT teacher_no FROM teacher_table WHERE CONCAT(simei_1,simei_2) = '");
				query.append(teacherStr);
				query.append("')) ORDER BY class_no,syusseki_no");
				ResultSet rs = stmt.executeQuery(query.toString());

				// 検索結果 取得
				while (rs.next()) {
					cla_name = rs.getString("class_no");
					syussekiStr = rs.getString("syusseki_no");
					gakusekiStr = rs.getString("gakuseki_no");
					simei_1Str = rs.getString("simei_1");
					simei_2Str = rs.getString("simei_2");
					kana_1Str = rs.getString("kana_1");
					kana_2Str = rs.getString("kana_2");
					umareStr = rs.getString("umare");

					sb.append(" <tr>");
					sb.append(" <td>");
					sb.append(cla_name);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(syussekiStr);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(gakusekiStr);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(simei_1Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(simei_2Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(kana_1Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(kana_2Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(umareStr);
					sb.append(" </td>");
					sb.append(" </tr>");
					;
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

		} else if (selectStr.equals("4")) {
			sb.append(simeiStr);
			// if (kubunStr.equals("0")) {
			// sb.append("学校関係");
			// } else {
			// if (kubunStr.equals("1")) {
			// sb.append("バイト関係");
			// } else {
			// if (kubunStr.equals("2")) {
			// sb.append("その他");
			// }
			// }
			// }
			sb.append(" </font>");
			sb.append("<br><br>");
			sb.append("<table border='1' bordercolor='darkblue'>");
			sb.append(" <tr>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("クラス");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("出席");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("学籍");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("氏名（性）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("氏名（名）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("カナ（性）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("カナ（名）");
			sb.append(" </font>");
			sb.append(" </td>");
			sb.append(" <td bgcolor='darkblue'>");
			sb.append(" <font color='white'>");
			sb.append("生年月日");
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
				query.append("SELECT * FROM class_table WHERE simei_1 = '");
				query.append(simeiStr);
				query.append("' OR simei_2 = '");
				query.append(simeiStr);
				query.append("' ORDER BY class_no,syusseki_no");
				ResultSet rs = stmt.executeQuery(query.toString());

				// 検索結果 取得
				while (rs.next()) {
					cla_name = rs.getString("class_no");
					syussekiStr = rs.getString("syusseki_no");
					gakusekiStr = rs.getString("gakuseki_no");
					simei_1Str = rs.getString("simei_1");
					simei_2Str = rs.getString("simei_2");
					kana_1Str = rs.getString("kana_1");
					kana_2Str = rs.getString("kana_2");
					umareStr = rs.getString("umare");

					sb.append(" <tr>");
					sb.append(" <td>");
					sb.append(cla_name);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(syussekiStr);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(gakusekiStr);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(simei_1Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(simei_2Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(kana_1Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(kana_2Str);
					sb.append(" </td>");
					sb.append(" <td>");
					sb.append(umareStr);
					sb.append(" </td>");
					sb.append(" </tr>");
					;
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
}
