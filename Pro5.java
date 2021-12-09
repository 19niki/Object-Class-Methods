
public class Pro5 {
	int i;
	Pro5(int i)
	{
	this.i=i;	
	}
		public static void main(String[] args)
		{
		     Pro5 obj1 = new Pro5(19);
		     Pro5 obj2 = obj1;
		     
		     System.out.println(obj1);
		     System.out.println(obj2);
		     System.out.println(obj1 == obj2); //true
		     System.out.println(obj1.equals(obj2)); //true

		}

	}