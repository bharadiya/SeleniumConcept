package ActionandRobot;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingActions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.shutterfly.com/");
		driver.findElement(By.xpath("//button[@class='modal-close']")).click();
		Actions action=new Actions(driver);
		WebElement photo=driver.findElement(By.xpath("//span[@class='xlg-screen'][contains(text(),'Photo Books')]"));
		action.moveToElement(photo).perform();
		action.contextClick(photo).perform();
		
	}
}

//Actions classes made by Selenium.
//Both classes can be used to handle both mouse and keyboard events.
//Mouse Handling :
//Left Click
//Right Click
//Scroll
//Mouse Hover.
//Robot class doesn't depend upon a webpage.
//When we want to perform composite action then we have to use build method of action class.


