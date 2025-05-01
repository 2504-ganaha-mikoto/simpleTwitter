package jp.alhinc.junit_sample;

public class OddAddition {

	/**
	 * メインメソッド
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;

		for(int i = 1; i <= 100; i++) {
			sum = sum + checkOdd(i);
		}

		System.out.println("結果：" + sum);
	}

	/**
	 * 奇数判定
	 *
	 * @param num
	 * @return	奇数の場合、引数の値
	 * 			偶数の場合、0
	 */
	public static int checkOdd(int num) {

		if((num % 2) != 0) {
			return num;
		}

		return 0;
	}
}
