package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/watch?v=T-w_QhRFFTY");
		/*Thread.sleep(2000);
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();*/
		driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		Thread.sleep(400000);//used to stop the execution for sometime
		driver.close();
	}
}
