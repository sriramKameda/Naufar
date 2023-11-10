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
import pagesOfYasasiiWeb.Naufar_AdjustmentRefund_Yasassiweb;

public class Naufar_AdjustmentRefund_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateemradt() throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
		Thread.sleep(3000);

	}

	@Test(dataProvider="getData"  , priority=0)
	public void Reg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo , String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String URL ,String AUTHUser,String AUTHpassword,String DebitCard , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);


		Naufar_AdjustmentRefund_Yasassiweb Adv = new Naufar_AdjustmentRefund_Yasassiweb(driver);

		Adv.patreg(title, Name, Dob, DocID, MobNo, Address, MRNo, lastname);


	}



	@Test(dataProvider="getData"  , priority=1)
	public void AdjustRefund(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo , String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String URL ,String AUTHUser,String AUTHpassword,String DebitCard , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);


		Naufar_AdjustmentRefund_Yasassiweb Adv = new Naufar_AdjustmentRefund_Yasassiweb(driver);


		Adv.combpay(MRNo, PROVIDER, ADJAMOUNT, CARDAMOUNT, CARDNO, APPROVENO, AUTHPERSON, REMARK1, REMARK2, AUTHUser, AUTHpassword, DebitCard, Site);

		Adv.RcmRefund(MRNo, REMARK2,  AUTHUser, AUTHpassword, DebitCard, Site);

		Adv.cardmaster(MRNo, AUTHUser, AUTHpassword, DebitCard, Site);   

		Adv.MIS( AUTHUser, AUTHpassword, Site, MRNo, ADJAMOUNT);

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

		Object[][] data =readExcel("AdjRefund");
		return data;	
	}





}
