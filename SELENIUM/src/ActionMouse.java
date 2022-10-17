import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMouse {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	 driver.get("http://greenstech.in/selenium-course-content.html");
	 WebElement btncourse = driver.findElement(By.xpath("//div[text()='Courses']"));
	 Actions a=new Actions(driver);
	 a.moveToElement(btncourse).perform();	 
}
}