package k_map;

import java.util.HashMap;

/**
 * 【マップ】
 * 下記の例では、テストの情報が格納されたマップを作成した後に「理科の点数に5点を加算」し、その中身をコンソールに表示しています。
 * (HashMapはデータの格納した順番を保持しないので、コンソールに表示される順番は格納した順番とは異なります)
 * 同様に「90点以下のテストの結果に10点を加算」し、その中身をコンソールに表示してみましょう。
 */

public class Answer11_03 {

	public static void main(String[] args) {
		HashMap<String, Integer> branches = new HashMap<String, Integer>();

		branches.put("国語", 87);
		branches.put("数学", 81);
		branches.put("社会", 94);
		branches.put("理科", 79);
		branches.put("英語", 85);

		for(String key : branches.keySet()) {
			if(branches.get(key) <= 90) {
				int sum = branches.get(key) + 10;
				branches.put(key, sum);
			}
			System.out.println(key + "の点数は" + branches.get(key) + "点です。");
		}
	}
}