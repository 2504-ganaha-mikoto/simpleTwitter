package e_if_for;

/**
 * 【条件分岐と繰り返し】
 * 入力された数が素数かどうかを判定するプログラムを作成しなさい。
 * 素数：正の約数の個数が 2 である自然数
 */

public class Question05_03 {

	public static void main(String[] args) {
		//指定した数字(任意)
		int value = 77;

		//処理
		for (int i = 2; i < value; i++) {
			if (value % i == 0) {
				System.out.println(value + " は素数ではありません");
				return;
			}
		}

		System.out.println(value + " は素数です");
	}

}