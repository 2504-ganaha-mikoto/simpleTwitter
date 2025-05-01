package h_string_method;

/**
 * 【Stringのメソッド】
 * 下記の例では、splitメソッドで文字列を指定した文字で分割し、結果をコンソールに表示しています。
 * 同様に「2020-12-31」をいう文字列を分割し、コンソールに「2020年12月31日」という文字列を表示してみましょう。
 */

public class Answer08_03 {

	public static void main(String[] args) {
		String department = "CEH,MTL,AMU,ROU,GAU,FAU";
		String[] departments = department.split(",");

		for(int i = 0; i < departments.length; i++) {
			System.out.println(departments[i]);
		}

		String sampleDate = "2020-12-31";
		String[] splitDate = sampleDate.split("-");

		System.out.println(splitDate[0] + "年" + splitDate[1] + "月" + splitDate[2] + "日");
	}
}