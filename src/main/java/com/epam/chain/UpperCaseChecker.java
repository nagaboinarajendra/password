package com.epam.chain;

public class UpperCaseChecker implements Chain {
	private Chain next;
	public void setNext(Chain nextChain) {
		next = nextChain;
	}
	public void process(String password) {
		 String upperCaseChars = "(.*[A-Z].*)";
		 if (password.matches(upperCaseChars))
         {
			 next.process(password);
         } else {
        	 System.out.println("Password should contain"
              		+ "atleast one upper case alphabet"); 
         }
	}
}
