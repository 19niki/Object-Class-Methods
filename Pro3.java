
public class Pro3 {

	int id;
	String name;
	Pro3()
	{
		
	}
	Pro3(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+ "...." +name;
	}
	public static void main(String[] args)
	{
	     Pro3 obj = new Pro3(45,"ravi");
	    
	     System.out.println(obj);

	}

}
