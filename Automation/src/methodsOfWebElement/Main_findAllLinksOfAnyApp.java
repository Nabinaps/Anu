package methodsOfWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_findAllLinksOfAnyApp 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		List<WebElement> link = d.findElements(By.tagName("a"));
		int count = link.size();
		System.out.println(count);
	
		for(int i=0;i<count;i++)
		{
			String t = link.get(i).getText();
		System.out.println(t);
		}
		d.close();
		System.out.println("=================================================");
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		List<WebElement> link1 = d1.findElements(By.xpath("//a"));
		int count1 = link1.size();
		System.out.println(count1);
	
		for(int i=0;i<count1;i++)
		{
			String t = link1.get(i).getText();
		System.out.println(t);
		}
		d1.close();
	}
}
