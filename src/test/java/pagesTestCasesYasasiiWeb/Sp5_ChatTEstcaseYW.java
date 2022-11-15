package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Sp5_ChatYasasiiWeb;


public class Sp5_ChatTEstcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	Sp5_ChatTEstcaseYW.login =new LoginPageYasasiiWeb(driver) ;
	Sp5_ChatTEstcaseYW.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}
	
	@Test (dataProvider = "getData")
	public void chat(String URL,String User , String Password , String site,String User1 , String Password1,String MRNO) throws InterruptedException, IOException {
		
		
		Sp5_ChatYasasiiWeb c22 =new Sp5_ChatYasasiiWeb(driver);
		
		c22.ch1(URL,User, Password, site, MRNO);
		c22.doc(URL, User1, Password1, site);
		c22.doc1(URL,User, Password, site, MRNO);

		}
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		Sp5_ChatTEstcaseYW.hm.clickLogout();
		
	}

	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("chat");
		return data;
		}

}

