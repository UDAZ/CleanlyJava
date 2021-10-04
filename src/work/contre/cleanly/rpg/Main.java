package work.contre.cleanly.rpg;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero(); // インスタンスを生成して
		h1.name = "ミナト"; // 初期値をセット
		h1.hp = 100; // 初期値をセット
		Hero h2 = new Hero(); // ここでもインスタンスを生成して
		h2.name = "アサカ"; // また初期値
		h2.hp = 100; // また初期値
		Wizzard w = new Wizzard(); // ここでもインスタンスを生成して
		w.name = "スガワラ"; // また初期値
		w.hp = 50; // また初期値
		w.heal(h1); // ここからやっとメインプログラム
		w.heal(h2);
		w.heal(h2);
		System.out.println(h2.hp);
	}

}
