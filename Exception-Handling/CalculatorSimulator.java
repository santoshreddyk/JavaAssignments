package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your emp name: ");
       try {
		String empName=reader.readLine();
		System.out.print("is he an indian: ");
		String nationality=reader.readLine();
		boolean isIndian = Boolean.parseBoolean(nationality);
		System.out.print("enter empsal:: ");
		String value=reader.readLine();
		double empSal=Double.parseDouble(value);
		TaxCalculator tc=new TaxCalculator();
		tc. CalculatorTax(empName,isIndian,empSal);
			//System.out.println("the taxAmount is"+total);	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
