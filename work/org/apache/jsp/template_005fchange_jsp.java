package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_005fchange_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

	String contentStr = request.getParameter("content_id");
	String content_nameStr = request.getParameter("content_name");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("    <title>テンプレート</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/detail.css\">\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("  <h2>");
      out.print( content_nameStr );
      out.write("</h2>\r\n");
      out.write("<table>\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"./servlet/template_changeend\">\r\n");
      out.write("  <tr><th>変更</th><th><input type=\"text\" name=\"content_name\"></th></tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<INPUT TYPE=\"submit\" VALUE=\"変更\">\r\n");
      out.write("<input type=\"hidden\" name=\"content\" value=\"");
      out.print( contentStr );
      out.write("\">\r\n");
      out.write("</FORM>\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"./servlet/template_delete\">\r\n");
      out.write("<INPUT TYPE=\"submit\" VALUE=\"削除\">\r\n");
      out.write(" <input type=\"hidden\" name=\"content\" value=\"");
      out.print( contentStr );
      out.write("\">\r\n");
      out.write(" </FORM>\r\n");
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
