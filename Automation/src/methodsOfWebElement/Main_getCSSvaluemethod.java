package methodsOfWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_getCSSvaluemethod 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement a = d.findElement(By.linkText("Forgotten password?"));
		String color = a.getCssValue("color");
		String fontSize = a.getCssValue("font-size");
		String fontType = a.getCssValue("font-weight");
		System.out.println(color);
		System.out.println(fontSize);
		System.out.println(fontType);
		d.close();

	}

}
