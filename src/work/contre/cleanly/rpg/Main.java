package work.contre.cleanly.rpg;

public class Main {

	public static void main(String[] args) {
		// (以下の内容をJavaで記述していく)
		/*
		 * 勇者よ、この仮想世界に生まれよ！
		 * お化けキノコよ、この世界に生まれよ！
		 * 勇者よ、戦え！
		 * お化けキノコよ、逃げろ！
		 */
		// 1. 勇者を生成
		Hero h = new Hero(); // Heroクラスからインスタンスを生成し、変数hに入れる。
		h.name = "ミナト";
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m1.hp = 48;
		m1.suffix = 'B';
		
		h.slip();
		m1.run();
		m2.run();
		h.run();
	}

}
