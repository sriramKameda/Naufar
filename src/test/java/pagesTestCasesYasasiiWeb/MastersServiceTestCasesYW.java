package pagesTestCasesYasasiiWeb;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.baseYasasiiWeb.TestBaseYasasiiWeb;
import pagesOfYasasiiWeb.FOEncounterYasasiiWeb;
import pagesOfYasasiiWeb.FORegEditYasasiiWeb;
import pagesOfYasasiiWeb.FORegistrationYasasiiWeb;
import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.MastersServiceYasasiiWeb;


	public class MastersServiceTestCasesYW extends TestBaseYasasiiWeb{
		public static LoginPageYasasiiWeb login;
		public static HomePageYasasiiWeb hm;
		
		
		@BeforeClass
		public void navigateMasterServicePage() throws InterruptedException {
			
		this.login =new LoginPageYasasiiWeb(driver) ;
		this.hm = login.enterloginDetails("admin", "kameda321", "Kameda Medical Center");
		Thread.sleep(3000);
			
		
		}
		@Test(dataProvider="getData")
		public void addservice(String BaseCategory,String SubCategory,String ServiceName,String Profile ,String POC,String Male ,String Female,String Others,String AgeFrom ,String AgeFromUnit,String AgeTo , String AgeToUnit , String DisplayInEmr , String CodeType , String CODE ,String InternalLab, String ExecutionCategory  ,String ResultType , String ResultUnit , String Specimen ,String Container,String RangeMode1 ,String RangeMode2 , String NormalAgeFrom,String NormalAgeFromUnit,String NormalAgeTo,String NormalAgeToUnit,String Comparision,String CriticalAgeFrom,String CriticalAgeFromUnit,String CriticalAgeTo,String CriticalAgeToUnit,String NormalMin ,String NormalMax, String CriticalMin ,String CiticalMax, String subtest1,String subtest2,String subtest3,String subtest4)throws InterruptedException, IOException {
			MastersServiceYasasiiWeb servicename = new MastersServiceYasasiiWeb(driver) ;
			servicename.LaboratoryService(BaseCategory, SubCategory, ServiceName, Profile, POC, AgeFrom, AgeFromUnit, AgeTo, AgeToUnit, DisplayInEmr, CodeType, CODE, InternalLab, ExecutionCategory, ResultType, ResultUnit, Specimen, Container, RangeMode1, RangeMode2, NormalAgeFrom, NormalAgeFromUnit, NormalAgeTo, NormalAgeToUnit, Comparision, NormalMin, NormalMax, CriticalAgeFrom, CriticalAgeFromUnit, CriticalAgeTo, CriticalAgeToUnit, CriticalMin, CiticalMax, subtest1, subtest2, subtest3, subtest4);
			
		}
			
			
		@AfterClass
		public void logout() throws Exception
		{
			this.hm.clickLogout();
		}


		@DataProvider
		public Object[][] getData() throws Exception{

			Object[][] data =readExcel("labService");
			return data;	
		}


}
