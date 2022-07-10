package HandlingDisableElementAndScrollDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_scrollingDownUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/news");
		Thread.sleep(2000);
		JavascriptExecutor r=(JavascriptExecutor)d;
		//scrollBy() method will count from where the curser is present
		r.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		r.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		//scroll to buttom of the page
		r.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//scrolling upwards
		r.executeScript("window.scrollBy(0,-1000)");
		
		
	}
}
