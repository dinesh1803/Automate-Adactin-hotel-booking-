package KeyboardrelatedAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyDownAndUp {
	public static void main(String[] args) throws AWTException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		txtbox.sendKeys("i");
		Robot s=new Robot();		
		
		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_DOWN);
		s.keyPress(KeyEvent.VK_ENTER);
		s.keyRelease(KeyEvent.VK_ENTER);	
}
}