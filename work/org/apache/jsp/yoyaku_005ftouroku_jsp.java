package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class yoyaku_005ftouroku_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>äºç´ç»é²</title>\r\n");
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
      out.write("        <form action=\"reservation.jsp\" method=\"get\">\r\n");
      out.write("<input type=\"submit\" name=\"æ»ã\" value=\"æ»ã\" class=\"btn btn-primary btn-lg\">\r\n");
      out.write("</form>\r\n");
      out.write("<h1 class=\"text-primary font-weight-bold\">äºç´ç»é²</h1>\r\n");
      out.write("<form action=\"yoyaku_kanryo.jsp\" method=\"get\">\r\n");
      out.write("    <table class=\"table\">\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"text-light bg-primary\">ä¼å¡çªå·</td>\r\n");
      out.write("        <td><input type=\"50030\" name=\"kaiinbango\" value=\"50030\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"text-light bg-primary\">äººæ°</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"ninzu\" value=\"5\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <td class=\"text-light bg-primary\">æ¥æ</td>\r\n");
      out.write("        <td><input type=\"text\" name=\"nitiji\" value=\"2020/8/24 10:00\"></td>\r\n");
      out.write("      </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("        <p><input type=\"submit\" value=\"ç»é²ãã\" class=\"btn btn-success btn-lg\"></p>\r\n");
      out.write("      </form>\r\n");
      out.write("       <form action=\"yoyaku_touroku_error.html\" method=\"get\">\r\n");
      out.write("<input type=\"submit\" value=\"ã¨ã©ã¼è¡¨ç¤º\">\r\n");
      out.write("</form>\r\n");
      out.write("  </body>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap.min.js\"></script>\r\n");
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
