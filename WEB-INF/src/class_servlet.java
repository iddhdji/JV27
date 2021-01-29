import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class class_servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		// webブラウザのFormからパラメータを取得
		String gakusekiStr = req.getParameter("GAKUSEKI");

		try {
			// Beanを呼び出してインスタンス化
			nhs90534.class_bean class_bean = new nhs90534.class_bean();

			// プロパティのセット
			class_bean.setJyouken("gakuseki_no='" + gakusekiStr + "'");

			// Beanコール
			class_bean.DBselect();

			// JSPコール
			req.setAttribute("class_bean", class_bean);
			ServletContext sc = getServletContext();

			sc.getRequestDispatcher("/class_search.jsp").forward(req, res);
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
