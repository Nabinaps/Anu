package Main_filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainEx1_ 
{
	public static void main(String[] args) throws IOException {
		
		File ob=new File("E://nabin3.text");
		try {
		if(ob.createNewFile())
		{
			System.out.println(ob.canExecute());
			System.out.println(ob.canRead());
			System.out.println(ob.canWrite());
		}
		else
		{
			System.out.println("already exit");
		}
		}
	
		catch(IOException r) {}
		FileWriter w=new FileWriter(ob);
		try {
	//if (ob.exists())
	//{
			w.write("10000");
			w.write("Anu");
	//}
		}
		catch(IOException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		w.close();
	}
}
