package generic;

import java.io.IOException;

public class genericLibrary 
{
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileLib f=new FileLib();
		//reading data from property file
		String url = f.getPropertyData("url");
		System.out.println(url);
		//reading data from exelFile
		String pass=f.getExelData("sheet1", 1, 2);
		System.out.println(pass);
		//writing data on excel
		f.stExelData("sheet1", 1, 1,"nabin");
	}
	

}
