package a_operator;

/**
 * 【演算子】
 * 下記の例の①②を記述し、13を5で割った商と余りを表示させてみましょう。
 */

public class Answer01_03 {

	public static void main(String[] args) {
		int num = 13;
		int div = 5;
		int result = 0;

		//①商
		result = num / div;
		System.out.println(num + "を" + div + "で割った商は" + result);

		//②余り
		result = num % div;
		System.out.println(num + "を" + div + "で割った余りは" + result);
	}

}
