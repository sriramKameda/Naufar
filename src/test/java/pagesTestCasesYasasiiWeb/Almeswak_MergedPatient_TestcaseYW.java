package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_MergedPatient_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_MergedPatient_TestcaseYW  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Adwaa Alyasameen");
		Thread.sleep(3000); 
	}

	@Test (dataProvider = "getData" , priority=0)
	public void patreg (String Title , String NAME , String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNO ,String Provider ,String MBLNO2 , String DOCno2 ,String URL, String User , String Password , String site, String SERVICE,String MRNO2,String NAme2) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_MergedPatient_YasassiWeb merge = new Almeswak_MergedPatient_YasassiWeb(driver);
		
		merge.patReg(Title, NAME, DOB, MBLNO, ADDRESS, DOCno, MRNO, Provider, MBLNO2, DOCno2,NAme2);

	  
	
		
	
	}


	@Test (dataProvider = "getData" ,  priority=1)
	public void merged (String Title , String NAME , String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNO ,String Provider ,String MBLNO2 , String DOCno2 ,String URL, String User , String Password , String site, String SERVICE,String MRNO2,String NAme2) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_MergedPatient_YasassiWeb merge = new Almeswak_MergedPatient_YasassiWeb(driver);
	

		merge.docnote(URL, User, Password, site, MRNO, SERVICE);
		
		merge.merge(site, DOCno2, MRNO, MRNO2, URL, User, Password);
	
		
	
	}
	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("merged");
		return data;	
	} 
}
 


 
	
	
	
	
	
	


