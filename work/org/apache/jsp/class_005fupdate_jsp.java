package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class class_005fupdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \r\n");
      out.write(" ");
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("\r\n");
      out.write(" <HTML>\r\n");
      out.write(" <HEAD><TITLE>update.jsp</TITLE></HEAD>\r\n");
      out.write(" <BODY BGCOLOR=\"#FFFFFF\">\r\n");
      out.write(" class_update.jsp\r\n");
      out.write(" <CENTER>\r\n");
      out.write(" <CAPTION><FONT SIZE=\"+3\" COLOR=\"#0000FF\">\r\n");
      out.write(" <B>＜＜名簿変更 ＞＞</B>\r\n");
      out.write("</FONT></CAPTION>\r\n");
      out.write(" <BR>\r\n");
      out.write(" <FORM METHOD=\"POST\" NAME=\"frm\" ACTION=\"/JV27/servlet/class_update3\">\r\n");
      out.write("<FONT SIZE=\"+1\" COLOR=\"#0000FF\">名簿情報を変更してください。 </FONT>\r\n");
      out.write("<P>\r\n");
      out.write(" <HR SIZE=\"5\" WIDTH=\"80%\">\r\n");
      out.write(" <CENTER>\r\n");
      out.write(" <TABLE border='1' bordercolor='darkblue'>\r\n");
      out.write("  <TR>\r\n");
      out.write(" <td bgcolor='blue'>\r\n");
      out.write(" <font color='white'>\r\n");
      out.write(" クラス\r\n");
      out.write(" </font>\r\n");
      out.write(" </td>\r\n");
      out.write(" <TD>\r\n");
      out.write("<select name=\"CLASS_NO\" id=\"CLASS_NO\" size=\"1\">\r\n");
      out.write("<option value=\"AT11A192\">AT11A192\r\n");
      out.write("<option value=\"AT11B203\">AT11B203\r\n");
      out.write("<option value=\"CG11A172\">CG11A172\r\n");
      out.write("<option value=\"IT11A172\">IT11A172\r\n");
      out.write("<option value=\"AT12A165\">AT12A165\r\n");
      out.write("<option value=\"AT12B165\">AT12B165\r\n");
      out.write("<option value=\"IH12A101\">IH12A101\r\n");
      out.write("<option value=\"IW12A185\">IW12A185\r\n");
      out.write("<option value=\"AT13A181\">AT13A181\r\n");
      out.write("<option value=\"AP13A223\">AP13A223\r\n");
      out.write("<option value=\"IH13A181\">IH13A181\r\n");
      out.write("<option value=\"IW13A187\">IW13A187\r\n");
      out.write("<option value=\"CD13A166\">CD13A166\r\n");
      out.write("<option value=\"AP14A226\">AP14A226\r\n");
      out.write("<option value=\"AT14A226\">AT14A226\r\n");
      out.write("<option value=\"IH14A223\">IH14A223\r\n");
      out.write("<option value=\"CT14A187\">CT14A187\r\n");
      out.write("<option value=\"IW14A187\">IW14A187\r\n");
      out.write("<option value=\"xx14Axxx\">xx14Axxx\r\n");
      out.write("</select>\r\n");
      out.write(" <SCRIPT Language=\"JavaScript\">\r\n");
      out.write(" var element = document.getElementById( \"CLASS_NO\" ) ;\r\n");
      out.write(" var elements = element.options ;\r\n");
      out.write(" switch (\"");
      out.print( request.getAttribute("class").toString() );
      out.write("\") {\r\n");
      out.write(" 　case \"AT11A192\": elements[0].selected = true ; break;\r\n");
      out.write(" case \"AT11B203\":elements[1].selected = true ; break;\r\n");
      out.write(" case \"CG11A172\":elements[2].selected = true ;  break;\r\n");
      out.write("  case \"IT11A172\":elements[3].selected = true ;  break;\r\n");
      out.write("  case \"AT12A165\":elements[4].selected = true ; break;\r\n");
      out.write("  case \"AT12B165\":elements[5].selected = true ;  break;\r\n");
      out.write("  case \"IH12A101\":elements[6].selected = true ;  break;\r\n");
      out.write("  case \"IW12A185\":elements[7].selected = true ; break;\r\n");
      out.write("  case \"AT13A181\":elements[8].selected = true ;  break;\r\n");
      out.write("  case \"AP13A223\":elements[9].selected = true ; break;\r\n");
      out.write("  case \"IH13A181\":elements[10].selected = true ;  break;\r\n");
      out.write("  case \"IW13A187\":elements[11].selected = true ;  break;\r\n");
      out.write("  case \"CD13A166\":elements[12].selected = true ;  break;\r\n");
      out.write("  case \"AP14A226\":elements[13].selected = true ;  break;\r\n");
      out.write("  case \"AT14A226\":elements[14].selected = true ;  break;\r\n");
      out.write("  case \"IH14A223\":elements[15].selected = true ;  break;\r\n");
      out.write("  case \"CT14A187\":elements[16].selected = true ;  break;\r\n");
      out.write("  case \"IW14A187\":elements[17].selected = true ;  break;\r\n");
      out.write("  case \"xx14Axxx\":elements[18].selected = true ;  break;\r\n");
      out.write(" }\r\n");
      out.write(" </SCRIPT>\r\n");
      out.write(" </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write("<td bgcolor='blue'>\r\n");
      out.write(" <font color='white'>\r\n");
      out.write(" 出席\r\n");
      out.write("  </font>\r\n");
      out.write(" </TD>\r\n");
      out.write(" <TD>\r\n");
      out.write(" <INPUT TYPE=\"TEXT\" NAME=\"SYUSSEKI\" SIZE=20\r\n");
      out.write("VALUE=\"");
      out.print( request.getAttribute("syusseki").toString() );
      out.write("\">\r\n");
      out.write(" </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write(" <td bgcolor='blue'>\r\n");
      out.write(" <font color='white'>\r\n");
      out.write(" 学籍\r\n");
      out.write("  </font>\r\n");
      out.write(" </TD>\r\n");
      out.write(" <TD>\r\n");
      out.write(" <INPUT TYPE=\"TEXT\" NAME=\"GAKUSEKI\" SIZE=20\r\n");
      out.write("VALUE=\"");
      out.print( request.getAttribute("gakuseki").toString() );
      out.write("\" readonly>\r\n");
      out.write("\r\n");
      out.write(" </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write(" <td bgcolor='blue'>\r\n");
      out.write(" <font color='white'>氏名（性）\r\n");
      out.write("  </font>\r\n");
      out.write(" </TD>\r\n");
      out.write(" <TD>\r\n");
      out.write(" <INPUT TYPE=\"TEXT\" NAME=\"SIMEI_1\" SIZE=20\r\n");
      out.write("VALUE=\"");
      out.print( request.getAttribute("simei_1").toString() );
      out.write("\">\r\n");
      out.write(" </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write(" <td bgcolor='blue'>\r\n");
      out.write(" <font color='white'>\r\n");
      out.write(" 氏名（名）\r\n");
      out.write("  </font>\r\n");
      out.write(" </TD>\r\n");
      out.write(" <TD>\r\n");
      out.write(" <INPUT TYPE=\"TEXT\" NAME=\"SIMEI_2\" SIZE=20\r\n");
      out.write("VALUE=\"");
      out.print( request.getAttribute("simei_2").toString() );
      out.write("\">\r\n");
      out.write(" </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write(" <TR>\r\n");
      out.write(" <td bgcolor='blue'>\r\n");
      out.write(" <font color='white'>\r\n");
      out.write(" カナ（性）\r\n");
      out.write("  </font>\r\n");
      out.write(" </TD>\r\n");
      out.write(" <TD>\r\n");
      out.write(" <INPUT TYPE=\"TEXT\" NAME=\"KANA_1\" SIZE=20\r\n");
      out.write(" VALUE=\"");
      out.print( request.getAttribute("kana_1").toString() );
      out.write("\">\r\n");
      out.write(" </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write("<TR>\r\n");
      out.write(" <td bgcolor='blue'>\r\n");
      out.write(" <font color='white'>\r\n");
      out.write(" カナ（名）\r\n");
      out.write("  </font>\r\n");
      out.write(" </TD>\r\n");
      out.write(" <TD>\r\n");
      out.write(" <INPUT TYPE=\"TEXT\" NAME=\"KANA_2\" SIZE=20\r\n");
      out.write(" VALUE=\"");
      out.print( request.getAttribute("kana_2").toString() );
      out.write("\">\r\n");
      out.write(" </TD>\r\n");
      out.write("</TR>\r\n");
      out.write(" <TR>\r\n");
      out.write(" <td bgcolor='blue'>\r\n");
      out.write(" <font color='white'>\r\n");
      out.write(" 生年月日\r\n");
      out.write("  </font>\r\n");
      out.write(" </TD>\r\n");
      out.write(" <TD>\r\n");
      out.write(" <INPUT TYPE=\"TEXT\" NAME=\"UMARE\" SIZE=20\r\n");
      out.write(" VALUE=\"");
      out.print( request.getAttribute("umare").toString() );
      out.write("\">\r\n");
      out.write(" </TD>\r\n");
      out.write(" </TR>\r\n");
      out.write(" </TABLE>\r\n");
      out.write(" <P>\r\n");
      out.write(" <HR SIZE=\"5\" WIDTH=\"80%\">\r\n");
      out.write(" <BR><CENTER>\r\n");
      out.write("<INPUT TYPE=\"submit\" VALUE=\"名簿更新\">\r\n");
      out.write(" <INPUT TYPE=\"RESET\" VALUE=\"入力クリア\"><BR><BR>\r\n");
      out.write("</FORM>\r\n");
      out.write(" <HR>\r\n");
      out.write(" <A HREF=\"/JV27/update.html\">名簿選択ヘ戻る </A>\r\n");
      out.write(" <A HREF=\"/JV27/meibo.html\">メニューヘ戻る</A>\r\n");
      out.write(" <BR>\r\n");
      out.write(" </CENTER>\r\n");
      out.write("</BODY>\r\n");
      out.write(" </HTML>");
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
