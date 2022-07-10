package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_CaptureFlightDetails {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.cleartrip.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]")).sendKeys("ban");
		Thread.sleep(2000);
		d.findElement(By.xpath("//p[text()='Bangalore, IN - Kempegowda International Airport (BLR)']")).click();
		d.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]")).sendKeys("goa");
		Thread.sleep(2000);
		d.findElement(By.xpath("//p[text()='Goa, IN - Dabolim Airport (GOI)']")).click();
		d.findElement(By.xpath("(//button[contains(@class,'flex-middle flex-between')])[4]")).click();
		Thread.sleep(2000); 
		d.findElement(By.xpath("(//div[text()='13'])[1]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[@class='col flex flex-middle'])[3]")).click();
		Thread.sleep(5000);
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,3000)");
		j.executeScript("window.scrollBy(0,3000)");
		j.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(10000);
		List<WebElement> flights = d.findElements(By.xpath("//img"));
		List<WebElement> time = d.findElements(By.xpath("//img/../../../../../div[2]/div/div[1]/p"));
		Thread.sleep(5000);
		System.out.println(flights.size());
		System.out.println("flight name "+"  dept. time");
		System.out.println("-----------------------------");
		for(int i=0;i<flights.size()-1;i++)
		{
			String name = flights.get(i).getAttribute("alt");
			String t = time.get(i).getText();
			System.out.println(name+"       "+t);
		}
		d.close();
		
			
		
	}
}
