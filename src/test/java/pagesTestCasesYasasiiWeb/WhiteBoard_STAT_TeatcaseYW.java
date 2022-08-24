package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;
import pagesOfYasasiiWeb.WhiteBoard_STAT_Yasassiweb;

public class WhiteBoard_STAT_TeatcaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateOPfullPage() throws InterruptedException {
		
		   
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("3", "KAmeda123$", "Kameda Medical Center");
	Thread.sleep(3000);
		
	}
	
	
	@Test (dataProvider="getData" , priority=0) 
	public void Stat(String MRNo,String id, String password,String Site , String nurseUser) throws InterruptedException, IOException {
			WhiteBoard_STAT_Yasassiweb WB = new WhiteBoard_STAT_Yasassiweb(driver);
		WB.DoctorReferral(MRNo);
		
		LogingOutAndLogingIn_YasasiiWeb log = new LogingOutAndLogingIn_YasasiiWeb(driver);
		log.action( id,  password, Site);
		
		
		WB.Whiteboard(MRNo);
		
		WB.roomstatus(nurseUser);
		
	}
	
		
	@AfterClass
	public void logout() throws Exception { 
		
		Thread.sleep(3000);
		  this.hm.clickLogout(); 
		  
	}
		  
		  @DataProvider
			public Object[][] getData() throws Exception {

				Object[][] data = readExcel("Checking");
				return data;
		  
	}
		
	

}
