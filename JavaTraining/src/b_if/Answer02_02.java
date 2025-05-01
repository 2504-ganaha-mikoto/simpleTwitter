package b_if;

/**
 * 【条件分岐】
 * 下記の例では、変数yearの値を「4」で割り算し、割り切れた場合はうるう年としてコンソールに表示しています。
 * うるう年を判定する条件として下記条件を追加してください。
 * ・4の倍数のかつ100の倍数になる年の中で400で割り切れない年はうるう年ではない
 */

public class Answer02_02 {

	public static void main(String[] args) {
		int year = 2100;

		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println(year + "年はうるう年です。");
				} else {
					System.out.println(year + "年はうるう年ではありません。");
				}
			} else {
				System.out.println(year + "年はうるう年です。");
			}
		} else {
			System.out.println(year + "年はうるう年ではありません。");
		}
	}

}
