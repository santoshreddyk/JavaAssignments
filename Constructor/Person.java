package constructor.sample;

public class Person {

	String fname;
	String lname;
  public Person(String fname,String lname)
  {
	 this.fname=fname;
	 this.lname=lname;
	 System.out.println("the given names are "+fname+"\t"+lname);
  }
}
