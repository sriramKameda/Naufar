package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.FO_PharmacyBilling_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_Additive_Outsider_Walkin_billing_yasasiiWeb;

public class SP5_Additive_Outsider_Walkin_billing_testCaseYW   extends TestBaseYasasiiWeb {
	
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData",priority=0)
	public void Patreg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO , String PROVIDER, String Medicine , String Additive , String Site , String Admin, String ADminPassword,String DocID , String DocPassword,String outsiderName1,String MRNO1) throws InterruptedException, IOException {
		
	
				
		SP5_Additive_Outsider_Walkin_billing_yasasiiWeb  add = new   SP5_Additive_Outsider_Walkin_billing_yasasiiWeb (driver);
		
		add.patReg(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER);
		
	}
	
	
	
	
	
	@Test (dataProvider = "getData" , priority=1)
	public void Additive(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO , String PROVIDER, String Medicine , String Additive , String Site , String Admin, String ADminPassword,String DocID , String DocPassword,String outsiderName1 ,String MRNO1) throws InterruptedException, IOException, AWTException {
		
	
				
		SP5_Additive_Outsider_Walkin_billing_yasasiiWeb  adit = new   SP5_Additive_Outsider_Walkin_billing_yasasiiWeb (driver);
		
		adit.doctorNote(MRNO, Medicine, Additive, Site, Admin, ADminPassword, DocID, DocPassword);
		
	}
	
	@Test (dataProvider = "getData" , priority=2)
	public void Outsider(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO , String PROVIDER, String Medicine , String Additive , String Site , String Admin, String ADminPassword,String DocID , String DocPassword,String outsiderName1,String MRNO1) throws InterruptedException, IOException, AWTException {
		
	
				
		SP5_Additive_Outsider_Walkin_billing_yasasiiWeb  adit = new   SP5_Additive_Outsider_Walkin_billing_yasasiiWeb (driver);
		
		
	 adit.Outsider(outsiderName1);
		
		
		
	}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Additive");
		return data;
		}
	

} 

	
	

