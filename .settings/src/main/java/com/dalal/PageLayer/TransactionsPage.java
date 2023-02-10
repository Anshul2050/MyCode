package com.dalal.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dalal.utilities.UtilClass_PP2;

public class TransactionsPage extends UtilClass_PP2 {
	public WebDriver driver;

	public TransactionsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	@FindBy(css = ".btn.btn-outline-success.w-md")
	private WebElement transaction_data;

	public void getTransactionData() {

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 9; j++) {

				String txt = driver.findElement(By.cssSelector("tbody tr:nth-child(" + i + ") td:nth-child(" + j + ")"))
						.getText() + " ";
				System.out.println(txt);
			}
			System.out.println();
		}
	}

	public Object getTransactionDataandWrite() {
		Object data [][]= new Object[10][9];
		Object storedData = null ;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 9; j++) {
				   storedData = data[i][j];
				String txt = driver.findElement(By.cssSelector("tbody tr:nth-child(" + i + ") td:nth-child(" + j + ")"))
						.getText() + " ";
				System.out.println(txt);
			}
			System.out.println();
			
		}
		return storedData;
	}

}
