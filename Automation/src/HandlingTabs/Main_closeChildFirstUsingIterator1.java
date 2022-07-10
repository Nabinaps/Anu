package HandlingTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_closeChildFirstUsingIterator1 {
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
		String pwh = d.getWindowHandle();
		//System.out.println(pwh);
		Iterator<String>it=allwh.iterator();
		
		while(it.hasNext())
		{
			
			String ad = it.next();
			//System.out.println(ad);
			d.switchTo().window(ad);
			if(!(ad.equals(pwh)))
			{
				d.close();
			}
		}
		Thread.sleep(2000);
		d.switchTo().window(pwh);
		d.close();
		
		
		
	}
}
