package c_logical_operator;

/**
 * 【論理演算子】
 * FizzBuzz問題
 * 指定した数字について以下の条件の通りに表示されるプログラムを書いてみましょう。
 * ・3で割り切れるときは「Fizz」と表示
 * ・5で割り切れるときは「Buzz」と表示
 * ・両方で割り切れるときは「FizzBuzz」と表示
 * ・以上の条件のどれにも当てはまらない場合は指定された数字をそのまま表示する。
 */

public class Question03_03 {

	public static void main(String[] args) {
		int num;

		// 15の場合(任意)
		num = 15;

		// 条件
		if ((num % 3 == 0) && ( num % 5 == 0)) {
			System.out.println("FizzBuzz");
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(num);
		}
	}

}
