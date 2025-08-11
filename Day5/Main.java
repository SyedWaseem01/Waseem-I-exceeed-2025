class A extends Thread
{
	
	A(){
		Thread t  = new Thread(this);
		System.out.println(t.getName());
		t.start();
		System.out.println("Hi");
	}
	public void run(){
	System.out.println("run");
	}
}
public class Main
{
	public static void main(String args[])
	{
		Thread t = Thread.currentThread();
		System.out.println(t.getName());	
		
		A a = new A();
		System.out.println(a.getName());
		a.start();	
	}
}
