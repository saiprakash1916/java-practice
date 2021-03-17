//toString method program
public class CityName {
	String name;
	int pinCode;
	public CityName(String name, int pinCode) {
		this.name= name;
		this.pinCode=pinCode;
	}
	@Override
	public String toString() {
		return name+" = "+pinCode;
	}
	public static void main(String[] args) {
		CityName c1 = new CityName("Mysure", 542100);
		System.out.println(c1);
		CityName c2 = new CityName("Bengaluru", 566005);
		System.out.println(c2);
	}

}
