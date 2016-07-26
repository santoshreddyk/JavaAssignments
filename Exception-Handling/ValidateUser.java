package Exceptions;

public class ValidateUser {

	public boolean checkUser(String username, String password){
		boolean result = false;

		if (username.equals("") || password.equals("")) {
			result = false;
			try {
				throw new LoginException("Username or Password shouldn't be null");
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin123")) {
			result = true;
			System.out.println("You entered correctly");
		}		
		return result;
	}
}
