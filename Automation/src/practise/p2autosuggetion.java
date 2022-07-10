package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2autosuggetion 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("url");
		d.findElement(By.xpath("xpath for search box")).sendKeys("typing statement");
		List<WebElement> sugg = d.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=sugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=sugg.get(i).getText();
			System.out.println(text);
		}
		d.close();	
	}
}
