package HandlingPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main_alertPopUp1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		d1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d1.findElement(By.partialLinkText("Alert with OK & Cancel")).click();
		d1.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		//Thread.sleep(1000);
		WebDriverWait wait =new WebDriverWait(d1, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = d1.switchTo().alert();
		a.dismiss();
		Thread.sleep(1000);
		boolean text = d1.findElement(By.id("demo")).isDisplayed();
		if(text==true)
		{
		System.out.println(" you pressed cancel text is displayed");
		}
		else
		{
			System.out.println(" not displayed");
		}
		d1.close();
	}
		
}
