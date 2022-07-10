 package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main_getAllOption {
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
		List<WebElement> allOption = s.getOptions();
		int c=allOption.size();
		for(WebElement op:allOption)
		{
			String op1=op.getText();
			System.out.println(op1);
		}
		d.close();
	}
}
