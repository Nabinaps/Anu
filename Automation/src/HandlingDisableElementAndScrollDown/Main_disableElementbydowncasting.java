package HandlingDisableElementAndScrollDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Main_disableElementbydowncasting {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/nabin/Desktop/disabled.html");
		RemoteWebDriver r=(RemoteWebDriver)d;
		r.executeScript("document.getElementById('d1').value='admin'");
		r.executeScript("document.getElementById('d2').value='payel'");
		
		
	}
}
