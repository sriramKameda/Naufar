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
import pagesOfYasasiiWeb.Naufar_MergedMRNO_yasasiiWeb;

public class Naufar_MergedMRNO_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String Title, String NAME ,String lastName, String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNO ,String Provider ,String MBLNO2 , String DOCno2,String URL, String User , String Password , String site, String SERVICE,String MRNO2,String NAme2,String lastName2) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_MergedMRNO_yasasiiWeb merged = new Naufar_MergedMRNO_yasasiiWeb(driver);
		
		merged.patReg(Title, NAME, lastName, DOB, MBLNO, ADDRESS, DOCno, MRNO2, Provider, MBLNO2, DOCno2, NAme2, lastName2);
		 
		
		 
}

@Test(dataProvider="getData"  , priority=0)
public void merged(String Title, String NAME ,String lastName, String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNO ,String Provider ,String MBLNO2 , String DOCno2,String URL, String User , String Password , String site, String SERVICE,String MRNO2,String NAme2,String lastName2) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_MergedMRNO_yasasiiWeb merged = new Naufar_MergedMRNO_yasasiiWeb(driver);
		
		merged.docnote( User, Password, site, MRNO, SERVICE);
		
		merged.merge(site, DOCno2, MRNO, MRNO2, User, Password);
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

	Object[][] data =readExcel("merged");
	return data;	

 


}

}
