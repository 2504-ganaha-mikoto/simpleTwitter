package n_debug;

/**
 * 【デバッグ】
 * 下記の例では、1から20まで順番に表示しています。
 * その数が2で割り切れる場合は「Hoge」、3で割り切れる場合は「Fuga」、
 * 両方で割り切れる場合は「HogeFuga」とコンソールに表示しようとしています。
 * ところが実行すると異なる結果になります。正しく動作するように修正しましょう。
 */

public class Question14_04 {

	public static void main(String[] args) {
		int numHoge = 2;
		int numFuga = 3;
		String strHoge = "Hoge";
		String strFuga = "Fuga";

		for (int i = 1; i <= 20; i++) {
			if (i % numHoge == 0) {
				System.out.println(strHoge);
			} else if (i % numFuga == 0) {
				System.out.println(strFuga);
			} else if ((i % numHoge == 0) && (i % numFuga == 0)) {
				System.out.println(strHoge + strFuga);
			}
		}
	}

}