package b_if;

/**
 * 【条件分岐】
 * 下記の例では、変数numの値が20の場合、コンソールに表示しています。
 * 同様に「numが10でない」「numが偶数」「numを3で割った余りが2」の場合をコンソールに表示してみましょう。
 */

public class Answer02_01 {

	public static void main(String[] args) {
		int num = 20;

		//変数numの値が20の場合
		if(num == 20) {
			System.out.println("numは20である");
		}

		//変数numが10でない場合
		if(num != 10) {
			System.out.println("numは10でない");
		}

		//変数numが偶数の場合
		if((num % 2) == 0) {
			System.out.println("numは偶数");
		}

		//変数numを3で割った余りが2の場合
		if((num % 3) == 2) {
			System.out.println("numを3で割った余りが2");
		}
	}

}
