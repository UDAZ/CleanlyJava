package work.contre.cleanly;

public class ParentChild {

	public static void main(String[] args) {
		int[][] scores = {{40,50,60},{80,60,70}}; // このような 
		System.out.println(scores.length); // parent
		System.out.println(scores[0].length); // child
	}

}
