package l_try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 【例外処理】
 * 下記の例では、「FileNotFoundException」が発生しないように「FileReader」でファイルを開く前に
 * if文を使って「ファイルが存在するかどうか」の判定をしています。
 * 同様に「数字に変換できない時」に発生する「NumberFormatException」が発生しないように
 * if文を使用し、判定をしてみましょう。
 */

public class Question12_04 {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		if(!file.exists() ) {
			System.out.println("ファイルの存在が確認できなかったので、returnで処理を終了します。");
			return;
		}

		try {
			FileReader fr = new FileReader(file);
		} catch(FileNotFoundException e) {
			System.out.println("ファイルが存在しません。");
			System.out.println(e);
		}
	}

}