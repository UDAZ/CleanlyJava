package work.contre.cleanly;

public class NoNewline {

	public static void main(String[] args) {
		String name = "すがわら";
		System.out.print("私の名前は、");
		System.out.print(name);
		System.out.print("です。");
		// System.out.print(); 改行せずに文字を表示
	}

}
