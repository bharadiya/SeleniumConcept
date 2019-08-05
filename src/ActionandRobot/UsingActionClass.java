package ActionandRobot;
/*
 * 1. For right click -> contextClick(WebElement) is the method
 * 2. For double click -> doubleClick(WebElement)
 * 3. For drag and Drop -> dragAndDrop(WebElement drag,WebElement drop)
 * 4. For moving at a Point -> moveByOffset(int x,int y)
 * 5. For sendingKeys to WebElement -> sendKeys(WebElement , charData) 
 * 6. For Key Up and Down ->
 * 			keyUp(charsequence)
 * 			keyDown(charsequence)
 * 			keyUp(WebElement element, charsequence)
 * 			keyDown(WebElement element, charsequence)
 * 7. For click and Hold -> clickAndHold();
 * 							clickAndHold(WebElement element)
 * 8. For Realease -> realease();
 * 					  realease(WebElement element)
 * 9. For click -> click(WebElement element)
 * 10.For pause -> pause(long milliseconds)
 * 					pause(duration)	
 */
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingActionClass {
	public static void moveToWebElement(WebDriver driver,Actions action) {
		WebElement searchbutton=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		action.moveToElement(searchbutton).perform();
	}
	public static void moveToWebElement(WebDriver driver,Actions action,WebElement element) {
		action.moveToElement(element).perform();
	}
	public static void dragAndDrop(WebDriver driver,Actions action) {
		WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(drag, drop).build().perform();
	}
	
	public static void doRightClick(WebDriver driver,Actions action)
	{
		driver.findElement(By.xpath("//button[@class='modal-close']")).click();
		WebElement photo=driver.findElement(By.xpath("//span[@class='xlg-screen'][contains(text(),'Photo Books')]"));
		action.moveToElement(photo).perform();
		action.contextClick(photo).perform();
	}
	
	public static void moveByOffsett(WebDriver driver,Actions action)
	{
		action.moveByOffset(372, 850).perform();
	}

	public static void sendKeystoWebElement(WebDriver driver,Actions action,String charData,WebElement element)
	{
		action.sendKeys(element,charData).perform();
	}

	public static void clickOnWebElement(WebDriver driver,Actions action,WebElement element)
	{
		action.click(element).perform();
	}
	public static void doDoubleClick(WebDriver driver,Actions action,WebElement element)
	{
		action.doubleClick(element).perform();
	}
	
	public static void pauseActions(WebDriver driver,Actions action,long milliseconds)
	{
		action.pause(milliseconds).perform();
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		//driver.findElement(By.xpath("//button[@class='modal-close']")).click();
		Actions action=new Actions(driver);
		//moveByOffsett(driver, action);
		WebElement textbox=driver.findElement(By.xpath("//input[@placeholder='Search']"));
		WebElement search=driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]"));
		WebElement trending=driver.findElement(By.xpath("//a[1]"));
		moveToWebElement(driver, action, textbox);
		sendKeystoWebElement(driver, action, "Aankh Marey", textbox);
		moveToWebElement(driver, action, search);
		clickOnWebElement(driver, action, search);
		pauseActions(driver, action, 30000);
		moveToWebElement(driver, action, trending);
		clickOnWebElement(driver, action, trending);
		
	}
}

// Using Robot class take screenshot
// Window alert handle
// maximise or minimise using robot.