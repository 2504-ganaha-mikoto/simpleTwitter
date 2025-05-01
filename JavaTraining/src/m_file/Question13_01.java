package m_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 【FileReaderとBufferedReader】
 *
 * 前提条件
 * PCのデスクトップ上に「sample.txt」というファイルを作成してください。
 * sample.txtの中身は下記の通りにしてください。
 *
 * 北海道
 * 宮城
 * 石川
 * 島根
 * 鳥取
 * 熊本
 *
 * ※ ファイルを作成する際は、「サクラエディタ」を使用し、文字コードを「UTF-8」で保存してください。
 *
 * 下記の例では、「sample.txt」を開き、そのファイルの中身を1行ずつコンソールに表示しています。
 * (実行する際は、自分のデスクトップのファイルパスを入力してください)
 * このままだと、途中で例外が発生した際に「brがcloseされない可能性」がありますので、
 * 「br.close();」の処理をtry-catch-finallyのfinallyブロックで行うようにしてみましょう。
 */

public class Question13_01 {

	public static void main(String[] args) {
		File file = new File("デスクトップのファイルパスを入力してください", "sample.txt");

		BufferedReader br = null;

		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch(IOException e) {
			System.out.println("例外が発生しました。");
			System.out.println(e);
		}
	}

}