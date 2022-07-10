package HandlingTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_cLoseChildTabFirst {
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
		String ptab=it.next();
		String ctab=it.next();
		d.switchTo().window(ctab);
		d.close();
		d.switchTo().window(ptab);
		d.close();
	}
}
