package work.contre.cleanly;

public class Lesson4_3 {

	public static void main(String[] args) {
		int[] counts = null;
		float[] heights = {171.3F,175.0F};
		System.out.println(counts[1]); // NullPointerException
		System.out.println(heights[2]); // ArrayIndexOutOfBoundsException
	}

}
