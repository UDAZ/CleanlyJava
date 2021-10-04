package work.contre.cleanly.rpg;

public class Main {

	public static void main(String[] args) {
		SuperHero sh = new SuperHero();
		sh.run();
		Hero h = new Hero();
		h.run();
		
		// SuperHeroクラスのソースコードにはrunがないがインスタンス化されればrun()を呼び出すことができます。
		// extendsを用いることによって差分だけを記述して新たなクラスを宣言することができます。
	}

}
