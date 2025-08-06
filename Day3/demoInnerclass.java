class Karnataka
{
	String cm;
	double area;
	Karnataka(String cm,double area)
	{
		this.cm =cm;
		this.area = area;
	}
	class Mysuru
	{
		String collector_name;
	   	int area_dist;
		Mysuru(String collector_name,int area_dist)
		{
			this.collector_name = collector_name;
			this.area_dist = area_dist;
		}

          		class Kolar
			{
				String collector_name;
	   			int area_dist;
				Kolar(String collector_name,int area_dist)
				{
					this.collector_name = collector_name;
					this.area_dist = area_dist;
				}
				public void display()
				{
					System.out.println("Area of dist "+area_dist);
					System.out.println("name of the collector "+collector_name);
				}
			}
		public void display()
		{

			System.out.println("Area of dist "+area_dist);
			System.out.println("name of the collector "+collector_name);
		}
			
	      }
	public void display()
	{
		System.out.println("Area of state "+area);
		System.out.println("name of the cm "+cm);
	}
		
}


class demoInnerclass
{
	public static void main(String args[])
	{
		Karnataka.Mysuru.Kolar my = new Karnataka("Syed",700).new Mysuru("Waseem",20).new Kolar("Basha",300);
		new Karnataka("Syed",700).display();
		new Karnataka("Syed",700).new Mysuru("Waseem",20).display();
		my.display();
	}
}
