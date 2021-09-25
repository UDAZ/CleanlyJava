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
}
