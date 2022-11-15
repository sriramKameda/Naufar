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
import pagesOfYasasiiWeb.SP5_Mergedpatient_YasasiiWeb;

public class SP5_Mergedpatient_TestcaseYW   extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(3000); 
	}
	
	
	

	@Test (dataProvider = "getData" , priority=0)
	public void patreg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site , String MBLNO2 , String MRNo2 , String Procedure , String AADHAR2) throws InterruptedException, IOException {
		
		Thread.sleep(3000); 
		
		SP5_Mergedpatient_YasasiiWeb  mrge	 = new SP5_Mergedpatient_YasasiiWeb(driver);
		
		mrge.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE, MBLNO2, AADHAR2);
		
	
	}
	
	
	@Test (dataProvider = "getData" ,priority=1)
	public void merge(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site , String MBLNO2 , String MRNo2 , String Procedure , String AADHAR2) throws InterruptedException, IOException, AWTException {
		
		Thread.sleep(3000); 
		
		SP5_Mergedpatient_YasasiiWeb  m23	 = new SP5_Mergedpatient_YasasiiWeb(driver);
		
		m23.docnote(URL, User, Password, site, MRNO, Procedure, SERVICE);
		
		m23.merge(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE, MBLNO2, MRNo2, AADHAR2, URL, site);
	
	}
	
	
	
	
	
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
	
		this.hm.clickLogout();
		
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("merge");
		return data;	
	}
	
}	

	
	
	


