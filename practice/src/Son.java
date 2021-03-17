public class Son extends Father {
	//Specific properties
	String name;
	//specific behavior
	void longDrive() {
		System.out.println(name + " " + "goes longdrive");
	}
	public static void main(String[] args) {
		Son s1 =new Son();
		//Accessing specific properties and behavior
		s1.smoke();
		s1.drink();
		s1.doYoga();
		System.out.println(s1.money);
		System.out.println(s1.girlFriend);
		//Accessing specific property and behavior
		s1.name = "sai";
		s1.longDrive();
	}
}
