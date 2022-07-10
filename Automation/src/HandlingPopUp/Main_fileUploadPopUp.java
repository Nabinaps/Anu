package HandlingPopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_fileUploadPopUp 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/nabin/Desktop/Resume.html");
		
		File f=new File("./data/Nabinresume-updated1.pdf");
		String absolutepath = f.getAbsolutePath();
		d.findElement(By.id("cv")).sendKeys(absolutepath);
	}
}
