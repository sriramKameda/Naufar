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
import pagesOfYasasiiWeb.Naufar_GroupTheraphy_YasassiWeb;




public class Naufar_GroupTheraphy_Testcase extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}
 
@Test(dataProvider="getData"  , priority=0)
public void GroupCreation(String GroupIncharge , String GroupCalender , String Groupprogram, String resource, String MRNO1,String MRNO2 , String MRNO3 , String MRNO4 ,String groupname,String User,String URL ,String password,String Site ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_GroupTheraphy_YasassiWeb group = new Naufar_GroupTheraphy_YasassiWeb(driver);
		
		group.mastersSetting(GroupIncharge, GroupCalender, Groupprogram, resource);
		
	    group.groupCreation(groupname, MRNO1, MRNO2, MRNO3, MRNO4, GroupCalender, Groupprogram);
		
	
			}


@Test(dataProvider="getData"  , priority=1)
public void GroupNote(String GroupIncharge , String GroupCalender , String Groupprogram, String resource, String MRNO1,String MRNO2 , String MRNO3 , String MRNO4 ,String groupname,String User,String URL ,String password,String Site ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_GroupTheraphy_YasassiWeb group = new Naufar_GroupTheraphy_YasassiWeb(driver);
		
	
		group.GroupNote(User, password, Site, groupname);
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

	Object[][] data =readExcel("GroupTheraphy");
	return data;	
}

}



