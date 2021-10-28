package listutil;

import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(5);
		list.add(1);
		list.add(7);
		list.add(9);
		list.add(3);
		
		MyListUtil listManager = new MyListUtil();
		
		System.out.println(listManager.sort(list, 1));
	}
}
