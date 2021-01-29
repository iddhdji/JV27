<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>

<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

String user_code = request.getParameter("user_code");
String user_id = request.getParameter("user_id");
%>
<!DOCTYPE html>

<html>

  <head>
    <meta charset="utf-8">
    <title>フレンド削除確認</title>

    <link rel="stylesheet" type="text/css" href="css/common.css">
  </head>
  <body style="color: #000">
    <h1>フレンド削除</h1>
    <hr>
    <br>
    <h3>以下のフレンドを削除しますか？</h3>
    <FORM METHOD="POST" ACTION="./friend_delete.jsp">
    <p><%= user_code %></p>
    <input type="hidden" name="user_id" value="<%= user_id %>">
    <input type="hidden" name="user_code" value="<%= user_code %>">
    <INPUT TYPE="submit" VALUE="削除">
     </FORM>
    <br>
    <br>
    <a href="./friend1.html">戻る</a>
  </body>
  
</html>