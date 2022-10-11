package pagesTestCasesYasasiiWeb;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_OrdersetFormulatory_YasassiWeb;
import pagesOfYasasiiWeb.SP5_pathology_biopsy_YasassiWeb;

public class SP5_OrdersetFormulatory_testcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("3", "KAmeda123$", "Kameda Medical Center");
	Thread.sleep(2000); 
	}

	

	@Test (dataProvider = "getData")
	public void orderset(String ORDERNAME,String URL , String User ,String Password,String sitename, String MRNO , String medicine) throws InterruptedException, IOException {
		
		
		SP5_OrdersetFormulatory_YasassiWeb os = new SP5_OrdersetFormulatory_YasassiWeb(driver);
		
		os.orderset(ORDERNAME, URL, User, Password, sitename, MRNO , medicine);
		
		
		}
	
		
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		this.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("orderset");
		return data;
		}
	
	
}


