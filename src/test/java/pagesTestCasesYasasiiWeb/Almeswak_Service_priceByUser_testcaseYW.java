package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_Service_priceByUser_yasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_Service_priceByUser_testcaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData" , priority=0)
	public void patreg (String codeType , String code,String ServiceName , String BaseCategory , String SubCategory,String URL, String User ,String Password , String Site , String MRNO,String Provider ,String ServiceDescription) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_Service_priceByUser_yasassiWeb pricebyuser = new Almeswak_Service_priceByUser_yasassiWeb(driver);
		
		pricebyuser.master(codeType, code, ServiceName, BaseCategory, SubCategory, ServiceDescription);

		pricebyuser.tariff(ServiceName, SubCategory);
		
		pricebyuser.Billing(URL, User, Password, Site, MRNO, ServiceName, Provider);
		
		}


	
	@AfterClass
	public void logout() throws Exception
	{
	this.hm.clickLogout();
}


	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("PriceByUser");
		return data;	
	} 
}
 


 
	
	
	
	
	
	


 


