 <%@ page contentType="text/html; charset=UTF8" import="java.util.*" %>
 <% response.setContentType("text/html;charset=UTF-8"); %>
 <html>
 <head>
 <title>名簿検索（Java Beans 検索２）</title>
 </head>
<body bgcolor="#ffffff">
 class_bean2.jsp
 <center>
 <caption><font size="+3" color="#0000ff">
 <b>＜ ＜ 名簿検索 ＞ ＞</b></font></caption>
 <br><br><br>
 
 <jsp:useBean id="class_bean2" scope="request"class="nhs90534.class_bean2" />
 <%
 if(class_bean2.getHit_flag() == 0){
 %>

 該当者なし

 <%
 }else{
 %>
  <%
 ArrayList tbl =class_bean2.getTbl();
 ArrayList row =(ArrayList)tbl.get(0);
 %>
 検索結果　学年:
 <font size='+2' color='deeppink'>
  <%= request.getAttribute("GAKUNEN_NO") %>
 </font>
年
 <table border="1" bordercolor="darkblue">
 <tr>
 <td bgcolor="darkblue">
 <font color="white">クラス</font>
 </td>
 <td bgcolor="darkblue">
 <font color="white">出席</font>
 </td>
 <td bgcolor="darkblue">
 <font color='white'>学籍</font>
 </td>
 <td bgcolor="darkblue">
 <font color="white">氏名（姓）</font>
 </td>
<td bgcolor="darkblue">
<font color="white">氏名（名）</font>
</td>
 <td bgcolor="darkblue">
 <font color="white">カナ（姓）</font>
 </td>
 <td bgcolor="darkblue">
<font color="white">カナ（名）</font>
 </td>
  <td bgcolor="darkblue">
<font color="white">生年月日</font>
 </td>
 </tr>
<%
for(int i = 0; i < tbl.size(); i++){
	row =(ArrayList)tbl.get(i);
	for(int j = 0;j < row.size(); j++){
%>

<td>
<%=(String)row.get(j)%>
</td>
<%
	}
%>
</tr>
 <%
 	}
 }
 %>
 </table><br>
 </center>
 <HR><A HREF="/JV27/class_search.html">名簿検索に戻る </A>
 <A HREF="/JV27/meibo_bean.html">ホームへ戻る
</A>
 </body>
 </HTML