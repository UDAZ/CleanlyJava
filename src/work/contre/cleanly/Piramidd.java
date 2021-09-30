package work.contre.cleanly;

public class Piramidd {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (9 - i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 4; i >= 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < (9 - i * 2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
