package work.contre.cleanly;

public class Lesson4_3 {

	public static void main(String[] args) {
		int[] counts = null;
		float[] heights = {171.3F,175.0F};
		
		// null なので参照できない
		System.out.println(counts[1]); // NullPointerException
		
		// 2はないので参照できない
		System.out.println(heights[2]); // ArrayIndexOutOfBoundsException
	}

}
