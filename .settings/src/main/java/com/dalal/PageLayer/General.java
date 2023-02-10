package com.dalal.PageLayer;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends LoginPage {

	public General(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		
		driver.findElement(By.name("email")).sendKeys("DavidMiller@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("miller123456");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector(".topnav.active [href*='transactions']")).click();
		
		for(int i = 1;i<=10;i++) {
			for(int j= 1;j<=9;j++) {
				
				System.out.print(driver.findElement(By.cssSelector("tbody tr:nth-child("+i+") td:nth-child("+j+")")).getText()+" ");
				
			}
			System.out.println();
		}
		
      
     
	}

}
