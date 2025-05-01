package j_list;

import java.util.ArrayList;

/**
 * 【リスト】
 * 下記の例では、setメソッドを使用して、リストの3番目の要素を
 * 「0」で置き換えて、コンソールに表示しています。
 * 同様に「リストの奇数番目の要素を0で置き換えて」、コンソールに表示してみましょう。
 */

public class Answer10_02 {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(50);
		values.add(55);
		values.add(70);
		values.add(65);
		values.add(80);

		values.set(2, 0);

		for(int i = 0; i < values.size(); i++) {
			if((i + 1) % 2 != 0) {
				values.set(i, 0);
			}
			System.out.println(i + 1 + "番目の要素 : " + values.get(i));
		}
	}
}