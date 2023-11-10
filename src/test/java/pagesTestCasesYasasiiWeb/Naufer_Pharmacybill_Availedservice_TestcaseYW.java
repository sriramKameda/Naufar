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
import pagesOfYasasiiWeb.Naufer_Pharmacybill_Availedservice_Yasasiiweb;

public class Naufer_Pharmacybill_Availedservice_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void walkin(String PROVIDER, String MRNO , String filepath,String URL, String User , String Password , String site,String Authoriser) throws InterruptedException, IOException, AWTException {
			
		
	Naufer_Pharmacybill_Availedservice_Yasasiiweb avail = new Naufer_Pharmacybill_Availedservice_Yasasiiweb(driver);
		
		avail.walkin(PROVIDER, MRNO, filepath);
		
		

}

@Test(dataProvider="getData"  , priority=1)
public void walkin1(String PROVIDER, String MRNO , String filepath,String URL, String User , String Password , String site,String Authoriser) throws InterruptedException, IOException, AWTException {
			
		
	Naufer_Pharmacybill_Availedservice_Yasasiiweb avail = new Naufer_Pharmacybill_Availedservice_Yasasiiweb(driver);
		
	avail.Availed(User, Password, site, MRNO, Authoriser, URL);
		
		avail.AuthorisingRequest(URL, User, Password, site, MRNO);

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

	Object[][] data =readExcel("PharmacybillAvailed");
	return data;	
	
}


}
