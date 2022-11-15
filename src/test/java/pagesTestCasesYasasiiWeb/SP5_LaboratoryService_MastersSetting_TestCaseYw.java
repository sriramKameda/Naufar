package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_LaboratoryService_MastersSetting_Yasasiisweb;

public class SP5_LaboratoryService_MastersSetting_TestCaseYw extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass
	public void navigateMasterServicePage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(3000);
		
	
	}
	@Test(dataProvider="getData")
	public void addservice(String BaseCategory,String SubCategory,String ServiceName,String Profile ,String POC,String Male ,String Female,String Others,String AgeFrom ,String AgeFromUnit,String AgeTo , String AgeToUnit , String DisplayInEmr , String CodeType , String CODE ,String InternalLab, String ExecutionCategory  ,String ResultType , String ResultUnit , String Specimen ,String Container)throws InterruptedException, IOException {
		
		
		SP5_LaboratoryService_MastersSetting_Yasasiisweb Lab = new SP5_LaboratoryService_MastersSetting_Yasasiisweb(null) ;
		
		Lab.LaboratoryService(BaseCategory, SubCategory, ServiceName, Profile, POC, AgeFrom, AgeFromUnit, AgeTo, AgeToUnit, DisplayInEmr, CodeType, CODE, InternalLab, ExecutionCategory, ResultType, ResultUnit, Specimen, Container);
		
		
		
		
		
		}
		
		
	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}


	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("labService");
		return data;	
	}



	
	
	
	
	
	
	
	

}
