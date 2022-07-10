package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_isDisplayedMethod {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		boolean x = d.findElement(By.xpath("//div[@class='atLogoImg']")).isDisplayed();
		if(x==true)
			System.out.println("logo is displayed");
		else
			System.out.println("logo is not displayed");
		d.close();
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
		boolean x1 = d1.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(x1==true)
			System.out.println("logo is displayed");
		else
			System.out.println("logo is not displayed");
		d1.close();
}
}