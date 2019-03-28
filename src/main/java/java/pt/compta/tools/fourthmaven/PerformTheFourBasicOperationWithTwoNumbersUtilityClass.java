package java.pt.compta.tools.fourthmaven;

public abstract class PerformTheFourBasicOperationWithTwoNumbersUtilityClass {
	
	public static int sumOfTwoNumbers(int firstNumber, int secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public static int subtractOfTwoNumbers(int firstNumber, int secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public static int multiplyOfTwoNumbers(int firstNumber, int secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public static int divideOfTwoNumbers(int firstNumber, int secondNumber) {
		return firstNumber / secondNumber;
	}
}
	/*
	 *An utility class is one which:
	 *Has no state (fields) of its own, so all the methods can be class methods (static)
	 *rather than object methods (requiring an instantiation of an object).
	 *Provides methods for multiple other classes (shared code)
	 *https://www.quora.com/What-is-a-utility-class
	 */