package nhs90534;

import java.sql.*;
import java.io.*;
import java.util.*;

public class class_bean2 implements Serializable {

	// データベース接続定義
	// ＤＢ：ＵＲＬ
	final String URL = "jdbc:mysql://localhost/nhs90534db?useUnicode=true&characterEncoding=UTF-8";
	// ＤＢ：ユーザ
	final String USER = "root";
	// ＤＢ：パスワード
	final String PASSWORD = "";
	// ＤＢ：ドライバ
	final String DRIVER = "org.gjt.mm.mysql.Driver";

	Connection con = null;
	Statement stmt = null;

	// プロパティ定義
	int hit_flag;
	String jyouken = "";
	String table_name = "";
	String fields = "*";
	String sort = "";
	ArrayList tbl = new ArrayList();

	// String cla_name, syussekiStr, gakusekiStr, simei_1Str, simei_2Str,
	// kana_1Str, kana_2Str, umareStr;
	// String table = "class_table";

	// コンストラクタ定義
	public class_bean2() {
		super();
	}

	// DBアクセス
	public void DBselect() {
		try {

			// MySQL Driver ローディング
			Class.forName(DRIVER);

			// MySQL への接続
			con = DriverManager.getConnection(URL, USER, PASSWORD);

			// SQL 格納
			stmt = con.createStatement();

			// SQL 実行
			Statement stmt = con.createStatement();
			StringBuffer query = new StringBuffer();
			query.append("SELECT ");
			query.append(fields);
			query.append(" from ");
			query.append(table_name);
			query.append(" WHERE ");
			query.append(jyouken);
			query.append(" ");
			query.append(sort);
			System.out.println(query.toString());
			ResultSet rs = stmt.executeQuery(query.toString());

			ResultSetMetaData rsmd = rs.getMetaData();
			// 検索結果 取得
			if (rs.next() == true) {
				hit_flag = 1;
				do {
					ArrayList row = new ArrayList();
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						try {
							row.add(rs.getObject(i).toString());
						} catch (SQLException ex) {
							ex.printStackTrace();
						}
					}
					tbl.add(row);
				} while (rs.next());
			} else {
				hit_flag = 0;
			}

			// 切断
			rs.close();
			stmt.close();
			con.close();

		}
		// 例外処理
		catch (SQLException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	// アクセサメッソド(setter）
	public void setTable(String inTable) {
		table_name = inTable;
	}

	public void setFields(String inFields) {
		fields = inFields;
	}

	public void setJyouken(String inJyouken) {
		jyouken = inJyouken;
	}

	public void setSort(String inSort) {
		sort = inSort;
	}

	// アクセサメソッド（getter）
	public int getHit_flag() {
		return hit_flag;
	}

	public ArrayList getTbl() {
		return tbl;
	}

}
