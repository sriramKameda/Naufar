package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_MergedPatient_YasassiWeb;
import pagesOfYasasiiWeb.Almeswak_outsider_patientFlow_YasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_outsider_patientFlow_TestCaseYW   extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData" , priority=0)
	public void patreg (String Title , String NAME , String DOB , String MBLNO ,String Provider,String MRNO,String DOCno,String service) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_outsider_patientFlow_YasasiiWeb outsider = new Almeswak_outsider_patientFlow_YasasiiWeb(driver);
		
		outsider.Patreg(Title, NAME, DOB, MBLNO);

		
	
		
	
	}


	@Test (dataProvider = "getData" ,  priority=1)
	public void merged (String Title , String NAME , String DOB , String MBLNO ,String Provider,String MRNO,String DOCno,String service) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_outsider_patientFlow_YasasiiWeb outsider1 = new Almeswak_outsider_patientFlow_YasasiiWeb(driver);
	
		outsider1.Appointment(NAME, Provider, MRNO, DOCno,service);
		
	
		
	
	}
	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Outsider");
		return data;	
	} 

 



}
