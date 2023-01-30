package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Almeswak_EMR_Dermotology_YasasiiWeb  extends PageFactoryInitYasasiiWeb {

	public Almeswak_EMR_Dermotology_YasasiiWeb(WebDriver driver) {
		super(driver);
	}  


	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement age; 

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement title;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")    
	public WebElement firstname;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement phoneno;

	@FindBy(xpath = "//span[contains(text(),' Contact Information ')]")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='personalemail']")
	public WebElement personalemail;

	@FindBy(xpath = "//span[normalize-space()='No Items Selected']")
	public WebElement preferedcommunicationid;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement docIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement docnumber;

	@FindBy(xpath = "//input[@id='issuedPlace']")
	public WebElement issuedPlace;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement IssuedDate;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[3]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement validfrom;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[1]/ki-calendar[1]/div[1]/input[1]")
	public WebElement validto;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//label[contains(@class,'check-container zero-label')]")
	public WebElement printuncheck;


	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement EpisodeIcon;

	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Encounter;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;


	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	@FindBy(xpath="//input[@id='searchtext']") 
	public WebElement SearchField;
	@FindBy(xpath="//label[@class='icon doctornote']")
	public WebElement docnote;
	@FindBy(xpath="//input[@id='chiefcomplainttext']")
	public WebElement reasonforvisit;
	@FindBy(xpath="//input[@id='emrtemplateid']")
	public WebElement template;
	@FindBy(xpath="//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement okay;
	
	
	@FindBy(xpath="/html/body/app-root/app-layout/main/app-asideleftbar/aside/div/div[2]/ul/li[4]/a/span[1]")
	public WebElement EMR;
	
	@FindBy(xpath="//span[normalize-space()='Smart Note(EMR)']")
	public WebElement Smartnote;
	
	@FindBy(xpath="//input[@id='abbreviation']")
	public WebElement SmartnoteWord;
	
	@FindBy(xpath="//textarea[@id='remarks']")
	public WebElement Remarks;
	
	@FindBy(xpath="//span[normalize-space()='Formatted Remarks']")
	public WebElement FormattedRemarks;
	
	@FindBy(xpath="//div[@role='textbox']")
	public WebElement textbox;
	
	@FindBy(xpath="//i[@class='ki ki-save']")
	public WebElement Save;
	
	@FindBy(xpath="//span[normalize-space()='EMR HomeScreen']")
	public WebElement EMRhomescreen;
	
	//History
		@FindBy(xpath="//div[@class='item-name'][contains(text(),'History / التاريخ')]")
		public WebElement history;
		//Medicalhistory
		@FindBy(xpath="//app-medical[@medicalflag='medicalhistoryFlag']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
		public WebElement Maddnew;
		@FindBy(xpath="//input[@id='diagnosis']")
		public WebElement diagnosismedical;
		@FindBy(xpath="//button[@id='addbtn']")
		public WebElement addmedical;
		///Family History
		@FindBy(xpath="//div[@class='card-body form-inputs']//app-family//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
		public WebElement familyaddnew;
		@FindBy(xpath="//input[@id='relationid']")
		public WebElement relative;
		//Surgical History
		@FindBy(xpath="//div[@class='card-body form-inputs overflow-visible']//app-surgical//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
		public WebElement surgicaladdnew;
		@FindBy(xpath="//input[@id='servicename']")
		public WebElement servicename;
		//Obsteric History
		@FindBy(xpath="//div[@class='card-body form-inputs']//app-obstetric//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
		public WebElement obsterichistory;

		@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[2]/app-obstetric[1]/div[1]/div[3]/div[1]/button[1]")
		public WebElement addobst;
		//Chemotheraphy
		@FindBy(xpath="//div[@id='chemo']//div[@class='card-body form-inputs']//app-oncology//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
		public WebElement chemoadd;
		@FindBy(xpath="//input[@id='protocol']")
		public WebElement protocol;
		@FindBy(xpath="//div[@class='form-group zero-bottom ng-star-inserted']//input[@type='text']")
		public WebElement startdate;
		@FindBy(xpath="//form[@class='ng-untouched ng-dirty ng-valid']//button[@id='addbtn']")
		public WebElement addchemo;
		//Radiation
		@FindBy(xpath="//div[@id='radiation']//div[@class='card-body form-inputs']//app-oncology//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[@class='row']//div[@class='col-md-12']//div[@class='empty-card-info md']//div//button[@type='button'][normalize-space()='Add New']")
		public WebElement Radiation;
		@FindBy(xpath="//input[@id='radiationsiteid']")
		public WebElement site1;
		@FindBy(xpath="//input[@id='treatmenttechniqueid']")
		public WebElement treatment;
		@FindBy(xpath="//div[@class='form-group zero-bottom ng-star-inserted']//input[@type='text']")
		public WebElement startdateR;
		@FindBy(xpath="//div[@class='ng-star-inserted']//button[@id='addbtn']")
		public WebElement addR;
		//Social History found
		@FindBy(xpath="//div[@class='empty-card-info md ng-star-inserted']//div//button[@type='button'][normalize-space()='Add New']")
		public WebElement addn;
		@FindBy(xpath="//div[@class='col-md-12 plt-prt-0 ta-r']//button[@id='addbtn']")
		public WebElement adds;
		//Allergy
		@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]")
		public WebElement allergytab;
		@FindBy(xpath="//input[@id='drugclassname']")
		public WebElement classname;
		@FindBy(xpath="//button[@id='drugallergyaddbtn']")
		public WebElement durgadd;
	
	
		//Vitals&Measurements
		@FindBy(xpath="/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[6]/div[2]/div")
		public WebElement vitals;
		@FindBy(xpath="//input[@id='vital000']")
		public WebElement Height;
		@FindBy(xpath="//input[@id='vital010']")
		public WebElement weight;
		//Diagnosis&plan
		@FindBy(xpath="/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[8]/div[2]/div")
		public WebElement diagnosisplan;
		
		
		@FindBy(xpath="//input[@id='db']")
		public WebElement searchdiagnosis;
	
		//Cpoe Service
		@FindBy(xpath="/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[10]/div[2]/label")
		public WebElement servicetab;
		@FindBy(xpath="//input[@id='cpoeSearchDb']")
		public WebElement searchname;	
		//CPOE Pharmacy
		@FindBy(xpath="/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[11]/div[2]/label")
		public WebElement pharmacy;
		@FindBy(xpath="//input[@placeholder='Search Medicines']")
		public WebElement pharmacysearch;
		@FindBy(xpath="//div[@class='form-group ng-star-inserted']//input[@id='duration']")
		public WebElement duration;
		@FindBy(xpath="//input[@id='durationunitid']")
		public WebElement dose;
		@FindBy(xpath="//button[@id='updatePharmacy']")
		public WebElement addpha;
		//Preview
		@FindBy(xpath="//label[@class='icon emrpreview']")
		public WebElement preview;
		//Save note
		@FindBy(xpath="//label[contains(@class,'icon emrsave')]")
		public WebElement savenote;
	
		@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-smartnotes[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
		public WebElement SmartnoteSearch;
	
	
		@FindBy(xpath = "//input[@id='middlename']")
		public WebElement middleName;
		
		@FindBy(xpath = "//input[@id='lastname']")
		public WebElement LastName;

     	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
		public WebElement PAS;
		
     	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")
    	public WebElement REmarks;
	

		@FindBy(xpath = "/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[2]/div[2]/div")
		public WebElement presentIllness;
	
	
		@FindBy(xpath = "//*[@id=\"antibioticorderingreasonid\"]")
		public WebElement orderingReason;
		
		@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
		public WebElement justification;
		
		@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy /صيدلية إدخال أوامر الطبيب على البرن')]")
		public WebElement CPOEpharm;

		@FindBy(xpath = "//input[@formcontrolname='searchText']")
		public WebElement MedicineSearch;

		@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
		public WebElement Orderingreason;

		@FindBy(xpath = "//div[@class='col-md-11']//span[@class='checkmark']")
		public WebElement diagnosischevckbox;

		@FindBy(xpath = "//label[contains(@class,'check-container ng-star-inserted')]//span[contains(@class,'checkmark')]")
		public WebElement inclinicadmin;

		@FindBy(xpath = "//button[@id='updatePharmacy']")
		public WebElement medicineAdd;	
		

		@FindBy(xpath = "//input[@id='mindose']")
		public WebElement mindose;
		
		@FindBy(xpath = "//input[@id='doseunitid']")
		public WebElement doseunit;
		

		@FindBy(xpath = "//div[@class='col-md-4']//input[@id='routeid']")
		public WebElement route;
		
		@FindBy(xpath = "//input[@id='formid']")
		public WebElement Form;
		
		@FindBy(xpath = "//input[@id='frequencyid']")
		public WebElement Frequency;

		@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='duration']")
		public WebElement Duration;
		
		@FindBy(xpath = "//input[@id='durationunitid']")
		public WebElement DurationUnit;
		
		

	public void patReg(String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String Provider,String MRNO,String DOCuser,String DOCpassword,String URL,String Site) throws InterruptedException, AWTException, IOException{

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();
		Thread.sleep(600); 

		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		
		Thread.sleep(1500);
		
		Registration.click();
	
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//img[@src='../../../assets/img/header/language-sel.png']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='English']")).click();
		Thread.sleep(1000);
		title.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'"+Title +"')]")).click();
		Thread.sleep(600);
		firstname.sendKeys(myfirstname);
		Thread.sleep(600);


		Thread.sleep(600);
		middleName.clear();
		Thread.sleep(600);
		middleName.sendKeys("AL");
		Thread.sleep(600);
		LastName.clear();
		Thread.sleep(600);
		LastName.sendKeys("mes");
		Thread.sleep(600);
		
		
		
		
		age.clear();
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		age.sendKeys(myage);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		Thread.sleep(600);
		phoneno.sendKeys(myphoneno);

		Thread.sleep(600);


		//////////////Enter contact information

		Thread.sleep(1000);
		contInformation.click();
		Thread.sleep(1000);

		preferedcommunicationid.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[@title='Phone']")).click();
		Thread.sleep(600);
		homeadd1.sendKeys(myhomeadd1);
		Thread.sleep(600);





		//////////////Enter Document information

		DocumentIdentification.click();
		Thread.sleep(1000);

		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);


		EnterAadhar.sendKeys(Keys.HOME + mydocnumber );
		Thread.sleep(600);
		issuedPlace.sendKeys("Chennai");
		Thread.sleep(600);
		/*	IssuedDate.click();

		for (int i = 0; i <=7; i++) {	

			Robot r =new Robot();
			r.keyPress(KeyEvent.VK_UP);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_UP);

		}
		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);


		validfrom.click();
		for (int i = 0; i <=3; i++) {	


			r.keyPress(KeyEvent.VK_UP);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_UP);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(600);


		validto.click();
		for (int i = 0; i <=3; i++) {	

			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(600);

		}  


		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER)  ;*/
		Thread.sleep(2000); 
		Clickadd.click();   

		Thread.sleep(1000);
		fosave.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-dialog-common//button[@aria-label='Close'][normalize-space()='No']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Close'][normalize-space()='No']")).click();


		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\AlmeswakYasassiWeb\\src\\test\\resources\\excelYasasiiWeb\\almeswaksheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(13);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(3000);   


	}


	public void encounter(String Provider,String MRNO) throws AWTException, InterruptedException {



		/////////Provider		


		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

}

	public void	DoctorNote(String MRNO,String DOCuser,String DOCpassword,String URL,String Site,String SmartNote )throws InterruptedException, AWTException {



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;
		
		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(DOCuser);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(DOCpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		
		
		
		/////Smartnote
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")));
		Thread.sleep(5000);
		Hamberger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		Smartnote.click();
		Thread.sleep(1000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='abbreviation']")));
		Thread.sleep(5000);
		SmartnoteWord.clear();
		Thread.sleep(1000);
		SmartnoteWord.sendKeys(SmartNote);
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(1000);
		FormattedRemarks.click();
		Thread.sleep(1000);
		textbox.click();
		Thread.sleep(1000);
		textbox.sendKeys("Scalp treatments unclog the hair follicles, releasing natural conditioning oils and help relieve a dry scalp and remove all those nasty dry flakes falling all over your shirt and pillow. Plus, they stimulate blood flow in the head and neck area so nutrients can better reach the scalp and nourish your hair");
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
		
		 
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		//Selecting the patient
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='dashboard-lock-arrow ki ki-chevron-up']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Lock/Unlock']")).click();
		Thread.sleep(1000);
		//Doctornote
		docnote.click();
		Thread.sleep(1000);

    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='chiefcomplainttext']")));
		Thread.sleep(1000);
		
		
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
			
			if(dynamicElement.size() !=0)
			{
				driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
			}
			  Thread.sleep(2000); 
		
		reasonforvisit.click();
		Thread.sleep(1000);
		reasonforvisit.sendKeys("Follow up");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/typeahead-container[1]/button[1]/span[1]/strong[1]")).click();
		Thread.sleep(1000);
		template.click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//li[normalize-space()='Dermatology']")).click();
		okay.click();
		Thread.sleep(1000);

	    driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		REmarks.click();
		Thread.sleep(1000);
		REmarks.sendKeys("ok");
		Thread.sleep(1000);
		
		
		
		presentIllness.click();
		Thread.sleep(1000);
		textbox.click();
		Thread.sleep(1000);
		textbox.sendKeys(SmartNote);
		Thread.sleep(1000);
		
		
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(400);
		r.keyPress(KeyEvent.VK_F2);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_F2);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		//Medical history
		history.click();
		Thread.sleep(1000);
		Maddnew.click();
		Thread.sleep(1000);
		diagnosismedical.click();
		Thread.sleep(1000);
		diagnosismedical.sendKeys("acute");
		Thread.sleep(1000);
		diagnosismedical.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/app-history[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-medical[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		addmedical.click();
		Thread.sleep(1000);
		//Family History
		familyaddnew.click();
		Thread.sleep(1000);
		diagnosismedical.click();
		Thread.sleep(1000);
		diagnosismedical.sendKeys("acute");
		Thread.sleep(1000);
		diagnosismedical.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id='listText'])[1]")).click();
		Thread.sleep(1000);
		relative.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Mother/الأم')]")).click();
		Thread.sleep(1000);
		addmedical.click();
		Thread.sleep(1000);
		//Surgical History
		surgicaladdnew.click();
		Thread.sleep(1000);
		servicename.click();
		Thread.sleep(1000);
		servicename.sendKeys("Uterus removal Surgery");
		Thread.sleep(1000);
		addmedical.click();
		Thread.sleep(1000);
	/*	//Obsteric History
		obsterichistory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Pregnant']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='LMP']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
	
		js.executeScript("arguments[0].scrollIntoView();", addobst);

		addobst.click();//button[@id='mainaddbtn']
		Thread.sleep(1000);
		//Chemotheraphy
		
		js.executeScript("arguments[0].scrollIntoView();", chemoadd);
		chemoadd.click();
		Thread.sleep(1000);
		protocol.click();
		Thread.sleep(1000);
		protocol.sendKeys("Protocol1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Protocol1']")).click();
		Thread.sleep(1000);
		startdate.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", addchemo);
		Thread.sleep(400);
		addchemo.click();
		Thread.sleep(1000);
		//Radiation
		
		js.executeScript("arguments[0].scrollIntoView();", Radiation);
		Thread.sleep(1000);
		Radiation.click();
		Thread.sleep(1000);
		site1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Brain']")).click();
		Thread.sleep(1000);
		treatment.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='3DCRT']")).click();
		Thread.sleep(1000);
		startdateR.click();
		Thread.sleep(1000);

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", addR);
		Thread.sleep(1000);
		addR.click();
		Thread.sleep(1000);
		//Social History found
		js.executeScript("arguments[0].scrollIntoView();", addn);
		Thread.sleep(1000);
		addn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Alcohol Use']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Beer']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", addn);
		Thread.sleep(1000);
		adds.click();
		Thread.sleep(1000);  */

		//Allergy
		allergytab.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='NKDA']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		classname.click();
		Thread.sleep(1000);
		classname.sendKeys("5-Aminosalicylates");
		Thread.sleep(1000);
		classname.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='5-Aminosalicylates']//div[@id='list0']")).click();
		Thread.sleep(1000);
		durgadd.click();
		Thread.sleep(1000);
		
		//Vital&Measurements
		vitals.click();
		Thread.sleep(1000);
		Height.click();
		Thread.sleep(1000);
		Height.sendKeys("165");
		Thread.sleep(1000);
		weight.click();
		Thread.sleep(1000);
		weight.sendKeys("70");


		//Diagnosis&plan
		diagnosisplan.click();
		Thread.sleep(1000);
		///driver.findElement(By.xpath("//label[@class='fav-icon']//i[@class='ki ki-favourite-fill ng-star-inserted']")).click(); //Favourite uncheck
		//Thread.sleep(1000);
	//	searchdiagnosis.click();
	//	Thread.sleep(1000);
		//searchdiagnosis.sendKeys("acute");
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);

		//CPOE Service//Procedure reporting	  
		servicetab.click();	  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='btn-service-search']//i[@class='ki ki-favourite-fill']")).click();
		Thread.sleep(1000);
		searchname.click();
		Thread.sleep(1000);
		searchname.sendKeys("active");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[2]/div[10]/div/app-cpoe-container/div/div/div[1]/div[1]/div/div/div/div[1]/app-cpoe-service-list/div/div[3]/div/div/label[2]")).click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//label[contains(text(),'Active removable appliance')]")).click();
	//	Thread.sleep(1000);
		//CPOE Pharmacy
		Thread.sleep(1000);
		CPOEpharm.click();
		Thread.sleep(1000);
		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("Abacavir");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Abacavir']")).click();
		Thread.sleep(1000);
		
		mindose.click();
		Thread.sleep(1000);
		mindose.sendKeys("2");
		Thread.sleep(1000);
		doseunit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mg']")).click();
		Thread.sleep(1000);
		route.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Eye']")).click();
		Thread.sleep(1000);
		Form.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Drops']")).click();
		Thread.sleep(1000);
		
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		Duration.clear();
		Thread.sleep(1000);
		Duration.sendKeys("2");
		Thread.sleep(1000);
		DurationUnit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
		Thread.sleep(1000);
		diagnosischevckbox.click();
		Thread.sleep(1000);
	
		medicineAdd.click();
		Thread.sleep(1000);
		//Preview
		preview.click();
		Thread.sleep(1000);
		//savenote
		savenote.click();
		Thread.sleep(2500);
	
		driver.findElement(By.xpath("//div[@class='shadow-container']//div[@class='v-action-bar']")).click();
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		Smartnote.click();
		Thread.sleep(1000);
		SmartnoteSearch.click();
		Thread.sleep(1000);
		SmartnoteSearch.sendKeys(SmartNote , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+SmartNote+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
}
