package k_map;

import java.util.HashMap;

/**
 * 【マップ】
 * 下記の例では、マップを作成した後にputメソッドを使用して福岡事業所の情報を追加し、
 * getメソッドを使用してコンソールに表示しています。
 * 同様に「マップを作成して横浜事業所の情報を追加」し、コンソールに表示してみましょう。
 */

public class Question11_01 {

	public static void main(String[] args) {
		HashMap<String, String> fukuoka = new HashMap<String, String>();

		fukuoka.put("社名", "ALH株式会社");
		fukuoka.put("福岡事業所", "福岡県福岡市");

		System.out.println(fukuoka.get("社名"));
		System.out.println(fukuoka.get("福岡事業所"));
	}
}