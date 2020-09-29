package com.practice.userRegistrationUC12;

public class UserRegistration {
	public boolean validateFirstName(String fName) throws InvalidInputException{
		boolean x = fName.matches("[A-Z][a-z]{2,}");
		if(x==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_FIRSTNAME,"Enter First name in specified format");
		   else return true;
	}	
	
	public boolean validateLastName(String lName) throws InvalidInputException{
		boolean x = lName.matches("[A-Z][a-z]{2,}");
		if(x==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_FIRSTNAME,"Enter Last name in specified format");
		   else return true;
	}
	
	public boolean validateEmail(String email) throws InvalidInputException{
		boolean x = email.matches("[a-zA-Z0-9+_-]+(.[a-zA-Z0-9+_-]*)@([^\\s])+[.][\\w]{1,}([.][\\w]{3,}.?|[.][a-zA-Z]{2}.?)?");
		if(x==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_FIRSTNAME,"Enter Email in specified format");
		   else return true;
	}
	
	public boolean validatePhoneNumber(String pNumber) throws InvalidInputException{
		boolean x = pNumber.matches("(91)[7-9][0-9]{9}");
		if(x==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_FIRSTNAME,"Enter Phone number in specified format");
		   else return true;
	}
	
	public boolean validatePassword(String password) throws InvalidInputException{
		boolean x = password.matches("(?=.*[^\\w])(?=.*[0-9])(?=.*[A-Z])[^\\s].{8,}");
		if(x==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_FIRSTNAME,"Enter Password in specified format");
		   else return true;	
	}

}
