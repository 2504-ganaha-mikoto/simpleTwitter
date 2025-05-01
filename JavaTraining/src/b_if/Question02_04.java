package b_if;

/**
 * 【条件分岐】
 * 下記の例は現在の月を入力して日数が31日まであるかどうか判断するプログラムです。
 * 同様にSwitch文を使って英語名でRがつく月かどうか判断するプログラムを作成してみましょう。
 */

public class Question02_04 {

	public static void main(String[] args) {
		//現在の月
		int currentMonth = 5;
		System.out.println("現在は" + currentMonth + "月です。");

		//条件式(31日があるか)
		switch(currentMonth){
			case 2:
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("31日はありません。");
				break;
			default:
				System.out.println("31日まであります。");
		}
		
//		Rがつく月か
		switch (currentMonth) {
		case 5:
		case 6:
		case 7:
		case 8:
			System.out.println("現在はRがつく月ではありません");
			break;

		default:
			System.out.println("現在はRがつく月です");
		}
	}

}
