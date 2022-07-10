package HandlingPopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main_alertPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Alerts.html");
		d1.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		//Thread.sleep(1000);
		WebDriverWait wait =new WebDriverWait(d1, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = d1.switchTo().alert();
		String text = a.getText();
		a.accept();
		System.out.println(text);
		d1.close();
		
		
	}
}
