package work.contre.cleanly.rpg;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが最大まで回復した");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は、"+ "秒間祈った！");
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAX_HP - this.mp, recover); // どちらか小さいほう、左が現在のMPから回復できる量で右がリカバーで回復できる量。
		this.mp += recoverActual;
		System.out.println("MPが"+ recoverActual + "回復した");
		return recoverActual;
		
	}
}
