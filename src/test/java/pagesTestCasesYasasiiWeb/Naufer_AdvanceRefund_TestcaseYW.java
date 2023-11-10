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
import pagesOfYasasiiWeb.Naufer_AdvanceRefund_YasassiWeb;
import pagesOfYasasiiWeb.Naufer_BillCancelandRefund_YasassiWeb;

public class Naufer_AdvanceRefund_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String title,String Name,String lastname , String Dob, String DocID, String MobNo,String Address,String MRNo,String PROVIDER ,String service,String authorisername , String remarks ,String URL , String AUTHUser, String AUTHpassword,String Site,String service1 , String service2) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufer_AdvanceRefund_YasassiWeb Adv = new Naufer_AdvanceRefund_YasassiWeb(driver);
		
		Adv.patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo);
			
			}



@Test(dataProvider="getData"  , priority=1)
public void billCancel(String title,String Name,String lastname , String Dob, String DocID, String MobNo,String Address,String MRNo,String PROVIDER ,String service,String authorisername , String remarks ,String URL , String AUTHUser, String AUTHpassword,String Site,String service1 , String service2) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
      Naufer_AdvanceRefund_YasassiWeb Adv = new Naufer_AdvanceRefund_YasassiWeb(driver);
		
		
		Adv.advance(PROVIDER, service, service1, service2);
		
		Adv.advanceview(authorisername, remarks, AUTHUser, AUTHpassword, Site, MRNo);
			
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

	Object[][] data =readExcel("advance");
	return data;	
}



	

}
