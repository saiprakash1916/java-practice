public class Calculator1 {
	double findCircleArea(double r) {
		double area = 3.142 * r * r;
		return area;
	}
	public static void main(String[] args) {
		Calculator1 c1 = new Calculator1();
		double area = c1.findCircleArea(10);
		System.out.println(area);
	}
}