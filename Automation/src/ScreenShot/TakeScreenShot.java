package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		//typecast the object to takesScreenShot to use the methods
		TakesScreenshot t=(TakesScreenshot) d;
		//press the print screen button by calling the method
		File src = t.getScreenshotAs(OutputType.FILE);
		//create a file in speciffic location
		File dest=new File("./screenshot/ss.png");
		//copy and paste the screenshot from src to dest
		FileUtils.copyFile(src, dest);
		d.close();
	}
}
