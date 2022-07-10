package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_customWait1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1=new ChromeDriver();
		d1.get("https://demo.actitime.com/");
		d1.findElement(By.id("username")).sendKeys("admin");
		d1.findElement(By.name("pwd")).sendKeys("manager");
		d1.findElement(By.xpath("//div[text()='Login ']")).click();
		while(true)
		{
			try
			{
				d1.findElement(By.id("logoutLink")).click();
				d1.close();
			}
			catch(Exception e)
			{
			}
		}
	}
}
