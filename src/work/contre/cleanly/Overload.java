package work.contre.cleanly;

public class Overload {
	// 1つめのaddメソッド
	public static int add(int x, int y) {
		return x + y;
	}
	// 2つめのaddメソッド
	public static double add(double x, double y) {
		return x + y;
	}
	// 3つめのaddメソッド
	public static String add(String x, String y) {
		return x + y;
	}
	//メインメソッド
	public static void main(String[] args) {
		System.out.println(add(100,10));
		System.out.println(add(3.2,4.5));
		System.out.println(add("HELLO ","WORLD"));
		//仮引数の型が異なれば、同じ名前のメソッドを複数定義することが許されています。
	}

}
