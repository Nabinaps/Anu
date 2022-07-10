package HandlingPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main_HiddenDivisionORcelenderPopUp
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("policynumber")).sendKeys("123");
		d.findElement(By.id("dob")).click();
		WebElement month = d.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s=new Select(month);
		s.selectByIndex(0);
		WebElement year = d.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s1=new Select(year);
		s1.selectByValue("1997");
		d.findElement(By.xpath("//a[text()='15']")).click();
		d.findElement(By.xpath("//input[@placeholder='Contact Number']")).sendKeys("9855098550");
		d.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		boolean text = d.findElement(By.xpath("//span[text()='Please enter valid Policy No.']")).isDisplayed();
		if(text==true)
		{
			System.out.println("text is displayed: passed");
		}
		else
		{
			System.out.println("text is not displayed: failed");
		}
		d.close();
		
	}
}
