package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_EMR_Dermotology_YasasiiWeb;
import pagesOfYasasiiWeb.Almeswak_Nursenote_consentForm_YasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_Nursenote_consentForm_TestCaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("nur01", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData")
	public void dentalAsssement (String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNO,String Provider,String DOCuser,String DOCpassword,String URL,String Site,String SmartNote) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 
		Almeswak_Nursenote_consentForm_YasasiiWeb nurse = new Almeswak_Nursenote_consentForm_YasasiiWeb(driver);
		
		nurse.PatientSelect(MRNO);
		
		nurse.nursenote();
		
		nurse.consentForm();
		
		
		   
	}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("dermotology");
		return data;	
	} 





}
