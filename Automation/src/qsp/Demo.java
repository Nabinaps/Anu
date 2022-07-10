package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
ChromeDriver c=new ChromeDriver();
c.get("http://google.com/");/// for searching any url using automation
String title=c.getTitle();
System.out.println(title);
c.close();//for closing the opened application
	}
 
}
