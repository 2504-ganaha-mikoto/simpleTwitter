package l_try_catch;

/**
 * 【例外処理】
 * 「配列の要素数を超えるインデックスにアクセスした時」に発生する
 * 「ArrayIndexOutOfBoundsException」を発生させてキャッチし、
 * 例外発生時のメッセージをコンソールに表示してみましょう。
 */

public class Answer12_03 {

	public static void main(String[] args) {
		String[] whatDayOfWeeks = {"月", "火", "水", "木", "金", "土", "日"};
		int index = 100;

		try {
			System.out.println(whatDayOfWeeks[index]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の要素数を超えるインデックスにはアクセスできません。");
			System.out.println(e);
		}
	}

}