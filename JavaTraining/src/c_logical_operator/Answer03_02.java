package c_logical_operator;

/**
 * 【論理演算子】
 * 指定した年が夏季または冬季オリンピックがある年かどうか表示するプログラムを作成しましょう。
 * ただし条件は以下の通りとします。
 * ・4または2で割り切れる場合「夏季もしくは冬季のオリンピック開催年です」と表示します。
 * ・4でも2でも割り切れない場合「オリンピック開催年ではありません」と表示します。
 */

public class Answer03_02 {

	public static void main(String[] args) {
		int year;
		// 2016年の場合
		year = 2022;

		// 条件

		if ((year % 4 == 0) || (year % 4 == 2)) {
			// 「OR」の例
			System.out.println(year + "年は、夏季もしくは冬季のオリンピック開催年です！");
		} else if (!(year % 4 == 0) && !(year % 4 == 2)) {
			// 「NOT」と「AND」の例
			System.out.println(year + "年は、オリンピック開催年ではありません！");
		}
	}

}
