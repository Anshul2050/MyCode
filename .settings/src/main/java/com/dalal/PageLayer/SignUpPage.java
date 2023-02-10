package com.dalal.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dalal.utilities.UtilClass_PP2;

public class SignUpPage extends UtilClass_PP2 {

	public WebDriver driver;

	public SignUpPage(WebDriver driver) {
		// the driver that is sent to signupPage from test is caught or accessed here
		// to super
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}
     
	@FindBy(css="[href='/register']")
	private WebElement clickOnSignUp;
	@FindBy(id = "formrow-firstname-Input")
	private WebElement firstName;
	@FindBy(id = "formrow-lastname-Input")
	private WebElement lastName;
	@FindBy(name = "email")
	private WebElement emailId;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(id = "customControlInline")
	private WebElement checkBox;
	@FindBy(css = "[type='submit']")
	private WebElement clickOnGetJouStarted;
	

	public void firstName_txt(String firstName_txt) {
		firstName.sendKeys(firstName_txt);
	}

	public void lastName_txt(String lastName_txt) {
		lastName.sendKeys(lastName_txt);
	}

	public void email_txt(String email_txt) {
		emailId.sendKeys(email_txt);
	}

	public void password_txt(String password_txt) {
		password.sendKeys(password_txt);
	}

	public void checbox_click() {
		checkBox.click();
	}

	public void clickOnGetJouStarted() {
		Scrolldown(100);
		clickOnGetJouStarted.click();
	}

	public void getSignUpUrl() {

		driver.get("https://www.apps.dalalstreet.ai/register");

	}
	
	public void clickOnSignUp_link() {
		
		Scrolldown(150);
		clickOnSignUp.click();
		
	}

}
