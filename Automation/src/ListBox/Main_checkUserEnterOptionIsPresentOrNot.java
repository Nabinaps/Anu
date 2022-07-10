package ListBox;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main_checkUserEnterOptionIsPresentOrNot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)  {
		System.out.println("enter the option");
		Scanner sc=new Scanner(System.in);
		String option=sc.next();
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/nabin/Desktop/multiselectlistbox.html");
		WebElement x = d.findElement(By.id("mtr"));
		Select s=new Select(x);
		List<WebElement> allOption = s.getOptions();
		int c=allOption.size();
		int counter=0;
		for(int i=0;i<c;i++)
		{
			String text=allOption.get(i).getText();
			if(text.equalsIgnoreCase(option))
			{
				counter++;
			}
		}
		if(counter==0)
			System.out.println(option+" is not present");
		else if(counter==1)
			System.out.println(option+" is present without duplicate");
		else
			System.out.println(option+" is present with duplicate");
		
		d.close();
	}
}
