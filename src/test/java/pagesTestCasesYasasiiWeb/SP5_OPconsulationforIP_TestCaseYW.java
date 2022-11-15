package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_DialysisNote_yasasiiWeb;
import pagesOfYasasiiWeb.SP5_OPconsulationforIP_yasassiWeb;

public class SP5_OPconsulationforIP_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(3000); 
	}
	
	
	
	@Test (dataProvider = "getData", priority=0)
	public void PAtreg(String Name,String AadharNumber,String MRNo,String Provider ,String ADTprovider ) throws InterruptedException, IOException {
		
		Thread.sleep(3000);
		
		SP5_OPconsulationforIP_yasassiWeb   cons= new SP5_OPconsulationforIP_yasassiWeb (driver);
	  
		cons.patreg(Name, AadharNumber, MRNo, Provider, ADTprovider);
	
		
	
	}
	
	@Test (dataProvider = "getData",priority=1)
	public void DialysisNote(String Name,String AadharNumber,String MRNo,String Provider ,String ADTprovider ) throws InterruptedException, IOException {
		
		Thread.sleep(3000); 
		SP5_OPconsulationforIP_yasassiWeb   opc = new SP5_OPconsulationforIP_yasassiWeb (driver);
		
		opc.opConsult( MRNo,Provider);
		
	opc.AvailedServiceFilt(Provider);
		
			}
	
	
	
	@AfterClass
	public void logout() throws Exception
	{
	
		this.hm.clickLogout();
	
	}
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("OPconsult");
		return data;	
	}
	
	
	 

	


}
