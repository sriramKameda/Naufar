package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_Copay_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class FO_Copay_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
		Thread.sleep(4000);
		
	}
	
	
	@Test(dataProvider = "getData" ,priority=0) 
	public void copay(String NAME, String AGE, String MBLNO , String ORGANISATION , String ADDRESS  ,String AADHAAR ,String PROVIDER , String REFNO, String MRNO,String ADTprovider,String REFNOIP ) throws AWTException, InterruptedException, IOException {
		FO_Copay_YasassiWeb ins =new FO_Copay_YasassiWeb(driver);
		ins.insuranceCopay(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, PROVIDER, REFNO,MRNO);
		
		
	}
	
	@Test(dataProvider = "getData" ,priority=1 ) 
	public void Reference(String NAME, String AGE, String MBLNO , String ORGANISATION , String ADDRESS  ,String AADHAAR ,String PROVIDER , String REFNO, String MRNO, String ADTprovider,String REFNOIP) throws AWTException, InterruptedException, IOException {
		FO_Copay_YasassiWeb ins =new FO_Copay_YasassiWeb(driver);
		ins.referenceLetter(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, PROVIDER, REFNO, MRNO,ADTprovider, REFNOIP);
		
		
	}
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	
	}
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("coPay");
		return data;	
	}

}
