package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_Appointment_master_blockAndfreeze_YasassiWeb;
import pagesOfYasasiiWeb.Almeswak_FO_ClosedEncounter_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_FO_ClosedEncounter_TestcaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData")
	public void AppointmentCheckin ( String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String Provider,String service) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		
		Almeswak_FO_ClosedEncounter_YasassiWeb closed = new Almeswak_FO_ClosedEncounter_YasassiWeb(driver);
		
		closed.patReg(Title, myfirstname, myage, myphoneno, myhomeadd1, mydocnumber);
		
		
		closed.encounterClosing(Provider, service);
		
		closed.closedEncBilling(Provider, service);
		
	}



	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

		
	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("closedEncounter");
		return data;	
	} 


}
