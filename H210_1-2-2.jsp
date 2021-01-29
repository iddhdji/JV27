<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>

<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");

String master_id= request.getParameter("master_id");
	String fix_id = request.getParameter("fix_id");
	String object_name;
	
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
		SQL.append("SELECT object_name FROM object_tbl ");
	SQL.append("INNER JOIN master_tbl ON object_tbl.master_id = master_tbl.master_id ");
	SQL.append("INNER JOIN fix_tbl ON object_tbl.fix_id = fix_tbl.fix_id ");
	SQL.append("WHERE object_tbl.fix_id = '");
	SQL.append(fix_id);
	SQL.append("' ");
	SQL.append("AND object_tbl.master_id = '");
	SQL.append(master_id);
	SQL.append("'");
      System.out.println(SQL.toString());

		//SQL文の実行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());
%>
<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

  <title>未来創造展H210</title>
    <!-- <link rel="stylesheet" type="text/css" href="css/reset.css"> -->
    <link rel="stylesheet" type="text/css" href="css/common9.css">
  </head>


  <header>
    <h1 class=""></h1>
  </header>
  <body>
    
    <nav id="nav_a">
      <ul>
        <li>
          <a class="a_a" href="H210_1-1-1.html">モノ検索</a>
          <a class="a_a" href="H210_1-2-1.html">一覧表示</a>
          <a class="a_a" href="H210_1-3-1.html">エリア編集</a>
        </li>
      </ul>
    </nav>
  <hr>

    <h2>詳細表示</h2>
  <div id="div_b">

<table class="table_box">
  <tr>
    <th>小物</th>
    <th>詳細</th>
  </tr>
  <%
		//入力したデータがデータベースに存在するか調べる
		while (rs.next()) {  //存在する
			//ヒットフラグON
			hit_flag = 1;
			object_name= rs.getString("object_name");
%>			
<FORM METHOD="POST" ACTION="./template_change.jsp">
<tr>
    <td><%= object_name %></td>
        <td><INPUT TYPE="submit" VALUE="詳細"></td>
    <input type="hidden" name="object_name" value="<%= object_name %>">
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
      <div id="div_a">
       <a class="a_b" href="H210_index.html">項目画面へ戻る</a>
      </div>
  </div>
<% if(ERMSG != null){ %>
予期せぬエラーが発生しました<br />
<%= ERMSG %>
<% }else{ %>
※エラーは発生しませんでした<br/>
<% } %>
</body>

</html>



