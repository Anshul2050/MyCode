package com.dalal.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dalal.utilities.UtilClass_PP2;

public class ProfilPage extends UtilClass_PP2 {

	public WebDriver driver;

	public ProfilPage(WebDriver driver) {
		// the driver that is sent to signupPage from test is caught or accessed here
		// to super
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(css = ".mx-5")
	private WebElement profile_User_id_txt;

	@FindBy(id = "floatingemailInput")
	private WebElement update_Password_box;

	@FindBy(css = ".btn.btn-outline-success.w-md")
	private WebElement update_btn;

	

	public String getUserIdTxt() {
		String txt =profile_User_id_txt.getText();
		String txt_part[]= txt.split(" ");
		String id = txt_part[2];
		return id;
	}

	public void enterNewPassword(String newPassword) {
		update_Password_box.sendKeys(newPassword);
	}
	
	public void click_update_btn(){
		waitTillClickable(update_btn,10);
		update_btn.click();
	}
	
	public String confirm_updation(){
		
		String txt =confirmation_Txt();
		return txt;
		
	}
	
	
}
