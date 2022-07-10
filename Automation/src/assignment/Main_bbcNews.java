package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_bbcNews 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.bbc.com/");
		List<WebElement> alloption = d.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		for(WebElement op:alloption)
		{
			String text = op.getText();
			System.out.println(text);
		}
		d.close();
		
		
		
	}
}
