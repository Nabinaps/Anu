package methodsOfWebElement;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllAutoSuggetions
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
		d.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> autoSugg = d.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=autoSugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text=autoSugg.get(i).getText();
			System.out.println(text);
		}
		autoSugg.get(0).click();
		Thread.sleep(2000);
		d.close();
		
	}
}
