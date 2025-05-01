package f_method;

/**
 * 【メソッド】
 * 引数あり・戻り値なし
 * 下記の例では、カウントダウンするメソッドに引数として、カウントダウンを開始する値を渡しています。
 * 同様にカウントアップするメソッドに「引数として、カウントアップを終了する値」を渡してみましょう。
 */

public class Question06_02 {

	public static void main(String[] args) {
		int start = 10;
		countDown(start);
		countUp(start);

	}

	private static void countDown(int start) {
		System.out.println("カウントダウン");

		for(int i = start; i >= 0; i--) {
			System.out.println(i);
		}
	}
	private static void countUp(int start) {
		System.out.println("カウントアップ");

		for(int i = 0; i <= start; i++) {
			System.out.println(i);
		}
	}
	
	
}