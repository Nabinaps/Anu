package HandlingPopUp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_fileUploadPopUp1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.naukri.com/");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("(//div[@class='mTxt'])[5]")).click();
		d.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("povey89026@abincol.com");
		d.findElement(By.xpath("//input[@type='password']")).sendKeys("demo123");
		d.findElement(By.xpath("//button[text()='Login']")).submit();
		d.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
		File f=new File("./data/Nabinresume-updated1.pdf");
		String absolutepath = f.getAbsolutePath();
		d.findElement(By.cssSelector("input[id=attachCV]")).sendKeys(absolutepath);
	}
}
