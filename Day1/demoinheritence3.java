import java.util.*;
class Car
{
	String nameofCompany;
	Boolean isAvailable;
	Car(String nameofCompany,boolean isAvailable)
	{
		this.nameofCompany = nameofCompany;
		this.isAvailable = isAvailable;
	}
	void getcarDetails()
	{
		
		System.out.println("Availability:- "+isAvailable);
		System.out.println("Company:- "+ nameofCompany);
	}
}
class Scorpio extends Car
{
	String carName,modelName,color;
	Scorpio(String carName,String modelName, String color)
	{
		super("Tata",true);
		this.carName = carName;
		this.modelName = modelName;
		this.color = color;
	}
	void displaycarModel()
	{
		System.out.println("car Name:- "+carName);
		System.out.println("model name:- "+modelName);
		System.out.println("color:- "+color);
	}
	
}
public class demoinheritence3
{
	public static void main(String RGS[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the details of car to check its availability");
		System.out.println("enter the car name");
		String name  = sc.next();
		System.out.println("enter the model name");
		String model  = sc.next();
		System.out.println("enter the color which you want");
		String color  = sc.next();
		if(name.equals("Scorpio") || name.equals("scorpio"))
		{
			Scorpio s = new Scorpio(name,model,color);
			System.out.println("The details you have entered are");
			s.displaycarModel();
			System.out.println("Below has details of you car availability");
			s.getcarDetails();

		}
	} 
}