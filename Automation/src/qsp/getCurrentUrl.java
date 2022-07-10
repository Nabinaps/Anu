package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver c=new ChromeDriver();
c.get("http://google.com/");
String currentUrl = c.getCurrentUrl();
String title=c.getTitle();
System.out.println(title);
System.out.println(currentUrl);
c.get("http://seleniumhg.org/");
String d = c.getCurrentUrl();
System.out.println(d);
c.quit();
	}
}
