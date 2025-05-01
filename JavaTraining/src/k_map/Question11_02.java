package k_map;

import java.util.HashMap;

/**
 * 【マップ】
 * 下記の例では、putメソッドを使用してALH株式会社の各事業所の郵便番号の情報が格納されたマップを作成し、
 * keySetメソッドとfor文を使用して、その中身をコンソールに表示しています。
 * (HashMapはデータの格納した順番を保持しないので、コンソールに表示される順番は格納した順番とは異なります)
 * 同様に「キーを郵便番号、バリューに住所」のマップを作成し、その中身をコンソールに表示してみましょう。
 */

public class Question11_02 {

	public static void main(String[] args) {
		HashMap<String, String> branches = new HashMap<String, String>();

		branches.put("東京本社", "〒153-0063");
		branches.put("横浜事業所", "〒220-0012");
		branches.put("大阪事業所", "〒530-0051");
		branches.put("福岡事業所", "〒810-0001");

		for(String key : branches.keySet()) {
			System.out.println(key + "の郵便番号は" + branches.get(key) + "です。");
		}
	}
}