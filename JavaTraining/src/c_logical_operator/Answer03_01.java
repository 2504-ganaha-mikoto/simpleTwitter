package c_logical_operator;

/**
 * 【論理演算子】
 * 下記の例では、middleはsmallよりも大きい かつ largeはmiddleよりも大きい場合、コンソールに表示しています。
 * 同様に「middleとmediumは等しくない または largeはsmallよりも大きい」「middleはsmallの2倍以上大きく、
 * largeはsmallの3倍と等しい」場合をコンソールに表示してみましょう。
 */

public class Answer03_01 {

	public static void main(String[] args) {
		int small = 5;
		int middle = 10;
		int medium = 10;
		int large = 15;

		//middleはsmallよりも大きい かつ largeはmiddleよりも大きい
		if((small < middle) && (middle < large)) {
			System.out.println("middleはsmallよりも大きい かつ largeはmiddleよりも大きい");
		}

		//middleとmediumは等しくない または largeはsmallよりも大きい
		if((middle != medium) || (small < large)) {
			System.out.println("middleとmediumは等しくない または largeはsmallよりも大きい");
		}

		//middleはsmallの2倍以上大きく、largeはsmallの3倍と等しい
		if(((small * 2) <= middle) && ((small * 3) == large)) {
			System.out.println("middleはsmallの2倍以上大きく、largeはsmallの3倍と等しい");
		}
	}

}
