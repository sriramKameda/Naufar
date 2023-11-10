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
import pagesOfYasasiiWeb.Naufer_PharmacyBilling_RecomennedDose_Substitute_YasasiiWeb;


public class Naufer_PharmacyBilling_RecomennedDose_Substitute_TestcaseYW    extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String title,String Name,String Lastname ,String Dob, String DocID, String MobNo,String Address,String MRNo , String PROVIDER, String CHEIFCOMPLAINT , String MEDICINE,String id, String docpassword , String Site ,String AdminID, String AdminPassword,String URL) throws InterruptedException, IOException, AWTException {
		
	Thread.sleep(2000);
		
    Naufer_PharmacyBilling_RecomennedDose_Substitute_YasasiiWeb subs = new Naufer_PharmacyBilling_RecomennedDose_Substitute_YasasiiWeb(driver);
		
	subs.patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, PROVIDER);	

	}



@Test(dataProvider="getData"  , priority=1)

public void AdjustRefund(String title,String Name,String Lastname ,String Dob, String DocID, String MobNo,String Address,String MRNo , String PROVIDER, String CHEIFCOMPLAINT , String MEDICINE,String id, String docpassword , String Site ,String AdminID, String AdminPassword,String URL) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
     
		Naufer_PharmacyBilling_RecomennedDose_Substitute_YasasiiWeb subs = new Naufer_PharmacyBilling_RecomennedDose_Substitute_YasasiiWeb(driver);
		
		subs.pharmacybill(MRNo, PROVIDER, CHEIFCOMPLAINT, MEDICINE, id, docpassword, Site, AdminID, AdminPassword);
		
		subs.pharmacyBilling(AdminID, AdminPassword, Site, MRNo, URL);
		
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

	Object[][] data =readExcel("PharmacySubstitute");
	return data;	
}


}
