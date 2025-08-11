class Account
{
	private double balance;
	private String acc_no;
	private String id;
	Account(double balance, String acc_no, String id)
	{
		this.balance = balance;
		this.acc_no = acc_no;
		this.id = id;
	}
	public double getbalance()
	{
		return balance;
	}
	public String getacc_no()
	{
		return acc_no;
	}
	public String getid()
	{
		return id;
	}
	public boolean deposit(double amount,String acc)
	{
		if(amount<=0)
		{
			System.out.println("Cant deposit the amount");
			return false;
		}
		balance = balance + amount;
		printtype("DEPOSIT",amount,acc);

		return true;
	}
	public boolean withdraw(double amount,String acc)
	{
		if(amount>balance || amount<=0)
		{
			System.out.println("Cant withdraw insufficient balance");
			return false;
		}
		balance = balance - amount;
		printtype("WITHDRAW",amount,acc);
		return true;
	}
	public boolean transfer(Account from,Account to, double amount,String acc)
	{
		if(amount<0 || amount>from.getbalance())
		{
			System.out.println("Cant transfer");
			return false;
		}
		from.withdraw(amount,acc);
		to.deposit(amount,acc);
		printtype("TRANSFER",amount,acc);
		return true;
	}
	public void printtype(String type,double amount,String account)
	{
		System.out.println("Transaction Type :"+type+" Amount:-"+amount+" Account "+account);
		System.out.println("Balance = "+getbalance()+" in account "+account);
	}
}

public class Bank
{
	public static void main(String args[])
	{
		Account user1 = new Account(1000.0,"A10001","111");
		Account user2 = new Account(2000.0,"B10001","222");
		System.out.println("User 1: Balance: "+user1.getbalance());
		System.out.println("User 1: acc_no: "+user1.getacc_no());
		System.out.println("User 1: Id: "+user1.getid());
		System.out.println("---------------------------------");
		System.out.println("User 2: Balance: "+user2.getbalance());
		System.out.println("User 2: acc_no: "+user2.getacc_no());
		System.out.println("User 2: Id: "+user2.getid());
		System.out.println("---------------------------------");
		user1.deposit(500,"A10001");
		System.out.println("---------------------------------");
		
		user1.deposit(0,"A10001");
		System.out.println("---------------------------------");

		user2.deposit(500,"B10001");
		System.out.println("---------------------------------");
		
		user1.withdraw(1000,"A10001");
		System.out.println("---------------------------------");
		
		user1.withdraw(1000,"A10001");
		System.out.println("---------------------------------");

		user2.withdraw(1000,"B10001");
		System.out.println("---------------------------------");

		user1.transfer(user1,user2,500,"A10001");
		System.out.println("---------------------------------");
		
	}
}