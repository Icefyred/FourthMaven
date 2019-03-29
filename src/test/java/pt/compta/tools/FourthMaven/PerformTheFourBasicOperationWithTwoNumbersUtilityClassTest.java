package pt.compta.tools.fourthmaven;

import org.junit.Test;

import pt.compta.tools.fourthmaven.PerformTheFourBasicOperationWithTwoNumbersUtilityClass;

import static junit.framework.TestCase.assertEquals;

public class PerformTheFourBasicOperationWithTwoNumbersUtilityClassTest {

	@Test
	public void testSumOfTwoNumbers() {

		assertEquals("Here is test for Addition Result: ", 30,
				PerformTheFourBasicOperationWithTwoNumbersUtilityClass.sumOfTwoNumbers(27, 3));
	}

}