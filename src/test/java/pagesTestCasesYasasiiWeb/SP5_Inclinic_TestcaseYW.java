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
import pagesOfYasasiiWeb.SP5_Inclinic_yasassiWeb;
import pagesOfYasasiiWeb.SP5_pathology_biopsy_YasassiWeb;

public class SP5_Inclinic_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver);
	this.hm = login.enterloginDetails("3", "KAmeda123$", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData")
	public void inclinic(String MRNO) throws InterruptedException, IOException, AWTException {
		
		
		SP5_Inclinic_yasassiWeb  INC =new SP5_Inclinic_yasassiWeb(driver);
	
		INC.doctorNote(MRNO);
		INC.newnote();
		INC.discontinue();
		INC.prescriptionPrint();
		INC.cpoeAdmin();
		
		}
	
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("inclinic");
		return data;
		}
	
	
}

	


 


