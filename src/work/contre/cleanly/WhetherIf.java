package work.contre.cleanly;

public class WhetherIf {

	public static void main(String[] args) {
		boolean tenki = true;
		if(tenki == true) {
			System.out.println("洗濯をします");
			System.out.println("散歩にいきます");
		} else 
		System.out.println("DVDを見ます");
		// {}のブロックが無くても1行だったら問題ないが実際の開発現場ではミス防止のため通常使う
	}

}
