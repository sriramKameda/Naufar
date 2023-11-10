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
import pagesOfYasasiiWeb.Naufer_Pharmacy_Walkin_Yasasiiweb;

public class Naufer_Pharmacy_walkin_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void walkin(String outsiderName1,String PROVIDER, String MRNO1,String User , String Password , String site,String authoriser) throws InterruptedException, IOException, AWTException {
			
		
	Naufer_Pharmacy_Walkin_Yasasiiweb avail = new Naufer_Pharmacy_Walkin_Yasasiiweb(driver);
		
	
	//avail.Outsider(outsiderName1);
	
	avail.walkin(PROVIDER, MRNO1);

	avail.Availed(User, Password, site, MRNO1, authoriser);
	
	avail.AuthorisingRequest( User, Password, site, MRNO1);
	
	
	
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

	Object[][] data =readExcel("PharmacyOutsider");
	return data;	
	
}

}
