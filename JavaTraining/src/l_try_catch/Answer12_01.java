package l_try_catch;

/**
 * 【例外処理】
 * 下記の例では、「存在しないファイルを開こうとした時」に発生する「FileNotFoundException」をキャッチし、
 * 例外発生時のメッセージをコンソールに表示しています。
 * 同様に「数字に変換できない時」に発生する「NumberFormatException」を発生させてキャッチし、
 * 例外発生時のメッセージをコンソールに表示してみましょう。
 */

public class Answer12_01 {

	public static void main(String[] args) {
		String notNumber = "1185-KaMaKuRa";
		int num;

		try {
			num = Integer.parseInt(notNumber);
		} catch(NumberFormatException e) {
			System.out.println("数字に変換できませんでした。");
			System.out.println(e);
		}
	}

}