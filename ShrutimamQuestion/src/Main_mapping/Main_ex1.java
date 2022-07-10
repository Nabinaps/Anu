package Main_mapping;

import java.util.HashMap;
import java.util.Map;

public class Main_ex1 {
public static void main(String[] args) {
	HashMap<String, Integer>h1=new HashMap<String,Integer>();
	h1.put("no1", 1);
	h1.put("no2", 2);
	h1.put("no3", 3);
	System.out.println(h1);
	h1.putIfAbsent("no4", 4);
	System.out.println(h1);
	h1.putIfAbsent("no5", 5);
	System.out.println(h1);
	System.out.println("==================================================");
	HashMap<String, Integer>h2=new HashMap<String,Integer>();
	h2.put("ph1", 1234);
	System.out.println(h2);
	h2.putAll(h1);
	System.out.println(h2);
	System.out.println(h2.values());
	System.out.println(h2.keySet());
	System.out.println(h2.get("no1"));
	System.out.println(h2.size());
	System.out.println(h2.entrySet());
	for(Map.Entry m:h2.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	for(String key:h2.keySet())
	{
		System.out.println(key);
	}
	for(Object value:h2.values())
	{
		System.out.println(value);
	}
	
}
}
