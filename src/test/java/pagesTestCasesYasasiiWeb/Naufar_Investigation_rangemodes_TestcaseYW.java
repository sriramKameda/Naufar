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
import pagesOfYasasiiWeb.Naufar_Investigation_rangemodes_YasasiiWeb;

public class Naufar_Investigation_rangemodes_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	 
}

@Test(dataProvider="getData"  , priority=0)
public void encounter_Billing(String title,String Name,String lastname, String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider,String service1,String service2,String service3,String URL,String User,String password,String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_Investigation_rangemodes_YasasiiWeb INV = new Naufar_Investigation_rangemodes_YasasiiWeb(driver);
		
		INV.patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo);
		
		INV.encounter(Provider, service1, service2, service3);
		
	
		
}

@Test(dataProvider="getData"  , priority=1)
public void investigation(String title,String Name,String lastname, String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider,String service1,String service2,String service3,String URL,String User,String password,String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_Investigation_rangemodes_YasasiiWeb INV = new Naufar_Investigation_rangemodes_YasasiiWeb(driver);
		
		
		INV.investigation(URL, User, password, Site, MRNo);
		
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

	Object[][] data =readExcel("investigation");
	return data;	
}


}
