package work.contre.cleanly.rpg;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("ミナト"); // インスタンスを生成して
		System.out.println(h1.name);
		Hero h2 = new Hero();
		System.out.println(h2.name);
		// h.Hero(); のように開発者が直接呼び出すことはできない！JVMが実行しているから
		// コンストラクタと見なされる条件
		// ①メソッド名がクラス名と完全に等しい
		// ②メソッド宣言に戻り値が記述されていない(voidもダメ)
	}

}
