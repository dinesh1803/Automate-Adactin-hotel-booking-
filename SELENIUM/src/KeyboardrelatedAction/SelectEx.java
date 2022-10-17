package KeyboardrelatedAction;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEx {
public static void main(String[] args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement DrDown = driver.findElement(By.id("month"));
		 Select s=new Select(DrDown);
		s.selectByValue("3");
		s.selectByIndex(11);
		s.selectByVisibleText("Apr");
		
		List<WebElement> opt = s.getOptions();
		WebElement s1 = opt.get(1);
	System.out.println(s1.getText());
		
		
}
}