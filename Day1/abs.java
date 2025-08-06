abstract class sample
{
	public void display1()
	{
	}
	abstract public void display2();
	abstract public void display3();
}
class sample1 extends sample
{
	public void display2()
	{
	}

}
class abs
{
	public static void main(String args[])
	{
		sample1 obj = new sample1();
	}
}