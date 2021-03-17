package programming;
import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList pts = new ArrayList(5);
		String res = null;
		do {
			System.out.println("Enter the product Id Name and Price");
			int id = sc.nextInt();
			String name=sc.next();
			double price=sc.nextDouble();
			Product p = new Product(id,name,price);
			boolean rs = pts.add(p);
			if(rs)
				System.out.println("Successfully added");
			else
				System.out.println("Fails to add");
			System.out.println("Do you have more products");
			res=sc.next();
		}while(res.equalsIgnoreCase ("yes"));
		sc.close();
		System.out.println("User Entered product Information: ");
		Iterator it =pts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//by using for loop
		Product hp=(Product)pts.get(0);
		for (int i =1; i < pts.size(); i++){
			Product p=(Product)pts.get(i);
			if(hp.getPrice()<p.getPrice())
				hp=p;
		}
		System.out.println("Highest price product is:");
		System.out.println(hp);
		
		//by using iterator method
		Product lp=(Product)pts.get(0);
		it=pts.iterator();
		while (it.hasNext()){
			Product p = (Product) it.next();
			if(lp.getPrice()>p.getPrice())
				lp=p;
		}
		System.out.println("lowest price product is:");
		System.out.println(lp);
	}
}
