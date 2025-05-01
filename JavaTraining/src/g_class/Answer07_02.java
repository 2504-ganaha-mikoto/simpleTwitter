package g_class;

/**
 * 【クラス】
 * サザエさんは何歳でタラちゃんを出産したのか年齢差を計算して、その結果をコンソールに表示してみましょう。
 * 条件は下記の通りです。
 * ・Humanクラスを使用すること
 * ・計算結果を戻り値として返すメソッドを作成すること
 * ・結果はmainメソッドで表示すること
 * ・サザエさんとタラちゃんの誕生日は考慮しないこと
 */

public class Answer07_02 {

	public static void main(String[] args) {
		Human tarao = new Human();
		tarao.nickname = "タラちゃん";
		tarao.age = 3;

		Human sazae = new Human();
		sazae.nickname = "サザエさん";
		sazae.age = 24;

		int difference = subtraction(sazae.age, tarao.age);
		System.out.println(sazae.nickname + "は" + difference + "歳で" + tarao.nickname + "を出産した");
	}

	private static int subtraction(int front, int back) {
		int result = front - back;
		return result;
	}
}