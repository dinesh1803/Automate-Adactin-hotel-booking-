package ProjectTask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\eclipse-workspace\\SELENIUM\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://adactinhotelapp.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

		WebElement userBox = driver.findElement(By.id("username"));

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('value','Dinesh001')", userBox);

		WebElement passBox = driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].setAttribute('value','Dinesh@123')", passBox);

		TakesScreenshot ts = (TakesScreenshot) driver;
//	File shot = ts.getScreenshotAs(OutputType.FILE);
//	File file=new File("E:\\HotelBookingSs\\BeforeLogin.png");
//	FileUtils.copyFile(shot, file);

		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();

		WebElement locationDropDown = driver.findElement(By.id("location"));
		Select s = new Select(locationDropDown);
		s.selectByValue("London");

		WebElement hotelDrDown = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotelDrDown);
		s1.selectByValue("Hotel Hervey");

		WebElement RoomTypeDrDown = driver.findElement(By.id("room_type"));
		Select s2 = new Select(RoomTypeDrDown);
		s2.selectByValue("Super Deluxe");

		WebElement checkindDateBox = driver.findElement(By.id("datepick_in"));
		jse.executeScript("arguments[0].setAttribute('value','20/10/2022')", checkindDateBox);

		WebElement checkoutDateBox = driver.findElement(By.id("datepick_out"));
		jse.executeScript("arguments[0].setAttribute('value','22/10/2022')", checkoutDateBox);

//		File shot1 = ts.getScreenshotAs(OutputType.FILE);
//	    File file1=new File("E:\\HotelBookingSs\\BeforeSearchHotel.png");
//		FileUtils.copyFile(shot1, file1);

		WebElement hotelSearch = driver.findElement(By.id("Submit"));
		hotelSearch.click();

		WebElement confirmRatioBtn = driver.findElement(By.id("radiobutton_0"));
		confirmRatioBtn.click();

//	File shot2 = ts.getScreenshotAs(OutputType.FILE);
//	File file2=new File("E:\\HotelBookingSs\\Confirmation.png");
//	FileUtils.copyFile(shot2, file2);
		WebElement contineBtn = driver.findElement(By.id("continue"));

		jse.executeScript("arguments[0].click()", contineBtn);

		WebElement firstName = driver.findElement(By.id("first_name"));

// firstName
		firstName.sendKeys("DINESH");
// LastName
		driver.findElement(By.id("last_name")).click();
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_SHIFT);
		ro.keyPress(KeyEvent.VK_R);
		ro.keyRelease(KeyEvent.VK_R);
		ro.keyRelease(KeyEvent.VK_SHIFT);

// Address
		driver.findElement(By.id("address")).sendKeys("konambatti,london-600612");
// cardno
		driver.findElement(By.id("cc_num")).sendKeys("9221822132214221");

// card Type
		WebElement cardType = driver.findElement(By.id("cc_type"));
		cardType.click();
		for (int i = 1; i <=3; i++) {
			ro.keyPress(KeyEvent.VK_DOWN);
			ro.keyRelease(KeyEvent.VK_DOWN);
		}
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		
		 WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		 expMonth.click();
		 Select expMon =new Select(expMonth);
		 expMon.selectByVisibleText("December");
	
		 WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		 expMonth.click();
		 Select expyer =new Select(expYear);
		 expyer.selectByVisibleText("2022");
		 
		 driver.findElement(By.id("cc_cvv")).sendKeys("335");
//		 File shot3 = ts.getScreenshotAs(OutputType.FILE);
//			File file3=new File("E:\\HotelBookingSs\\BeforeBooking.png");
//			FileUtils.copyFile(shot3, file3);
		 
		 driver.findElement(By.id("book_now")).click();
		 
		 Thread.sleep(5000);
		 
		 WebElement orderNo = driver.findElement(By.id("order_no"));
		 
		 System.out.println(orderNo.getText());
		 
		 
	
	}
}
