package constructor.sample;

public class Emp {
	int empno;
	String ename;
	int sal;
	String type;

public Emp()
{
	empno=10;
	ename="abc";
	sal=50000;
	type="permanent";
}
public Emp(int empno,String ename,int sal,String type)
{
this.empno = empno;
this.ename=ename;
this.sal=sal;
this.type=type;
}
public void display()
{
	System.out.println("emp name is"+ename+"sai is "+sal);
}


}
