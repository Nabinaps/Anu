package HandlingPopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main_NotificationPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver d=new ChromeDriver(option);
	d.get("https://www.yatra.com/");
	
	
	
	
	
	
	}
}
