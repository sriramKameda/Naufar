package pagesTestCasesYasasiiWeb;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Sp5_EMR_FamilyMembersYasasiiWeb;




public class Sp5_EMR_FamilyMembersTestCaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	Sp5_EMR_FamilyMembersTestCaseYW.login =new LoginPageYasasiiWeb(driver) ;
	Sp5_EMR_FamilyMembersTestCaseYW.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(2000); 
	}
	
	@Test (dataProvider = "getData" ,priority=0)
	public void familyM(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String FM1,String FM2,String FM3,String FM4,String FM5,String PROVIDER,String URL, String User , String Password , String site) throws InterruptedException, IOException {
		
		
		Sp5_EMR_FamilyMembersYasasiiWeb fm22 =new Sp5_EMR_FamilyMembersYasasiiWeb(driver);
		
		fm22.familyM(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO,FM1,FM2,FM3,FM4,FM5,PROVIDER);
		
	
		
		}
	
	@Test (dataProvider = "getData",priority=1)
	public void emrf(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String FM1,String FM2,String FM3,String FM4,String FM5,String PROVIDER,String URL, String User , String Password , String site) throws InterruptedException, IOException {
		
		
		Sp5_EMR_FamilyMembersYasasiiWeb fm22 =new Sp5_EMR_FamilyMembersYasasiiWeb(driver);
		
		
		fm22.emrf(URL, User, Password, site, MRNO);
		
		
		}
	
	@AfterClass
	public void logout() throws Exception
	{
		
		Thread.sleep(2000);
		Sp5_EMR_FamilyMembersTestCaseYW.hm.clickLogout();
		
	}
	
	
	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("EMRFamilymember");
		return data;
		}
	
	
}

	


