package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class teststrings {

	@Test
	void test() {
		jUnitFunction jUnitstring = new jUnitFunction();
		String result = jUnitstring.string("Assignment","ten");
		assertEquals("Assignmentten", result);
	}

}
	