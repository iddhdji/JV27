<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>

<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

	String tempStr = request.getParameter("temp_id");
	String temp_name = request.getParameter("temp_name");
	String content_name,content_id;
	
	
	//データベースに接続するために使用する変数宣言
	Connection con = null;
	Statement stmt = null;
	StringBuffer SQL = null;
	ResultSet rs = null;

	//ローカルのMySQLに接続する設定
	String USER ="root";
	String PASSWORD = "";
	String URL ="jdbc:mysql://localhost/nhs90534db";

	//サーバーのMySQLに接続する設定
//	String USER = "nhsxxxxx";
//	String PASSWORD = "byyyymmdd";
//  String URL ="jdbc:mysql://192.168.121.16/nhsxxxxxdb";

	String DRIVER = "com.mysql.jdbc.Driver";

	//確認メッセージ
	StringBuffer ERMSG = null;
	
	//ヒットフラグ
	int hit_flag = 0;
	
	//HashMap（1件分のデータを格納する連想配列）
	HashMap<String,String> map = null;
	 
	//ArrayList（すべての件数を格納する配列）
	ArrayList<HashMap> list = null;
	list = new ArrayList<HashMap>();
	 
	try{	// ロードに失敗したときのための例外処理
		// JDBCドライバのロード
		Class.forName(DRIVER).newInstance();

		// Connectionオブジェクトの作成
		con = DriverManager.getConnection(URL,USER,PASSWORD);

		//Statementオブジェクトの作成
		stmt = con.createStatement();

		//SQLステートメントの作成（選択クエリ）
		SQL = new StringBuffer();

		//SQL文の構築（選択クエリ）
		SQL.append("select * from content_tbl where temp_id = '");
		SQL.append(tempStr);
		SQL.append("'");
      System.out.println(SQL.toString());

		//SQL文の実行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());
%>
<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>テンプレート</title>

    <link rel="stylesheet" type="text/css" href="css/common9.css">

<body>
  <h2><%=temp_name%></h2>
<table>
<tr><th>持ち物</th><th>変更</th></tr>

<%
		//入力したデータがデータベースに存在するか調べる
		while (rs.next()) {  //存在する
			//ヒットフラグON
			hit_flag = 1;
			content_name= rs.getString("content_name");
			content_id= rs.getString("content_id");
%>			
<FORM METHOD="POST" ACTION="./template_change.jsp">
		 <tr><td><%= content_name %></td><td><INPUT TYPE="submit" VALUE="変更"></a></td></tr>
		<input type="hidden" name="content_id" value="<%= content_id %>">
		<input type="hidden" name="content_name" value="<%= content_name %>">
		    </FORM>
<%
		}

	}	//tryブロック終了
	catch(ClassNotFoundException e){
		ERMSG = new StringBuffer();
		ERMSG.append(e.getMessage());
	}
	catch(SQLException e){
		ERMSG = new StringBuffer();
		ERMSG.append(e.getMessage());
	}
	catch(Exception e){
		ERMSG = new StringBuffer();
		ERMSG.append(e.getMessage());
	}

	finally{
		//各種オブジェクトクローズ
	    try{
	    	if(rs != null){
	    		rs.close();
	    	}
	    	if(stmt != null){
	    		stmt.close();
			}
	    	if(con != null){
	    		con.close();
			}
	    }
		catch(SQLException e){
		ERMSG = new StringBuffer();
		ERMSG.append(e.getMessage());
		}
	}
%>
  </FORM>
</table>
<FORM METHOD="POST" ACTION="./template_add.jsp">
<INPUT TYPE="submit" VALUE="追加する">
<input type="hidden" name="temp" value="<%= tempStr %>">
<input type="hidden" name="temp_name" value="<%= temp_name %>">
  </FORM>
  <!-- 削除フラグを立てて検索できなくする -->
  <FORM METHOD="POST" ACTION="./servlet/template_delete_all">
  <INPUT TYPE="submit" VALUE="全ての持ち物を削除">
  <input type="hidden" name="temp" value="<%= tempStr %>">
 </FORM>
   <FORM METHOD="POST" ACTION="./servlet/temp_delete">
  <INPUT TYPE="submit" VALUE="テンプレートを削除">
  <input type="hidden" name="temp" value="<%= tempStr %>">
 </FORM>
</body>
