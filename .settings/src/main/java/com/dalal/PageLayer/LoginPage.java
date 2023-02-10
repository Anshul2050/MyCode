package com.dalal.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dalal.utilities.UtilClass_PP2;

public class LoginPage extends UtilClass_PP2 {

	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		// the driver that is sent to signupPage from test is caught or accessed here
		// to super
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	
	@FindBy(name = "email")
	private WebElement emailId;
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(css = "[type='submit']")
	private WebElement login_btn;



	public void email_txt(String email_txt) {
		emailId.sendKeys(email_txt);
	}

	public void password_txt(String password_txt) {
		password.sendKeys(password_txt);
	}

	public void loginBtn_click() {
		 login_btn.click();
	}
	
	public void login_Util(String email_util, String password_util) {
		emailId.sendKeys(email_util);
		password.sendKeys(password_util);
		login_btn.click();
		
	}
	public void loginPage_url() {
		
		driver.get("https://www.apps.dalalstreet.ai/login");
	}
	
	@FindBy(css=".mb-3:nth-child(1) .invalid-feedback")
	WebElement invalidEmail_txt;
	
	public String invalidEmailTxt() {
		
		String txt =	invalidEmail_txt.getText();
		return txt;
	}
	
	@FindBy(css=".mb-3:nth-child(2) .invalid-feedback")
	WebElement invalidPassword_txt;
	
	public String invalidPasswordTxt() {
		
		String txt = invalidPassword_txt.getText();
		return txt;
	}
	@FindBy(css=".text-center.my-3.alert.alert-danger.fade.show")
	WebElement Wrong_txt;
	public String AccNotExistTxt() {
		
		String txt=Wrong_txt.getText()
;		return txt;
	}
	
	public void movingToLogin() {
		movingAction(login_btn);
	}
	
	
	
	
	
	
	
	
	

}
