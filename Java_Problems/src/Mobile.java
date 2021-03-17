public class Mobile {
	String model;
	String color;
	String ramCapacity;
	public static void main(String[] args) {
		Mobile m1 = new Mobile("oneplus 7t" , "Silver color" , "8gb RAM");
		System.out.println(m1.model +" " + m1.color + " " + m1.ramCapacity);
		Mobile m2 = new Mobile("Nokia 6.1" , "Black color" , "4gb RAM");
		System.out.println(m2.model +" " + m2.color + " " + m2.ramCapacity);
	}
	Mobile(String model, String color, String ramCapacity){
		this.model = model;
		this.color = color;
		this.ramCapacity = ramCapacity;
	}
}