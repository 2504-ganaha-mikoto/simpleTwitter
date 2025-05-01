package c_logical_operator;

/**
 * 【論理演算子】
 * 下記の例では中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、
 * 両方とも 60 点以上の場合、合格と表示しています。
 * 次の条件に従って合格、不合格を判定するプログラムを作成してみましょう。
 * ・両方とも 60 点以上の場合、合格
 * ・合計が 130 点以上の場合、合格
 * ・合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
 * ・上記以外は不合格
 */

public class Answer03_04 {

	public static void main(String[] args) {
		int midTermScore = 80;
		int FinalScore = 60;

		//条件式
		if (midTermScore >= 60 && FinalScore >= 60) {
			System.out.println("合格");
		} else if ((midTermScore + FinalScore) >= 130) {
			System.out.println("合格");
		} else if ((midTermScore + FinalScore) >= 100 && (midTermScore >= 90 || FinalScore >= 90)) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}

}
