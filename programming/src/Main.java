import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet stds = new TreeSet(new StdIdCompare());
		String res = null;
		do {
			System.out.println("Enter the student Id Name and percentage");
			int id = sc.nextInt();
			String name=sc.next();
			double per=sc.nextDouble();
			Student std = new Student(id,name,per);
			if(stds.add(std))
				System.out.println("Successfully added");
			else
				System.out.println("Fails to add");
			System.out.println("Do you have more products");
			res=sc.next();
		}while(res.equalsIgnoreCase ("yes"));
		sc.close();
		System.out.println("Student details: ");
		for(Object obj:stds) {
			System.out.println(obj);
		}
		System.out.println("Student details and percentage wise high to low");
		TreeSet ts = new TreeSet(new StdPerComapre());
		ts.addAll(stds);
		for(Object obj:ts) {
			System.out.println(obj);
		}
	}
}
