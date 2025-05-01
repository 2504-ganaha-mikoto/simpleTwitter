package d_array_for;

/**
 * 【配列と繰り返し】
 * 下記の例では、配列valuesの値を全てコンソールに表示しています。
 * 同様に「配列valuesの要素数、1番目から3番目の値」をコンソールに表示してみましょう。
 * ※ 配列の要素は0番目から始まります。
 */

public class Question04_01 {

	public static void main(String[] args) {
		int[] values = {50, 55, 70, 65, 80};

		//全要素
		System.out.println("全要素の値");

		for(int i = 0; i < values.length; i++) {
			System.out.println("values[" + i + "]=" + values[i]);
		}
	}

}