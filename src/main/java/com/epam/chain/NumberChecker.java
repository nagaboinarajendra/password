package com.epam.chain;

public class NumberChecker implements Chain {
	private Chain next;
	public void setNext(Chain nextChain) {
		next = nextChain;
	}
	public void process(String password) {
		 String numbers = "(.*[0-9].*)";
		 if (password.matches(numbers))
         {
			 next.process(password);
         } else {
        	 System.out.println("Password should contain"
              		+ "atleast one number"); 
         }
	}
}