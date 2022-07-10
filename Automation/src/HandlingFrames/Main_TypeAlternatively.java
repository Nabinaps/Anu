package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_TypeAlternatively {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/nabin/Desktop/page1.html");
		d.switchTo().frame(0);
		d.findElement(By.id("t2")).sendKeys("A");
		d.switchTo().defaultContent();
		d.findElement(By.id("t1")).sendKeys("NA");
		d.switchTo().frame("f1");
		d.findElement(By.id("t2")).sendKeys("N");
		d.switchTo().parentFrame();
		d.findElement(By.id("t1")).sendKeys("BIN");
		WebElement we = d.findElement(By.xpath("//iframe"));
		d.switchTo().frame(we);
		d.findElement(By.id("t2")).sendKeys("U");
		
	}
}
