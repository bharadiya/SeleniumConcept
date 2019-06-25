import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OpeningFirefox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/home/sb/Desktop/BackUp/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.godaddy.com");
		Thread.sleep(5000);
		WebElement signIn = driver.findElement(By.xpath("//span[contains(text(),'Sign In')]"));
		signIn.click();
		
	}
}
