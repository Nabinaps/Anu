package StringClass;

public class AllMethodsOfStringClass {

	public static void main(String[] args) {
		String s="QSPIDERS";
		String lower=s.toLowerCase();//this method will return lowercase value
		System.out.println(s);
		System.out.println(lower);
		String upper=lower.toUpperCase();//this will return uppercase value
		System.out.println(upper);
		char c=s.charAt(0);            //this will return specified character
		System.out.println(c);
		String sub=s.substring(2,6);  //this will return part of a string including starting point and excluding end point
		System.out.println(sub);
		String name="   NABIN     ";
		System.out.println(name.trim());//this will remove the spaces at starting and ending point
		System.out.println(s.indexOf("S"));//this will return index value of specified character
		System.out.println(s.indexOf('Z'));//this will return -1 as it is not present in the string
		System.out.println(s.length());  ///this will return the length of the string
		System.out.println(s.concat("nabin"));////this will add to string
		System.out.println(s.replace('Q', 'J'));// to replace any character or string
		System.out.println(s.contains("SP"));//to check string present or not
		System.out.println(s.endsWith("DER"));
		System.out.println(s.lastIndexOf("S"));
		System.out.println(s.matches(lower));
		System.out.println(s.equals(lower));
		System.out.println(s.hashCode());
		
	}

}
