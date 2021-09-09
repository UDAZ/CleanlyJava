package work.contre.cleanly;

public class Lesson5_2 {

	public static void main(String[] args) {
		email("ご案内","okayama.com","こんにちは");
		/*
		 * String title = "ご案内";
		 * String address = "okayama.com":
		 * String text = "こんにちは";
		 * email(title, address, text);
		 */
	}

	public static void email(String title, String address, String text) {
		System.out.println(address+"にメールを送信しました");
		System.out.println("件名: "+ title);
		System.out.println("本文: "+ text);
	}
}
