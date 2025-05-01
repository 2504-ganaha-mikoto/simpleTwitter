package l_try_catch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 【例外処理】
 * 下記の例では、「存在しないファイルを開こうとした時」に発生する「FileNotFoundException」をキャッチし、
 * 例外発生時のメッセージをコンソールに表示しています。
 * 同様に「数字に変換できない時」に発生する「NumberFormatException」を発生させてキャッチし、
 * 例外発生時のメッセージをコンソールに表示してみましょう。
 */

public class Question12_01 {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		try {
			FileReader fr = new FileReader(file);
		} catch(FileNotFoundException e) {
			System.out.println("ファイルが存在しません。");
			System.out.println(e);
		}
	}

}