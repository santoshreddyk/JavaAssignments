package Exceptions;

public class LoginException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;
	public LoginException(String s) {
		super(s);
		this.s = s;
	}
	
	public void printStackTrace(){
		System.out.println(s);
	}
}
