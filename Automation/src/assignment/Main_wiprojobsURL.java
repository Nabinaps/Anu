package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_wiprojobsURL 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.google.com/");
		d1.findElement(By.name("q")).sendKeys("wipro jobs");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		List<WebElement> alllinks = d1.findElements(By.xpath("//a"));
		
		int count = alllinks.size();
		System.out.println(count);
		for(WebElement all:alllinks)
		{
			String link = all.getAttribute("href");
			System.out.println(link);
		}
		d1.close();
	}
}
