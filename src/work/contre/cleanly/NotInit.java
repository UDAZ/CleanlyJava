package work.contre.cleanly;

public class NotInit {

	public static void main(String[] args) {
		// ↓初期化されていないのでエラーになる
		// int x;
		// System.out.println(x);
		
		// ↓自動的に初期化されるのでエラーにならない
		int[] scores = new int[5];
		System.out.println(scores[0]);
	}

}
