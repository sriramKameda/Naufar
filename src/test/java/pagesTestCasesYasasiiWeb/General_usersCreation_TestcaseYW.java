package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.General_usersCreation_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class General_usersCreation_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000);
	
}

//Register ER Patient 

@Test(dataProvider="getData")
public void userCreation(String firstname ,String userid,String pssword, String Phone, String Dept,String desig,String site,String userProf,String usertype) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		General_usersCreation_YasassiWeb user =new General_usersCreation_YasassiWeb(driver);
		user.UserCreation(firstname, userid, pssword, Phone, Dept, desig, site, userProf, usertype);
	
		}

@AfterClass
public void logout() throws Exception
{
	this.hm.clickLogout();
}
@DataProvider
public Object[][] getData() throws Exception {

	Object[][] data = readExcel("genUser");
	return data;
}

}

 


