package com.epam.chain;

public class LengthChecker implements Chain {
	private Chain next;
	public void setNext(Chain nextChain) {
		next = nextChain;
	}

	public void process(String password) {
		 if (password.length() <= 20 && password.length() >= 8) {
             next.process(password);
         } else {
        	 System.out.println("Password should be less than 20 "
              		+ "and more than 8 characters in length.");
         }
	}
}
