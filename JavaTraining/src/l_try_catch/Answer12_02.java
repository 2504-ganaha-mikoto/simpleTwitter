package l_try_catch;

/**
 * 【例外処理】
 * 「Nullの変数は参照している時」に発生する「NullPointerException」を発生させてキャッチし、
 * 例外発生時のメッセージをコンソールに表示してみましょう。
 */

public class Answer12_02 {

	public static void main(String[] args) {
		String nullCharacter = null;
		int nullCharacterLength;

		try {
			nullCharacterLength = nullCharacter.length();
		} catch(NullPointerException e) {
			System.out.println("Nullの変数は参照できません。");
			System.out.println(e);
		}
	}

}