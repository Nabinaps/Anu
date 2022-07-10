package usingEncapsulationINSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainMethodClass {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		LoginPage l=new LoginPage(driver);
		l.setUser("admin");
	}
}
