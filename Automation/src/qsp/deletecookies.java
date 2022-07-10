package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class deletecookies {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver c=new ChromeDriver();
c.manage().deleteAllCookies();
c.get("http://google.com/");
String title=c.getTitle();
System.out.println(title);
c.quit();
	}
}
