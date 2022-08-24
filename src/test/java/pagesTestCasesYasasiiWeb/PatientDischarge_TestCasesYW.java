package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.EMR_DoctorNote_CategoryFilters_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.PatientDischarge_YasassiWeb;

public class PatientDischarge_TestCasesYW  extends TestBaseYasasiiWeb{

	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("km999", "Kameda321", "Kameda Medical Center");
		Thread.sleep(2000); 
	}
	
	@Test (dataProvider = "getData")
	public void patientdischarge1 (String MRNO , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String URL,String Site) throws InterruptedException, IOException, AWTException {

		Thread.sleep(4000); 

		PatientDischarge_YasassiWeb dis = new PatientDischarge_YasassiWeb(driver);

		dis.dischargeRecommendation(MRNO, nurseUser, Password,URL,Site);
		dis.dischargeApproval(MRNO, nurseUser, Password, depUser,URL,Site);
		dis.laboratoryClearance(MRNO, Password, depUser, RADuser,URL,Site);
		dis.radiologyClearance(MRNO, RADuser, Password, meduser,URL,Site);
		dis.medicalClearance(MRNO,Password, meduser, nurseUser,URL,Site);
		dis.PharmacyClearance(MRNO, nurseUser, Password, AdminUser, AdminPassword,URL,Site);
		dis.ADTAppoval(MRNO, nurseUser, Password,URL,Site);
		dis.financialClearance(MRNO, nurseUser, Password,URL,Site);
		dis.physicalDischarge(MRNO, nurseUser, Password);

	}

	@AfterClass
	public void logout() throws Exception
	{
		Thread.sleep(2000); 
		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("PatientDischarge");
		return data;	
	} 





}

