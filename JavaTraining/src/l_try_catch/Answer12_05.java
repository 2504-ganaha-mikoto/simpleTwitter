package l_try_catch;

/**
 * 【例外処理】
 * 「Nullの変数は参照している時」に発生する「NullPointerException」が発生しないように
 * if文を使用し、判定をしてみましょう。
 */

public class Answer12_05 {

	public static void main(String[] args) {
		String nullCharacter = null;
		int nullCharacterLength;

		if(nullCharacter == null) {
			System.out.println("「nullCharacter」がNULL値のため、returnで処理を終了します。");
			return;
		}
	}

}