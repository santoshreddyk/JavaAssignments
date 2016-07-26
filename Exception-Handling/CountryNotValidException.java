package Exceptions;

public class CountryNotValidException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
String s;
	public CountryNotValidException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		this.s=s;
	}
	 public void printStackTrace()
	 {
		 System.out.println(s);
	 }
}
