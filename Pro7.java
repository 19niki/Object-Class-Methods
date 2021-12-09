
public class Pro7 {

	String name;
	int price;
	Pro7(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		System.out.println("name of the laptop is:"+ name);
		System.out.println("Price of the laptop is:"+ price);
		return "";					
	}
	public boolean equals(Object o)
	{
		Pro7 temp =(Pro7)o;
		return this.name == temp.name &&
		this.price == temp.price;
	}
	public static void main(String[] args)
	{
		Pro7 obj1 = new Pro7("Dell", 50000);
		Pro7 obj2 = new Pro7("Dell", 50000);
		System.out.println(obj1);
		System.out.println(obj2);
		if(obj1.equals(obj2))
		{
			System.out.println("Same config");
		}
		else
			System.out.println("Diff config");
					
		}
       
	}


