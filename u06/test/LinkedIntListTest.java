import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class LinkedIntListTest {

	@Test
	public void basicTest() {

		LinkedIntList newList = new LinkedIntList();
		assertEquals(0, newList.getSize());
		newList.addFirst(5);
		assertEquals(1, newList.getSize());

		newList.addFirst(7); // 7,5
		System.out.println(newList.get(0));
		assertEquals(7, newList.get(0));
		assertEquals(5, newList.get(1));
		newList.clear();
		for (int i = 0; i < 1000000; i++) {
			newList.addLast(i);
		}
		assertEquals(1000000 - 1, newList.get(1000000 - 1));

	}

	@Test
		public void setTest() {
			LinkedIntList newList=new LinkedIntList();
			newList.addFirst(5);
			newList.set(0 , 6);
			assertEquals(6, newList.get(0));
			
		}

	@Test
		public void emptyTest() {
			LinkedIntList newList=new LinkedIntList();
			assertEquals(true, newList.isEmpty());
			newList.addFirst(5);
			newList.set(0 , 6);
			assertEquals(false, newList.isEmpty());
			newList.clear();
			assertEquals(true, newList.isEmpty());
			
		}
//
//		@Test
//		public void testKlassenBreite() {
//			assertEquals(10, DatenAnalyse.klassenBreite(100, 200, 10));
//			assertEquals(11 + 1, DatenAnalyse.klassenBreite(100, 200, 9));
//			assertEquals(12 + 1, DatenAnalyse.klassenBreite(100, 200, 8));
//			assertEquals(14 + 1, DatenAnalyse.klassenBreite(100, 200, 7));
//			assertEquals(16 + 1, DatenAnalyse.klassenBreite(100, 200, 6));
//			assertEquals(20, DatenAnalyse.klassenBreite(100, 200, 5));
//		}
//	    

}
