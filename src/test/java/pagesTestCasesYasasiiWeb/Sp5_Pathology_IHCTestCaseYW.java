package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Sp5_Pathology_IHCYasasiiWeb;

public class Sp5_Pathology_IHCTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

//	@Test (dataProvider = "getData")
	public void Pathology(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site,String SERVICE1) throws InterruptedException, IOException {
		
		
		Sp5_Pathology_IHCYasasiiWeb ihc22 =new Sp5_Pathology_IHCYasasiiWeb(driver);
		
		ihc22.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE1);
		
		
		
		}
	
	@Test (dataProvider = "getData")
	public void inestigation(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site,String SERVICE1) throws InterruptedException, IOException {
		
		
		Sp5_Pathology_IHCYasasiiWeb ihc22 =new Sp5_Pathology_IHCYasasiiWeb(driver);
		
		
		
		ihc22.investigtion(URL, User, Password, site, MRNO);
		
		ihc22.resultEnter(MRNO, URL, User, Password, site);
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("biopsy");
		return data;
		}
	
	
}

	


