package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_pathology_Cytology_YasasiiWeb;

public class SP5_Pathology_Cytology_TestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	SP5_Pathology_Cytology_TestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
	SP5_Pathology_Cytology_TestCaseYW.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData" ,priority=0)
	public void Pathology(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site) throws InterruptedException, IOException {
		
		
		SP5_pathology_Cytology_YasasiiWeb c22 =new SP5_pathology_Cytology_YasasiiWeb(driver);
		
		c22.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
		
	
		
		}
	
	@Test (dataProvider = "getData",priority=1)
	public void inestigation(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site) throws InterruptedException, IOException {
		
		
		SP5_pathology_Cytology_YasasiiWeb c22 =new SP5_pathology_Cytology_YasasiiWeb(driver);
		
		c22.investigtion(URL, User, Password, site, MRNO);
		
			
		c22.resultEnter(MRNO, URL, User, Password, site);
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		SP5_Pathology_Cytology_TestCaseYW.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Cytology");
		return data;
		}
	
	
}

	


