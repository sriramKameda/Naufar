package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Sp5_pathology_FrozenYasasiiWeb;


public class SP5_pathology_FrozenTestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	SP5_pathology_FrozenTestcaseYW.login =new LoginPageYasasiiWeb(driver) ;
	SP5_pathology_FrozenTestcaseYW.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData" ,priority=1)
	public void Pathology(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site,String User1,String Password1) throws InterruptedException, IOException {
		
		
		Sp5_pathology_FrozenYasasiiWeb fro =new Sp5_pathology_FrozenYasasiiWeb(driver);
		
		
		fro.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
	
		
		}
	
	@Test (dataProvider = "getData",priority=2)
	public void inestigation(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String URL, String User , String Password , String site,String User1,String Password1) throws InterruptedException, IOException {
		
		
		Sp5_pathology_FrozenYasasiiWeb fro2 =new Sp5_pathology_FrozenYasasiiWeb(driver);
		
		//b22.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, SERVICE);
		
		fro2.investigtion(URL, User, Password, site, MRNO, User1, Password1);
		
		fro2.resultEnter(MRNO, URL, User, Password, site);
		
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		SP5_pathology_FrozenTestcaseYW.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Frozen");
		return data;
		}
	
	
}

	


