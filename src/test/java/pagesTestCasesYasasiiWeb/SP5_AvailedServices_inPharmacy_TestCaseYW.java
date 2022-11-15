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
import pagesOfYasasiiWeb.SP5_AvailedServices_inPharmacy_yasasiiWeb;


public class SP5_AvailedServices_inPharmacy_TestCaseYW  extends TestBaseYasasiiWeb {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData",priority=0)
	public void Patreg(String PROVIDER, String MRNO,String URL, String User , String Password , String site , String filepath) throws InterruptedException, IOException, AWTException {
		
	
				
		SP5_AvailedServices_inPharmacy_yasasiiWeb awalk=new SP5_AvailedServices_inPharmacy_yasasiiWeb(driver);
		
		awalk.walkin(PROVIDER, MRNO, filepath);
		
		awalk.AuthorisingRequest(URL, User, Password, site, MRNO);
		
	}
	
	
	
	
	
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("panelAvailed");
		return data;
		}
	

} 

	
	

 


