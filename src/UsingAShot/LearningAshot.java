package UsingAShot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class LearningAshot {
	private static WebDriver driver;

//		This takes screenshot of only current window
	public static void takeScreenShotWindowSize(AShot a, Screenshot sc) {
		Date d = new Date();
		try {
			ImageIO.write(sc.getImage(), "PNG", new File(
					"/home/shashank/eclipse-workspace/SeleniumConcept/ScreenShotImages/" + d.toString() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	This takes screenshot of entire webpage.
	public static void takeScreenShotEntireWebPage(AShot a, Screenshot sc) {
		Date d = new Date();
		sc = a.shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);
		try {
			ImageIO.write(sc.getImage(), "JPG", new File(
					"/home/shashank/eclipse-workspace/SeleniumConcept/ScreenShotImages/" + d.toString() + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.fb.com");
		AShot a = new AShot();
		Screenshot sc = a.takeScreenshot(driver);
		takeScreenShotWindowSize(a, sc);
	}
}
