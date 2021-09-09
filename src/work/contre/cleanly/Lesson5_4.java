package work.contre.cleanly;

public class Lesson5_4 {

	public static void main(String[] args) {
		double tArea = calcTriangleArea(10,5);
		double cArea = calcCircleArea(5);
		System.out.println("三角形の面積は"+ tArea +"㎠");
		System.out.println("円の面積は"+ cArea +"㎠");
	}

	public static double calcTriangleArea(double bottom, double height) {
		double tArea = bottom * height / 2;
		return tArea;
	}
	
	public static double calcCircleArea(double radius) {
		double cArea = radius * radius * 3.14;
		return cArea;
	}
}
