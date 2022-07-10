package HandlingTabs;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_ActitimeAssignmentOfHandlingTabs {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.id("username")).sendKeys("admin");
		d.findElement(By.name("pwd")).sendKeys("manager");
		d.findElement(By.id("loginButton")).click();
		d.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		d.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(4000);
		d.findElement(By.linkText("Read Service Agreement")).click();
		Thread.sleep(4000);
		Set<String> allwh = d.getWindowHandles();
		for(String wh:allwh)
		{
			d.switchTo().window(wh);
			String title = d.getTitle();
			if(title.equals("actiTIME Online Terms of Service"))
			{
				List<WebElement> opall = d.findElements(By.xpath("//span"));
				for(WebElement op:opall)
				{
					System.out.println(op.getText());
				}
			}
			//System.out.println(title);
		}
		d.quit();
		
		
		
		
		
		
	}
}
