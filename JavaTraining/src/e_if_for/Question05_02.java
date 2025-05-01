package e_if_for;

/**
 * 【条件分岐と繰り返し】
 * 次のプログラムを作成してみましょう。
 * 巨人、阪神戦で毎回の得点を入力する。（1回～9回, 先行を巨人とする）
 * ゲームごとのそれぞれの得点を表示する。
 * 9回裏までそれぞれの得点を合計し、どちらが勝ったかを表示する。
 */

public class Question05_02 {

	public static void main(String[] args) {
		//巨人先行、9回裏までの得点(任意)
		int[] score = { 0, 1, 2, 1, 0, 3, 0, 1, 0, 1, 0, 1, 0, 0, 2, 1, 3, 0 };

		//巨人の点数
		int giants = 0;

		//阪神の点数
		int tigers = 0;

		//繰り返し処理
		for (int i = 1; i < 18; i++) {
			if (i % 2 != 0) {
				giants += score[(i - 1)];
			} else {
				tigers += score[(i - 1)];

			}
		}
		//結果の判定処理
		System.out.println("巨人の点数は" + giants + "点です");
		System.out.println("阪神の点数は" + tigers + "点です");

	}

}