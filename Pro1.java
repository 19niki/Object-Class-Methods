/*
 * toString():- Is object class method
 * To string method return a string
 * In java every time we try to print the refrence of the object the "toString" method of the object is called
 * Object class implementation to string method returns a string in the following format
 *  Syntax: - fullyqulifed class name @ Hexadecimalnumber
 */

public class Pro1 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pro1 obj = new Pro1();
		System.out.println(obj); //Pro1@5e265ba4
		System.out.println(obj.toString()); //Pro1@5e265ba4
		System.out.println(new Pro1()); //Pro1@36aa7bc2

	}

}
