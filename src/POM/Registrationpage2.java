package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpage2 {
	static WebDriver driver;

	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	WebElement RegLink;

	@FindBy(how = How.NAME, using = "firstName")
	WebElement FirstName;

	@FindBy(how = How.NAME, using = "lastName")
	WebElement LastName;

	@FindBy(how = How.NAME, using = "phone")
	WebElement phone;

	@FindBy(how = How.NAME, using = "userName")
	WebElement email;

	@FindBy(how = How.NAME, using = "address1")
	WebElement address1;

	@FindBy(how = How.NAME, using = "address2")
	WebElement address2;

	@FindBy(how = How.NAME, using = "city")
	WebElement city;

	@FindBy(how = How.NAME, using = "state")
	WebElement state;

	@FindBy(how = How.NAME, using = "postalCode")
	WebElement postalCode;

	@FindBy(how = How.NAME, using = "country")
	WebElement country;

	@FindBy(how = How.NAME, using = "email")
	WebElement username;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.NAME, using = "confirmPassword")
	WebElement confirmpassword;

	@FindBy(how = How.NAME, using = "register")
	WebElement registerBtn;

	public Registrationpage2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickRegLink() {
		RegLink.click();
	}

	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		LastName.sendKeys(lname);
	}

	public void setPhoneNo(String ph) {
		phone.sendKeys(ph);
	}

	public void setEmail(String uname) {
		email.sendKeys(uname);
	}

	public void setAddress1(String add) {
		address1.sendKeys(add);
	}

	public void setAddress2(String add) {
		address2.sendKeys(add);
	}

	public void setCity(String ct) {
		city.sendKeys(ct);
	}

	public void setState(String st) {
		state.sendKeys(st);
	}

	public void setPostalCode(String pc) {
		postalCode.sendKeys(pc);
	}

	public void setCountry(String c) {
		country.sendKeys(c);
	}

	public void setUserName(String uname) {
		username.sendKeys(uname);
	}

	public void setPassword(String pass) {
		password.sendKeys(pass);
	}

	public void setconfirmPass(String cpass) {
		confirmpassword.sendKeys(cpass);
	}

	public void clickRegButton() {
		registerBtn.click();
	}
}
