package programming;
import java.util.*;
public class Toppers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList pts = new ArrayList(5);
		String res = null;
		do {
			System.out.println("Enter student id, name and percentage");
			int id=sc.nextInt();
			String name =sc.next();
			double perce = sc.nextDouble();
			Student s = new Student(id, name, perce);
			boolean rs = pts.add(s);
			if(rs)
				System.out.println("Successfully added");
			else
				System.out.println("Failed to add");
			System.out.println("Do you have more students");
			res = sc.next();
		}while(res.equalsIgnoreCase("yes"));
		sc.close();
		System.out.println("User entered student information");
		Iterator it = pts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Student sp=(Student)pts.get(0);
		for(int i=1;i<pts.size();i++) {
			Student s=(Student)pts.get(i);
			if(sp.getPer()<s.getPer())
				sp=s;
		}
		System.out.println("Highest percentage of Student is");
		System.out.println(sp);
		Student lp = (Student)pts.get(0);
		it=pts.iterator();
		while(it.hasNext()) {
			Student p =(Student)it.next();
			if(lp.getPer()>p.getPer())
				lp=p;
		}
		System.out.println("Lowest percentage of Student is");
		System.out.println(lp);

		for(int i=1;i<pts.size();i++) {
			Student s=(Student)pts.get(i);
			if(sp.getPer()>80)
				System.out.println("distinction students");
			System.out.println(sp);
		}
	}
}