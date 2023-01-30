package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_AdvanceFlow_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_AdvanceFlow_TestcaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData",priority=0)
	public void patregAdv (String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNo,String mail,String PROVIDER ,String service,String authorisername , String remarks ,String URL , String AUTHUser, String AUTHpassword,String Site ) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		
		Almeswak_AdvanceFlow_YasassiWeb Adv = new Almeswak_AdvanceFlow_YasassiWeb(driver);
	
	
		Adv.patReg(Title, myfirstname, myage, myphoneno, myhomeadd1, mydocnumber, MRNo, mail);
		
	
		
	}

	@Test (dataProvider = "getData",priority=1)
	public void advanceRefund (String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNo,String mail,String PROVIDER ,String service,String authorisername , String remarks ,String URL , String AUTHUser, String AUTHpassword,String Site ) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		
		Almeswak_AdvanceFlow_YasassiWeb Adv = new Almeswak_AdvanceFlow_YasassiWeb(driver);
	
	
		
		Adv.advance(PROVIDER, service);
		
		
		Adv.advanceview(authorisername, remarks, URL, AUTHUser, AUTHpassword, Site, MRNo);
		
	}


	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("advance");
		return data;	
	} 

 


}


