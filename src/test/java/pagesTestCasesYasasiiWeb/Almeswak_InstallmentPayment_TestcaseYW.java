package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_InstallmentPayment_Yasasiiweb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_InstallmentPayment_TestcaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass() 
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData")
	public void AppointmentCheckin (String codeType , String code,String ServiceName , String BaseCategory , String SubCategory,String URL, String User ,String Password , String Site,String MRNO, String AdminUser ,String adminPassword , String ServiceDescription) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		
		Almeswak_InstallmentPayment_Yasasiiweb INS = new Almeswak_InstallmentPayment_Yasasiiweb(driver);
	
		INS.master(codeType, code, ServiceName, BaseCategory, SubCategory, ServiceDescription);
		
	   INS.TariffSetting(SubCategory, ServiceName);
	
		INS.installmenttariff(ServiceName, SubCategory);
		
		INS.Doctornote(URL, User, Password, Site, MRNO, ServiceName);  
		
		INS.Billing(URL, AdminUser, adminPassword, Site, MRNO);
		
		
	}



	@AfterClass
	public void logout() throws Exception
	{

		
		
		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("installment");
		return data;	
	} 

 


}


  

	
	
	
	
	
	
	

