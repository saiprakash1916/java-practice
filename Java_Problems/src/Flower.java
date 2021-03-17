public class Flower {
	String color;
	String type = "Garber";
	public static void main(String[] args) {
		Flower f1 = new Flower();
		f1.color = "Yellow";
		Flower f2 = new Flower();
		f2.color = "Pink";
		Flower f3 = new Flower();
		f3.color = "Orange";
		System.out.println(f1.type);
		System.out.println(f1.color);
		System.out.println(f2.type);
		System.out.println(f2.color);
		System.out.println(f3.type);
		System.out.println(f3.color);
	}
}
