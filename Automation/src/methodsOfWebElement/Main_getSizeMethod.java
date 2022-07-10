package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_getSizeMethod 
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
		System.out.println("Height is: "+height);
		System.out.println("width is: "+width);
		d.close();
	}
}
