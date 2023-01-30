package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_AppointmentCheckin_YasassiWeb;
import pagesOfYasasiiWeb.Almeswak_BlockandFreeze_Yasassiweb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_BlockandFreeze_TestcaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000);  
	}

	@Test (dataProvider = "getData")
	public void AppointmentCheckin (String User , String Password , String cite , String MRNO,String URL,String Provider,String ProviderID,String VIP) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_BlockandFreeze_Yasassiweb block = new Almeswak_BlockandFreeze_Yasassiweb(driver);

		block.Block(User, Password, cite, MRNO, URL, Provider, ProviderID);
		
		block.freeze(VIP, ProviderID, cite, Provider);
		
	}



	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();
     
	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("blockAndfreeze");
		return data;	
	} 






 

}

	
	


