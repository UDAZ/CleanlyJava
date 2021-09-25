package work.contre.cleanly.rpg;

public class Hero {
	String name; // 名前の宣言
	int hp; // HPの宣言
	
	/*
	 * 【名前】sleep
	 * 【必要情報】なし
	 * 【結果】なし
	 * 【処理内容】眠ったあとはHPが100に回復する
	 */
	public void sleep() {
		this.hp = 100; // 自分自身のhpフィールド
		System.out.println(this.name + "は、眠って回復した！");
		// thisとは特別に準備された変数で、「自分自身のインスタンス」を意味しています。
	}
	
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "座った。");
		System.out.println("HPが" + sec + "ポイント回復した。");
	}
	
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	// thisを省略しない、ローカル変数や引数に同じ名前の変数があるとそちらが優先されてしまう可能性がある。
}
