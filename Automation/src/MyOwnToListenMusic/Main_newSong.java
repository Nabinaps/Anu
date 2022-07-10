package MyOwnToListenMusic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_newSong {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/watch?v=Z-kk0yPilbM");
		driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']")).click();
		//driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		Thread.sleep(600000);//used to stop the execution for sometime
		driver.close();
	}
}
