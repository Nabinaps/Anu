package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_TypeOnBothFrame 
{
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/nabin/Desktop/page1.html");
		d.findElement(By.id("t1")).sendKeys("NABIN");
		d.switchTo().frame(0);
		d.findElement(By.id("t2")).sendKeys("ANU");
	}
}
