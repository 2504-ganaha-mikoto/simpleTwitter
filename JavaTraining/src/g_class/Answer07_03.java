package g_class;

/**
 * 【クラス】
 * 立方体クラス（Cubeクラス）を使用し、1面あたりの面積・立方体の体積を求めて、コンソールに表示してください。
 * ・1辺の長さは整数とする
 * ・結果はmainメソッドで表示すること
 */

public class Answer07_03 {

	public static void main(String[] args) {
		Cube cube = new Cube();
		cube.length = 10;

		System.out.println("1辺が" + cube.length + "cmの立方体の1面あたりの面積は" + cube.getArea() + "平方センチメートル");
		System.out.println("1辺が" + cube.length + "cmの立方体の体積は" + cube.getVolume() + "立方センチメートル");
	}
}