package work.contre.cleanly;

public class ArrayQuiz {

	public static void main(String[] args) {
		int[] arrayA = {1, 2, 3};
		int[] arrayB;
		arrayB = arrayA;
		arrayB[1] = 100;
		System.out.println(arrayA[1]);
		
	}

}
