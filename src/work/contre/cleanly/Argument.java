package work.contre.cleanly;

public class Argument {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出しています");
		hello("奏");
		hello("朝霞");
		hello("菅原");
		System.out.println("メソッドの呼び出しが終わりました。");
	}
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは！");
	}
}
