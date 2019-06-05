package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegistrationTest {
	static WebDriver driver;

	@Test
	public void verifyFlightReg() {
		System.setProperty("webdriver.chrome.driver", "//home//sb//Desktop//BackUp//Downloads//chromedriver");
		driver = new ChromeDriver();
		Registrationpage2 p = new Registrationpage2(driver);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		p.clickRegLink();
		p.setFirstName("shashank");
		p.setLastName("bharadiya");
		p.setPhoneNo("9994567890");
		p.setEmail("s.b@gmail.com");
		p.setAddress1("Pimple Gurav");
		p.setAddress2("Pune");
		p.setCity("Hyd");
		p.setState("Telangana");
		p.setPostalCode("411027");
		p.setCountry("India");
		p.setUserName("shashank9665");
		p.setPassword("admin123");
		p.setconfirmPass("admin123");
		p.clickRegButton();
		driver.close();
	}
}
