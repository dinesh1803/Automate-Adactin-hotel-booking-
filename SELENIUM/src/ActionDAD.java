import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDAD {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		WebElement frame = driver.findElement(By.xpath("src=\"ads.html\""));
	    driver.switchTo().frame(frame);
	    WebElement s = driver.findElement(By.xpath("src=\"Jmeter720.png"));
	    s.click();
	    
	    
	}
}