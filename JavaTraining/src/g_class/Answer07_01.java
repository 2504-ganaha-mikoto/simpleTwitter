package g_class;

/**
 * 【クラス】
 * 下記の例では、Humanクラスをインスタンス化し、変数に値を代入してコンソールに表示しています。
 * 同様に「自分自身の情報を持った変数を作成」し、コンソールに表示してみましょう。
 */

public class Answer07_01 {

	public static void main(String[] args) {
		Human tarao = new Human();
		tarao.nickname = "タラちゃん";
		tarao.age = 3;
		System.out.println(tarao.nickname + "は" + tarao.age + "歳");

		Human sazae = new Human();
		sazae.nickname = "サザエさん";
		sazae.age = 24;
		System.out.println(sazae.nickname + "は" + sazae.age + "歳");
	}

}