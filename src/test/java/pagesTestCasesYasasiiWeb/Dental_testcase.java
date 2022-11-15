package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.dental_yasassiWeb;

public class Dental_testcase extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Al-Nahdah");
		Thread.sleep(2000);
		
	}
	
	@Test(dataProvider="getData" ,priority=0)
	public void  master (String CPTCode,String ServiceName , String BaseCategory , String SubCategory,String ServiceDescription)throws InterruptedException, IOException, AWTException {
		
		
	
			Thread.sleep(2000);
			
			dental_yasassiWeb  token= new dental_yasassiWeb(driver);
			token.master(CPTCode, ServiceName, BaseCategory, SubCategory, ServiceDescription);
			
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		Thread.sleep(2000);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("dental");
		return data;
		}

 

}
