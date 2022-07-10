package methodsOfWebElement;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_printAutoSuggForFlipkart 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the url");
		String url=sc.nextLine();
		WebDriver d=new ChromeDriver();
		d.get(url);
		Thread.sleep(2000);
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		d.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> autoSugg = d.findElements(By.xpath("//li[@class='Y5N33s']"));
		int count=autoSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=autoSugg.get(i).getText();
			System.out.println(text);
		}
		autoSugg.get(count-1).click();
		Thread.sleep(2000);
		d.close();
		
	}
}
