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
import pagesOfYasasiiWeb.Naufer_ClosedEncounterBilling_Yasassiweb;

public class Naufer_ClosedEncounterBilling_TestCaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}
 
@Test(dataProvider="getData"  , priority=0)
public void closeEncounter(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider,String service) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufer_ClosedEncounterBilling_Yasassiweb closed = new Naufer_ClosedEncounterBilling_Yasassiweb(driver);
		
		closed.patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo);
		
		closed.encounterClosing(Provider);
		
		closed.closedEncBilling(service);
			
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

	Object[][] data =readExcel("closedEncounter");
	return data;	
}

}
