package pagesTestCasesYasasiiWeb;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_Careteam_YasasiiWeb;
import pagesOfYasasiiWeb.SP5_GroupTheraphy_YasasiiWeb;

public class SP5_GroupTheraphy_TestCaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void Master() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
		Thread.sleep(3000);



	}



	@Test(dataProvider="getData")
	public void groupTheraphy(String GroupIncharge , String GroupCalender , String Groupprogram, String resource ,  String MRNO1,String MRNO2 , String MRNO3 , String MRNO4 ,String groupname ) throws Exception {
		Thread.sleep(2000);



		SP5_GroupTheraphy_YasasiiWeb grp =new SP5_GroupTheraphy_YasasiiWeb(driver);

            grp.mastersSetting(GroupIncharge, GroupCalender, Groupprogram, resource);

            grp.groupCreation(groupname, MRNO1, MRNO2, MRNO3, MRNO4, GroupCalender, Groupprogram);


}

	

	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	}
	
	
	
	
	
	
	@DataProvider
	public Object[][] getData() throws Exception {

		Object[][] data = readExcel("GroupTheraphy");
		return data;
	}



}
















