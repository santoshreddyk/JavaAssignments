package abs.sample;

public abstract class Employee {
	int empno;
	String ename;
	abstract void jobs();
	abstract void timings();
	
 public void noticeperiod()
 {
	 System.out.println("notice period is two months");
 }

}
