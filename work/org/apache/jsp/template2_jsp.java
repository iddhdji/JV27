package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>ãã³ãã¬ã¼ã</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common2.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<ul class=\"pricecards\">\r\n");
      out.write("               <li class=\"pricecard standard\">\r\n");
      out.write("                   <h3>å¹³æ¥ç¨</h3>\r\n");
      out.write("                   <h4>å¹³æ¥ãã³ãã¬ãã®1</h4>\r\n");
      out.write("                   \r\n");
      out.write("                   <p>æãæ°´ãéææ¥ç¨ã®ãã³ãã¬ã¼ã</p>\r\n");
      out.write("                   <a href=\"template_detail.jsp\">è©³ç´°</a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li class=\"pricecard standard\">\r\n");
      out.write("                   <h3>å¹³æ¥ç¨</h3>\r\n");
      out.write("                   <h4>å¹³æ¥ãã³ãã¬ãã®2</h4>\r\n");
      out.write("                   \r\n");
      out.write("                   <p>ç«æ¨ææ¥ç¨ã®ãã³ãã¬ã¼ã</p>\r\n");
      out.write("                   <a href=\"\">è©³ç´°</a>\r\n");
      out.write("               </li>\r\n");
      out.write("               <li class=\"pricecard standard\">\r\n");
      out.write("                   <h3>ä¼æ¥ç¨</h3>\r\n");
      out.write("                   <h4>ä¼æ¥ãã³ãã¬</h4>\r\n");
      out.write("                   \r\n");
      out.write("                   <p>ä¼æ¥ç¨ã®ãã³ãã¬ã¼ã</p>\r\n");
      out.write("                   <a href=\"\">è©³ç´°</a>\r\n");
      out.write("               </li>\r\n");
      out.write("\r\n");
      out.write("               <li class=\"pricecard standard\">\r\n");
      out.write("                   <h3>é¢æ¥ç¨</h3>\r\n");
      out.write("                   <h4>é¢æ¥ç¨ãã³ãã¬</h4>\r\n");
      out.write("                   \r\n");
      out.write("                   <p>é¢æ¥ç¨ã®ãã³ãã¬ã¼ã</p>\r\n");
      out.write("                   <a href=\"\">è©³ç´°</a>\r\n");
      out.write("               </li>\r\n");
      out.write("\r\n");
      out.write("           </ul>\r\n");
      out.write("</body>");
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
