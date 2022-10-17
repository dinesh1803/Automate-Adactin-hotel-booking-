package KeyboardrelatedAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMul {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		WebElement drdown = driver.findElement(By.xpath("(//select[@class='spTextField'])[1]"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='cp-target cp-field-element cp-close-image cp-img-lazy']")).click();
	  Select s=new Select(drdown);
	  s.selectByValue("msperformance");
	  s.selectByIndex(1);
	  s.selectByVisibleText("Agile Methodology");
	  



}
}