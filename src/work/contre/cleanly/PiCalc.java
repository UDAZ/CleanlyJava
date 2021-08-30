package work.contre.cleanly;

public class PiCalc {

	public static void main(String[] args) {
		double pi = 3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		System.out.println("パイの半径を倍にします");
		
		pi = 10; 
		// ほんとうはpieに代入すべきだったのに...
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * pi);
		// 変えられない値にしたいです
	}

}
