package com.dalal.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalal.BaseTest.BaseTest;

public class DashBoardPageComponentsTest extends BaseTest {
	
	
	@Test
	public void minBalanceTest() throws InterruptedException {
		
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		Thread.sleep(3000);
		System.out.println(db.getAvailBal());
		Assert.assertEquals(db.getAvailBal(), 50000);		
		
	}
	
	@Test
	public void netWorthTest() throws InterruptedException {
		
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		Thread.sleep(3000);
		System.out.println(db.getNetWorth());
		Assert.assertEquals(db.getNetWorth(), 1085);	
		
	}
	
	@Test
	public void goToExchangesLinkTest() throws InterruptedException {
		
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		Thread.sleep(3000);
		util_obj.Scrolldown(100);
		db.goToExchanges();	
		
		System.out.println(util_obj.getCurrentWebPageUrl());
		Assert.assertEquals(util_obj.getCurrentWebPageUrl(), "https://www.apps.dalalstreet.ai/exchanges");
		
		
	}
	
	
	

}
