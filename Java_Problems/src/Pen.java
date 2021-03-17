public class Pen {
	String color;
	String type;
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.color = "Blue";
		p1.type = "Marker";
		Pen p2 = new Pen();
		p2.color = "Green";
		p2.type = "Marker";
		System.out.println(p1.color);
		System.out.println(p1.type);
		System.out.println(p2.color);
		System.out.println(p2.type);
	}
}
