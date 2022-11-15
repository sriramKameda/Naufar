package pagesTestCasesYasasiiWeb;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersResouceMasterYasassiiWeb;
import pagesOfYasasiiWeb.MastersResourceCategoryYasassiiWeb;


public class MastersResourceMasterTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateResMaster() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData")
public void ResMaster(String BlockName,String FloorName,String RoomName,String BedName1,String BedName2,String BedName3,String BedName4,String BedName5,String BedName6,String BedName7,String BedName8) throws InterruptedException {
		MastersResouceMasterYasassiiWeb resourcemast = new MastersResouceMasterYasassiiWeb(driver);
		resourcemast.ResourceMasterSelect();
		resourcemast.ResourceMasterBed(BlockName,FloorName,RoomName, BedName1, BedName2, BedName3, BedName4, BedName5, BedName6, BedName7, BedName8);
		}


@AfterClass
public void logout() throws Exception
{
	Thread.sleep(3000);
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception{

	Object[][] data =readExcel("ResourceMaster");
	return data;	
}



}
