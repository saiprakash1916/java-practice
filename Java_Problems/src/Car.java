public class Car {
	String name = "BMW";
	String color = "Black";
	int price = 5000000;
	int carnumber = 1928;
	Car(){
		String name = "RR";
		String color = "White";
		int price = 6000000;
		int carnumber = 1916;
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
		System.out.println(carnumber);
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.price);
		System.out.println(this.carnumber);
	}
	public static void main(String[] args) {
		new Car();
	}
}