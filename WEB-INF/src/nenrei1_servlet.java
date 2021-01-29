import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class nenrei1_servlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		PrintWriter out;
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");
		out = res.getWriter();

		// webブラウザのFormからパラメータを取得
		String nenStr = req.getParameter("NEN");
		String tukiStr = req.getParameter("TUKI");
		String hiStr = req.getParameter("HI");

		try {
			// Beanを呼び出してインスタンス化
			nhs90534.nenrei1_bean nenrei_bean = new nhs90534.nenrei1_bean();

			// プロパティのセット（年）
			nenrei_bean.setNen(Integer.parseInt(nenStr));

			// プロパティのセット（月）
			nenrei_bean.setTuki(Integer.parseInt(tukiStr));

			// プロパティのセット（日）
			nenrei_bean.setHi(Integer.parseInt(hiStr));

			// 年齢計算
			nenrei_bean.keisan();

			// 結果取得
			int kekka = nenrei_bean.getNenrei();

			StringBuffer sb = new StringBuffer();
			sb.append("<html>");
			sb.append("<head><title>nenrei</title></head>");
			sb.append("<body bgcolor='#ffffff'>");
			sb.append("nenrei1.java");
			sb.append("<center>");
			sb.append("<CAPTION><FONT SIZE='+3' COLOR='#0000FF'>");
			sb.append("<B>");
			sb.append("年齢計算");
			sb.append("</B></FONT></CAPTION>");
			sb.append("<BR><BR><BR><H1>");
			sb.append("あなたは");
			sb.append("<BR><FONT COLOR='deeppink'>");
			sb.append(nenStr);
			sb.append("</FONT>");
			sb.append("年");
			sb.append("<FONT COLOR='deeppink'>");
			sb.append(tukiStr);
			sb.append("</FONT>");
			sb.append("月");
			sb.append("<FONT COLOR='deeppink'>");
			sb.append(hiStr);
			sb.append("</FONT>");
			sb.append("</FONT>");
			sb.append("日");
			sb.append("<BR>");
			sb.append("生まれで");
			sb.append("<BR>");
			sb.append("<FONT COLOR='deeppink'>");
			sb.append(kekka);
			sb.append("</FONT>");
			sb.append("才なんですね");
			sb.append("</H1></center><BR><BR>");
			sb.append("<a href='../nenrei1.html'>");
			sb.append("トップへ戻る");
			sb.append("</a>");
			sb.append("</body>");
			sb.append("</html>");
			out.println(sb.toString());
		}

		// 例外処理
		catch (Exception ex) {
			ex.printStackTrace(out);
		}
	}
}