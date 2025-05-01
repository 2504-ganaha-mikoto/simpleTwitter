package l_try_catch;

/**
 * 【例外処理】
 * 「配列の要素数を超えるインデックスにアクセスした時」に発生する
 * 「ArrayIndexOutOfBoundsException」が発生しないように
 * if文を使用し、判定をしてみましょう。
 */

public class Answer12_06 {

	public static void main(String[] args) {
		String[] whatDayOfWeeks = {"月", "火", "水", "木", "金", "土", "日"};
		int index = 100;

		if(whatDayOfWeeks.length <= index) {
			System.out.println("「index」の値が「whatDayOfWeeks」の要素数を超えているため、returnで処理を終了します。");
			return;
		}

		try {
			System.out.println(whatDayOfWeeks[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えるインデックスにはアクセスできません。");
			System.out.println(e);
		}
	}

}