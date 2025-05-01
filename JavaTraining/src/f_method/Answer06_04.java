package f_method;

/**
 * 【メソッド】
 * 下記の例では、２つの整数の大きい方を選ぶメソッドに引数として、比較する2つの値を渡しています。
 * そして、比較結果を戻り値として返しています。
 * 同様に引数で渡された2つの値を「比較し、小さい方の数値を戻り値として返す」メソッドを作成してみまょう。
 * また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、
 * 最も小さい数値を表示するプログラムを作成してみましょう。
 */

public class Answer06_04 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;

		//最大値を表示する
		System.out.println(maxValue(x, maxValue(y, z)));

		//最小値を表示する
		System.out.println(minValue(x, minValue(y, z)));
	}

	static int maxValue(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}
	}

	static int minValue(int n1, int n2) {
		if (n1 < n2) {
			return n1;
		} else {
			return n2;
		}
	}
}