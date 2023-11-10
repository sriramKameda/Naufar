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
import pagesOfYasasiiWeb.Naufer_FO_ADTactivities_Yasasiiweb;
import pagesOfYasasiiWeb.Naufer_nursingStationTransfer_YasassiWeb;

public class Naufer_FO_ADTactivities_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void BirthReg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String URL ,String DOCuser ,String DOCpassword,String Site,String nurseUser , String  NursePassword ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufer_FO_ADTactivities_Yasasiiweb ADT = new Naufer_FO_ADTactivities_Yasasiiweb(driver);
		
		
		ADT.Patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo, Provider, ADTprovider);
		
		ADT.ADT(ADTprovider);
	
		
		}

@Test(dataProvider="getData"  , priority=1)
public void EMRtransfer(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String URL ,String DOCuser ,String DOCpassword,String Site,String nurseUser , String  NursePassword ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufer_FO_ADTactivities_Yasasiiweb ADT = new Naufer_FO_ADTactivities_Yasasiiweb(driver);
		
	 	ADT.DoctorNote(DOCuser, DOCpassword,  Site, MRNo, DocID);
		
		ADT.dischargeApproval(MRNo, nurseUser, NursePassword, Site);  
		
	//	ADT.laboratoryClearance(MRNo, NursePassword, nurseUser, URL, Site); 
		 
		ADT.ADTAppoval(MRNo);   
		
		ADT.homeleaveCancel();  
		
		ADT.FinancialClearance(MRNo, nurseUser, NursePassword, Site);
		
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

	Object[][] data =readExcel("ADT");
	return data;	
}

}
