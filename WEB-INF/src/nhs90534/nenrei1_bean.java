package nhs90534;

import java.io.*;
import java.util.Calendar;

public class nenrei1_bean implements Serializable {

	// プロパティ定義

	private int toshi;
	private int nen;
	private int tuki;
	private int hi;

	// コンストラクタ定義
	public nenrei1_bean() {
		super();
	}

	// 処理メッソド
	public void keisan() {
		Calendar cal = Calendar.getInstance();
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;
		int dd = cal.get(Calendar.DATE);
		toshi = yy - nen;
		if (mm < tuki) {
			toshi = toshi - 1;
		} else {
			if (mm == tuki && dd < hi) {
				toshi = toshi - 1;
			}
		}
	}

	// アクセサメッソド(setter）
	public void setNen(int inNen) {
		nen = inNen;
	}

	public void setTuki(int inTuki) {
		tuki = inTuki;
	}

	public void setHi(int inHi) {
		hi = inHi;
	}

	// アクセサメソッド（getter）
	public int getNenrei() {
		return toshi;
	}
}