package n_debug;

/**
 * 【デバッグ】
 * プログラミングにはバグやエラーがつきものです。
 * 入力間違いや勘違いなど、様々な理由でバグやエラーが発生します。
 *
 * エラーの種類は大きく分けて2つに分類されます。
 * ①コンパイルエラー：作成したJavaプログラムをコンパイルするときに起きるエラーです。Eclipse上では赤い波線が表示されます。
 * ②ランタイムエラー：作成したJavaプログラムをコンパイルし、実行するときに起きるエラーです。Eclipse上では何も表示されません。
 *
 * バグやランタイムエラーが発生した場合に デバッグを用いて原因究明を行うことが多いです。
 * 実際に、デバッグを行いながら問題を解いていきましょう。
 *
 * 下記の例では、2つの文字列を比較し、trueをコンソールに表示しようとしています。
 * ところが実行すると異なる結果になります。正しく動作するように修正しましょう。
 */

public class Question14_01 {

	public static void main(String[] args) {
		String str1 = "Harmonize";
		String str2 = "Harmo";
		String str3 = str2 + "nize";

		boolean result = stringComparison(str1, str3);
		System.out.println(result);
	}

	public static boolean stringComparison(String str1, String str2) {
		return str1 == str2;
	}

}