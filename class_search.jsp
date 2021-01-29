 <%@ page contentType="text/html; charset=UTF8" %>
 <% response.setContentType("text/html;charset=UTF-8"); %>
 <html>
 <head>
 <title>名簿検索（Java Beans 検索２）</title>
 </head>
<body bgcolor="#ffffff">
 class_search.jsp
 <center>
 <caption><font size="+3" color="#0000ff">
 <b>＜ ＜ 名簿検索 ＞ ＞</b></font></caption>
 <br><br><br>
 <jsp:useBean id="class_bean" scope="request"class="nhs90534.class_bean" />
 <%
 if(class_bean.getHit_flag() == 0){
 %>
 <%
 }else{
 %>
 </font>
 <table border="1" bordercolor="darkblue">
 <tr>
 <td bgcolor="darkblue">
 <font color="white">クラス記号</font>
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
 <tr>
  <td>
 <jsp:getProperty name="class_bean"property="cla_name" />
</td>
 <td>
 <jsp:getProperty name="class_bean"property="syusseki" />
</td>
 <td>
 <jsp:getProperty name="class_bean"property="gakuseki" />
</td>
 <td>
 <jsp:getProperty name="class_bean"property="simei_1" />
 </td>
 <td>
 <jsp:getProperty name="class_bean"property="simei_2" />
 </td>
 <td>
 <jsp:getProperty name="class_bean"property="kana_1" />
 </td>
 <td>
 <jsp:getProperty name="class_bean"property="kana_2" />
 </td>
 <td>
 <jsp:getProperty name="class_bean"property="umare" />
 </td>
 </tr>
 <%
 }
 %>
 </table><br>
 </center><br><br>
 <HR><A HREF="/JV27/class_search.html">名簿検索に戻る </A>
 <A HREF="/JV27/meibo_bean.html">ホームへ戻る
</A>
 </body>
 </HTML