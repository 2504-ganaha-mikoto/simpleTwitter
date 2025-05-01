package e_if_for;

/**
 * 【条件分岐と繰り返し】
 * 次のプログラムを作成してみましょう。
 * 巨人、阪神戦で毎回の得点を入力する。（1回～9回, 先行を巨人とする）
 * ゲームごとのそれぞれの得点を表示する。
 * 9回裏までそれぞれの得点を合計し、どちらが勝ったかを表示する。
 */

public class Answer05_02 {

	public static void main(String[] args) {
		//巨人先行、9回裏までの得点(任意)
		int[] score = { 0, 1, 2, 1, 0, 3, 0, 1, 0, 1, 0, 1, 0, 0, 2, 1, 3, 0};

		//巨人の点数
		int giants = 0;

		//阪神の点数
		int tigers = 0;

		//繰り返し処理
		for (int game = 1; game <= 9; game++) {
			System.out.println(game + "回表、巨人の得点は？" + score[2 * game - 2]);
			giants += score[2 * game - 2];

			System.out.println(game + "回裏、阪神の得点は？" + score[2 * game - 1]);
			tigers += score[2 * game - 1];
		}

		System.out.println("巨人：" + giants + "点, 阪神：" + tigers + "点");

		//結果の判定処理
		if (giants > tigers) {
			System.out.println("巨人の勝ち");
		} else if (giants < tigers) {
			System.out.println("阪神の勝ち");
		} else {
			System.out.println("引き分け");
		}
	}

}