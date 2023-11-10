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
import pagesOfYasasiiWeb.Naufar_EMRBlockandFreeze_YasasiiWeb;
import pagesOfYasasiiWeb.Naufar_WhiteboardStat_yasasiiweb;

public class Naufar_WhiteboardStat_TestCaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("100435","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData" , priority=0)
public void EMRBlock(String MRNo,String nurseUser,String password,String URL,String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_WhiteboardStat_yasasiiweb Stat = new Naufar_WhiteboardStat_yasasiiweb(driver);
		
		Stat.DoctorReferral(MRNo);
		
		Stat.Whiteboard(MRNo, URL, nurseUser, password, Site);
		
		Stat.roomstatus(nurseUser,password);
		
		
		
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

	Object[][] data =readExcel("Stat");
	return data;	

 


}

}
