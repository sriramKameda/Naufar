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
import pagesOfYasasiiWeb.Naufar_CpoePendingOrder_Billing_Yasasiiweb;

public class Naufar_CpoePendingOrder_Billing_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void PatientReg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String DOCuser ,String DOCpassword,String URL , String Site ,String adminuser,String adminpassword ) throws InterruptedException, IOException, AWTException {
			
		
	Naufar_CpoePendingOrder_Billing_Yasasiiweb cpoe = new Naufar_CpoePendingOrder_Billing_Yasasiiweb(driver);
		
	cpoe.Patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo, Provider);
	
	
}
@Test(dataProvider="getData"  , priority=1)
public void CpoePending(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String DOCuser ,String DOCpassword,String URL , String Site ,String adminuser,String adminpassword ) throws InterruptedException, IOException, AWTException {
			
		
	Naufar_CpoePendingOrder_Billing_Yasasiiweb serv = new Naufar_CpoePendingOrder_Billing_Yasasiiweb(driver);
	
	serv.DoctorNote(DOCuser, DOCpassword,  Site, MRNo);
	
	serv.CPOEOrderStatus(adminuser, adminpassword, Site, MRNo);
	
	serv.serviceExecution(DOCuser, DOCpassword,  Site, MRNo);
	
	serv.OrderBilling(adminuser, adminpassword, Site, MRNo);
	
	
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

	Object[][] data =readExcel("CpoePending");
	return data;	
	
}




}
