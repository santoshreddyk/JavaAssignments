package Exceptions;

public class TaxException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;
	public TaxException(String s)
	{
		super(s);
	}
 public void printStackTrace()
 {
	 System.out.println(s);
 }
}
