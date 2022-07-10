package HandlingFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_CountFrameInMakeMyTrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.makemytrip.com/");
		List<WebElement> frame = d.findElements(By.xpath("//iframe"));
		int count=frame.size();
		System.out.println(count);
		d.close();
	}
}
