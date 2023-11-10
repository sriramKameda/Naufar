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
import pagesOfYasasiiWeb.Naufer_nursingStationTransfer_YasassiWeb;

public class Naufer_nursingStationTransfer_Testcase extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "Naufar Center");
	Thread.sleep(3000);
	
}
@Test(dataProvider="getData"  , priority=0)
public void BirthReg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String URL ,String User , String Password , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufer_nursingStationTransfer_YasassiWeb trans = new Naufer_nursingStationTransfer_YasassiWeb(driver);
		
		trans.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, Provider, ADTprovider);
		
	
		
		}

@Test(dataProvider="getData"  , priority=1)
public void EMRtransfer(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String URL ,String User , String Password , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufer_nursingStationTransfer_YasassiWeb trans = new Naufer_nursingStationTransfer_YasassiWeb(driver);
		
		
		trans.Appointment(MRNo, ADTprovider);//
		
		trans.ADT(ADTprovider);
		
		trans.transfer(MRNo, URL, User, Password, Site);
		
		trans.PateintStatusEdit(MRNo);
		
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

	Object[][] data =readExcel("nurseTransfer");
	return data;	
}



	

}
