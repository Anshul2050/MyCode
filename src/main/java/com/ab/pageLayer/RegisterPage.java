package com.ab.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Register']")
	private WebElement Register_btn;
	
	@FindBy(xpath="//input[@id='gender-female']")
	private WebElement female_radio_btn;
	
	@FindBy(xpath="//input[@id='FirstName']")
	private WebElement enter_first_name;
	
	@FindBy(xpath="//input[@id='LastName']")
	private WebElement enter_last_name;
	
	@FindBy(xpath="//option[text()='12']")
	private WebElement enter_dob;
	
	@FindBy(xpath="//option[text()='February']")
	private WebElement enter_dom;
	
	@FindBy(xpath="//option[text()='1994']")
	private WebElement enter_doy;
	
	@FindBy(xpath="//input[@id='Email']")
	private WebElement enter_email;
	
	@FindBy(xpath="//input[@id='Company']")
	private WebElement enter_company;
	
	@FindBy(xpath="//input[@id='Newsletter']")
	private WebElement newsletter_radio;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement enter_password_txtbx;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	private WebElement enter_re_password_txtbx;
	
	@FindBy(xpath="//button[@id='register-button']")
	private WebElement click_Register;
	
	@FindBy(xpath="//li[text()='The specified email already exists']")
	private WebElement get_Error_message;
	
	@FindBy(xpath="//span[text()='Wrong email']")
	private WebElement gmail_error_message;
	
	@FindBy(xpath="//span[text()='Email is required.']")
	private WebElement email_required;
	
	
	public void ClickonRegisterButton()
	{
		Register_btn.click();
	}
	
	public void SelectGender()
	{
		female_radio_btn.click();
	}
	
	public void EnterFirstName(String fn)
	{
		enter_first_name.sendKeys(fn);
	}
	
	public void EnterLastName(String ln)
	{
		enter_last_name.sendKeys(ln);
	}
	
	public void ClickonDOB()
	{
		enter_dob.click();
	}
	
	public void ClickonDOM()
	{
		enter_dom.click();
	}
	
	public void ClickonDOY()
	{
		enter_doy.click();
	}
	
	public void EnterEmail(String email)
	{
		enter_email.sendKeys(email);
	}

	public void EnterCompany(String company)
	{
		enter_company.sendKeys(company);
	}
	
	public void NewsletterRadioBtn()
	{
		newsletter_radio.click();
	}
	
	public void EnterPasswprd(String password)
	{
		enter_password_txtbx.sendKeys(password);
	}
	
	public void EnterRePassword(String repassword)
	{
		enter_re_password_txtbx.sendKeys(repassword);
	}
	
	public void ClickonSignup()
	{
		click_Register.click();
	}
	
	public String getmessage()
	{
		return get_Error_message.getText();
		
	}
	
	public String getErrorGmail()
	{
		return gmail_error_message.getText();
	}
	
	public String EmailRequiredMessage()
	{
		return email_required.getText();
	}
	
	public String getcurrenturl()
	{
		return driver.getCurrentUrl();
	}
	
}
