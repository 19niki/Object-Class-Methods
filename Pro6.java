/*
 *  Overriding of the object method
 *  In order to compare the state of two objects rather than the refrence we 
 */


public class Pro6 {
int i;
Pro6(int i) // 20 is passed here
{
	this.i=i; //memory allocated for 20
	System.out.println(this.i);
	
}
public boolean equals(Object o) // it wiil compare the obj1.equals(obj2)
{
	Pro6 temp = (Pro6)o; //Upcasting
	return this.i == temp.i;
}
	public static void main(String[] args) 
	{
	   Pro6 obj1 = new Pro6(20);
	   Pro6 obj2 = new Pro6(20);
	   
	   System.out.println(obj1==obj2); //false because equlas opertor (==) compares the ref of 2 object
	   System.out.println(obj1.equals(obj2)); //equals method comapares the state of 2 boject since it is overriden.
   
	}

}
