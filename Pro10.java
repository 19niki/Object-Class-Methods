
public class Pro10
{
int bid;
String name;
int price;
Pro10(int bid,String name,int price)
{
	this.bid=bid;
	this.name=name;
	this.price=price;
}
public String toString()
{
	System.out.println("bid");
	System.out.println("name");
	System.out.println("price");
	return "";
}
public boolean equals(Object o)
{
	Pro10 temp = (Pro10)o;
	return this.bid == temp.bid && this.name == temp.name && this.price == temp.price;
	
}

public int hashCode()
{
	int hc=0;
	hc=hc+bid;
	hc=hc+price;
	hc=hc+name.hashCode();
	return hc;
}
	public static void main(String[] args) 
 	{
         Pro10 obj1 = new Pro10(10,"ggg",1981);
         Pro10 obj2 = new Pro10(16,"uqi",1982);
         System.out.println(obj1.equals(obj2));
         System.out.println(obj1.hashCode());
         System.out.println(obj2.hashCode());
         System.out.println(obj1.hashCode()==obj2.hashCode());
         
         

	}

}
