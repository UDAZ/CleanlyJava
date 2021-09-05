package work.contre.cleanly;

public class NullArray {

	public static void main(String[] args) {
		int[] array = {1,2,3};
		array = null; // 番地がnull
		array[0] = 10; // 何も参照できないので代入できない
		System.out.println(array[0]);
	}

}
