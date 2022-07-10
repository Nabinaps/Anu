package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main_handlingSingleListBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		WebElement x = d.findElement(By.id("month"));
		Select s=new Select(x);
		s.selectByIndex(10);
		s.selectByValue("8");
		s.selectByVisibleText("Jan");
		d.close();
	}
}
