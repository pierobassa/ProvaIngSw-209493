import java.util.Arrays;
import java.util.Vector;

import org.joda.time.DateTime;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import listutil.MyListUtil;

public class MyListUtilTest {
	
	private static MyListUtil myListUtil;
	DateTime dateTime;
	
	@BeforeClass
	public static void beforeClassPrint() {
		System.out.println("This appears before all the tests are run.");
	}
	
	@Before
	public void initList() {
		myListUtil = new MyListUtil();
		dateTime = new DateTime();
	}
	
	@Test
	public void testSortCrescente() {
		System.out.println("Ascendent Test start : " + dateTime.toString());
		
		Integer[] numbers = {6, 2, 1, 9, 3, 4};
		Integer[] expected = {1, 2, 3, 4, 6, 9};
		
		Vector<Integer> numbersV = new Vector<Integer>(Arrays.asList(numbers));
		Vector<Integer> orderResult = (Vector<Integer>) myListUtil.sort(numbersV, 0);
		
		Integer[] orderRs = new Integer[orderResult.size()];
		
		for(int i=0; i<orderRs.length; i++) {
			orderRs[i] = orderResult.elementAt(i);
		}
		
		Assert.assertArrayEquals(expected, orderRs);
		
		dateTime = new DateTime();
		System.out.println("Ascendent Test end : " + dateTime.toString());
	}
	
	@Test
	public void testSortDecrescente() {
		System.out.println("Descendent Test start : " + dateTime.toString());
		
		Integer[] numbers = {6, 2, 1, 9, 3, 4};
		Integer[] expected = {9, 6, 4, 3, 2, 1};
		
		Vector<Integer> numbersV = new Vector<Integer>(Arrays.asList(numbers));
		Vector<Integer> orderResult = (Vector<Integer>) myListUtil.sort(numbersV, 1);
		
		Integer[] orderRs = new Integer[orderResult.size()];
		
		for(int i=0; i<orderRs.length; i++) {
			orderRs[i] = orderResult.elementAt(i);
		}
		
		Assert.assertArrayEquals(expected, orderRs);
		
		dateTime = new DateTime();
		System.out.println("Descendent Test end : " + dateTime.toString());
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Testing completed");
	}
}
