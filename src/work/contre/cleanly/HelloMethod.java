package work.contre.cleanly;

public class HelloMethod {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello();
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello() {
		System.out.println("奏さん、こんにちは！");
	}
}
