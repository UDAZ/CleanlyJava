package work.contre.cleanly;

public class OverloadNum {

	public static int add(int x, int y) {
		return x + y;
	}
	// add(int x, int y)ここまでをまとめてシグネチャと呼ぶ、オーバーロードはシグネチャが一致していなければできると覚えておくとよい
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	public static void main(String[] args) {
		System.out.println("10+20=" + add(10,20));
		System.out.println("30+40+50=" + add(30,40,50));
	}

}
