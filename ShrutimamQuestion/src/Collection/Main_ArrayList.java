package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(100);
		a1.add(200);
		System.out.println(a1);
		//a1.set(0, 5);
		//System.out.println(a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.addAll(a1);
		a2.add(354);
		System.out.println(a2.size());
		//System.out.println(a2);
		a2.add(2,478);
		//System.out.println(a2);
		a2.addAll(3,a1);
		for(int x:a2)
			System.out.println(x);
		System.out.println(a2);
		Iterator it=a2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("============================================================================");
		ListIterator<Integer>l=a2.listIterator();
		while(l.hasNext())
		{
			System.out.println(l.next());
		}
		System.out.println("================================================================================");
		while(l.hasPrevious())
		{
			System.out.println(l.previous());
		}
		a2.retainAll(a1);
		System.out.println(a2);
		a2.retainAll(a2);
		System.out.println(a2);
		a2.set(2,100);
		System.out.println(a2);
		/*boolean x = a2.contains(100);
		System.out.println(x);
		boolean y = a2.containsAll(a1);
		System.out.println(y);
		int p=a2.get(2);
		System.out.println(p);
		System.out.println(a2.remove(0));
		System.out.println(a2);
		System.out.println(a2.isEmpty());
		System.out.println(a2.indexOf(478));
		System.out.println(a2);
		System.out.println(a2.removeAll(a1));
		System.out.println(a2);*/
	}
}
