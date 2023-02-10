package com.dalal.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dalal.utilities.UtilClass_PP2;

public class LogoutPage extends UtilClass_PP2 {

	public WebDriver driver;

	public LogoutPage(WebDriver driver) {
		// the driver that is sent to signupPage from test is caught or accessed here
		// to super
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(css = "h3.text-secondary")
	private WebElement log_out_txt;
	
	public String getLogOutText() {
		
		String txt = log_out_txt.getText();
		return txt;
		
		
	}
	
	
	
}
