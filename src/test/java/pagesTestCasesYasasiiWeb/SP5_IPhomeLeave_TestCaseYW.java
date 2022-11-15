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
import pagesOfYasasiiWeb.SP5_IPhomeLeave_YasassiWeb;

public class SP5_IPhomeLeave_TestCaseYW  extends TestBaseYasasiiWeb{



	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData" , priority=0)
	public void patreg (String Name,String AadharNumber,String MRNo,String Provider ,String ADTprovider ,String service,String DOCuser ,String DOCpassword,String URL , String Site ,String nurseUser , String  Password ,String AdminUser , String AdminPassword) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000); 

		SP5_IPhomeLeave_YasassiWeb Home = new SP5_IPhomeLeave_YasassiWeb(driver);
		
		Home.PATREG(Name, AadharNumber, MRNo, Provider, ADTprovider);
		
		
		
	}


	@Test (dataProvider = "getData" ,priority=1)
	public void homevisit (String Name,String AadharNumber,String MRNo,String Provider ,String ADTprovider ,String service,String DOCuser ,String DOCpassword,String URL , String Site ,String nurseUser , String  Password ,String AdminUser , String AdminPassword) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000); 

		SP5_IPhomeLeave_YasassiWeb Home = new SP5_IPhomeLeave_YasassiWeb(driver);
		
		Home.HomeLeave(service);
		Home.DoctorNote(DOCuser, DOCpassword, URL, Site, MRNo, AadharNumber);
		Home.dischargeApproval(MRNo, nurseUser, Password, URL, Site);
		Home.laboratoryClearance(MRNo, Password, nurseUser);
		Home.PharmacyClearance(MRNo, nurseUser, Password, AdminUser, AdminPassword, URL, Site);
		Home.ADTAppoval(MRNo);
		Home.homeleaveCancel();
		
		
		
		
		
	}
	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("HomeLeave");
		return data;	
		
	} 


}

	
	
	
	
	
	
	


