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
import pagesOfYasasiiWeb.Naufar_IPFinalbilling_yasasiiweb;
import pagesOfYasasiiWeb.Naufar_interimIncoice_IP_yasasiiweb;

public class Naufar_IPFinalbilling_TestcaseYW   extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
		Thread.sleep(3000);

	}

	  @Test(dataProvider="getData"  , priority=0)
	public void Reg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNO,String provider,String  ADTprovider,String service1,String service2,String service3,String docid,String docpassword,String Site,String adminid,String adminpassword , String nurseUser , String  NursePassword ,String URL,String authoriser  ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		Naufar_IPFinalbilling_yasasiiweb IPfinal = new Naufar_IPFinalbilling_yasasiiweb(driver);

		IPfinal.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNO, ADTprovider);

		IPfinal.ADT(ADTprovider);

		IPfinal.Billing(ADTprovider, service1, service2, service3);



	}

	@Test(dataProvider="getData"  , priority=1)
	public void finalbilling(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNO,String provider,String  ADTprovider,String service1,String service2,String service3,String docid,String docpassword,String Site,String adminid,String adminpassword , String nurseUser , String  NursePassword ,String URL,String authoriser  ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);

		Naufar_IPFinalbilling_yasasiiweb IPfinal = new Naufar_IPFinalbilling_yasasiiweb(driver);

		IPfinal.doctoreNote(docid, docpassword, Site, MRNO);

		IPfinal.PharmacyBilling(MRNO, ADTprovider, adminid, adminpassword, Site);

		IPfinal.dischargeApproval(MRNO, nurseUser, NursePassword, Site);

		//	IPfinal.laboratoryClearance(MRNO, NursePassword, nurseUser, URL, Site, adminid, adminpassword);

		IPfinal.ADTAppoval(MRNO, Site, adminid, adminpassword);

		IPfinal.FinalBilling( adminid, adminpassword, Site, MRNO, authoriser);


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

		Object[][] data =readExcel("IP_invoice");

		return data;	
	}



}
