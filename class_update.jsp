 <%@ page contentType="text/html; charset=UTF-8" %>
 <% response.setContentType("text/html; charset=UTF-8"); %>
 <HTML>
 <HEAD><TITLE>update.jsp</TITLE></HEAD>
 <BODY BGCOLOR="#FFFFFF">
 class_update.jsp
 <CENTER>
 <CAPTION><FONT SIZE="+3" COLOR="#0000FF">
 <B>＜＜名簿変更 ＞＞</B>
</FONT></CAPTION>
 <BR>
 <FORM METHOD="POST" NAME="frm" ACTION="/JV27/servlet/class_update3">
<FONT SIZE="+1" COLOR="#0000FF">名簿情報を変更してください。 </FONT>
<P>
 <HR SIZE="5" WIDTH="80%">
 <CENTER>
 <TABLE border='1' bordercolor='darkblue'>
  <TR>
 <td bgcolor='blue'>
 <font color='white'>
 クラス
 </font>
 </td>
 <TD>
<select name="CLASS_NO" id="CLASS_NO" size="1">
<option value="AT11A192">AT11A192
<option value="AT11B203">AT11B203
<option value="CG11A172">CG11A172
<option value="IT11A172">IT11A172
<option value="AT12A165">AT12A165
<option value="AT12B165">AT12B165
<option value="IH12A101">IH12A101
<option value="IW12A185">IW12A185
<option value="AT13A181">AT13A181
<option value="AP13A223">AP13A223
<option value="IH13A181">IH13A181
<option value="IW13A187">IW13A187
<option value="CD13A166">CD13A166
<option value="AP14A226">AP14A226
<option value="AT14A226">AT14A226
<option value="IH14A223">IH14A223
<option value="CT14A187">CT14A187
<option value="IW14A187">IW14A187
<option value="xx14Axxx">xx14Axxx
</select>
 <SCRIPT Language="JavaScript">
 var element = document.getElementById( "CLASS_NO" ) ;
 var elements = element.options ;
 switch ("<%= request.getAttribute("class").toString() %>") {
 　case "AT11A192": elements[0].selected = true ; break;
 case "AT11B203":elements[1].selected = true ; break;
 case "CG11A172":elements[2].selected = true ;  break;
  case "IT11A172":elements[3].selected = true ;  break;
  case "AT12A165":elements[4].selected = true ; break;
  case "AT12B165":elements[5].selected = true ;  break;
  case "IH12A101":elements[6].selected = true ;  break;
  case "IW12A185":elements[7].selected = true ; break;
  case "AT13A181":elements[8].selected = true ;  break;
  case "AP13A223":elements[9].selected = true ; break;
  case "IH13A181":elements[10].selected = true ;  break;
  case "IW13A187":elements[11].selected = true ;  break;
  case "CD13A166":elements[12].selected = true ;  break;
  case "AP14A226":elements[13].selected = true ;  break;
  case "AT14A226":elements[14].selected = true ;  break;
  case "IH14A223":elements[15].selected = true ;  break;
  case "CT14A187":elements[16].selected = true ;  break;
  case "IW14A187":elements[17].selected = true ;  break;
  case "xx14Axxx":elements[18].selected = true ;  break;
 }
 </SCRIPT>
 </TD>
 </TR>
<td bgcolor='blue'>
 <font color='white'>
 出席
  </font>
 </TD>
 <TD>
 <INPUT TYPE="TEXT" NAME="SYUSSEKI" SIZE=20
VALUE="<%= request.getAttribute("syusseki").toString() %>">
 </TD>
 </TR>
 <td bgcolor='blue'>
 <font color='white'>
 学籍
  </font>
 </TD>
 <TD>
 <INPUT TYPE="TEXT" NAME="GAKUSEKI" SIZE=20
VALUE="<%= request.getAttribute("gakuseki").toString() %>" readonly>

 </TD>
 </TR>
 <td bgcolor='blue'>
 <font color='white'>氏名（性）
  </font>
 </TD>
 <TD>
 <INPUT TYPE="TEXT" NAME="SIMEI_1" SIZE=20
VALUE="<%= request.getAttribute("simei_1").toString() %>">
 </TD>
 </TR>
 <td bgcolor='blue'>
 <font color='white'>
 氏名（名）
  </font>
 </TD>
 <TD>
 <INPUT TYPE="TEXT" NAME="SIMEI_2" SIZE=20
VALUE="<%= request.getAttribute("simei_2").toString() %>">
 </TD>
 </TR>
 <TR>
 <td bgcolor='blue'>
 <font color='white'>
 カナ（性）
  </font>
 </TD>
 <TD>
 <INPUT TYPE="TEXT" NAME="KANA_1" SIZE=20
 VALUE="<%= request.getAttribute("kana_1").toString() %>">
 </TD>
 </TR>
<TR>
 <td bgcolor='blue'>
 <font color='white'>
 カナ（名）
  </font>
 </TD>
 <TD>
 <INPUT TYPE="TEXT" NAME="KANA_2" SIZE=20
 VALUE="<%= request.getAttribute("kana_2").toString() %>">
 </TD>
</TR>
 <TR>
 <td bgcolor='blue'>
 <font color='white'>
 生年月日
  </font>
 </TD>
 <TD>
 <INPUT TYPE="TEXT" NAME="UMARE" SIZE=20
 VALUE="<%= request.getAttribute("umare").toString() %>">
 </TD>
 </TR>
 </TABLE>
 <P>
 <HR SIZE="5" WIDTH="80%">
 <BR><CENTER>
<INPUT TYPE="submit" VALUE="名簿更新">
 <INPUT TYPE="RESET" VALUE="入力クリア"><BR><BR>
</FORM>
 <HR>
 <A HREF="/JV27/update.html">名簿選択ヘ戻る </A>
 <A HREF="/JV27/meibo.html">メニューヘ戻る</A>
 <BR>
 </CENTER>
</BODY>
 </HTML>