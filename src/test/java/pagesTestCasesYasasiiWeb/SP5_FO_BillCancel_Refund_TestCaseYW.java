package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;
import pagesOfYasasiiWeb.SP5_FO_BillCancel_Refund_YasassiWeb;


public class SP5_FO_BillCancel_Refund_TestCaseYW extends TestBaseYasasiiWeb {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData")
	public void patreg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String MRNO , String PROVIDER ,String SERVICE1, String AMOUNT ,String SERVICE2 ,String URL, String User , String Password , String site ) throws InterruptedException, IOException {
		
		
		SP5_FO_BillCancel_Refund_YasassiWeb bill=new SP5_FO_BillCancel_Refund_YasassiWeb(driver);
		
		bill.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR);
		
		bill.BillCancelReq(MRNO, PROVIDER, SERVICE1, AMOUNT, SERVICE2);
		
		bill.AuthorisingRequest(URL, User, Password, site);
		
		bill.checkRestored(PROVIDER);
		
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("BillCancel");
		return data;
		}
	
	
}
