package e_if_for;

/**
 * 【条件分岐と繰り返し】
 * 10 回入力された整数の、最大値と最小値を求めるプログラムを作成してみましょう。
 */

public class Answer05_04 {

	public static void main(String[] args) {
		//自然数（正の整数）(任意)
		int[] num = { 1, 9, 93, 19, 11, 76, 9, 66, 44, 33 };
		int maxValue = 0;
		int minValue = 0;

		//処理
		for (int i = 0; i < 10; i++) {
			int value = num[i];

			if (i == 0) {
				maxValue = value;
				minValue = value;
			} else {
				if (value > maxValue) {
					maxValue = value;
				}
				if (value < minValue) {
					minValue = value;
				}
			}
		}

		System.out.println("最大値=" + maxValue + " 最小値=" + minValue);
	}

}