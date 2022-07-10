package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_SendKeysMethods {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		d.findElement(By.name("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		
		d.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		d.close();
}
}
