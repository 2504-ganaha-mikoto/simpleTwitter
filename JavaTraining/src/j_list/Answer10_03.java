package j_list;

import java.util.ArrayList;

/**
 * 【リスト】
 * 下記の例では、getメソッドでリストの2番目の要素を取得した後に2倍にして、
 * setメソッドで置き換えてからコンソールに表示しています。
 * 同様に「リストの偶数番目の要素を3倍」にして、コンソールに表示してみましょう。
 */

public class Answer10_03 {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(50);
		values.add(55);
		values.add(70);
		values.add(65);
		values.add(80);

		for(int i = 0; i < values.size(); i++) {
			if((i + 1) % 2 == 0) {
				int multiple = values.get(i) * 3;
				values.set(i, multiple);
			}
			System.out.println(i + 1 + "番目の要素 : " + values.get(i));
		}
	}
}