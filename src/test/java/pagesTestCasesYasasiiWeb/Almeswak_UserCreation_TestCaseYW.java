package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_MergedPatient_YasassiWeb;
import pagesOfYasasiiWeb.Almeswak_UserCreation_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_UserCreation_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}
 
	@Test (dataProvider = "getData" , priority=0)
	public void userCreation (String FirstName ,String MiddleName,String LastName,String Gender,String PhoneNumber,String userId,String UserType,String Department,String Designation,String allowedSites,String Userprofile,String Passsword,String DOJ ,String emailid, String DOB , String encounterCreation,String modules1,String modules2,String modules3,String modules4,String modules5,String modules6,String modules7,String modules8,String deafultmodule,String RegistrationNO,String Country,String provider,String MRNO) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_UserCreation_YasassiWeb user = new Almeswak_UserCreation_YasassiWeb(driver);
		
		
        user.userCreation(FirstName, MiddleName, LastName, Gender, PhoneNumber, userId, UserType, Department, Designation, allowedSites, Userprofile, Passsword, DOJ, emailid, DOB, encounterCreation, modules1, modules2, modules3, modules4, modules5, modules6, modules7, modules8, deafultmodule, RegistrationNO, Country);
	  
    	user.tariffSetting(FirstName);
		
    	user.ScheduleSetting(FirstName, allowedSites);
	
    	user.Billing(FirstName, provider, MRNO);
	
	}
	

	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("userCreation");
		return data;	
	} 
	
}
