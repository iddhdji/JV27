<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

	String contentStr = request.getParameter("content_id");
	String content_nameStr = request.getParameter("content_name");
%>
<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>テンプレート</title>

    <link rel="stylesheet" type="text/css" href="css/detail.css">

<body>
  <h2><%= content_nameStr %></h2>
<table>
<FORM METHOD="POST" ACTION="./servlet/template_changeend">
  <tr><th>変更</th><th><input type="text" name="content_name"></th></tr>

</table>
<INPUT TYPE="submit" VALUE="変更">
<input type="hidden" name="content" value="<%= contentStr %>">
</FORM>
<FORM METHOD="POST" ACTION="./servlet/template_delete">
<INPUT TYPE="submit" VALUE="削除">
 <input type="hidden" name="content" value="<%= contentStr %>">
 </FORM>
</body>