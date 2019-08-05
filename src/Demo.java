import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///home/sb/Desktop/abc.html");
		driver.findElement(By.xpath("//input[3]")).sendKeys("pankaj");
		driver.findElement(By.xpath("//input[2]")).sendKeys("hi");
	}
}