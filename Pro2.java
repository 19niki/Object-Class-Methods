/*
 * Ex: To override the toString method 
 * Now rather than displaying the refrence of the object it will return the String
 */
public class Pro2 {

	public String toString()
	{
		return "hi";
	}
	public static void main(String[] args)
	{
	      Pro2 obj = new Pro2();
	      System.out.println(obj); //hi
	      System.out.println(obj.toString()); //hi

	}

}
