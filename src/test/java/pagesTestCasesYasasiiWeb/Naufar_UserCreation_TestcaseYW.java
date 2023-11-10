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

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Naufar_UserCreation_Yasasiiweb;

public class Naufar_UserCreation_TestcaseYW   extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}
 
@Test(dataProvider="getData" , priority=0)
public void usercreation(String FirstName ,String MiddleName,String LastName,String Gender,String PhoneNumber,String userId,String UserType,String Department,String Designation,String allowedSites,String Userprofile,String Passsword,String DOJ ,String emailid, String DOB , String encounterCreation,String modules1,String modules2,String modules3,String modules4,String modules5,String modules6,String modules7,String modules8,String deafultmodule,String RegistrationNO,String Country,String provider,String MRNO) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_UserCreation_Yasasiiweb User = new Naufar_UserCreation_Yasasiiweb(driver);
		
		User.userCreation(FirstName, MiddleName, LastName, Gender, PhoneNumber, userId, UserType, Department, Designation, allowedSites, Userprofile, Passsword, DOJ, emailid, DOB, encounterCreation, modules1, modules2, modules3, modules4, modules5, modules6, modules7, modules8, deafultmodule, RegistrationNO, Country);
		
		User.tariffSetting(FirstName , userId);
		
		User.ScheduleSetting(FirstName, allowedSites);
		
		User.Billing(FirstName, provider, MRNO);
		
		
}


@AfterClass
public void logout() throws Exception
{
	Robot t=new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(400);
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	 
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("Usercreation");
	return data;	

 


}


}
