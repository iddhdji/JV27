package nhs90534;

import java.sql.*;
import java.io.*;

public class class_bean implements Serializable {

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
	String jyouken = "";
	int hit_flag;
	String cla_name, syussekiStr, gakusekiStr, simei_1Str, simei_2Str,
			kana_1Str, kana_2Str, umareStr;
	String table = "class_table";
	String fields = "*";
	String sort = "";

	// コンストラクタ定義
	public class_bean() {
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
			query.append(table);
			query.append(" WHERE ");
			query.append(jyouken);
			query.append(" ");
			query.append(sort);
			ResultSet rs = stmt.executeQuery(query.toString());

			// 検索結果 取得
			if (rs.next() == true) {
				hit_flag = 1;
				cla_name = rs.getString("class_no");
				syussekiStr = rs.getString("syusseki_no");
				gakusekiStr = rs.getString("gakuseki_no");
				simei_1Str = rs.getString("simei_1");
				simei_2Str = rs.getString("simei_2");
				kana_1Str = rs.getString("kana_1");
				kana_2Str = rs.getString("kana_2");
				umareStr = rs.getString("umare");
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
	public void setJyouken(String inJyouken) {
		jyouken = inJyouken;
	}

	// アクセサメソッド（getter）
	public int getHit_flag() {
		return hit_flag;
	}

	public String getCla_name() {
		return cla_name;
	}

	public String getSyusseki() {
		return syussekiStr;
	}

	public String getGakuseki() {
		return gakusekiStr;
	}

	public String getSimei_1() {
		return simei_1Str;
	}

	public String getSimei_2() {
		return simei_2Str;
	}

	public String getKana_1() {
		return kana_1Str;
	}

	public String getKana_2() {
		return kana_2Str;
	}

	public String getUmare() {
		return umareStr;
	}
}