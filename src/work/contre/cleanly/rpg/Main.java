package work.contre.cleanly.rpg;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizzard w = new Wizzard();
		w.name = "スガワラ";
		w.hp = 50;
		w.heal(h1); // ミナトを回復
		w.heal(h2); // アサカを回復
		w.heal(h2); // アサカを回復
		System.out.println(h2.hp);
	}

}
