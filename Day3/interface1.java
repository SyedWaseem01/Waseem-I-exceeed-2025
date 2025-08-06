interface one

{

    public void methodfromone();
 
}
 
interface two extends one

{

    public void methodfromtwo();

}
 
class sample implements two

  {

     sample()

	{
 
	}



     public void methodfromone(){

	 System.out.println("method from interface one");

	}
 


     public void methodfromtwo(){

	System.out.println("method from interface two");

	}

}
 
class interface1

{

    public static void main(String asd[])

	{

	   sample obj=new sample();

	   obj.methodfromone();

	   obj.methodfromtwo();	

	}

}
 