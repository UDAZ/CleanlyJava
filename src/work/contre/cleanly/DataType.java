package work.contre.cleanly;

public class DataType {

	public static void main(String[] args) {
		// 整数を格納できる4つの型
		byte glasses; glasses = 2;
		short age; age = 18;
		int salary; salary = 152000;
		long worldPeople; worldPeople = 6000000000L;
		System.out.println("byteはとても小さな整数"+ glasses);
		System.out.println("shortは小さな整数" + age);
		System.out.println("intは普通の整数"+ salary);
		System.out.println("longは大きな数"+ worldPeople);
		// 少数を格納できる2つの型		
		float weight; weight = 59.4F;
		double pi; pi = 3.14;
		System.out.println("floatは少しあいまいでも良い少数"+ weight);
		System.out.println("doubleは普通の少数"+ pi);
		// YESかNOかを格納できるboolean型
		boolean isError;isError = true;
		System.out.println("booleanはtrueかfalse: " + isError);
	}

}
