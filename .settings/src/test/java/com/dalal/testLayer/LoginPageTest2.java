package com.dalal.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dalal.BaseTest.BaseTest;
import com.dalal.utilities.UtilClass_PP2;

public class LoginPageTest2 extends BaseTest {
	
	

	@Test
	public void validCredLoginTest() throws InterruptedException {
		logg.info("Login functionality test with valid credential started");
        // valid email valid password
		Login_obj.email_txt(RC_obj.getEmailId());
		Login_obj.password_txt(RC_obj.getPassword());
	    Login_obj.loginBtn_click();
		
		Thread.sleep(3000);
		String actualUrl=util_obj.getCurrentWebPageUrl();
		Assert.assertEquals(actualUrl,"https://www.apps.dalalstreet.ai/dashboard");
		logg.info("SuccessFully Logged in");
		
		
	
	}
    @Test
	public void invalidCredLoginTest() {
    	// invalid email invalid password
    	logg.info("Login functionality test with invalid email and invalid password started");
    	Login_obj.email_txt("Davidjenner@gmail.com");
		Login_obj.password_txt("david1234556");
		Login_obj.loginBtn_click();
		System.out.println(Login_obj.AccNotExistTxt());
		Assert.assertEquals(Login_obj.AccNotExistTxt(), "Account does not exist\n"
				+ "Your email does not exist. Please sign up for a new account.");
		
		logg.info("Login functionality test with invalid email and invalid password finished");
    
	}
    
    @Test
   	public void invalidPassMinBounLoginTest() throws InterruptedException {
       	// valid email invalid password less than 8 character
    	logg.info("Login functionality test with valid email and invalid password less than 8 character");
       	Login_obj.email_txt("DavidMiller@gmail.com");
   		Login_obj.password_txt("dav");
   		
   		Login_obj.movingToLogin();
   		
   		System.out.println(Login_obj.invalidPasswordTxt());
   		Assert.assertEquals(Login_obj.invalidPasswordTxt(), "Password should be at least of 8 characters");
   		logg.info("Login functionality test with valid email and invalid password less than 8 character Finished");
       
   	}
    
    @Test
   	public void invalidBothLoginTest() throws InterruptedException {
    	
    	logg.info("Login functionality test with invalid email and invalid password less than 8 character Started");
       	Login_obj.email_txt("Davidjenne@gmail.com");
   		Login_obj.password_txt("david123456");
   		Login_obj.loginBtn_click();
   		
   		System.out.println(Login_obj.AccNotExistTxt());
		Assert.assertEquals(Login_obj.AccNotExistTxt(), "Account does not exist\n"
				+ "Your email does not exist. Please sign up for a new account.");
		logg.info("Login functionality test with invalid email and invalid password less than 8 character Finished");
  
   	}
    
    
    
    
    
    
    
    
    
    
    
    

}
