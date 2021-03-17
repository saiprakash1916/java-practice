import java.util.*;
public class StdIdCompare implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1.compareTo(i2)>0)
			return-1;
		else
			return 1;
	}

}
