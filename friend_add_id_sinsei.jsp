<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%
	//文字コードの指定
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	
	//入力データ受信
	String user_idStr  = request.getParameter("user_id");
	
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
	
	int ins_count =0;
	
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
		SQL.append("select * from friend_tbl where user_id = '");
		SQL.append(user_idStr);
		SQL.append("'");
      System.out.println(SQL.toString());

		//SQL文の実行（選択クエリ）
		rs = stmt.executeQuery(SQL.toString());

		//入力したデータがデータベースに存在するか調べる
		if(rs.next()){  //存在する	
			//ヒットフラグON
			hit_flag = 1;
		}else{  //存在しない
			//ヒットフラグOFF
		hit_flag = 0;
		SQL = new StringBuffer();
		SQL.append("insert into friend_tbl(user_id)");
		SQL.append("values('");
		SQL.append(user_idStr);
		SQL.append("')");
      System.out.println(SQL.toString());
      
      ins_count = stmt.executeUpdate(SQL.toString());
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
<!DOCTYPE html>

<html>

  <head>
    <meta charset="utf-8">
    <title>ID検索</title>

    <link rel="stylesheet" type="text/css" href="css/common.css">
  </head>
  <body style="color: #000">
    <h1>フレンド追加</h1>
    <hr>
    <br>
    <%
	if(hit_flag == 1){  //認証OK
%>
認証NG<br>
<%= "入力されたフレンドは既に存在しています" %>
<%
	}else if(ins_count==0){  //認証NG
%>
	追加NG<br>
	  <%= "登録処理が失敗しました" %>
<%
	}else{  //認証NG
%>
	追加OK<br>
	<p>フレンド申請を送信しました。</p>
<%
	}
%>
    <br>
    <br>
    <a href="./friend.html">戻る</a>
  </body>
</html>