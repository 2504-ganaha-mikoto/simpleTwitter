package g_class;

public class Cube {
	//1辺の長さ
	int length;

	//面積
	public int getArea() {
		return this.length * this.length;
	}

	//体積
	public int getVolume() {
		return this.length * this.length * this.length;
	}
}
