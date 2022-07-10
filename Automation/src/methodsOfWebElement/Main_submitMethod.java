package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_submitMethod 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d=new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/");
		d.findElement(By.id("user_login_btn")).submit();
		Thread.sleep(2000);
		d.close();
	}
}
