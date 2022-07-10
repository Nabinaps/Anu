package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass_parallelExecution {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browser)
	{
		Reporter.log("openBrowser",true);
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("closeBrowser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws InterruptedException
	{
		Reporter.log("login",true);
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
	}
	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(5000);
		Reporter.log("logout",true);
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(5000);
	}
}
