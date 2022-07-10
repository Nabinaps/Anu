package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_closeSpecificChildBrowser {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1=new ChromeDriver();
		d1.get("https://secure.indeed.com/");
		d1.findElement(By.id("apple-signin-button")).click();
		d1.findElement(By.id("login-facebook-button")).click();
		Set<String> alwh = d1.getWindowHandles();
		for(String wh:alwh)
		{
			d1.switchTo().window(wh);
			String title = d1.getTitle();
			System.out.println(title);
			if(title.equals("Facebook"))
			{
				d1.close();
			}
		}
	}
}
