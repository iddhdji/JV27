<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

	String tempStr = request.getParameter("temp");
	String temp_name = request.getParameter("temp_name");
%>

<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>テンプレート</title>

    <link rel="stylesheet" type="text/css" href="css/detail.css">

<body>
<h2>追加する物を入力してください</h2>
<FORM METHOD="POST" ACTION="./servlet/template_addend">
<table>
  <tr><th>追加</th><th><input type="text" name="content"></th></tr>
</table>
<INPUT TYPE="submit" VALUE="追加">
 <input type="hidden" name="temp" value="<%= tempStr %>">
 <input type="hidden" name="temp_name" value="<%= temp_name %>">
</FORM>
</body>