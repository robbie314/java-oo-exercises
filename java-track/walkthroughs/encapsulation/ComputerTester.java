package encapsulation;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTester {

	@Test
	public void testAddMemory() {
		Computer c = new Computer(4,10.3, 1.4, "Lenovo");
		assertTrue("Problem setting memory in constructor", c.getMemory()== 4);
		c.addMemory(2);
		assertTrue("Problem updating memory in addMemory()", c.getMemory()== 6);
	}
	@Test
	public void testAddMemoryMax() {
		Computer c = new Computer(8,10.3, 1.4, "Lenovo");
		assertTrue("Problem setting memory in constructor", c.getMemory()== 8);
		c.addMemory(2);
		assertTrue("Problem updating memory in addMemory() when we hit the max allowed memory", c.getMemory()== 8);
	}
}
