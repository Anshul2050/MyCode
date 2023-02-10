package com.ab.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ab.BaseTest_team.BaseTest;


public class RegistrationPageTest extends BaseTest {
	
	@Test
	public void RegisterwithCorrectCredentials() throws InterruptedException
	{
		register_obj.ClickonRegisterButton();
		Thread.sleep(2000);
		register_obj.SelectGender();
		register_obj.EnterFirstName("Robert");
		register_obj.EnterLastName("Wilson");
		
		util_obj.scrolldown();
		Thread.sleep(2000);
		register_obj.ClickonDOB();
		register_obj.ClickonDOM();
		register_obj.ClickonDOY();
		register_obj.EnterEmail("robertwilson12@gmail.com");
		
		util_obj.scrolldown();
		Thread.sleep(2000);
		register_obj.EnterCompany("Amazon India pvt. Ltd.");
		register_obj.EnterPasswprd("Test@1234");
		register_obj.EnterRePassword("Test@1234");
		Thread.sleep(2000);
		register_obj.ClickonSignup();	
	
	}
	
	@Test
	public void RegisterwithIncorrectCredentials() throws InterruptedException 
	{
		String expected_result="The specified email already exists";
		register_obj.ClickonRegisterButton();
			register_obj.SelectGender();
			register_obj.EnterFirstName("Robert");
			register_obj.EnterLastName("Wilson");
			
			util_obj.scrolldown();
			Thread.sleep(2000);
			register_obj.ClickonDOB();
			register_obj.ClickonDOM();
			register_obj.ClickonDOY();
			register_obj.EnterEmail("robertwilson12@gmail.com");
			
			util_obj.scrolldown();
			Thread.sleep(2000);
			register_obj.EnterCompany("Amazon India pvt. Ltd.");
			register_obj.EnterPasswprd("123456");
			register_obj.EnterRePassword("123456");
			Thread.sleep(2000);
			register_obj.ClickonSignup();
	String actual_result=register_obj.getmessage();
	Assert.assertEquals(actual_result, expected_result);		
	
	}
	
	@Test
	public void RegisterwithIncorrectgmail() throws InterruptedException 
	{
		String expected_result="Wrong email";
		register_obj.ClickonRegisterButton();
			register_obj.SelectGender();
			register_obj.EnterFirstName("Robert");
			register_obj.EnterLastName("Wilson");
			
			util_obj.scrolldown();
			Thread.sleep(2000);
			register_obj.ClickonDOB();
			register_obj.ClickonDOM();
			register_obj.ClickonDOY();
			register_obj.EnterEmail("robertwilson12gmail.com");
			util_obj.scrolldown();
			Thread.sleep(2000);
			register_obj.EnterCompany("Amazon India pvt. Ltd.");
			
			
	String actual_result=register_obj.getErrorGmail();
	Assert.assertEquals(actual_result, expected_result);		
	
	}
	@Test
	public void Registerwithblankemail() throws InterruptedException 
	{
		String expected_result="Email is required.";
		register_obj.ClickonRegisterButton();
			register_obj.SelectGender();
			register_obj.EnterFirstName("Robert");
			register_obj.EnterLastName("Wilson");
			
			util_obj.scrolldown();
			Thread.sleep(2000);
			register_obj.ClickonDOB();
			register_obj.ClickonDOM();
			register_obj.ClickonDOY();
			register_obj.EnterEmail(" ");
			util_obj.scrolldown();
			Thread.sleep(2000);
			register_obj.EnterCompany("Amazon India pvt. Ltd.");
			
			register_obj.EnterPasswprd("123456");
			register_obj.EnterRePassword("123456");
			Thread.sleep(2000);
			register_obj.ClickonSignup();
	String actual_result=register_obj.EmailRequiredMessage();
	Assert.assertEquals(actual_result, expected_result);		
	
	}
	
	@Test
	public void RegisterwithcorrectCredentials1() throws InterruptedException 
	{
		String expected_url="https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
		register_obj.ClickonRegisterButton();
			register_obj.SelectGender();
			register_obj.EnterFirstName("Robert");
			register_obj.EnterLastName("Wilson");
			
			util_obj.scrolldown();
			Thread.sleep(2000);
			register_obj.ClickonDOB();
			register_obj.ClickonDOM();
			register_obj.ClickonDOY();
			register_obj.EnterEmail("abc12@gmail.com");
			util_obj.scrolldown();
			Thread.sleep(2000);
			register_obj.EnterCompany("Amazon India pvt. Ltd.");
			
			register_obj.EnterPasswprd("123456");
			register_obj.EnterRePassword("123456");
			Thread.sleep(2000);
			register_obj.ClickonSignup();
	String actual_result=register_obj.getcurrenturl();
	Assert.assertEquals(actual_result, expected_url);		
	
	}
	
}

