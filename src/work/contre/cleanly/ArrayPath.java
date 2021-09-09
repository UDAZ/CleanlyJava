package work.contre.cleanly;

public class ArrayPath {
	
	public static void incArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	public static void main(String[] args) {
		int[] array = {4,5,6};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}
	// 234と表示される
}
