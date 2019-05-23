package ActionandRobot;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingActionClass {
	public static void moveToElement(WebDriver driver,Actions action) {
		WebElement photo=driver.findElement(By.xpath("//span[@class='xlg-screen'][contains(text(),'Photo Books')]"));
		action.moveToElement(photo).perform();
	}
	public static void dragAndDrop(WebDriver driver,Actions action) {
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		//driver.findElement(By.xpath("//button[@class='modal-close']")).click();
		Actions action=new Actions(driver);
		//moveToElement(driver, action);
		dragAndDrop(driver, action);
		
		
	}
}

// Using Robot class take screenshot
// Window alert handle
// maximise or minimise using robot.