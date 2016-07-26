package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) throws LoginException {
		ValidateUser v = new ValidateUser();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name: ");

		String name = "";
		String password = "";
		try {
			name = reader.readLine();
			System.out.print("Enter your pwd  : ");
			password = reader.readLine();
			v.checkUser(name, password);

			/*
			 * if(v.checkUser(name, password) == true) { System.out.println(
			 * "You entered correctly"); }
			 * 
			 * if( v.checkUser(name, password) == false){ throw new
			 * LoginException(password); }
			 */
			System.out.println("Your name is: " + name + " and password is :" + password);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
