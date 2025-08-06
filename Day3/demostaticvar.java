class demostaticvar 
{
	static int x;
	int y;
	demostaticvar()
	{
		x++;
		y++;
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String args[])
	{	
		demostaticvar obj1 = new demostaticvar();
		demostaticvar obj2 = new demostaticvar();
		demostaticvar obj3 = new demostaticvar();
		System.out.println(demostaticvar.x);
	}
}	