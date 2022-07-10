package HandlingPropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Main_TakingDataFromPropertyfile 
{
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./data/common.property");
		Properties p=new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		System.out.println(url);
		
	}
}
