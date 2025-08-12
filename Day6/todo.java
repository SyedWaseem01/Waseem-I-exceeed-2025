import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;
import java.time.format.DateTimeParseException;
class todo
{
	private static ArrayList<String> tasks = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String args[])
	{


		while(true)
		{
			display();
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1:
					addTask();
					break;
				case 2:
					viewTask();
					break;
				case 3:
					markTask();
					break;
				case 4:
					deleteTask();
					break;
				case 5:
					System.out.println("Exiting ...");
					return;
				default:
					System.out.println("Enter a coorect choice");
						
			}
		}
	}
	
	public static void display()
	{
		System.out.println("1.Add your task");
		System.out.println("2.View your task");
		System.out.println("3.Mark your task as completed");
		System.out.println("4.Delete your task");
		System.out.println("5.Exit from the todo");
	}

	public static void addTask()
	{
		System.out.println("Enter the Task to add");
		String task = sc.nextLine();
		//System.out.println("Enter 1 to add the time remainder for you task");
		//int t = sc.nextInt();
		/*if(t==1)
		{
			try{
			System.out.print("Enter a time (HH:mm:ss): ");
			String Time = sc.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        		LocalTime userTime = LocalTime.parse(Time, formatter);
			LocalTime currentTime = LocalTime.now();
			if(currentTime.equals(userTime))
			{
				System.out.println("Complete your task");
			}
			}
			catch (DateTimeParseException e)
			{
				System.out.println("Invalid time format. Please enter time as HH:mm:ss (e.g., 14:30:00).");		
			}
		}*/
		if(tasks.contains(task))
		{
			System.out.println("Task is Already exit");
			return;
		}
		tasks.add(task);
		System.out.println("Task is added successfully\n");
		
	}
	public static void viewTask()
	{
		if(tasks.isEmpty())
		{	
			System.out.println("No tasks are there");
		}
		else
		{
			System.out.println("-------Your tasks------");
			for(int i=0;i<tasks.size();i++)
			{
				System.out.println((i+1)+"."+tasks.get(i));
			}
			System.out.println("\n");
		}
	}
	public static void markTask()
	{
		if(tasks.isEmpty())
		{	
			System.out.println("No tasks to complete");
		}
		else
		{
			viewTask();
			System.out.println("Enter the task number to mark as completed");
			int taskmark = sc.nextInt();
			String mark = tasks.get(taskmark-1);
			String mark1 = mark+"[Completed]";
			tasks.set(taskmark-1,mark1);
			System.out.println("Task marked as completed");
		}
		
	}
	public static void deleteTask()
	{
		if(tasks.isEmpty())
		{	
			System.out.println("No tasks to delete");
		}
		else
		{
			viewTask();
			System.out.println("Enter the task number to delete");
			int delete = sc.nextInt();
			if(delete<=tasks.size())
			{	
			tasks.remove(delete-1);
			System.out.println("Task is deleted");
			}
			else
			{
				System.out.println("Select task which are available");
			}
			sc.nextLine();
		}
	}

}