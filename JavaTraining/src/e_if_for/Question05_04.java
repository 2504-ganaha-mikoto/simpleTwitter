package e_if_for;

/**
 * 【条件分岐と繰り返し】
 * 10 回入力された整数の、最大値と最小値を求めるプログラムを作成してみましょう。
 */

public class Question05_04 {

	public static void main(String[] args) {
		//自然数（正の整数）(任意)
		int[] num = { 1, 9, 93, 19, 11, 76, 9, 66, 44, 33 };
		int maxValue = 0;
		int minValue = 0;

		//処理
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (i > j) {
					maxValue = i;
				}else if (j > i) {
					minValue = i;
				}
			}

		}
		System.out.println("最大値=" + maxValue + " 最小値=" + minValue);
	}

}