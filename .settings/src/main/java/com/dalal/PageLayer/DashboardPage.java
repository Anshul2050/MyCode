package com.dalal.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dalal.utilities.UtilClass_PP2;

public class DashboardPage extends UtilClass_PP2 {

	public WebDriver driver;

	public DashboardPage(WebDriver driver) {
		// the driver that is sent to signupPage from test is caught or accessed here
		// to super
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(css = ".mt-2.d-none.d-lg-block:nth-child(2) h5")
	private WebElement avail_balance;

	@FindBy(css = ".mt-2.d-none.d-lg-block:nth-child(3) h5")
	private WebElement net_worth;

	@FindBy(css = ".app-search.d-none.d-lg-block input")
	private WebElement search_box;

	@FindBy(css = ".app-search.d-none.d-lg-block input")
	private WebElement select_option;

	@FindBy(linkText = "ADANI PORT SPECIAL")
	private WebElement option;

	@FindBy(id = "page-header-user-dropdown")
	private WebElement profile_dd;

	@FindBy(css = ".dropdown-item span")
	private WebElement click_pwr_Off;

	@FindBy(css = "[href*='profile']")
	private WebElement click_on_Profile;

	@FindBy(css = ".topnav.active [href*='transactions']")
	private WebElement click_on_transactionse;
	
	@FindBy(css = "[href*='profile']")
	private WebElement go_to_Exchanges;

	public void search_box(String search_item) {
		search_box.sendKeys(search_item);
	}

	public void selectOption() {
		waitTillVisible(option, 5);
		option.click();
	}

	public void click_Profile_dd() {
		profile_dd.click();
	}

	public void click_Pwr_Off() {

		click_pwr_Off.click();
	}

	public void click_Profile() {

		click_on_Profile.click();
	}

	public void click_On_transactions() {
		click_on_transactionse.click();

	}

	public int getAvailBal() {

		String bal = avail_balance.getText();
		int bNumericBal = Integer.parseInt(bal);
		return bNumericBal;

	}

	public int getNetWorth() {

		String bal = net_worth.getText();
		int bNumericBal = Integer.parseInt(bal);
		return bNumericBal;

	}

	public void goToExchanges() {
		
		 go_to_Exchanges.click();
		
		
	}
}
