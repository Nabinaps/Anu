 package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_MobileNameAndPrice 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		d.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		Thread.sleep(3000);
		//Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		d.findElement(By.xpath("//button")).submit();
		Thread.sleep(20000);
		List<WebElement> allname = d.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')] "));
		List<WebElement> allprice = d.findElements(By.xpath("//div[contains(text(),'APPLE iPhone 13 Pro Max')] /../../div[2]/div[1]/div[1]/div"));
		
		System.out.println("     Name of the mobile         "+"                      Price");
		System.out.println("-----------------------------------------------------------------------------");
		for(int i=0;i<allname.size()-1;i++)
		{
			String text = allname.get(i).getText();
			String price = allprice.get(i).getText();
			System.out.println(text+"---------->   "+price);
		}
		d.close();
	
	
	
	
	
	}
}
