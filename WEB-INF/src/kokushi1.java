import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class kokushi1 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();
		String namaeStr = req.getParameter("NAMAE");
		String gakunenStr = req.getParameter("GAKUNEN");
		String gozenStr = req.getParameter("GOZEN");
		String gogoStr = req.getParameter("GOGO");
		int gozen = Integer.parseInt(gozenStr);
		int gogo = Integer.parseInt(gogoStr);
		int goukei = gozen + gogo;

		StringBuffer sb = new StringBuffer();
		sb.append("<html><body>");
		sb.append("kokushi1.java");
		sb.append("<center><h1>");
		sb.append("国家試験判定");
		sb.append("<br><font color='deeppink'>");
		sb.append(gakunenStr);
		sb.append("</font>");
		sb.append("の");
		sb.append("<font color='deeppink'>");
		sb.append(namaeStr);
		sb.append("</font>");
		sb.append("さん");
		sb.append("<br>");
		sb.append("あなたの得点は");
		sb.append("<br>");
		sb.append("午前");
		sb.append("<font color='deeppink'>");
		sb.append(gozenStr);
		sb.append("</font>");
		sb.append("点　午後");
		sb.append("<font color='deeppink'>");
		sb.append(gogoStr);
		sb.append("</font>");
		sb.append("点　合計");
		sb.append("<font color='deeppink'>");
		sb.append(goukei);
		sb.append("</font>");
		sb.append("点");
		sb.append("<br>");
		sb.append("判定結果は");
		if (gozen >= 65 && gogo >= 65 && goukei >= 140) {
			sb.append("<font color='deeppink'>");
			sb.append("合格");
			sb.append("</font>");
		} else {
			sb.append("<font color='deeppink'>");
			sb.append("不合格");
			sb.append("</font>");
		}
		sb.append("です");
		sb.append("</h1></center></body></html>");
		out.println(sb.toString());
	}
}