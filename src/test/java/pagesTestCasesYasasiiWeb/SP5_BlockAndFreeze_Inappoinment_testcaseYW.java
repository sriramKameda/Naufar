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
import pagesOfYasasiiWeb.SP5_BlockAndFreeze_Inappoinment_yasassiWeb;

public class SP5_BlockAndFreeze_Inappoinment_testcaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
		Thread.sleep(2000);
		
	}
	
	@Test //(dataProvider="getData" ,priority=0)
	public void  queuemaster ()throws InterruptedException, IOException, AWTException {
			Thread.sleep(2000);
			
			SP5_BlockAndFreeze_Inappoinment_yasassiWeb  BF = new SP5_BlockAndFreeze_Inappoinment_yasassiWeb(driver);
			
			BF.App();
		
			}
	
	
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		Thread.sleep(2000);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("");
		return data;
		}

}


