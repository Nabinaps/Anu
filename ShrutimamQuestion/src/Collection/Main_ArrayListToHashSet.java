package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class Main_ArrayListToHashSet
{
	public static void main(String[] args) 
	{
		ArrayList<String>a1=new ArrayList<>();
		a1.add("Nabin");
		a1.add("Anu");
		HashSet<String>h1=new HashSet<String>();
		h1.addAll(a1);
	}
}
