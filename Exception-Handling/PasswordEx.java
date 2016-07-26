package Exceptions;

import java.util.Scanner;

public class PasswordEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ehete the password");
		String Password = sc.next();
     ValidPassword vp=new ValidPassword();
     try {
		vp.validPassword(Password);
	} catch (PasswordException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
