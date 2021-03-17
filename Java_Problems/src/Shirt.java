public class Shirt {
	String color;
	int size;
	public static void main(String[] args) {
		Shirt s1 = new Shirt("Blue" , 36);
		System.out.println("Shirt color is "+s1.color + " and " +"Shirt size is "+ s1.size);
		Shirt s2 = new Shirt("White" , 40);
		System.out.println("Shirt color is "+s2.color + " and " +"Shirt size is "+ s2.size);
	}
	Shirt (String a , int b){
		color = a;
		size = b;
	}
}
