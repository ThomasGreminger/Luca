import static org.junit.Assert.*;

import org.junit.Test;

public class BlackBoxTest {

	@Test
	public void testRotateArray() {
	    int[] values = new int[] { 1, 2 };
		int[] expected = new int[] { 2, 1 };
		BlackBox.rotateArray(values, 1);
		assertArrayEquals(expected, values);
		
		values =new int[] {4, 8 ,3 ,7, 6};
		BlackBox.rotateArray(values, 2);
		expected=new int[] {7,6,4, 8 ,3};
		assertArrayEquals(expected, values);
		
		values =new int[] {};
		BlackBox.rotateArray(values, 2);
		expected=new int[] {};
		assertArrayEquals(expected, values);
		
		values =new int[] {200,100,50,30,20,10};
		BlackBox.rotateArray(values, -2);
		expected=new int[] {50,30,20,10,200,100};
		assertArrayEquals(expected, values);
		
		values =new int[] {200,100,50,30,20,10};
		BlackBox.rotateArray(values, -6);
		expected=new int[] {200,100,50,30,20,10};
		assertArrayEquals(expected, values);
		
		
	}
}
