/*
 * To override the hashcode method
 * It is recommende to override the hashcode whenever equals method is overriden
 * If equal method compares state of 2 object then hashcode such that it return an  integer number generated based on the state  of the object
 */
public class Pro9 {
	
	int i;
	Pro9(int i)
	{
	   this.i=i;	
	}
	public boolean equals(Object o)
	{
		Pro9 temp = (Pro9)o;
		return this.i==temp.i;
	}
	public int hashCode()
	{
		int hc =0;
		hc=hc+1;
		return hc;
	}

	public static void main(String[] args) 
	{
        Pro9 obj1 = new Pro9(18);
        Pro9 obj2 =new Pro9(18);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode()==obj2.hashCode());
        
       
	}

}
