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
import pagesOfYasasiiWeb.Naufer_MedicineAdmin_VisitSummary_YasasiWeb;

public class Naufer_MedicineAdmin_VisitSummary_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;

 
@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void patientReg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String URL ,String DOCuser ,String DOCpassword,String Site,String servicecountInEMR ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufer_MedicineAdmin_VisitSummary_YasasiWeb cpoe = new Naufer_MedicineAdmin_VisitSummary_YasasiWeb(driver);
		
		cpoe.Patreg(title, Name, lastname, Dob, DocID, MobNo, Address, MRNo, Provider, ADTprovider);
		
		cpoe.ADT(ADTprovider);
		}

@Test(dataProvider="getData"  , priority=1)
public void CPOE(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String URL ,String DOCuser ,String DOCpassword,String Site,String servicecountInEMR) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufer_MedicineAdmin_VisitSummary_YasasiWeb cpoe = new Naufer_MedicineAdmin_VisitSummary_YasasiWeb(driver);
		
		cpoe.DoctorNote(DOCuser, DOCpassword,  Site, MRNo, ADTprovider);
		
		cpoe.CPOEAdministration();
		
		}
@Test(dataProvider="getData"  , priority=2)
public void MIS(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider, String URL ,String DOCuser ,String DOCpassword,String Site,String servicecountInEMR) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufer_MedicineAdmin_VisitSummary_YasasiWeb cpoe = new Naufer_MedicineAdmin_VisitSummary_YasasiWeb(driver);
		
		cpoe.MIS( DOCuser, DOCpassword, Site, MRNo, servicecountInEMR);
		
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

	Object[][] data =readExcel("cpoe");
	return data;	
}



}
