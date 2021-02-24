package com.exception_handling;

public class EmailBussinessLogic {

	public boolean isValidEmailId(String email) throws MyEmailIDException{
		if(email.equals(null) || email.equals(""))
			throw new MyEmailIDException("The email id cannot be empty");
		if(!email.contains(".com") || !email.contains("@"))
			throw new MyEmailIDException("The incorrect email id format");
		
		return true;
	}
}
