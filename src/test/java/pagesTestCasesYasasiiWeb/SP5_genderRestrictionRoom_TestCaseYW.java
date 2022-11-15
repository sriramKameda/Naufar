package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_genderRestrictionRoom_YasasiiWeb;

public class SP5_genderRestrictionRoom_TestCaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(3000); 
	}
	
	
	

	@Test (dataProvider = "getData")
	public void genderRestrict(String Male ,String Female , String  ADTprovider) throws InterruptedException, IOException {
		
		Thread.sleep(3000); 
		
		SP5_genderRestrictionRoom_YasasiiWeb  grr	 = new SP5_genderRestrictionRoom_YasasiiWeb(driver);
		
		grr.genderRestrict(Male, Female, ADTprovider);
		
	
	}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
	
		this.hm.clickLogout();
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("bedRestriction");
		return data;	
	}
	
	
}
	
	
	


 
	
	
	
	
	
	
	
	


