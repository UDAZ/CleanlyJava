package work.contre.cleanly.rpg;

public class Wizzard {
	String name;
	int hp;
	public void heal(Hero h) {
		h.hp += 10;
		System.out.println(h.name + "のHPを10回復した");
	}
}
