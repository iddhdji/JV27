import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_servlet2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		// webブラウザのFormからパラメータを取得
		String selectStr = req.getParameter("SELECT_ID");
		String class_noStr = req.getParameter("CLASS_NO");
		String gakunen_noStr = req.getParameter("GAKUNEN_NO");

		try {
			// Beanを呼び出してインスタンス化
			nhs90534.class_bean2 class_bean2 = new nhs90534.class_bean2();

			class_bean2.setTable("class_table");

			// クラスの場合
			if (selectStr.equals("1")) {

				// プロパティのセット
				class_bean2.setJyouken("class_no='" + class_noStr + "'");

				class_bean2
						.setFields("syusseki_no,gakuseki_no,simei_1,simei_2,kana_1,kana_2,umare");

				class_bean2.setSort(" ORDER BY syusseki_no");

				// 学年の場合
			} else if (selectStr.equals("2")) {
				class_bean2.setJyouken("class_no like '___" + gakunen_noStr
						+ "____'");

				class_bean2
						.setFields("class_no,syusseki_no,gakuseki_no,simei_1,simei_2,kana_1,kana_2,umare");

				class_bean2.setSort(" ORDER BY class_no,syusseki_no");
			}
			// Beanコール
			class_bean2.DBselect();

			// JSPコール
			req.setAttribute("class_bean2", class_bean2);
			req.setAttribute("CLASS_NO", class_noStr);
			req.setAttribute("GAKUNEN_NO", gakunen_noStr);
			ServletContext sc = getServletContext();

			if (selectStr.equals("1")) {
				sc.getRequestDispatcher("/class_bean1.jsp").forward(req, res);
			} else if (selectStr.equals("2")) {
				sc.getRequestDispatcher("/class_bean2.jsp").forward(req, res);
			}
		}

		// 例外処理
		catch (Exception ex) {
			PrintWriter out;
			req.setCharacterEncoding("UTF-8");
			res.setContentType("text/html;charset=UTF8");
			out = res.getWriter();
			ex.printStackTrace(out);
		}
	}
}
