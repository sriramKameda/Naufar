package pagesTestCasesYasasiiWeb;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Sp5_pathology_Cytologysmear_YasasiiWeb;


public class Sp5_pathology_CytologysmearTestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	Sp5_pathology_CytologysmearTestcaseYW.login =new LoginPageYasasiiWeb(driver) ;
	Sp5_pathology_CytologysmearTestcaseYW.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData" ,priority=0)
	public void Pathology(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site) throws InterruptedException, IOException {
		
		
		Sp5_pathology_Cytologysmear_YasasiiWeb cs22 =new Sp5_pathology_Cytologysmear_YasasiiWeb(driver);
		
		cs22.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
		
	
		
		}
	
	@Test (dataProvider = "getData",priority=1)
	public void inestigation(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site) throws InterruptedException, IOException {
		
		
		Sp5_pathology_Cytologysmear_YasasiiWeb cs22 =new Sp5_pathology_Cytologysmear_YasasiiWeb(driver);
		
		//b22.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
		cs22.investigtion(URL, User, Password, site, MRNO);
		
			
		cs22.resultEnter(MRNO, URL, User, Password, site);
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		Sp5_pathology_CytologysmearTestcaseYW.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Cytologysmear");
		return data;
		}
	
	
}

	


