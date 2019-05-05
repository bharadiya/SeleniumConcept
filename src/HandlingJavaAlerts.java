import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///home/shashank/Downloads/prompt.html");
		driver.findElement(By.xpath("//button")).click();
		Thread.sleep(5000);
		//driver.switchTo().alert().accept(); //This is to switch to the pop up and ok as accept as it is not html code
		//driver.switchTo().alert().dismiss(); // This is to not accept the agremment on pop up which is non html code
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Shashank");
		driver.switchTo().alert().accept();
		driver.switchTo().alert().sendKeys("28");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().sendKeys("Hi");
	}
}
//Alert Methods :
//	accept
//	dismiss
//	sendkeys
//	getText()