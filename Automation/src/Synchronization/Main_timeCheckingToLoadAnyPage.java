package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_timeCheckingToLoadAnyPage 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1=new ChromeDriver();
		d1.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
		try {
		d1.get("https://demo.actitime.com/");
		System.out.println("loaded within 3 sec");
		}
		catch(Exception e)
		{
			System.out.println("not loaded within 3 sec");
		}
	}
}
