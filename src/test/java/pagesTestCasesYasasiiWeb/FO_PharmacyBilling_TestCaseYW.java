package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_EncounterCreationScreenYasasiiWeb;
import pagesOfYasasiiWeb.FO_OPadvpay_yasassiWeb;
import pagesOfYasasiiWeb.FO_PharmacyBilling_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.LogingOutAndLogingIn_YasasiiWeb;

public class FO_PharmacyBilling_TestCaseYW  extends TestBaseYasasiiWeb {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData",priority=0)
	public void pharmacy( String CHEIFCOMPLAINT , String MEDICINE,String doctor,String id, String docpassword,String Site,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO , String PROVIDER) throws InterruptedException, IOException {
		
	
				
		FO_PharmacyBilling_YasassiWeb  bill = new   FO_PharmacyBilling_YasassiWeb (driver);
		
		bill.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER);
		
	}
	
	
	
	
	
	@Test (dataProvider = "getData" , priority=1)
	public void pharmacy1( String CHEIFCOMPLAINT , String MEDICINE,String doctor,String id, String docpassword,String Site,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO , String PROVIDER) throws InterruptedException, IOException, AWTException {
		
	
				
		FO_PharmacyBilling_YasassiWeb  bill = new   FO_PharmacyBilling_YasassiWeb (driver);
		
		
		 bill.pharmacybill(MRNO, PROVIDER, CHEIFCOMPLAINT, MEDICINE,id,docpassword , Site);
		
	}
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("pharmacyBill");
		return data;
		}
	

}