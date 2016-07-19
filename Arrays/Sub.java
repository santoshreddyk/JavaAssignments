package org.sample;
import java.util.Scanner;
public class Sub {
	public int[] a;
	public int n;

	public void Data()
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
}
}

