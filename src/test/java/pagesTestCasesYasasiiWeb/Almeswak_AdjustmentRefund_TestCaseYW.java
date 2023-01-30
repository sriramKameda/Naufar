package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.Almeswak_AdjustmentRefund_yasassiWeb;
import pagesOfYasasiiWeb.Almeswak_BillCancelandRefund_YasassiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class Almeswak_AdjustmentRefund_TestCaseYW extends TestBaseYasasiiWeb{
	
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;

 
	@BeforeClass()
	public void navigateFOPage(  ) throws InterruptedException {

		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "KAmeda123$", "Almeswak Academy");
		Thread.sleep(3000); 
	}
	
	@Test (dataProvider = "getData", priority=0)
	public void Patreg (String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNo,String mail, String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String URL ,String AUTHUser,String AUTHpassword,String DebitCard,String Site) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_AdjustmentRefund_yasassiWeb adj = new Almeswak_AdjustmentRefund_yasassiWeb(driver);

		adj.patReg(Title, myfirstname, myage, myphoneno, myhomeadd1, mydocnumber, MRNo, mail);
		
		}

	@Test (dataProvider = "getData" , priority=1)
	public void Adjustment (String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNo,String mail, String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String URL ,String AUTHUser,String AUTHpassword,String DebitCard,String Site) throws InterruptedException, IOException, AWTException {
                                                     
		Thread.sleep(2000); 

		Almeswak_AdjustmentRefund_yasassiWeb adj = new Almeswak_AdjustmentRefund_yasassiWeb(driver);

	
		adj.combpay(MRNo, PROVIDER, ADJAMOUNT, CARDAMOUNT, CARDNO, APPROVENO, AUTHPERSON, REMARK1, REMARK2, URL, AUTHUser, AUTHpassword, DebitCard,Site);
		
		
		
		
	}

	@AfterClass
	public void logout() throws Exception
	{

		this.hm.clickLogout();

	}



	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("adjustment");
		return data;	
	} 





}
