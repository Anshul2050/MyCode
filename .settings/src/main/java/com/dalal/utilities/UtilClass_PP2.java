package com.dalal.utilities;

import java.time.Duration;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.dalal.PageLayer.LoginPage;

public class UtilClass_PP2 {

	public WebDriver driver;
	public LoginPage login_obj;
	public DataFormatter formatter = new DataFormatter();

	public UtilClass_PP2(WebDriver driver) {

		this.driver = driver;

	}

	public void Scrolldown(int scrollBy) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + scrollBy + ")");

	}

	public void Login_obj() {

		login_obj = new LoginPage(driver);
		driver.get("https://www.apps.dalalstreet.ai/login");

	}

	public void waitTillVisible(WebElement webelement, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

		wait.until(ExpectedConditions.visibilityOf(webelement));

	}

	public void waitTillClickable(WebElement webelement, int duration) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));

		wait.until(ExpectedConditions.elementToBeClickable(webelement));

	}

	public void movingAction(WebElement webelement) {
		Actions a = new Actions(driver);
		a.moveToElement(webelement).click().build().perform();

	}

	public String getCurrentWebPageUrl() {

		String url = driver.getCurrentUrl();
		return url;

	}

	public String confirmation_Txt() {
		waitTillVisible(driver.findElement(By.cssSelector(".Toastify__toast-body div:nth-child(2)")), 5);
		String txt = driver.findElement(By.cssSelector(".Toastify__toast-body div:nth-child(2)")).getText();

		return txt;

	}

	public void navigateToDashBoard() {
		driver.findElement(By.cssSelector("[href*='/dashboard']")).click();
	}

	public void navigateToPortFolio() {
		driver.findElement(By.cssSelector("[href*='/portfolio']")).click();
	}

	public void navigateToExchanges() {
		driver.findElement(By.cssSelector("[href*='/exchanges']")).click();
	}

	public void navigateTotransactions() {
		driver.findElement(By.cssSelector("[href*='/transactions']")).click();
		
	}

}
