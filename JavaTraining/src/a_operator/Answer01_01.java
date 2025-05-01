package a_operator;

/**
 * 【演算子】
 * 下記の例では、コンソールに計算式と加算した結果を表示しています。
 * 同様に「減算」「乗算」「除算」「剰余」の計算式と結果をコンソールに表示してみましょう。
 */

public class Answer01_01 {

	public static void main(String[] args) {
		int num = 3;
		int result = 0;

		//加算
		result = 6 + num;
		System.out.println(6 + "+" + num + "=" + result);

		//減算
		result = 6 - num;
		System.out.println(6 + "-" + num + "=" + result);

		//乗算
		result = 6 * num;
		System.out.println(6 + "*" + num + "=" + result);

		//除算
		result = 6 / num;
		System.out.println(6 + "/" + num + "=" + result);

		//剰余
		result = 6 % num;
		System.out.println(6 + "%" + num + "=" + result);
	}

}
