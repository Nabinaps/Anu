 package mouseAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Main_RobotClass 
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		Runtime.getRuntime().exec("notepad");
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
	}
}
