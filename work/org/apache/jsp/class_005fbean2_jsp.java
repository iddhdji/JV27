package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class class_005fbean2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \r\n");
      out.write(" ");
 response.setContentType("text/html;charset=UTF-8"); 
      out.write("\r\n");
      out.write(" <html>\r\n");
      out.write(" <head>\r\n");
      out.write(" <title>名簿検索（Java Beans 検索２）</title>\r\n");
      out.write(" </head>\r\n");
      out.write("<body bgcolor=\"#ffffff\">\r\n");
      out.write(" class_bean2.jsp\r\n");
      out.write(" <center>\r\n");
      out.write(" <caption><font size=\"+3\" color=\"#0000ff\">\r\n");
      out.write(" <b>＜ ＜ 名簿検索 ＞ ＞</b></font></caption>\r\n");
      out.write(" <br><br><br>\r\n");
      out.write(" \r\n");
      out.write(" ");
      nhs90534.class_bean2 class_bean2 = null;
      synchronized (request) {
        class_bean2 = (nhs90534.class_bean2) _jspx_page_context.getAttribute("class_bean2", PageContext.REQUEST_SCOPE);
        if (class_bean2 == null){
          class_bean2 = new nhs90534.class_bean2();
          _jspx_page_context.setAttribute("class_bean2", class_bean2, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      out.write(' ');

 if(class_bean2.getHit_flag() == 0){
 
      out.write("\r\n");
      out.write("\r\n");
      out.write(" 該当者なし\r\n");
      out.write("\r\n");
      out.write(" ");

 }else{
 
      out.write("\r\n");
      out.write("  ");

 ArrayList tbl =class_bean2.getTbl();
 ArrayList row =(ArrayList)tbl.get(0);
 
      out.write("\r\n");
      out.write(" 検索結果　学年:\r\n");
      out.write(" <font size='+2' color='deeppink'>\r\n");
      out.write("  ");
      out.print( request.getAttribute("GAKUNEN_NO") );
      out.write("\r\n");
      out.write(" </font>\r\n");
      out.write("年\r\n");
      out.write(" <table border=\"1\" bordercolor=\"darkblue\">\r\n");
      out.write(" <tr>\r\n");
      out.write(" <td bgcolor=\"darkblue\">\r\n");
      out.write(" <font color=\"white\">クラス</font>\r\n");
      out.write(" </td>\r\n");
      out.write(" <td bgcolor=\"darkblue\">\r\n");
      out.write(" <font color=\"white\">出席</font>\r\n");
      out.write(" </td>\r\n");
      out.write(" <td bgcolor=\"darkblue\">\r\n");
      out.write(" <font color='white'>学籍</font>\r\n");
      out.write(" </td>\r\n");
      out.write(" <td bgcolor=\"darkblue\">\r\n");
      out.write(" <font color=\"white\">氏名（姓）</font>\r\n");
      out.write(" </td>\r\n");
      out.write("<td bgcolor=\"darkblue\">\r\n");
      out.write("<font color=\"white\">氏名（名）</font>\r\n");
      out.write("</td>\r\n");
      out.write(" <td bgcolor=\"darkblue\">\r\n");
      out.write(" <font color=\"white\">カナ（姓）</font>\r\n");
      out.write(" </td>\r\n");
      out.write(" <td bgcolor=\"darkblue\">\r\n");
      out.write("<font color=\"white\">カナ（名）</font>\r\n");
      out.write(" </td>\r\n");
      out.write("  <td bgcolor=\"darkblue\">\r\n");
      out.write("<font color=\"white\">生年月日</font>\r\n");
      out.write(" </td>\r\n");
      out.write(" </tr>\r\n");

for(int i = 0; i < tbl.size(); i++){
	row =(ArrayList)tbl.get(i);
	for(int j = 0;j < row.size(); j++){

      out.write("\r\n");
      out.write("\r\n");
      out.write("<td>\r\n");
      out.print((String)row.get(j));
      out.write("\r\n");
      out.write("</td>\r\n");

	}

      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write(" ");

 	}
 }
 
      out.write("\r\n");
      out.write(" </table><br>\r\n");
      out.write(" </center>\r\n");
      out.write(" <HR><A HREF=\"/JV27/class_search.html\">名簿検索に戻る </A>\r\n");
      out.write(" <A HREF=\"/JV27/meibo_bean.html\">ホームへ戻る\r\n");
      out.write("</A>\r\n");
      out.write(" </body>\r\n");
      out.write(" </HTML");
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
