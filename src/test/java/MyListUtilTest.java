import java.util.Arrays;
import java.util.Vector;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import listutil.MyListUtil;

public class MyListUtilTest {
	
	private static MyListUtil myListUtil;
	
	@BeforeClass
	public static void beforeClassPrint() {
		System.out.println("This appears before all the tests are run.");
	}
	
	@Before
	public void initList() {
		myListUtil = new MyListUtil();
	}
	
	@Test
	public void testSortCrescente() {
		Integer[] numbers = {6, 2, 1, 9, 3, 4};
		Integer[] expected = {1, 2, 3, 4, 6, 9};
		
		Vector<Integer> numbersV = new Vector<Integer>(Arrays.asList(numbers));
		Vector<Integer> orderResult = 
	}
}
