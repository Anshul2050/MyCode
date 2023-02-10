package com.dalal.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalal.BaseTest.BaseTest;
import com.dalal.PageLayer.DashboardPage;
import com.dalal.PageLayer.LogoutPage;
import com.dalal.PageLayer.ProfilPage;
import com.dalal.utilities.UtilClass_PP2;

public class ProfileOptionsTest extends BaseTest {

	@Test
	public void veriFyUserIdTest() throws InterruptedException {

		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		
		Thread.sleep(5000);
		db.click_Profile_dd();
		db.click_Profile();
		ProfilPage PP_obj = new ProfilPage(driver);
		System.out.println(PP_obj.getUserIdTxt());
		Assert.assertEquals(PP_obj.getUserIdTxt(), "63d4c91ddbe3b37229e4a715");
	}

	@Test
	public void veriFyLogOutTest() throws InterruptedException {

		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		DashboardPage db = new DashboardPage(driver);
		Thread.sleep(5000);
		db.click_Profile_dd();
		db.click_Pwr_Off();
		LogoutPage lo_obj = new LogoutPage(driver);
		System.out.println(lo_obj.getLogOutText());
		Assert.assertEquals(lo_obj.getLogOutText(),"Good Bye, Trader");
	}
	
	@Test
	public void verifyUpdatePassword() throws InterruptedException {
		UtilClass_PP2 obj= new UtilClass_PP2 (driver);
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		DashboardPage db = new DashboardPage(driver);
		Thread.sleep(5000);
		db.click_Profile_dd();
		db.click_Profile();
		ProfilPage PP_obj = new ProfilPage(driver);
		obj.Scrolldown(100);
		PP_obj.enterNewPassword("miller123456");
		Thread.sleep(2000);
		PP_obj.click_update_btn();
		Assert.assertEquals(PP_obj.confirm_updation(), "APS: Details updated successfully");
		System.out.println(PP_obj.confirm_updation());
	}
	

}
