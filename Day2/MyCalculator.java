package Week1.Day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int add = cal.add(20, 40, 60);
		int sub = cal.sub(50, 20);
		double mul = cal.mul(20, 30.76);
		float divide = cal.divide(12f, 120);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(divide);
		

	}

}
