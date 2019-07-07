package ActionandRobot;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTutorial {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://www.shutterfly.com/");
		driver.findElement(By.xpath("//button[@class='modal-close']")).click();
		Robot robo=new Robot();
		WebElement photo=driver.findElement(By.xpath("//span[@class='xlg-screen'][contains(text(),'Photo Books')]"));
		Point p=photo.getLocation();
		robo.mouseMove(p.getX()+5, p.getY()+125);
		Thread.sleep(6000);
	}
}

