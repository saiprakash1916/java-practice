import java.util.*;
public class StdPerComapre implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.per>s2.per)
			return-1;
		else
			return 1;
	}
}
