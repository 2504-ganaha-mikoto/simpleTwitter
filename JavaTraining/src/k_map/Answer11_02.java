package k_map;

import java.util.HashMap;

/**
 * 【マップ】
 * 下記の例では、putメソッドを使用してALH株式会社の各事業所の郵便番号の情報が格納されたマップを作成し、
 * keySetメソッドとfor文を使用して、その中身をコンソールに表示しています。
 * (HashMapはデータの格納した順番を保持しないので、コンソールに表示される順番は格納した順番とは異なります)
 * 同様に「キーを郵便番号、バリューに住所」のマップを作成し、その中身をコンソールに表示してみましょう。
 */

public class Answer11_02 {

	public static void main(String[] args) {
		HashMap<String, String> branches = new HashMap<String, String>();

		branches.put("〒153-0063", "東京都目黒区目黒 1-24-12");
		branches.put("〒220-0012", "神奈川県横浜市西区みなとみらい 3-7-1");
		branches.put("〒530-0051", "大阪府大阪市北区太融寺町 3-24");
		branches.put("〒810-0001", "福岡県福岡市中央区天神 1-6-8");

		for(String key : branches.keySet()) {
			System.out.println(key + "の住所は" + branches.get(key) + "です。");
		}
	}
}