package Exceptions;

public class EmployeeNameInvalidException extends Exception {
String s;
	public EmployeeNameInvalidException(String s) {
		// TODO Auto-generated constructor stub
		super(s);
		this.s=s;
	}

	/**
	 * 
	 */
	 public void printStackTrace()
	 {
		 System.out.println(s);
	 }
	private static final long serialVersionUID = 1L;

}
