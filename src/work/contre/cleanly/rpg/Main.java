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
		// 2. フィールドに初期値をセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者【" + h.name + "】を生み出しました！");
	}

}