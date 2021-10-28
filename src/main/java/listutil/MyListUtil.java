package listutil;

import java.util.Comparator;
import java.util.List;
import java.util.Vector;

class ComparatoreCrescente implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
	
}

class ComparatoreDecrescente implements Comparator<Integer>{

	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}
	
}

public class MyListUtil {
	private Vector<Integer> myList;
	
	public List<Integer> sort(List<Integer> list, int order){   //order = 0 Crescente, 1 decrescente
		myList = (Vector<Integer>) list;
		
		if(order==0)
			myList.sort(new ComparatoreCrescente());
		else
			myList.sort(new ComparatoreDecrescente());
		
		return myList;	
    }
}
