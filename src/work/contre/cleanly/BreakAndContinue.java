package work.contre.cleanly;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i =1; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i + "これがbreak");
		}
		// 3でbreakしてforが終了
		for (int j =1; j < 10; j++) {
			if (j == 3) {
				continue;
			}
			System.out.println(j + "これがcontinue");
		}
		// 3でコンティニューして、4から再始動
	}

}
