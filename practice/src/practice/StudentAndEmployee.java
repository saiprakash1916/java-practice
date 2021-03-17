package practice;
import java.util.TreeSet;
public class StudentAndEmployee {
	public static void main(String[] args) {
		Student s1 = new Student(123, "sai", 75.23);
		Student s2 = new Student(124, "sp", 66.36);
		Student s3 = new Student(125, "prakash", 70.23);
		Student s4 = new Student(126, "chinni", 86.36);

		Employee e1 = new Employee(501, "pradeep", 60000.36);
		Employee e2 = new Employee(502, "keerthi", 95632.36);
		Employee e3 = new Employee(503, "sai", 85632.36);
		Employee e4 = new Employee(504, "Dinu", 86231.36);
		TreeSet ts = new TreeSet(new NameComparator());
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		for(Object obj:ts) {
			System.out.println(obj);
		}
	}

}
