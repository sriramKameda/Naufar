package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_Careteam_YasasiiWeb;

public class SP5_Careteam_TestCaseYW   extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void Master() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
		Thread.sleep(3000);



	}



	@Test(dataProvider="getData")
	public void careteam(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String MRNO , String CareTeamName ,  String PROVIDER) throws Exception {
		Thread.sleep(2000);



		SP5_Careteam_YasasiiWeb care =new SP5_Careteam_YasasiiWeb(driver);

		care.mastersSetting(CareTeamName);
		
		
		care.REgister(NAME, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, CareTeamName, MRNO, PROVIDER);



}

	@Test(dataProvider="getData")
	public void careteam1(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String MRNO , String CareTeamName , String PROVIDER) throws Exception {
		Thread.sleep(2000);



		SP5_Careteam_YasasiiWeb care =new SP5_Careteam_YasasiiWeb(driver);

		care.appointment(CareTeamName, MRNO);

		care.patientcard();


}

	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	
	
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("careTeam");
		return data;
	}


}















