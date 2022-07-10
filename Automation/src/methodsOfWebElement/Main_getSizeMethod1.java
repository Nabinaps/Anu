package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_getSizeMethod1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d= new ChromeDriver();
		d.get("https://demo.actitime.com/");
		WebElement un = d.findElement(By.id("username"));
		int height=un.getSize().getHeight();
		int width=un.getSize().getWidth();
		WebElement pwd = d.findElement(By.name("pwd"));
		int height1=pwd.getSize().getHeight();
		int width1=pwd.getSize().getWidth();
		
		if(height==height1 && width==width1)
			System.out.println("height and width is same for username and password: passed");
		else
			System.out.println("height and width is not same for username and password: failed");
		d.close();
	}
}
