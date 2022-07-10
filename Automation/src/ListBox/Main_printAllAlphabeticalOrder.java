package ListBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main_printAllAlphabeticalOrder {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/nabin/Desktop/multiselectlistbox.html");
		ArrayList<String>al=new ArrayList<>();
		WebElement x = d.findElement(By.id("mtr"));
		Select s=new Select(x);
		List<WebElement> allOption = s.getOptions();
		int c=allOption.size();
		for(int i=0;i<c;i++)
		{
			String text=allOption.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for(String op:al)
		{
			System.out.println(op);
		}
		d.close();	
	}
}
