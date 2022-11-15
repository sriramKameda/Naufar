package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_pathology_biopsy_YasassiWeb;

public class SP5_pathology_biopsy_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData")
	public void Pathology(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site,String SERVICE1) throws InterruptedException, IOException {
		
		
		SP5_pathology_biopsy_YasassiWeb b22 =new SP5_pathology_biopsy_YasassiWeb(driver);
		
		b22.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
		
		//b22.investigtion(URL, User, Password, site, MRNO);
		
		}
	
	@Test (dataProvider = "getData")
	public void inestigation(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site,String SERVICE1) throws InterruptedException, IOException {
		
		
		SP5_pathology_biopsy_YasassiWeb b22 =new SP5_pathology_biopsy_YasassiWeb(driver);
		
		//b22.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
		
		b22.investigtion(URL, User, Password, site, MRNO);
		
		b22.resultEnter(MRNO, URL, User, Password, site);
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

	


