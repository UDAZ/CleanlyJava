package work.contre.cleanly;

public class For {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("こんにちは");
		}
		// for (①初期化処理、②繰り返し条件、③繰り返し時処理)
		// ①最初に1回だけ実行される文、通常「何週目のループかを記録しておく変数」ループ変数と言われる。
		// ②ループを繰り返すかどうか判定する条件
		// ③ブロックを処理した直後に実行される処理
		// !ループ変数の名前は自由ただし、既に宣言されている変数名は使えません
		// !ブロック内での計算や表示に使います
	}

}
