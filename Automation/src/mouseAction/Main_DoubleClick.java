package mouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main_DoubleClick {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		a.moveToElement(men);
		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-Shirts']"));
		a.moveToElement(tshirt).click().perform();
		WebElement x = driver.findElement(By.xpath("(//h3[contains(text(),'HRX')])[1]/..//span[@class='product-discountedPrice']"));
		String price = x.getText();
		System.out.println(price);
		a.doubleClick(x).perform();
		Thread.sleep(10000);
		
		driver.close();
	}
}
