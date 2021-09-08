package work.contre.cleanly;

public class JustReturn {

	public static void main(String[] args) {
		System.out.println(add(add(10,30),add(30,40))); // (10+30) + (30+40) = 110
	}
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
		x = 100; //returnした後ではコンパイルエラーになる。
	}
}
