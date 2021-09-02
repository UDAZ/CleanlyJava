package work.contre.cleanly;

public class ForNest {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) { // 1から9まで
			for (int j = 1; j < 10; j++) { // 1から9まで
				System.out.print(i * j); // 掛け算の結果を出力
				System.out.print(" "); // 空白を出力
			}
			System.out.println(""); // 改行を出力
		}
	}

}
