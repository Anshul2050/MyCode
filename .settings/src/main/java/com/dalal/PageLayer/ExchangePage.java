package com.dalal.PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dalal.utilities.UtilClass_PP2;

public class ExchangePage extends UtilClass_PP2 {

	public static WebDriver driver;

	public ExchangePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(css = ".bg-light.rounded.nav.nav-pills li:nth-child(2) a")
	WebElement sell_btn;

	@FindBy(css = ".bg-light.rounded.nav.nav-pills li:nth-child(1) a")
	WebElement First_buy_btn;

	@FindBy(xpath = "//div//button[text()='Buy']")
	private WebElement buy_btn;

	@FindBy(xpath = "//div//button[text()='Sell']")
	private WebElement sell_btn_foot;

	@FindBy(name = "input-Qunatity")
	private WebElement quantity;

	@FindBy(id = "quantity")
	private WebElement sellquantity;

	@FindBy(css = ".tab-content.mt-4 .Toastify div div div div:nth-child(2)")
	WebElement confirmation_msg;

	public void quantity(String count) {
		waitTillVisible(quantity, 5);
		quantity.sendKeys(count);
		quantity.click();

	}

	public void click_buy() {

		buy_btn.click();
	}

	public String confirmation() {
		waitTillVisible(confirmation_msg, 5);
		String txt = confirmation_msg.getText();
		return txt;
	}

	public void sell() {

		sell_btn.click();
	}

	public void sell_foot() {

		sell_btn_foot.click();
	}

	public void sell_quantity(String count) {

		sellquantity.sendKeys(count);
	}

}
