package com.dalal.testLayer;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dalal.BaseTest.BaseTest;
import com.dalal.BaseTest.ReadConfig;
import com.dalal.BaseTest.TestUtilities;
import com.dalal.PageLayer.DashboardPage;
import com.dalal.PageLayer.TransactionsPage;

public class TransactionTest extends BaseTest {
	
	@Test
	public void TransactionTest1() throws InterruptedException   {
		
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		logg.info("Successfully Logged in!!!");
		Thread.sleep(3000);
		db.click_On_transactions();
	    tp_obj.getTransactionData();
	    logg.info("Transaction Data Printed in Console");
	
	}
	
	@DataProvider(name = "kk")
	public Object TransactionTest2() throws InterruptedException   {
		
		Login_obj.login_Util(RC_obj.getEmailId(), RC_obj.getPassword());
		Thread.sleep(3000);
		db.click_On_transactions();
	    Object data =tp_obj.getTransactionDataandWrite();
		return data;
	
	}
	
	@Test(dataProvider="kk")
	public void TransactionTestandwritetoExcel(String email, String password, String fn, String ln,
	    String email1, String password1, String fn1, String ln1,String pm) throws InterruptedException, IOException   {
		tu_obj = new TestUtilities();
		
		tu_obj.writeData2(email,password, fn,ln, email1,password1, fn1,ln1,pm);
	
	}

	
}
