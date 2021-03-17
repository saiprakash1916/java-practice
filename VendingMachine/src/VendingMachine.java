import java.util.Scanner;
public class VendingMachine {
	Beverage give() {
		Scanner s = new Scanner(System.in);
		System.out.println("1.Coffee      2.Tea");
		System.out.println("Enter the number");	
		int choise = s.nextInt();
		s.close();
		if (choise == 1) {
			Coffee c = new Coffee();
			return c;
		}
		else if (choise == 2) {
			Tea t = new Tea();
			return t;
		}
		else {
			System.out.println("Invaild chiose");
			return null;
		}
	}
	public static void main(String[] args) {
		VendingMachine vm = new VendingMachine();
		Beverage b = vm.give(); // up-casting
		if (b instanceof Coffee) {
			Coffee cf = (Coffee)b; //down casting
			cf.coffeepoweder();
			//System.out.println("Vending Machining gave Coffee");  another method
			//System.out.println("Enjoy the Coffee...");
		}
		else if(b instanceof Tea) {
			Tea t =(Tea) b;		//down casting
			t.addginger();
			//System.out.println("vending Machine gave Tea");  another method
			//System.out.println("Enjoy the Tea...");
		}
		b.drink();
	}
}
