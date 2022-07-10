package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_isSelectedMethod {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("https://demo.actitime.com/");
		boolean x = d.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(x==true)
			System.out.println("checkbox is selected");
		else
			System.out.println("checkbox is not selected");
		d.close();
	}
}
