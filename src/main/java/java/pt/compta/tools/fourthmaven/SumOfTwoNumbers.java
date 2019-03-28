package java.pt.compta.tools.fourthmaven;

public class SumOfTwoNumbers {
	private static int firstNumber;
	private static int secondNumber;
	
	public static int sumOfTwoNumbers(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
}
	/*
	 *A utility class is one which:
	 *Has no state (fields) of its own, so all the methods can be class methods (static)
	 *rather than object methods (requiring an instantiation of an object).
	 *Provides methods for multiple other classes (shared code)
	 *https://www.quora.com/What-is-a-utility-class
	 */