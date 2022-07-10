package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main_getFirstSelectOption 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/nabin/Desktop/multiselectlistbox.html");
		WebElement x = d.findElement(By.id("cp"));
		Select s=new Select(x);
		System.out.println(s.isMultiple());
		String op1 = s.getFirstSelectedOption().getText();
		System.out.println(op1);
		d.close();
	}
}
