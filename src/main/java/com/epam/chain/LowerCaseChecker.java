package com.epam.chain;

public class LowerCaseChecker implements Chain {
	private Chain next;
	public void setNext(Chain nextChain) {
		next = nextChain;
	}
	public void process(String password) {
		 String lowerCaseChars = "(.*[a-z].*)";
		 if (password.matches(lowerCaseChars))
         {
			 next.process(password);
         } else {
        	 System.out.println("Password should contain"
              		+ "atleast one lower case alphabet"); 
         }
	}
}
