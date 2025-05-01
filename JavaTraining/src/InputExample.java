import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {

	public static void main(String[] args) {
		System.out.println("あなたのお名前は？");
		//ステップ1の処理です
		InputStreamReader in = new InputStreamReader(System.in);
		//ステップ2の処理です
		BufferedReader reader = new BufferedReader(in);

		try {
			//ステップ3の処理です
			String name = reader.readLine();
			//読み取った内容を出力します
			System.out.println("こんにちは。" + name + "さん");
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}

