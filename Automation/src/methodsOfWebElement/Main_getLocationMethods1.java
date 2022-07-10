package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_getLocationMethods1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.xpath("//a[@rel='async']")).click();
		//d.findElement(By.id("u_0_2_or")).click();
		Thread.sleep(2000);
		int y = d.findElement(By.xpath("//input[@type='radio']")).getLocation().getY();
		int y1 = d.findElement(By.xpath("//input[@type='radio']")).getLocation().getY();
		int y2 = d.findElement(By.xpath("//input[@type='radio']")).getLocation().getY();
		System.out.println(y);
		if(y==y1 && y1==y2)
			System.out.println("gender radio buttons are properly alligned: passed");
		else
			System.out.println("gender radio buttons are not properly alligned: failed");
		d.close();
	}
}
