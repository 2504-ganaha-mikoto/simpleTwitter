package l_try_catch;

/**
 * 【例外処理】
 * 下記の例では、「FileNotFoundException」が発生しないように「FileReader」でファイルを開く前に
 * if文を使って「ファイルが存在するかどうか」の判定をしています。
 * 同様に「数字に変換できない時」に発生する「NumberFormatException」が発生しないように
 * if文を使用し、判定をしてみましょう。
 */

public class Answer12_04 {

	public static void main(String[] args) {
		String notNumber = "1185-KaMaKuRa";
		int num;

		if(!notNumber.matches("^[0-9]+$")) {
			System.out.println("「" + notNumber + "」が数字ではないため、returnで処理を終了します。");
			return;
		}

		try {
			num = Integer.parseInt(notNumber);
		} catch(NumberFormatException e) {
			System.out.println("数字に変換できませんでした。");
			System.out.println(e);
		}
	}

}