package com.dalal.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalal.BaseTest.BaseTest;
import com.dalal.PageLayer.DashboardPage;
import com.dalal.PageLayer.ExchangePage;
import com.dalal.utilities.UtilClass_PP2;

public class BuyFunctionalityTest extends BaseTest {
	
	
	
	@Test
	public void buyTest() throws InterruptedException {
		
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		
	
		
		db.search_box("adani");
		Thread.sleep(2000);
		db.selectOption();
		Thread.sleep(3000);
		util_obj.Scrolldown(200);
		ep.quantity("4");
		
		
		ep.click_buy();
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
		obj.Scrolldown(200);
		ep.quantity("4");
		
		ep.click_buy();
		System.out.println(ep.confirmation());
	    Assert.assertEquals(ep.confirmation(), "Low balance available");
		
	}

}
