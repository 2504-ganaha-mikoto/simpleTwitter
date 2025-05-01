package j_list;

import java.util.ArrayList;

/**
 * 【リスト】
 * 下記の例では、リストを作成した後にaddメソッドを使用して数字を追加し、コンソールに表示しています。
 * 同様に「リストを作成してA~Eのアルファベットを追加」し、コンソールに表示してみましょう。
 */

public class Answer10_01 {

	public static void main(String[] args) {
		ArrayList<Integer> values = new ArrayList<Integer>();

		values.add(50);
		values.add(55);
		values.add(70);
		values.add(65);
		values.add(80);

		for(int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}

		ArrayList<String> alphabets = new ArrayList<String>();

		alphabets.add("A");
		alphabets.add("B");
		alphabets.add("C");
		alphabets.add("D");
		alphabets.add("E");

		for(int i = 0; i < alphabets.size(); i++) {
			System.out.println(alphabets.get(i));
		}
	}
}