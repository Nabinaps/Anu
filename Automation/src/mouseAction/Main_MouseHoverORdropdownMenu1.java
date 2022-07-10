package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main_MouseHoverORdropdownMenu1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Actions a=new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		a.moveToElement(men);
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		a.moveToElement(tshirt).click().perform();
		String x = driver.findElement(By.xpath("(//h3[contains(text(),'HRX')])[1]/..//span[@class='product-discountedPrice']")).getText();
		
		System.out.println(x);
		driver.close();
		
				
				
				
	}
}
