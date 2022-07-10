package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_closeChildFirstUsingIterator {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		d.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(5000);
		Set<String> allwh = d.getWindowHandles();
		//String pwh = d.getWindowHandle();
		//System.out.println(pwh);
		Iterator<String>it=allwh.iterator();
		String pwh = it.next();
		String cwh = it.next();
		Thread.sleep(5000);
		d.switchTo().window(cwh);
		d.close();
		Thread.sleep(5000);
		d.switchTo().window(pwh);
		d.close();
		
		
		
		
	}
}
