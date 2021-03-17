//link to vehicle class
//child class
public class Bike extends Vehicle {
	//specific property
	String name;
	//specific behavior
	void longDrive() {
		System.out.println(name +" "+ "goes for long drive with girl friend");
	}
	public static void main(String[] args) {
		Bike b1 = new Bike();
		//Accessing common properties and behavior
		b1.Ride();
		b1.speed();
		System.out.println(b1.money);
		System.out.println(b1.name);
	}
	

}
