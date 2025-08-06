class company

{

    String nameofcom;

    String city;
 
    company(String nameofcom,String city)

	{

	  this.nameofcom=nameofcom;

	  this.city=city;

	}

  }
 
class HR extends company

{

    HR()

	{
		super("I-Exceed","Banglore");
		System.out.println("This is a Hr Team from the "+nameofcom+" company in "+"city "+city);
 
	}

}
 
 
class Finance extends company

{

    Finance()

	{
		super("I-Exceed","Banglore");
		System.out.println("This is a finance Team from the "+nameofcom+" company in "+"city "+city);
 
	}

}

public class demoinheritence2
{
	public static void main(String args[])
	{
		new HR();
		new Finance();
		
	}

}

 