package work.contre.cleanly.rpg;

public class Hero {
	String name; // 名前の宣言
	int hp; // HPの宣言
	Sword sword; //勇者が装備している剣の情報
	
	// あるクラスが別のクラスをフィールドとして利用している関係をhas-aの関係という。
	// Hero has a Sword(勇者は剣を持っている)
	
	public void attack() {
		System.out.println(this.name + "は" + this.sword.name + "で攻撃した！");
		System.out.println("敵に"+ this.sword.damage +"ダメージをあたえた！");
	}
	
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
		System.out.println(this.name + "は、" + sec + "秒座った。");
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
	
	public Hero(String name) {
		this.hp = 100; // これがコンストラクタ、mewされた直後に実行される
		this.name = name;
	}
	// thisを省略しない、ローカル変数や引数に同じ名前の変数があるとそちらが優先されてしまう可能性がある。
}
