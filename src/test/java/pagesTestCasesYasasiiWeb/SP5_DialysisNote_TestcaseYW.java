package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_combinationalPAY_DiscRaise_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_DialysisNote_yasasiiWeb;

public class SP5_DialysisNote_TestcaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(3000); 
	}
	
	
	
	@Test (dataProvider = "getData", priority=0)
	public void PAtreg(String NAME,String AGE, String MBLNO , String ORGANISATION, String ADDRESS , String AADHAAR , String PROVIDER,String URL, String User,String Password,String site, String MRNO,String Service) throws InterruptedException, IOException {
		
		Thread.sleep(3000); 
		
		SP5_DialysisNote_yasasiiWeb   dia= new SP5_DialysisNote_yasasiiWeb (driver);
	  
		dia.PatReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, PROVIDER);
	
		
	
	}
	
	@Test (dataProvider = "getData",priority=1)
	public void DialysisNote(String NAME,String AGE, String MBLNO , String ORGANISATION, String ADDRESS , String AADHAAR , String PROVIDER,String URL, String User,String Password,String site, String MRNO,String Service) throws InterruptedException, IOException {
		
		Thread.sleep(3000); 
		SP5_DialysisNote_yasasiiWeb   dia= new SP5_DialysisNote_yasasiiWeb (driver);
		
		dia.DialysisNote(URL, User, Password, site, MRNO,Service);
		
		
		}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
	
		this.hm.clickLogout();
	
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("dialysis");
		return data;	
	}
	
	
	 

	}
