import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class cookie extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");

		PrintWriter out;
		out = res.getWriter();

		// webブラウザのFormからパラメータを取得
		String paramStr = req.getParameter("param");
		String namaeStr = req.getParameter("namae");
		String seibetuStr = req.getParameter("seibetu");
		String e_mailStr = req.getParameter("e_mail");
		String situmonStr = req.getParameter("situmon");

		// レスポンス用CSV
		StringBuffer res_csv = new StringBuffer();

		// ヒットフラグ
		int hit_flg = 0;
		try {
			// 読み込み処理
			if (paramStr.equals("read")) {
				// クッキー読み込み
				Cookie[] cookies = req.getCookies();
				if (cookies != null) {
					int i = 0;
					for (i = 0; i < cookies.length; i++) {
						if (cookies[i].getName().equals("cooNAMAE")) {
							res_csv.append(URLDecoder.decode(
									cookies[i].getValue(), "UTF-8")); // URLデコード
							hit_flg = 1;
						}
						if (cookies[i].getName().equals("cooSEIBETU")) {
							res_csv.append("," + cookies[i].getValue());
							hit_flg = 1;
						}
						if (cookies[i].getName().equals("cooE_MAIL")) {
							res_csv.append("," + cookies[i].getValue());
							hit_flg = 1;
						}
						if (cookies[i].getName().equals("cooSITUMON")) {
							res_csv.append(","
									+ URLDecoder.decode(cookies[i].getValue(),
											"UTF-8")); // URLデコード
							hit_flg = 1;
						}
					}
					// メッセージ出力
					if (hit_flg == 1) {
						out.print(res_csv.toString());
					} else {
						out.print("noting,9,noting,noting");
					}
				} else {
					out.print("noting,9,noting,noting");
				}

				// 書き込み処理
			} else {

				// クッキー書き込み
				Cookie namaeCookie = new Cookie("cooNAMAE", URLEncoder.encode(
						namaeStr, "UTF-8")); // URLエンコード
				// namaeCookie.setMaxAge( 86400 ); //24時間
				namaeCookie.setMaxAge(10); // 10秒
				res.addCookie(namaeCookie);

				Cookie seibetuCookie = new Cookie("cooSEIBETU", seibetuStr);
				seibetuCookie.setMaxAge(10); // 10秒
				res.addCookie(seibetuCookie);

				Cookie e_mailCookie = new Cookie("cooE_MAIL", e_mailStr);
				e_mailCookie.setMaxAge(10); // 10秒
				res.addCookie(e_mailCookie);

				Cookie situmonCookie = new Cookie("cooSITUMON",
						URLEncoder.encode(situmonStr, "UTF-8")); // URLエンコード
				situmonCookie.setMaxAge(10); // 10秒
				res.addCookie(situmonCookie);
			}
		}

		// 例外処理
		catch (Exception ex) {
			ex.printStackTrace(out);
		}
	}
}