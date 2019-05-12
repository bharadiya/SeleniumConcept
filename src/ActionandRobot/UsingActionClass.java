package ActionandRobot;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingActionClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.shutterfly.com/");
		driver.findElement(By.xpath("//button[@class='modal-close']")).click();
		Actions action=new Actions(driver);
		WebElement photo=driver.findElement(By.xpath("//span[@class='xlg-screen'][contains(text(),'Photo Books')]"));
		action.moveToElement(photo).perform();
	}
}

// Using Robot class take screenshot
// Window alert handle
// maximise or minimise using robot.