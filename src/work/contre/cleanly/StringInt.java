package work.contre.cleanly;

public class StringInt {

	public static void main(String[] args) {
		// Integer.parseInt(); 文字列を数値に変換する
		String age = "31";
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、"+ (n + 1) + "歳になりますね。");
	}

}
