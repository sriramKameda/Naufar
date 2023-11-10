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
import pagesOfYasasiiWeb.Naufer_nurseNote_ConsentForm_Yasasiiweb;

public class Naufer_nurseNote_ConsentForm_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;
  

@BeforeClass
public void navigateemradt() throws InterruptedException { 
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider,String URL, String User , String Password , String Site) throws InterruptedException, IOException, AWTException {
		
	Thread.sleep(2000);
		
	Naufer_nurseNote_ConsentForm_Yasasiiweb con = new Naufer_nurseNote_ConsentForm_Yasasiiweb(driver);
		
	con.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, provider);
	
			}

@Test(dataProvider="getData"  , priority=1)
public void nursenote(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider,String URL, String User , String Password , String Site) throws InterruptedException, IOException, AWTException {
		
	Thread.sleep(2000);
		
	Naufer_nurseNote_ConsentForm_Yasasiiweb con = new Naufer_nurseNote_ConsentForm_Yasasiiweb(driver);
		
	con.NurseNote(URL, User, Password, Site, MRNo);           

			
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

	Object[][] data =readExcel("NurseNote");
	
	return data;	
}




}
