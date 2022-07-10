package StringClass;

public class MainEqualsMethod 
{
	
	public static void main(String[] args) {
		String a="ANU";//a is in String constant pool
		String b=new String("ANU");// b is in heap area 
		System.out.println(a==b);//false because reference are difference
		System.out.println(a.equals(b));//true data is same
		String c="NABIN";// both c and d have same reference
		String d="NABIN";//both is in string constant pool
		System.out.println(c==d);//true reference is same
		System.out.println(c.equals(d));//true data is same
		String p=new String("ANJALI");//both is in heap area
		String Q=new String("ANJALI");//different reference
		System.out.println(p==Q);//false
		System.out.println(p.equals(Q));//true  as data is same
	}
}
