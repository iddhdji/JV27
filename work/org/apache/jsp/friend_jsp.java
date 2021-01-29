package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.HashMap;
import java.util.ArrayList;

public final class friend_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>フレンド追加</title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\">\r\n");
      out.write("  </head>\r\n");
      out.write("  <body style=\"color: #000\">\r\n");
      out.write("    <h1>フレンド管理</h1>\r\n");
      out.write("    <hr>\r\n");
      out.write("    <br>\r\n");
      out.write("    <h2>フレンド一覧</h2>\r\n");
      out.write("    <table>\r\n");
      out.write("      <tr>\r\n");
      out.write("        <th>name</th>\r\n");
      out.write("        <th>ID</th>\r\n");
      out.write("      </tr>\r\n");
      out.write("      ");

		//入力したデータがデータベースに存在するか調べる
		while (rs.next()) {  //存在する
			//ヒットフラグON
			hit_flag = 1;
			user_id= rs.getString("user_tbl.user_id");
			user_name= rs.getString("user_name");
			user_code= rs.getString("user_code");

      out.write("\t\t\t\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"./friend_delete_kakunin.jsp\">\r\n");
      out.write("  <tr>\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("  \t\t<td>");
      out.print( user_name );
      out.write("</td>\r\n");
      out.write("        <td>");
      out.print( user_code );
      out.write("</td>\r\n");
      out.write("        <td><a href=\"./friend_menu.html\"><button>貸出・譲渡</button></a></td>\r\n");
      out.write("        <input type=\"hidden\" name=\"user_id\" value=\"");
      out.print( user_id );
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" name=\"user_code\" value=\"");
      out.print( user_code );
      out.write("\">\r\n");
      out.write("        <td><INPUT TYPE=\"submit\" VALUE=\"削除\"></td>\r\n");
      out.write("         </tr>\r\n");
      out.write("\t\t    </FORM>\r\n");

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

      out.write("\r\n");
      out.write("  </FORM>\r\n");
      out.write("    </table>\r\n");
      out.write("    <br>\r\n");
      out.write("        <td><a href=\"./friend_add.html\">フレンド追加</a></td>\r\n");
      out.write("    <br>\r\n");
      out.write("    <br>\r\n");
      out.write("    <a href=\"./top.html\">TOPへ戻る</a>\r\n");
      out.write("  </body>\r\n");
      out.write("  ");
 if(ERMSG != null){ 
      out.write("\r\n");
      out.write("予期せぬエラーが発生しました<br />\r\n");
      out.print( ERMSG );
      out.write('\r');
      out.write('\n');
 }else{ 
      out.write("\r\n");
      out.write("※エラーは発生しませんでした<br/>\r\n");
 } 
      out.write("\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
