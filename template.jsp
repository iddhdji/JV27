<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>

<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

	String temp_id,temp_title,temp_name,temp_view;
	
	
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
		SQL.append("select * from temp_tbl");
      System.out.println(SQL.toString());

		//SQL文の実行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());
%>
<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>テンプレート</title>

    <link rel="stylesheet" type="text/css" href="css/common2.css">


<body>
<ul class="pricecards">
<%
while (rs.next()) {
temp_id = rs.getString("temp_id");
temp_title = rs.getString("temp_title");
temp_name = rs.getString("temp_name");
temp_view = rs.getString("temp_view");
%>
<FORM METHOD="POST" ACTION="./template_detail.jsp">
               <li class="pricecard standard">
                   <h3><%= temp_title %></h3>
                   <h4><%= temp_name %></h4>
                   
                   <p><%= temp_view %></p>
                  <INPUT TYPE="submit" VALUE="詳細">
                  <input type="hidden" name="temp_id" value="<%= temp_id %>">
                  <input type="hidden" name="temp_name" value="<%= temp_name %>">
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
           </ul>
 <FORM METHOD="POST" ACTION="./temp_add.jsp">          
       <INPUT TYPE="submit" VALUE="追加">
 </FORM>   
</body>