package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1AllLinks 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		List<WebElement> links = d.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=links.get(i).getText();
			System.out.println(text);
		}
		d.close();
	}
}
