package work.contre.cleanly;

public class FizzBuzz {

	public static void main(String[] args) {
		// 変数宣言
		// ループカウンタ
		int i = 0;
		// 繰り返し最大数
		int loopCount = 100;
		// 3の倍数
		int numFizz = 3;
		// 5の倍数
		int numBuzz = 5;
		// Fizz 文字列
		String strFizz = "Fizz";
		// Buzz 文字列
		String strBuzz = "Buzz";
		// forで100回の繰り返し
		for (i = 1; i <= loopCount; i++) {
			// i で回数を表示
			System.out.print(i + " ");
			// FizzBuzzの判定　これは必ず最初
			if (i % (numFizz * numBuzz) == 0) {
				System.out.println(strFizz + strBuzz);
			// Fizzの判定
			} else if (i % numFizz == 0) {
				System.out.println(strFizz);
			// Buzzの判定
			} else if (i % numBuzz == 0) {
				System.out.println(strBuzz);
			} else {
				System.out.println();
			}
		}
	}

}
