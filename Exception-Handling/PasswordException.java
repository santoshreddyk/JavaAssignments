package Exceptions;

public class PasswordException extends Exception{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String e;
	public PasswordException(String e)
	{
		super(e);
		this.e=e;
	}
	
	public void printStackTrace()
	{
		System.out.println(e);
	}
}
