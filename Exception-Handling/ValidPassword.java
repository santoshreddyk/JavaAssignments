package Exceptions;

public class ValidPassword  {
 public void validPassword(String Password) throws PasswordException
 {
	 if(Password.length()>6)
	 {
		 System.out.println("valid password");
	 }
	 else
	 {
		 throw new PasswordException("please eneter password value geter than 6");
	 }
 }
}
