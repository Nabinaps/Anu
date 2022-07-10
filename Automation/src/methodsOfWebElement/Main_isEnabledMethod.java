package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_isEnabledMethod {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		boolean x = d.findElement(By.id("loginButton")).isEnabled();
		if(x==true)
			System.out.println("login button is enabled");
		else
			System.out.println("login button is not enabled");
		d.close();
		
		
		
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
		boolean x1 = d1.findElement(By.name("login")).isEnabled();
		if(x1==true)
			System.out.println("login button is enabled");
		else
			System.out.println("login button is not enableded");
		d1.close();
}
}
