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
import pagesOfYasasiiWeb.Naufar_AppointmentView_inEMR_Yasasiiweb;

public class Naufar_AppointmentView_inEMR_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String URL ,String User , String Password , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		 
		    
		Naufar_AppointmentView_inEMR_Yasasiiweb App = new Naufar_AppointmentView_inEMR_Yasasiiweb(driver);
		
		App.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, Provider);
		
		App.Appointment(Provider);
		
}

@Test(dataProvider="getData"  , priority=1)
public void EMRapp(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String URL ,String User , String Password , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_AppointmentView_inEMR_Yasasiiweb App = new Naufar_AppointmentView_inEMR_Yasasiiweb(driver);
		
		App.EMR_Appointment(MRNo, Provider, MobNo,  User, Password, Site);   
		
		
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

	Object[][] data =readExcel("EMRAPP"); 
	return data;	
}



}
