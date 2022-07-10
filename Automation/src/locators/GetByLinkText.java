package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetByLinkText 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nabin/Desktop/APIDEMO.html");
		driver.findElement(By.linkText("Google")).click();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	}
}
