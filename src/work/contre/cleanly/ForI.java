package work.contre.cleanly;

public class ForI {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("現在" + (i+1) + "周目→");
		}
		/* 	
		 * ループ変数を１からスタートする
		 * for (int i = 1; i < 10; i++) {}
		 * 
		 * ループ変数を2つずつ増やす
		 * for (int i = 1; i < 10; i += 2){}
		 * 
		 * ループ変数を10から1ずつ1まで減らしていく
		 * for (int i = 10; i > 0; i--){}
		 * 
		 * ループ変数を初期化しない
		 * for (; i < 10; i++){}
		 * 
		 * 繰り返し時の処理を行わない
		 * for (int i = 0; i < 10;){}
		 */
	}

}
