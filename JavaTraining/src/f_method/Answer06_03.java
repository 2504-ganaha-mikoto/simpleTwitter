package f_method;

/**
 * 【メソッド】
 * 下記の例では、掛け算をするメソッドに引数として、計算する2つの値を渡しています。そして、計算結果を戻り値として返しています。
 * 同様に引数で渡された2つの値を「割り算し、計算結果を戻り値として返す」メソッドを作成してみましょう。
 */

public class Answer06_03 {

	public static void main(String[] args) {
		int front = 10;
		int back = 3;

		int product = multiplication(front, back);
		System.out.println(front + "*" + back + "=" + product);

		double quotient = division(front, back);
		System.out.println(front + "/" + back + "=" + quotient);
	}

	private static int multiplication(int front, int back) {
		int result = front * back;
		return result;
	}

	private static double division(double front, double back) {
		double result = front / back;
		return result;
	}
}