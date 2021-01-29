<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>

<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

	String user_name,user_code,user_id;
	
	
	//データベースに接続するために使用する変数宣言
	Connection con = null;
	Statement stmt = null;
	StringBuffer SQL = null;
	ResultSet rs = null;

	//ローカルのMySQLに接続する設定
	String USER ="root";
	String PASSWORD = "";
	String URL ="jdbc:mysql://localhost/nhs90534";

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
		SQL.append("select user_tbl.user_id,user_name,user_code from friend_tbl ");
		SQL.append("INNER JOIN user_tbl ON friend_tbl.user_id = user_tbl.user_id ");
		SQL.append("GROUP BY user_name");
      System.out.println(SQL.toString());

		//SQL文の実行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());
%>
<!DOCTYPE html>

<html>

  <head>
    <meta charset="utf-8">
    <title>フレンド追加</title>

    <link rel="stylesheet" type="text/css" href="css/common.css">
  </head>
  <body style="color: #000">
    <h1>フレンド管理</h1>
    <hr>
    <br>
    <h2>フレンド一覧</h2>
    <table>
      <tr>
        <th>name</th>
        <th>ID</th>
      </tr>
      <%
		//入力したデータがデータベースに存在するか調べる
		while (rs.next()) {  //存在する
			//ヒットフラグON
			hit_flag = 1;
			user_id= rs.getString("user_tbl.user_id");
			user_name= rs.getString("user_name");
			user_code= rs.getString("user_code");
%>			
<FORM METHOD="POST" ACTION="./friend_delete_kakunin.jsp">
  <tr>
  
  
  		<td><%= user_name %></td>
        <td><%= user_code %></td>
        <td><a href="./friend_menu.html"><button>貸出・譲渡</button></a></td>
        <input type="hidden" name="user_id" value="<%= user_id %>">
        <input type="hidden" name="user_code" value="<%= user_code %>">
        <td><INPUT TYPE="submit" VALUE="削除"></td>
         </tr>
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
    <br>
        <td><a href="./friend_add.html">フレンド追加</a></td>
    <br>
    <br>
    <a href="./top.html">TOPへ戻る</a>
  </body>
  <% if(ERMSG != null){ %>
予期せぬエラーが発生しました<br />
<%= ERMSG %>
<% }else{ %>
※エラーは発生しませんでした<br/>
<% } %>
</html>