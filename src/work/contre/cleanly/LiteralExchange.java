package work.contre.cleanly;

public class LiteralExchange {

	public static void main(String[] args) {
		float f = 3; // float型の変数にint型を代入
		double d = f; // double型の変数にfloat型を代入
		System.out.println(f);
		System.out.println(d);
		// 型の自動変換が行われている
	}

}
