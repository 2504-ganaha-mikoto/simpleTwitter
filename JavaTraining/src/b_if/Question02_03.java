package b_if;

/**
 * 【条件分岐】
 * 下記の例では、自販機で130円のジュースを購入するのに500円を投入した際のおつりを計算して、
 * どの硬貨が何枚になるかを判定し、コンソールに表示しています。
 * 同様に140円の商品を購入するのに1,000円を投入した場合のおつりを計算して、
 * どの硬貨が何枚になるかを判定し、コンソールに表示してみましょう。
 */

public class Question02_03 {

	public static void main(String[] args) {
		int money = 500;
		int product = 130;
		int change = money - product;

		System.out.println(product + "円の商品を" + money + "円で購入した場合のおつりは・・・");

		if(change / 100 >= 1) {
			System.out.println("100円玉は" + (change / 100) + "枚");
			change = change % 100;
		}

		if(change / 50 >= 1) {
			System.out.println("50円玉は" + (change / 50) + "枚");
			change = change % 50;
		}

		if(change / 10 >= 1) {
			System.out.println("10円玉は" + (change / 10) + "枚");
			change = change % 10;
		}
	}

}
