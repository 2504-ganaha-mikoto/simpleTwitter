package m_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 【FileWriterとBufferedWriter】
 * 下記の例では、「sample.txt」に「目黒本社」という文字列を書き込んでいます。
 * 同様に、「横浜事業所」「大阪事業所」「福岡事業所」という文字列を用意して、
 * 「sample.txt」に繰り返し処理を使って書き込んでみましょう。
 * (実行する際は、自分のデスクトップのファイルパスを入力してください)
 */

public class Answer13_02 {

	public static void main(String[] args) {
		File file = new File("デスクトップのファイルパスを入力してください", "sample.txt");

		ArrayList<String> branches = new ArrayList<String>();
		branches.add("目黒本社");
		branches.add("横浜事業所");
		branches.add("大阪事業所");
		branches.add("福岡事業所");

		BufferedWriter bw = null;

		try {
			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			for(int i = 0; i < branches.size(); i++) {
				bw.write(branches.get(i));
				bw.newLine();
			}
		} catch(IOException e) {
			System.out.println("例外が発生しました。");
			System.out.println(e);
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					System.out.println("close処理中に例外が発生しました。");
					System.out.println(e);
				}
			}
		}
	}

}