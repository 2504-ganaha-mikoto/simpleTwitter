package e_if_for;

/**
 * 【条件分岐と繰り返し】
 * 次の配列に格納されている値を昇順で並び替えてみましょう。
 */

public class Answer05_05 {

	public static void main(String[] args) {
		int[] values = {32, 23, 56, 12, 63, 1, 33, 28, 91, 75, 43, 51};

		for(int i = 0; i < values.length; i++) {
			for(int j = i + 1; j < values.length; j++) {
				if(values[i] > values[j]) {
					int max = values[i];
					int min = values[j];
					values[i] = min;
					values[j] = max;
				}
			}
		}

		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}

}

