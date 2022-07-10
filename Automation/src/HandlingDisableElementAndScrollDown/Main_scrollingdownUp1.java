package HandlingDisableElementAndScrollDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_scrollingdownUp1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/news");
		Thread.sleep(2000);
		JavascriptExecutor r=(JavascriptExecutor)d;
		r.executeScript("window.scrollTo(0,1000)");//scrollTo() method will always count from the top of the page
		Thread.sleep(2000);
		r.executeScript("window.scrollTo(0,2000)");
		Thread.sleep(2000);
		//scroll to buttom of the page
		r.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//scroll to top of the page
		r.executeScript("window.scrollTo(0,0)");
		
		
	}
}
