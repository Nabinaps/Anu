package HandlingPopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_childWindowPopUp 
{
		static
		{
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver d1=new ChromeDriver();
			d1.get("https://demoqa.com/browser-windows");
			d1.findElement(By.id("windowButton")).click();
			d1.findElement(By.id("messageWindowButton")).click();
			Set<String> alwh = d1.getWindowHandles();
			int count=alwh.size();
			System.out.println(count);
			for(String wh:alwh)
			{
				System.out.println(wh);
			}
			d1.quit();
			
	}
}
