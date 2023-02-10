package com.dalal.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalal.BaseTest.BaseTest;
import com.dalal.PageLayer.DashboardPage;
import com.dalal.PageLayer.ExchangePage;
import com.dalal.utilities.UtilClass_PP2;

public class SellFunctionalityTest extends BaseTest {
	
	
	
	@Test
	public void buyTest() throws InterruptedException {
		UtilClass_PP2 obj= new UtilClass_PP2 (driver);
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		
		DashboardPage db = new DashboardPage(driver) ;
		ExchangePage ep= new ExchangePage(driver);
		db.search_box("adani");
		Thread.sleep(2000);
		db.selectOption();
		
		Thread.sleep(3000);
		ep.sell();
		obj.Scrolldown(200);
		ep.sell_quantity("2");
		
		
		ep.sell_foot();
		System.out.println(ep.confirmation());
		Assert.assertEquals(ep.confirmation(), "Order Created successfully");
		
	
	}
	
	@Test
	public void buyTestInsufficientBal() throws InterruptedException {
		UtilClass_PP2 obj= new UtilClass_PP2 (driver);
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		
		
		
		db.search_box("adani");
		Thread.sleep(2000);
		db.selectOption();
		
		Thread.sleep(3000);
		ep.sell();
		obj.Scrolldown(200);
		ep.sell_quantity("2");
		
		
		ep.sell_foot();
		System.out.println(ep.confirmation());
		Assert.assertEquals(ep.confirmation(), "Order Created successfully");
		
	}

}
