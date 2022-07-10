package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_getLocationMethods 
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
		int y=un.getLocation().getY();
		System.out.println("x-axis is: "+x);
		System.out.println("y-axis is: "+y);
		d.close();
	}
}
