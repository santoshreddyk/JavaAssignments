package maxmin.sample;

import java.util.Scanner;

public class MaxMin {

	public int[] a;
	public int n;

	public void Code()
	{
		int []a=new int[100];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no. of elements");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	Scanner key=new Scanner(System.in);
	int k=key.nextInt();
	a[i]=k;
	}
	System.out.println("the values of array are");
	for(int j=0;j<n;j++)
	{
	System.out.print("\t"+a[j]);
	}
	Min(a,n);
	Max(a,n);
	
    }
	public void Min(int[] a,int n)
	{
		int minvalue=a[0];
		for(int j=1;j<n;j++)
		{
			
		if(a[j]<minvalue)
		{
			minvalue=a[j];
		}
			
		}
		System.out.println("the manimum value of array is"+ minvalue);
		
	}
	
	public void Max(int[] a,int n)
	{
		int maxvalue=a[0];
		for(int j=0;j<n;j++)
		{
			
		if(a[j+1]>maxvalue)
		{
			maxvalue=a[j+1];
		}
			
		}
		System.out.println("the maximum value of array is"+maxvalue);
		
	}
}
