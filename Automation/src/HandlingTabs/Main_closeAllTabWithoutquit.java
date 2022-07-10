package HandlingTabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_closeAllTabWithoutquit {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		d.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
		Set<String> allTabs = d.getWindowHandles();
		for(String all:allTabs)
		{
			d.switchTo().window(all);
			d.close();
		}
	}
}
