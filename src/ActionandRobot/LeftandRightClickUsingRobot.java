package ActionandRobot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftandRightClickUsingRobot {
	public static void leftClick(Robot robo) {
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	public static void doubleClick(Robot robo) {
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	public static void doScrolling(Robot robo) {
		robo.mouseWheel(25);
	}
	public static void doRightClick(Robot robo) {
		robo.mousePress(InputEvent.BUTTON3_MASK);
		robo.mouseRelease(InputEvent.BUTTON3_MASK);
	}
	public static void takeScreenShot(Robot robo) throws IOException {
		BufferedImage image=robo.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image,"png",new File("/home/shashank/Desktop/ForShop/RoboScreenshot.png"));
	}
	public static void usingUpandDownKeys(Robot robo) throws InterruptedException {
		robo.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(4000);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_UP);
		Thread.sleep(4000);
		robo.keyRelease(KeyEvent.VK_UP);
		robo.keyPress(KeyEvent.VK_ALT);
		for (int i = 0; i < 3; i++) {
			robo.keyPress(KeyEvent.VK_TAB);
			Thread.sleep(3000);
			robo.keyRelease(KeyEvent.VK_TAB);
		}
		robo.keyRelease(KeyEvent.VK_ALT);
	}
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/pune");
		Robot robo = new Robot();
		robo.mouseMove(900, 230);
		//doRightClick(robo);
		//takeScreenShot(robo);
		//leftClick(robo);
		//Thread.sleep(5000);
		//doScrolling(robo);
		//robo.mouseMove(400, 900);
		//doubleClick(robo);
		usingUpandDownKeys(robo);
	}
}
