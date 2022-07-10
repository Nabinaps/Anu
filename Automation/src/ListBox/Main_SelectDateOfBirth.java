package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main_SelectDateOfBirth 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.get("https://www.facebook.com/");
		d.findElement(By.linkText("Create New Account")).click();
		WebElement day = d.findElement(By.id("day"));
		WebElement month = d.findElement(By.id("month"));
		WebElement year = d.findElement(By.id("year"));
		Select s=new Select(day);
		s.selectByValue("15");
		Select s1=new Select(month);
		s1.selectByIndex(0);
		Select s2=new Select(year);
		s2.selectByVisibleText("1997");
	}
}
