/*
 * 2. Equlas method  - Public boolean equals (Object o)
 *  This method is used to compare the refrence of one object with the another object
 *  It behaves similar to Equlity opertor 
 *  Syntax:
 *  obj1.equals(obj2)
 *  It comapres refrence of current object with the passed object
 *  If we override the Equals method it compares the state of object rather than comparing the refrence of 2 object
 */
public class Pro4 {
int i;
Pro4(int i)
{
this.i=i;	
}
	public static void main(String[] args)
	{
	     Pro4 obj1 = new Pro4(19);
	     Pro4 obj2 = new Pro4(19);
	     System.out.println(obj1);
	     System.out.println(obj2);
	     System.out.println(obj1 == obj2); //false
	     System.out.println(obj1.equals(obj2)); //false

	}

}
