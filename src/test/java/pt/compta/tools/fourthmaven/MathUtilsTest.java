package pt.compta.tools.fourthmaven;

import org.junit.Test;

import pt.compta.tools.fourthmaven.MathUtils;

import static junit.framework.TestCase.assertEquals;

public class MathUtilsTest {

	@Test
	public void testSumOfTwoNumbers() {

		assertEquals("Here is test for Addition Result: ", 30,
				MathUtils.sumOfTwoNumbers(27, 3));
	}

}