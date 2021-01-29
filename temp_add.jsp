<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
%>

<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>テンプレート</title>

    <link rel="stylesheet" type="text/css" href="css/detail.css">

<body>
<h2>テンプレートを入力してください</h2>
<FORM METHOD="POST" ACTION="./servlet/temp_add">
<table>
  <tr><th>タイトル</th><th><input type="text" name="title"></th></tr>
  <tr><th>名前</th><th><input type="text" name="name"></th></tr>
  <tr><th>説明</th><th><input type="text" name="explan"></th></tr>
</table>
<INPUT TYPE="submit" VALUE="追加">
</FORM>
</body>