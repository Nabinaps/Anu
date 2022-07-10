package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_getTagNameMethod {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
		String x1 = d1.findElement(By.xpath("//a[text()='Forgotten password?']")).getTagName();
		if(x1.equals("a"))
			System.out.println("Tag name is matching: passed");
		else
			System.out.println("Tag name is not matching : failed");
		d1.close();
}
}