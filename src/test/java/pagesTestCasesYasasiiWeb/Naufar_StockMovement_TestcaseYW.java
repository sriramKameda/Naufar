package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.Naufar_Inventory_yasasiiweb;

public class Naufar_StockMovement_TestcaseYW extends TestBaseYasasiiWeb  { 
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
		Thread.sleep(3000);

	}


	@Test(dataProvider="getData"  , priority=0)
	public void EMRapp(String Supplier,String Sublocation , String MRNo,String IndGroupName,String GRNNO,String BatchNo, String DOB,String closeIndentNO) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufar_Inventory_yasasiiweb INVstock = new Naufar_Inventory_yasasiiweb(driver);

		INVstock.InventoryHome();

		INVstock.StockGRN(GRNNO , BatchNo ,DOB);

		INVstock.StockUpdate();
		
		INVstock.Stockview();
	
		INVstock.StockMovement();  
 

	}


	@Test(dataProvider="getData"  , priority=1)
	public void closedIndent(String Supplier,String Sublocation , String MRNo,String IndGroupName,String GRNNO,String BatchNo,String DOB,String closeIndentNO) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufar_Inventory_yasasiiweb INV = new Naufar_Inventory_yasasiiweb(driver);

		INV.PatientIndentForClose(MRNo);
		
		INV.closeIndent(closeIndentNO);

		INV.IndentGroup(IndGroupName);

	}
	
	
	@AfterClass
	public void logout() throws Exception
	{

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		this.hm.clickLogout();
		
	}

	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("Inventory");
		return data;	


	}




}
