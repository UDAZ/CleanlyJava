package work.contre.cleanly;

public class RandomMath {

	public static void main(String[] args) {
		// new java.util.Random().nextInt(); 乱数を発生させる
		int r = new java.util.Random().nextInt(90); // 90は含まない、0-89まで
		System.out.println("あなたはたぶん、" + r + "歳ですね。");
	}

}
