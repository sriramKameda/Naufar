package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_FullPatientRegistration_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_FullPatientRegistration_TestCaseYW  extends TestBaseYasasiiWeb{



	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData")
	public void EncType (String Title ,String myfirstname ,String myage,String myphoneno,String myaltphoneno,String myhomeadd1,String myhomeadd2,String mydocnumber,String MRNo,String familyName,String Organisation,String mail,String relatedMR , String provider) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000); 

		Almeswak_FullPatientRegistration_YasassiWeb ET = new Almeswak_FullPatientRegistration_YasassiWeb(driver);
		
		ET.PatientReg(Title, myfirstname, myage, myphoneno, myaltphoneno, myhomeadd1, myhomeadd2, mydocnumber, MRNo, familyName, Organisation, mail, relatedMR);
		
		ET.PatientInfo(provider);
	}



	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("FullRegistration");
		return data;	
	} 







}
 
	
	


