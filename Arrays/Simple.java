package org.sample;

public class Simple extends Sub{
	public void sumCal()
	{
		int sum=0;
		System.out.println(super.n);
		for(int j=0;j<super.n;j++)
		{
			sum=sum+super.a[j];
		}
		 System.out.println("\tthe total sum of elements in array is :\t"+sum); 
	}
}
