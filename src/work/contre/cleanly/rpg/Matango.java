package work.contre.cleanly.rpg;

public class Matango {
	int hp;
	// int level = 10; // お化けキノコのレベルに初期値10を設定した。
	final int LEVEL = 10; // 定数でLEVELは10に固定
	char suffix;
	public void run() {
		System.out.println("お化けキノコ" + suffix + "は逃げ出した！");
	}
}
