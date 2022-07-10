package Synchronization;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main_expliciteWait 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver d1=new ChromeDriver();
		d1.get("https://demo.actitime.com/");
		d1.findElement(By.id("username")).sendKeys("admin");
		d1.findElement(By.name("pwd")).sendKeys("manager");
		d1.findElement(By.xpath("//div[text()='Login ']")).click();
		WebDriverWait wait=new WebDriverWait(d1, 5);
		wait.until(ExpectedConditions.titleContains("Enter"));
		String t=d1.getTitle();
		System.out.println(t);
		d1.close();
	}
}
