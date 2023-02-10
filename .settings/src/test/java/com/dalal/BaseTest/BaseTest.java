package com.dalal.BaseTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameter;
import com.dalal.PageLayer.DashboardPage;
import com.dalal.PageLayer.ExchangePage;
import com.dalal.PageLayer.LoginPage;
import com.dalal.PageLayer.ProfilPage;
import com.dalal.PageLayer.TransactionsPage;
import com.dalal.utilities.UtilClass_PP2;

//PP
public class BaseTest {
	public static WebDriver driver;
	public LoginPage Login_obj;
	public DashboardPage db;
	public TransactionsPage tp_obj;
	public TestUtilities tu_obj;
	public ProfilPage PP_obj;
	public ReadConfig RC_obj;
	public Logger logg;
	public ExchangePage ep;
	public UtilClass_PP2  util_obj;

	@BeforeTest
	public void start() {
		logg = Logger.getLogger("My First Framework Project On DalalStreet");
		PropertyConfigurator.configure("Log4jFile.properties");
		logg.info("Test Initiated");
      
	}

	@AfterTest
	public void end() {
		
		logg.info("Test Finished");

	}

	public WebDriver initialiseBrowser() throws IOException {

		String globPropPath = "E:\\software testing notes\\FrameWork WorkSpace\\DalalStreet_PP_New_met\\"
				+ "src\\test\\resources\\config\\Config.properties";
		FileInputStream fis = new FileInputStream(globPropPath);

		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			WebDriver driver = new ChromeDriver();
			this.driver = driver;

		} else if (browserName.equalsIgnoreCase("edge")) {

			WebDriver driver = new EdgeDriver();
			this.driver = driver;
		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriver driver = new FirefoxDriver();
			this.driver = driver;
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		logg.info("Browser Operations done!!!");
		db = new DashboardPage(driver);
		tp_obj = new TransactionsPage(driver);
		tu_obj = new TestUtilities();
		PP_obj = new ProfilPage(driver);
		RC_obj = new ReadConfig();
		util_obj = new UtilClass_PP2(driver);
		logg.info("Necessary Objects Created");
        ep = new ExchangePage(driver);
        
		return driver;
	}

	@BeforeMethod
	public LoginPage launchApplication() throws IOException {
		driver = initialiseBrowser();

		Login_obj = new LoginPage(driver);

		Login_obj.loginPage_url();
		
		logg.info("Url hitted");

		return Login_obj;

	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
