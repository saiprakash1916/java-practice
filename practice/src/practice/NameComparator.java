package practice;
import java.util.Comparator;
public class NameComparator implements Comparator{
	@Override
	public int compare(Object o1,Object o2) {
		int rs=0;
		if(o1 instanceof Student && o2 instanceof Employee) {
			Student s1 = (Student)o1;
			Employee e2=(Employee)o2;
			rs=s1.name.compareTo(e2.name);
		}else if(o1 instanceof Student && o2 instanceof Student) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			rs=rs=s1.name.compareTo(s2.name);
		}else if(o1 instanceof Employee && o2 instanceof Student) {
			Employee e1 = (Employee)o1;
			Student s2 = (Student)o2;
			rs=rs=e1.name.compareTo(s2.name);
		}else if(o1 instanceof Employee && o2 instanceof Employee) {
			Employee e1 = (Employee)o1;
			Employee e2 = (Employee)o2;
			rs=rs=e1.name.compareTo(e2.name);
		}
		if(rs>0)
			return 1;
		else
			return -1;
	}

}
