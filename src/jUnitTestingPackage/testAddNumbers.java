package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void test() {
		jUnitFunction jUnit = new jUnitFunction();
		int result = jUnit.Numbers(10, 20);
		assertEquals(30, result);
	}

}
