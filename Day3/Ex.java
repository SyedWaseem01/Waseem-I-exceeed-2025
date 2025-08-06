class Staticinstancevar
{

	public static void main(String args[])
	{
		sample e = new sample();
		e.display();
		sample.display1();
	}
}
class sample
{
	int x =10;
	static int y=30;
	public void display()
	{
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}
	static void display1()
	{
		System.out.println("X = "+new sample().x);
		System.out.println("Y = "+y);		
	}
}