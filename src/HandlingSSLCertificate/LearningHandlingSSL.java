package HandlingSSLCertificate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LearningHandlingSSL {

	@Test
	public void handleCertificate() {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, false);
		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cacert.org");
	}
}
