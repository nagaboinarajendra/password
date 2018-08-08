package com.epam.chain;

public  class SpecialCharacterChecker implements Chain {
	public void setNext(Chain nextChain) {
	}
	public void process(String password) {
		String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,"
		 		+ "_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
		 if (password.matches(specialChars))
         {
			 System.out.println("valid password");
         } else {
        	 System.out.println("Password should contain"
              		+ "atleast one Special Character"); 
         }
	}
}