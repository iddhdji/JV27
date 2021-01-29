package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tyumon_005fsakujo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("    <title>æ³¨æåé¤</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/menu.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("    <header>\r\n");
      out.write("    ã¾ããå \r\n");
      out.write("     <form action=\"member.html\">\r\n");
      out.write("    <input type=\"submit\" name=\"member\" value=\"ä¼å¡ãªã¹ã\" style=\"width: 170px; height: 40px; font-size: 30px; text-align: center; background-color: #fff; margin-left: 1150px;\">\r\n");
      out.write("  </form>\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("<ul>\r\n");
      out.write("<li><a class=âcurrentâ href=\"reservation.html\">RESERVATION</a></li>\r\n");
      out.write("<li><a href=\"room.html\">ROOM</a></li>\r\n");
      out.write("<li><a href=\"./order.html\">ORDER</a></li>\r\n");
      out.write("<li><a href=\"./check.html\">CHECK</a></li>\r\n");
      out.write("<li><a href=\"./employ.html\">EMPLOY</a></li>\r\n");
      out.write("<li><a href=\"./profit.html\">PROFIT</a></li>\r\n");
      out.write("</ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("  <body>\r\n");
      out.write("<form action=\"order.html\" method=\"get\">\r\n");
      out.write("<input type=\"submit\" name=\"æ»ã\" value=\"æ»ã\" class=\"btn btn-primary btn-lg\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<h1 class=\"text-primary font-weight-bold\">æ³¨æåé¤</h1>\r\n");
      out.write("<form action=\"tyumon_sakujo_error.html\" method=\"get\">\r\n");
      out.write("<input type=\"submit\" value=\"ã¨ã©ã¼è¡¨ç¤º\">\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<form action=\"tyumon_sakujo_kanryo.html\" method=\"get\">\r\n");
      out.write("<table class=\"table\">\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>æ³¨æã³ã¼ã</td>\r\n");
      out.write("    <td>åç§°</td>\r\n");
      out.write("    <td>å¤æ®µ</td>\r\n");
      out.write("    <td>åæ°</td>\r\n");
      out.write("    <td>æ³¨ææ¥æ</td>\r\n");
      out.write("    <td>åé¤</td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>50001</td>\r\n");
      out.write("    <td>ãã©ã¤ãããã</td>\r\n");
      out.write("    <td>350</td>\r\n");
      out.write("    <td>1</td>\r\n");
      out.write("    <td>2020/8/24 10:00</td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"sakujo\" value=\"åé¤ãã\" class=\"btn btn-primary btn-lg\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>50001</td>\r\n");
      out.write("    <td>ãµã©ã</td>\r\n");
      out.write("    <td>400</td>\r\n");
      out.write("    <td>1</td>\r\n");
      out.write("    <td>2020/8/24 10:00</td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"sakujo\" value=\"åé¤ãã\" class=\"btn btn-primary btn-lg\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>50001</td>\r\n");
      out.write("    <td>æè±</td>\r\n");
      out.write("    <td>250</td>\r\n");
      out.write("    <td>1</td>\r\n");
      out.write("    <td>2020/8/24 10:00</td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"sakujo\" value=\"åé¤ãã\" class=\"btn btn-primary btn-lg\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>50001</td>\r\n");
      out.write("    <td>ããç¼ã</td>\r\n");
      out.write("    <td>400</td>\r\n");
      out.write("    <td>1</td>\r\n");
      out.write("    <td>2020/8/24 10:00</td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"sakujo\" value=\"åé¤ãã\" class=\"btn btn-primary btn-lg\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>50001</td>\r\n");
      out.write("    <td>ãã«ã¯ãã£ã¼</td>\r\n");
      out.write("    <td>400</td>\r\n");
      out.write("    <td>2</td>\r\n");
      out.write("    <td>2020/8/24 10:00</td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"sakujo\" value=\"åé¤ãã\" class=\"btn btn-primary btn-lg\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>50001</td>\r\n");
      out.write("    <td>ã³ã¼ã©</td>\r\n");
      out.write("    <td>400</td>\r\n");
      out.write("    <td>2</td>\r\n");
      out.write("    <td>2020/8/24 10:00</td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"sakujo\" value=\"åé¤ãã\" class=\"btn btn-primary btn-lg\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("    <td>50001</td>\r\n");
      out.write("    <td>ã¦ã¼ã­ã³è¶</td>\r\n");
      out.write("    <td>400</td>\r\n");
      out.write("    <td>1</td>\r\n");
      out.write("    <td>2020/8/24 10:00</td>\r\n");
      out.write("    <td><input type=\"submit\" name=\"sakujo\" value=\"åé¤ãã\" class=\"btn btn-primary btn-lg\"></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\" class=\"btn btn-primary btn-lg\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
