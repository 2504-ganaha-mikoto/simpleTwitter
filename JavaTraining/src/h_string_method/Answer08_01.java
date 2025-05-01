package h_string_method;

/**
 * 【Stringのメソッド】
 * 下記の例では、startsWithメソッドで文字列が指定した文字列で始まっているか判定し、結果をコンソールに表示しています。
 * 同様にendsWithメソッドを使用して、「文字列が指定した文字列で終わっているか判定」し、結果をコンソールに表示してみましょう。
 */

public class Answer08_01 {

	public static void main(String[] args) {
		String alh = "As Leading Hamonaizer";
		String start = "As";
		String end = "Hamonaizer";

		if(alh.startsWith(start)) {
			System.out.println(alh + "は" + start + "から始まっている");
		}

		if(alh.endsWith(end)) {
			System.out.println(alh + "は" + end + "で終わっている");
		}
	}
}