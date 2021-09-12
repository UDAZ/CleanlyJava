package calcapp.main;

public class Calc {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		// int total = tasu(a, b);
		// int delta = hiku(a, b);
		
		// CalcLogicから呼び出す
		int total = calcapp.logic.CalcLogic.tasu(a, b);
		int delta = calcapp.logic.CalcLogic.hiku(a, b);
		System.out.println("足すと"+ total + "引くと" + delta);
	}
	
	/*
	 * 完全限定クラス名 FCQN(full qualified class name)
	 * パッケージ名.クラス名
	 */
	
	
	// public static int tasu(int a, int b) {
	// 	return (a + b);
	// }
	// public static int hiku(int a, int b) {
	// 	return (a - b);
	// }
}
