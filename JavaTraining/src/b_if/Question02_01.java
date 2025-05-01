package b_if;

/**
 * 【条件分岐】
 * 下記の例では、変数numの値が20の場合、コンソールに表示しています。
 * 同様に「numが10でない」「numが偶数」「numを3で割った余りが2」の場合をコンソールに表示してみましょう。
 */

public class Question02_01 {

	public static void main(String[] args) {
		int num = 20;

		//変数numの値が20の場合
		if(num == 20) {
			System.out.println("numは20である");
		}
		
		if (num != 10) {
			System.out.println("numは10でない");
		}
		
		if (num % 2 == 0) {
			System.out.println("numは偶数である");
		}
		
		
	}

}
