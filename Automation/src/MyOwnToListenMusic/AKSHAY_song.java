package MyOwnToListenMusic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AKSHAY_song {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/watch?v=42NDrs_L5IY");
		driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		Thread.sleep(400000);//used to stop the execution for sometime
		driver.close();
	}
}
