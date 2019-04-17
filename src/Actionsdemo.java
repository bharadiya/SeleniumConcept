import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//shashank//Downloads//Compressed//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.fb.com/");
		Actions a=new Actions(driver);
		WebElement b=driver.findElement(By.xpath("//input[@name='email']"));
		a.moveToElement(b).build().perform();
	}
}
