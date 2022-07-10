package usingEncapsulationINSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodClass1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage1 l=new LoginPage1(driver);
		l.setUser("admin","manager");
	}
}
