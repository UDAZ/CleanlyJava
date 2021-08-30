package work.contre.cleanly;

public class PiCalc {

	public static void main(String[] args) {
		// 定数を利用する。 final 型 定数名 = 初期値;
		final double PI = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
		
		PI = 10;
		// これで再利用できない。定数です！
	}

}
