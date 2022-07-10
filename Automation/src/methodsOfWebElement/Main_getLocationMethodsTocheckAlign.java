package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_getLocationMethodsTocheckAlign 
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
		int x=un.getLocation().getX();
		WebElement pwd = d.findElement(By.name("pwd"));
		int x1=pwd.getLocation().getX();
		if(x==x1)
			System.out.println("username and password alligned properly");
		else
			System.out.println("username and password not alligned properly");
		d.close();
	}
}
