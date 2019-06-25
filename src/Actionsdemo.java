import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionsdemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		Thread.sleep(5000);
//		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
//		signIn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById(\"email\").setAttribute(\"placeholder\",\"usernamename\");");
		/*
		 * driver.get("https://www.fb.com/"); Actions a = new Actions(driver);
		 * WebElement b = driver.findElement(By.xpath("//input[@name='email']"));
		 * a.moveToElement(b).build().perform();
	
		 */
		driver.findElement(By.xpath("//input[@placeholder='usernamename']")).sendKeys("shashank");
	}
}
