package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.SP5_InventoryYasasiiWeb;


public class SP5_InventoryTestCase  extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;
	
	
	@BeforeClass()
	public void navigateFOPage() throws InterruptedException {
		
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","kameda321","Kameda Medical Center");  
	Thread.sleep(2000); 
	}

	@Test // (dataProvider = "getData")
	public void inventoryFlow() throws InterruptedException, IOException, AWTException {
		
		 SP5_InventoryYasasiiWeb INV = new  SP5_InventoryYasasiiWeb(driver);
		
		INV.InventoryHome();
		// INV.subLocation(); 
		// INV.Stockview();
		// INV.StockMovement();
		 INV.indentGroup();
		}
	
	

	@AfterClass
	public void logout() throws Exception
	{
		this.hm.clickLogout();
	
	}

//	@DataProvider
//	public Object[][] getData() throws Exception{
//
//		Object[][] data =readExcel("Inventory");
//		return data;
//		}
//	


}
