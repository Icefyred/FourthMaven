package pt.compta.tools.fourthmaven;

import org.junit.Test;

import pt.compta.tools.fourthmaven.MathUtils;

import static junit.framework.TestCase.assertEquals;

public class MathUtilsTest {

	@Test
	public void testSubtractOfTwoNumbers() {

		assertEquals("Here is test for Subtraction Result: ", 11, MathUtils.sumOfTwoNumbers(8, 3));
	}

	@Test
	public void testMultiplyOfTwoNumbers() {

		int expected = 18;
		int actual = MathUtils.multiplyOfTwoNumbers(9, 2);

		assertEquals(expected, actual);
	}

}