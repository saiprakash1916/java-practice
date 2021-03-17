public class City {
	int pincode;
	String name;
	City (int pincode , String name){
		this.name = name;
		this.pincode = pincode;
	}
	public static void main(String[] args) {
		City c1 = new City(522111 , "Guntur");
		System.out.println(c1.pincode +" "+ c1.name);
		City c2 = new City(522006 , "Hyderabad");
		System.out.println(c2.pincode +" "+ c2.name);
	}
}
