package c_logical_operator;

/**
 * 【論理演算子】
 * 下記の例では、middleはsmallよりも大きい かつ largeはmiddleよりも大きい場合、コンソールに表示しています。
 * 同様に「middleとmediumは等しくない または largeはsmallよりも大きい」「middleはsmallの2倍以上大きく、
 * largeはsmallの3倍と等しい」場合をコンソールに表示してみましょう。
 */

public class Question03_01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int small = 5;
		int middle = 10;
		int medium = 10;
		int large = 15;

		//middleはsmallよりも大きい かつ largeはmiddleよりも大きい
		if ((small < middle) && (middle < large)) {
			System.out.println("middleはsmallよりも大きい かつ largeはmiddleよりも大きい");
		}
		//		middleとmediumは等しくない または largeはsmallよりも大きい
		if ((middle != medium) || (large > small)) {
			System.out.println("middleとmediumは等しくない または largeはsmallよりも大きい");
		}
		//		middleはsmallの2倍以上大きく、largeはsmallの3倍と等しい
		if ((middle >= (small * 2)) && (large == (small * 3))) {
			System.out.println("middleはsmallの2倍以上大きく、largeはsmallの3倍と等しい");

		}

	}

}
