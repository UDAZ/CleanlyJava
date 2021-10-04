package work.contre.cleanly.rpg;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero(); // インスタンスを生成して
		System.out.println(h.hp);
		// h.Hero(); のように開発者が直接呼び出すことはできない！JVMが実行しているから
	}

}
