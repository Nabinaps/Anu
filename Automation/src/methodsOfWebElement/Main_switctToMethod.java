package methodsOfWebElement;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_switctToMethod 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.switchTo().activeElement().sendKeys("java"+Keys.ENTER);
		Thread.sleep(2000);
		d.close();
	}
}
