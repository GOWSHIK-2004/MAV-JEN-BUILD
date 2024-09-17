package calcpkg;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCalc {
	MyCalc obj = new MyCalc();
	
	
	

	@Test
	public void test() {
		assertEquals(10,obj.sum(10, 0));
		assertEquals(50,obj.difference(30, 0));
	}

}
