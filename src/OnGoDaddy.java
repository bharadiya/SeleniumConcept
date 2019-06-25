import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OnGoDaddy {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/sb/Desktop/BackUp/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.godaddy.com/");
		WebElement signin = driver.findElement(By.xpath("//div[@class='tray-toggle-wrapper']/button"));	
		signin.click();
	}
}
