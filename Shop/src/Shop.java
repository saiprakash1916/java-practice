import java.util.Scanner;
public class Shop {
	Product sell () {
		Scanner scan = new Scanner(System.in);
		System.out.println("0.Soap      1.Deo     2.Brush");
		System.out.println("Enter the product that you like to buy: ");	
		int choise = scan.nextInt();
		scan.close();
		Product p = null;
		if (choise == 0) {
			p = new Soap();
		}
		else if (choise == 1) {
			p = new Deo ();
		}
		else if (choise == 2) {
			p = new Brush();
		}
		else {
			System.out.println("Invalid input");
		}
		return p;
	}
	public static void main(String[] args) {
		Shop sh = new Shop();
		Product p = sh.sell();
		if (p instanceof Soap) {
			Soap s = (Soap)p;    //down casting
			s.bodysoap();
			//System.out.println("Take a bath");
		}
		else if (p instanceof Deo) {
			Deo d = (Deo)p;			//down casting
			d.bodyspray();
			//System.out.println("Apply on body");
		}
		else if (p instanceof Brush) {
			Brush b =(Brush)p;		//down casting
			b.mouth();
			//System.out.println("Mouth wash");
		}
	}
}
