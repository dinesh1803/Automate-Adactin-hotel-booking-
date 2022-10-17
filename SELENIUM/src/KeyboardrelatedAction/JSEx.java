package KeyboardrelatedAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;

public class JSEx {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	// driver.get("http://traininginchennai.in/selenium-training-in-chennai.html");
		driver.get("https://www.amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	 txtsearch.click();
	 
	 JavascriptExecutor jse= (JavascriptExecutor) driver;	 
	 jse.executeScript("arguments[0].setAttribute('value','Iphone')",txtsearch);
	 
	 
//	 WebElement scrolldwn = driver.findElement(By.xpath("(//h3[@class='mb-0'])[13]"));
//	 jse.executeScript("arguments[0].scrollIntoView(true)",scrolldwn);
		
}
}