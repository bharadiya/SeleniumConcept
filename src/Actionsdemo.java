import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionsdemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		Dimension n=new Dimension(250,250);
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
		WebElement username=driver.findElement(By.xpath("//input[@placeholder='usernamename']"));
		System.out.println(username.getLocation());
		System.out.println(username.getRect());
		System.out.println(username.getSize().getWidth());
		System.out.println(username.getSize().getHeight());
		System.out.println(username.getSize());
		System.out.println(username.getCssValue("color"));
		System.out.println();
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		System.out.println(password.getLocation());
		System.out.println(password.getRect());
		System.out.println(password.getSize().getWidth());
		System.out.println(password.getSize().getHeight());
		System.out.println(password.getSize());
		System.out.println(password.getCssValue("color"));
	}
}
