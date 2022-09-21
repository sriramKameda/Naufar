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

	@Test(dataProvider = "getData")
	public void inventoryFlow(String Subloc ,String refCode , String BAtchno,String IndGrpName, String MRNo , String MRNo1, String PatcloseNo, String invCloseNo, String supplierCode, String SuppName) throws InterruptedException, IOException, AWTException {

		SP5_InventoryYasasiiWeb INV = new  SP5_InventoryYasasiiWeb(driver);

		INV.InventoryHome();
		INV.subLocation( Subloc, refCode ); 
		INV.Stockview();
		INV.StockMovement(BAtchno);
		INV.indentGroup(IndGrpName);
		INV.InventoryIndednt(IndGrpName);
		INV.indentClosed(IndGrpName);
		INV.patientIndent( MRNo ,  MRNo1);
		INV.patientIndentClosed( MRNo ,  MRNo1);
		
	}

	@Test(dataProvider = "getData")
	public void inventoryFlow1(String Subloc ,String refCode , String BAtchno,String IndGrpName, String MRNo , String MRNo1, String PatcloseNo, String invCloseNo, String supplierCode, String SuppName) throws InterruptedException, IOException, AWTException {

		SP5_InventoryYasasiiWeb INV = new  SP5_InventoryYasasiiWeb(driver);
	
		INV.closedIndent(PatcloseNo ,invCloseNo);
		INV.supplierCreation( SuppName ,supplierCode);
	}
	
	

	@AfterClass
	public void logout() throws Exception
	{
		
		
		this.hm.clickLogout();

	}

		@DataProvider
		public Object[][] getData() throws Exception{
	
			Object[][] data =readExcel("Inventory");
			return data;
			}
		


}
