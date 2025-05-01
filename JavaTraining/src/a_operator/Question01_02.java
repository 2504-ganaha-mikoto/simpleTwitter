package a_operator;

/**
 * 【演算子】
 * 下記の例の①②を下の仕様に基づいて記述してみましょう。
 */

public class Question01_02 {

	public static void main(String[] args) {
		int num = 3;
		int incrementResult = 0;
		int decrementResult = 0;

		//① インクリメント演算子を用いてnumを1加算してください。
		num += 1;
		incrementResult = num;
		System.out.println("3を1加算した数は" + incrementResult);
		num = 3;

		//② デクリメント演算子を用いてnumを1減算してください。
		num -= 1;
		decrementResult = num;
		System.out.println("3を1減算した数は" + decrementResult);
		
	}

}
