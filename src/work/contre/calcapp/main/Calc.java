package work.contre.calcapp.main;

import work.contre.calcapp.logic.CalcLogic;
// import宣言はあくまで「入力軽減機能」
public class Calc {

	public static void main(String[] args) {
		int a = 10; int b = 2;
		// int total = tasu(a, b);
		// int delta = hiku(a, b);
		
		// CalcLogicから呼び出す
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
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
