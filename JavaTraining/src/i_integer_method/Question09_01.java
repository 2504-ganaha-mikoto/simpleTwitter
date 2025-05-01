package i_integer_method;

/**
 * 【Integerのメソッド】
 * 下記の例では、parseIntメソッドで文字列を整数型に変換し、判定結果をコンソールに表示しています。
 * 同様にvalueOfメソッドで「文字列を整数型に変換」し、判定結果をコンソールに表示してみましょう。
 */

public class Question09_01 {

	public static void main(String[] args) {
		int value = Integer.parseInt("100");

		if(value < 500) {
			System.out.println(value + "は500未満");
		} else {
			System.out.println(value + "は500以上");
		}
	}
}