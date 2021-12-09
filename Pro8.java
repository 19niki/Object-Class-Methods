/*
 *  HashCode()- The hashcode method return integer
 *  Object class implemention of hash code generates the Unifue integer number generated  for each object
 *  According to object method implemention if equlas method return false for 2 objects reference then their hashcode are different
 *  If equals method return true for two refrence then their hashcode should be same
 */

public class Pro8 {

	int i;
	Pro8(int i)
	{
	this.i=i;	
	}
		public static void main(String[] args)
		{
		     Pro8 obj1 = new Pro8(19);
		     Pro8 obj2 = new Pro8(19);
		     System.out.println(obj1);
		     System.out.println(obj2);
		     System.out.println(obj1.hashCode());
		     System.out.println(obj2.hashCode());
		     System.out.println(obj1 == obj2); //false
		     System.out.println(obj1.equals(obj2)); //false
		     System.out.println(obj1.hashCode()==obj2.hashCode());

		}
}
