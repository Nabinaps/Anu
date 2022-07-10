package HandlingDisableElementAndScrollDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_ScrollingToParticularElement {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/news");
		d.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//d.findElement(By.xpath("//span[text()='Close']")).click();
	
		
		d.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		int y = d.findElement(By.xpath("//span[text()='How to Watch']")).getLocation().getY();
		Thread.sleep(2000);
		JavascriptExecutor r=(JavascriptExecutor)d;
		r.executeScript("window.scrollBy(0,"+y+")");
		
		
		
	}
}
