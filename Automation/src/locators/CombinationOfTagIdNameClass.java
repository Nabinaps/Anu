package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CombinationOfTagIdNameClass 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/nabin/Desktop/APIDEMO.html");
		d.findElement(By.tagName("a")).click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.findElement(By.name("n1")).click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.findElement(By.className("c1")).click();
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.findElement(By.id("d1")).click();
		Thread.sleep(2000);
		d.navigate().back();
		d.close();
	}
}
