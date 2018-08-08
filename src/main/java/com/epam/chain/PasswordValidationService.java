package com.epam.chain;

public class PasswordValidationService {
	public static void main(String args[]) {
		Chain one = new LengthChecker();
		Chain two = new UpperCaseChecker();
		Chain three = new LowerCaseChecker();
		Chain four = new NumberChecker();
		Chain five = new SpecialCharacterChecker();
		one.setNext(two);
		two.setNext(three);
		three.setNext(four);
		four.setNext(five);
		one.process("raja");
		one.process("rajendra");
		one.process("RAJENDRA");
		one.process("Rajendra");
		one.process("Rajendra1234");
		one.process("Rajendra123@");
	}
}
