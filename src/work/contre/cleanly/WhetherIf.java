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
		 * ! 文字列の比較では、文字列型の変数.equals(比較相手の文字列)を使う
		 * 
		 * 関係演算子
		 * || または(どちらかの片方の条件さえ満たされればtrue)
		 * && かつ(両方の条件が満たされた場合にtrue)
		 * 
		 * if (age > 18 && month == 5){...
		 * if (name.equals("斎藤")|| name.equals("斉藤")){...
		 * if ((hp < 100 && poison == false) || (hp >= 100 && poison == true)){...
		 * if (!(age == 10)){... ageが10と等しくないなら
		 * 
		 */
	}

}
