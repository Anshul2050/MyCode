package com.dalal.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.dalal.BaseTest.BaseTest;
import com.dalal.BaseTest.TestUtilities;
import com.dalal.PageLayer.SignUpPage;

public class SignUpPageTest extends BaseTest {
      
	@Test
	public void SignUpTest() throws IOException, InterruptedException {
		logg.info("Sign up Test Started");
		SignUpPage sign_up_obj = new SignUpPage(driver);
		sign_up_obj.clickOnSignUp_link();
		//here driver is coming from base test and going to SignupPage
		sign_up_obj.getSignUpUrl();
		sign_up_obj.firstName_txt("Ricky");
		sign_up_obj.lastName_txt("Ponting");
		sign_up_obj.email_txt("RickyPonting@gmail.com");
		sign_up_obj.password_txt("Ricky123456");
		sign_up_obj.checbox_click();
		
		sign_up_obj.clickOnGetJouStarted();
	
	}
	@Test
	public void SignUpTestAndWrite() throws IOException, InterruptedException {
		logg.info("Sign up and Storing in the Excel sheet Test Started");
		SignUpPage sign_up_obj = new SignUpPage(driver);
		//here driver is coming from base test and going to SignupPage
		sign_up_obj.getSignUpUrl();
		sign_up_obj.firstName_txt("Sachin");
		sign_up_obj.lastName_txt("Tendulkar");
		sign_up_obj.email_txt("Sach@gmail.com");
		sign_up_obj.password_txt("Tinda123456");
		sign_up_obj.checbox_click();
		
		sign_up_obj.clickOnGetJouStarted();
	    TestUtilities test_utl_obj = new TestUtilities();
		test_utl_obj.writeData(1,"Sachin" ,"Tendulkar","Sach@gmail.com","Tinda123456");
		logg.info("Sign up and Storing in the Excel sheet Test Finished");
	}
	
}

//sign_up_obj.email_txt("DavidMiller@gmail.com"); registered
//sign_up_obj.password_txt("david123456");