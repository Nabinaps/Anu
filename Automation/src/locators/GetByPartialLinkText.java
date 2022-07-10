package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetByPartialLinkText 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nabin/Desktop/APIDEMO.html");
		driver.findElement(By.partialLinkText("G")).click();
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Goo")).click();//text can be part of the original but should be continuous 
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("gle")).click();
		driver.manage().window().maximize();
		driver.close();
	}
}
