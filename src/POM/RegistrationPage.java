package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	By RegLink = By.linkText("REGISTER");
	By FirstName = By.name("firstName");
	By LastName = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address1 = By.name("address1");
	By address2 = By.name("address2");
	By city = By.name("city");
	By state = By.name("state");
	By postalCode = By.name("postalCode");
	By country = By.name("country");
	By username = By.name("email");
	By password = By.name("password");
	By confirmpassword = By.name("confirmPassword");
	By registerBtn = By.name("register");
	/**
	 * Parameterised Constructor 
	 * @param driver
	 */
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickRegLink() {
		driver.findElement(RegLink).click();
	}
	public void setFirstName(String fname) {
		driver.findElement(FirstName).sendKeys(fname);
	}
	public void setLastName(String lname) {
		driver.findElement(LastName).sendKeys(lname);
	}
	public void setPhoneNo(String ph) {
		driver.findElement(phone).sendKeys(ph);
	}
	public void setEmail(String uname) {
		driver.findElement(email).sendKeys(uname);
	}
	public void setAddress1(String add) {
		driver.findElement(address1).sendKeys(add);
	}
	public void setAddress2(String add) {
		driver.findElement(address2).sendKeys(add);
	}
	public void setCity(String ct) {
		driver.findElement(city).sendKeys(ct);
	}
	public void setState(String st) {
		driver.findElement(state).sendKeys(st);
	}
	public void setPostalCode(String pc) {
		driver.findElement(postalCode).sendKeys(pc);
	}
	public void setCountry(String c) {
		driver.findElement(country).sendKeys(c);
	}
	public void setUserName(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void setPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	public void setconfirmPass(String cpass) {
		driver.findElement(confirmpassword).sendKeys(cpass);
	}
	public void clickRegButton() {
		driver.findElement(registerBtn).click();
	}
}
