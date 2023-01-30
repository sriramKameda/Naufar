package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_BillCancelandRefund_YasassiWeb;
import pagesOfYasasiiWeb.Almeswak_FullPatientRegistration_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_BillCancelandRefund_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData" , priority=0)
	public void Patreg ( String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNo,String mail,String provider,String Authoriser,String URL, String User , String Password , String site) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000); 

		Almeswak_BillCancelandRefund_YasassiWeb Bill = new Almeswak_BillCancelandRefund_YasassiWeb(driver);
		
		Bill.PatientReg(Title, myfirstname, myage, myphoneno, myhomeadd1, mydocnumber, MRNo, mail);
		
		
		
		
	}

	@Test (dataProvider = "getData" , priority=1)
	public void AdjustmentApply ( String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNo,String mail,String provider,String Authoriser,String URL, String User , String Password , String site) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000); 

		Almeswak_BillCancelandRefund_YasassiWeb Bill = new Almeswak_BillCancelandRefund_YasassiWeb(driver);
		
     	Bill.AvailedServices(provider, MRNo, Authoriser);
		
		Bill.AuthorisingRequest(URL, User, Password, site, MRNo);
		
		
		
		
	}


	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("BillCancel");
		return data;	
	} 







}
 
	
	



	
	
	
	
	
	
	
	


