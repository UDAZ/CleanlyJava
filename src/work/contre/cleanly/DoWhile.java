package work.contre.cleanly;

public class DoWhile {

	public static void main(String[] args) {
		int temp = 30;
		while (temp > 30) {
			temp--;
			System.out.println("温度を一度下げました"+ temp);
		}
		do {
			temp--;
			System.out.println("温度を一度下げました" + temp);
		} while (temp > 30);
		// 1度実行するかどうかが肝
		// do-whileは最低一回はブロックを実行する
	}

}
