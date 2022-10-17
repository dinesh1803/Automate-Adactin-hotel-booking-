import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDubClick {
	public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//WebElement txtbox = driver.findElement(By.id("twotabsearchtextbox"));
		//txtbox.sendKeys("iphone");
		Actions a=new Actions(driver);
		//a.doubleClick(txtbox).perform();
		//Thread.sleep(1000);
		a.contextClick().perform();
		}
}