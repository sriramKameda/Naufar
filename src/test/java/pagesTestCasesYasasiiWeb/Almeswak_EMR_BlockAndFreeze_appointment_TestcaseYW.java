package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_EMR_BlockAndFreeze_appointment_YasasiiWeb;
import pagesOfYasasiiWeb.Almeswak_EMR_DentalAssesement_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_EMR_BlockAndFreeze_appointment_TestcaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login; 
	public static HomePageYasasiiWeb hm;


	@BeforeClass()  
	public void navigateFOPage() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("raina", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData")
	public void Emr (String MRNO , String Provider) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 
		Almeswak_EMR_BlockAndFreeze_appointment_YasasiiWeb EMR = new Almeswak_EMR_BlockAndFreeze_appointment_YasasiiWeb(driver);
	   
		
		EMR.EMRblock(MRNO, Provider);
		
	}
	
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000); 
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(2000); 
		
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("EMRBlock");
		return data;	
	} 





}
 


