package Exceptions;

public class TaxCalculator {

	public void CalculatorTax(String empName,boolean isIndian,double empSal)
	{
		double taxAmount;
		try
		{
		if(isIndian==false)
		{
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
		}
		else if(empName.equalsIgnoreCase(""))
		{
			try {
				throw new  EmployeeNameInvalidException("The employee name cannot be empty");
			} catch (EmployeeNameInvalidException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(empSal>100000 && isIndian==true)
		{
			 taxAmount =empSal *8/100 ;
			 System.out.println("total amount"+taxAmount);
		}
		else if(empSal>50000 &&empSal<1100000 && isIndian==true)
		{
			 taxAmount =empSal *6/100;
			 System.out.println("total amount"+taxAmount);
		}
		else if(empSal>30000 &&empSal<50000 && isIndian==true)
		{
			taxAmount =empSal *5/100 ;
			System.out.println("total amount"+taxAmount);
		} else
			try {
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			} catch (TaxNotEligibleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(CountryNotValidException e)
		{
			e.printStackTrace();
		}
		
		
		
	}


}
