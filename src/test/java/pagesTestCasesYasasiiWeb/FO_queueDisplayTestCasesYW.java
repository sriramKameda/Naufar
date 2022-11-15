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
import pagesOfYasasiiWeb.FO_queueDisplayYasassiweb;

public class FO_queueDisplayTestCasesYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	@BeforeClass
	public void navigateemradt() throws InterruptedException {
		
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
		Thread.sleep(2000);
		
	}
	
	@Test(dataProvider="getData" ,priority=0)
	public void  queuemaster (String MRNo,String URL, String Queuetype ,String queueName,String ID , String Password, String Site,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO)throws InterruptedException, IOException, AWTException {
			Thread.sleep(2000);
			
			FO_queueDisplayYasassiweb  token = new FO_queueDisplayYasassiweb(driver);
			token.tokenview(MRNo, URL, Queuetype, queueName, ID, Password, Site, NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO);
			}
	
	@Test(dataProvider="getData",priority=1)
	public void  QueueCall (String MRNo,String URL, String Queuetype ,String queueName,String ID , String Password, String Site,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO)throws InterruptedException, IOException, AWTException {
			Thread.sleep(2000);
			
			FO_queueDisplayYasassiweb  token = new FO_queueDisplayYasassiweb(driver);
			token.EMR(MRNo, URL, Queuetype, queueName, ID, Password, Site, NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO);
			}
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
		Thread.sleep(2000);
		
		
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("EncounterQueue");
		return data;
		}

}