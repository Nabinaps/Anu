package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main_MouseHoverORdropdownMenu {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://www.vtiger.com/");
		d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement target = d.findElement(By.id("navbarLandings"));
		a.moveToElement(target).perform();
		WebElement target1 = d.findElement(By.partialLinkText("Resources"));
		Thread.sleep(1000);
		a.moveToElement(target1).perform();
		d.findElement(By.partialLinkText("Contact Us")).click();
		String phno = d.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]")).getText();
		System.out.println(phno);
		d.close();
	}
}
