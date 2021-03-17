public class Calculator {
	double add(double a, double b ) {
		double x = a + b;
		return x;
	}
	double sub(double a, double b ) {
		double y = a - b;
		return y;
	}
	double multi(double a, double b ) {
		double y = a * b;
		return y;
	}
	double div(double a, double b ) {
		double y = a / b;
		return y;
	}
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		double a = c1.add(20.3, 10.5);
		double b = c1.sub(20.3, 10.5);
		double c = c1.multi(20.3, 10.5);
		double d = c1.div(20.3, 10.5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
