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
		/*
		 * 関係演算子
		 * == 左辺と右辺が等しい
		 * != 左辺と右辺が異なる
		 * > 左辺が右辺より大きい
		 * < 左辺が右辺より小さい
		 * >= 左辺が右辺より大きいか等しい
		 * <= 左辺が右辺より小さいか等しい
		 * 
		 * sw != false　変数swがfalseでなかったら...
		 * deg - 273.15 < 0　変数degから273.15を引いたものが0未満なら...
		 * initial == '雅'　変数initialに入っている文字が「雅」だったら...
		 * ! 条件式では==を使う
		 */
	}

}
