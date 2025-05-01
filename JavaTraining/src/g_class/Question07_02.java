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

public class Question07_02 {

	public static void main(String[] args) {
		Human tarao = new Human();
		tarao.nickname = "タラちゃん";
		tarao.age = 3;

		Human sazae = new Human();
		sazae.nickname = "サザエさん";
		sazae.age = 24;
	}

}