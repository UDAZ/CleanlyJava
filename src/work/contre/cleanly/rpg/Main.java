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
		Hero h; // 「Hero型のインスタンスだけを中に入れることができる」Hero型の箱を準備
		h = new Hero(); // Heroインスタンス(メモリ領域)が生成され、変数hにHeroインスタンスが代入される
		h.hp = 100; // 変数hからHeroインスタンスを参照し、hpフィールドを100に書き換える

	}

}
