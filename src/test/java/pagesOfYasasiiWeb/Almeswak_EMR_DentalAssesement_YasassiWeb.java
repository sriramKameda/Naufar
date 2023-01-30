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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Almeswak_EMR_DentalAssesement_YasassiWeb extends PageFactoryInitYasasiiWeb {

	public Almeswak_EMR_DentalAssesement_YasassiWeb(WebDriver driver) {
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
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/app-dental-examination[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/label[1]/label[1]")
	public WebElement diag;	
	@FindBy(xpath="//label[@for='dental_examination_header_1']")
	public WebElement treat;
	@FindBy(xpath="//div[@class='item-right']//button[@type='button'][normalize-space()='Add']")
	public WebElement adddental;
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

	@FindBy(xpath="//button[@id='mainaddbtn']")
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
	@FindBy(xpath="    //div[@class='col-md-12 plt-prt-0 ta-r']//button[@id='addbtn']")
	public WebElement adds;
	//Allergy
	@FindBy(xpath="/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[5]/div[2]/div")
	public WebElement allergytab;
	@FindBy(xpath="//input[@id='drugclassname']")
	public WebElement classname;
	@FindBy(xpath="//button[@id='drugallergyaddbtn']")
	public WebElement durgadd;
	///Clinicalwarning
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[6]/div[2]/div[1]")
	public WebElement clinical;
	//Vitals&Measurements
	@FindBy(xpath="/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[1]/div[2]/div[7]/div[2]/div")
	public WebElement vitals;
	@FindBy(xpath="//input[@id='vital000']")
	public WebElement Height;
	@FindBy(xpath="//input[@id='vital010']")
	public WebElement weight;
	//Diagnosis&plan
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[9]/div[2]/div[1]")
	public WebElement diagnosisplan;
	@FindBy(xpath="//input[@id='db']")
	public WebElement searchdiagnosis;
	//Refrerral
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[10]/div[2]/div[1]")
	public WebElement refertab;
	@FindBy(xpath="//input[@id='rhtonamewithid']")
	public WebElement providername;
	@FindBy(xpath="//input[@id='timeframeid']")
	public WebElement timeframe;
	@FindBy(xpath="//textarea[@id='reason']")
	public WebElement reason;
	@FindBy(xpath="//div[@class='col-md-12 ta-r rtl-right pr-0']//button[@type='button'][normalize-space()='Add']")
	public WebElement addre;
	//Cpoe Service
	@FindBy(xpath="//label[contains(text(),'CPOE Service / خدمات إدخال أوامر الطبيب على البرنا')]")
	public WebElement servicetab;
	@FindBy(xpath="//input[@id='cpoeSearchDb']")
	public WebElement searchname;	
	//CPOE Pharmacy
	@FindBy(xpath="//label[contains(text(),'CPOE Pharmacy /صيدلية إدخال أوامر الطبيب على البرن')]")
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
	//familymembers
	@FindBy(xpath="//label[@class='icon familymenbers']")
	public WebElement family;

	//CPOE Adminstration
	@FindBy(xpath="//label[@class='icon cpoeadmin']")
	public WebElement admins;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/label[1]/i[1]")
	public WebElement icon;
	@FindBy(xpath="//textarea[@id='remarks']")
	public WebElement remarks;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement saveadmin;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[8]/label[1]/i[1]")
	public WebElement orderDetails;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[8]/label[2]/i[1]")
	public WebElement Orderinformation;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[3]/ul[1]/li[4]/a[1]")
	public WebElement EMR;

	@FindBy(xpath="//span[normalize-space()='ICD Updation Tool']")
	public WebElement icd;

	@FindBy(xpath="//i[@title='Update']")
	public WebElement icdEdit;

	@FindBy(xpath="//textarea[@id='remarks']")
	public WebElement diagnosisRemarks;

	@FindBy(xpath="//span[@class='btn btn-dark-green active']")
	public WebElement update;

	@FindBy(xpath="(//label[@class='vi-info-label ng-star-inserted'])[2]")
	public WebElement adddednote;

	@FindBy(xpath="//i[@title='Print']")
	public WebElement logprint;

	@FindBy(xpath="//i[@class='ki ki-user-computer']")
	public WebElement CpoeView;

	@FindBy(xpath="//a[@id='2-link']")
	public WebElement medicine;

	@FindBy(xpath="//i[@title='Prescription Print']")
	public WebElement prescriptionPrint;

	@FindBy(xpath="//div[contains(text(),'Doctor Referrals')]")
	public WebElement DoctorReferal;

	@FindBy(xpath="//div[@class='item-icon']//i[@class='ki ki-reception-fill']")
	public WebElement Billing;

	@FindBy(xpath="//i[@class='ki ki-medical-kit']")
	public WebElement encounter;

	@FindBy(xpath="//button[normalize-space()='Check-In']")
	public WebElement CheckIn;

	@FindBy(xpath="//label[@for='dental_examination_header_0']")
	public WebElement Diagnosis;


	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;

	@FindBy(xpath = "//label[@for='checkbox_top_0_12']")
	public WebElement upperLeft;

	@FindBy(xpath = "//label[@for='checkbox_bottom_0_2']")
	public WebElement upperRight;

	@FindBy(xpath = "//label[@for='checkbox_left_0_18']")
	public WebElement LOwerRight;

	@FindBy(xpath = "//label[@class='action-icons']//i[@class='ki ki-notes']")
	public WebElement DentalPreview;

	@FindBy(xpath = "//label[@class='action-icons']//i[@class='ki ki-pencil']")
	public WebElement dentalEdit;

	@FindBy(xpath = "//label[@for='checkbox_right_0_28']")
	public WebElement LowerLeft;


	@FindBy(xpath="//span[normalize-space()='EMR HomeScreen']")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement REmarks;
	

	@FindBy(xpath = "//*[@id=\"antibioticorderingreasonid\"]")
	public WebElement orderingReason;
	
	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;
	
	@FindBy(xpath = "//div[@class='v-action-bar']")
	public WebElement Bar;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[9]/td[1]/i[1]")
	public WebElement signupload;

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
	
	@FindBy(xpath="//textarea[@id='remarks']")
	public WebElement Remarks;
	


	
	public void patReg( String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String Provider,String MRNO,String DOCuser,String DOCpassword,String URL,String Site) throws InterruptedException, AWTException, IOException{

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();

		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(600);
		
		Registration.click(); 
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
		/*		IssuedDate.click();

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

		}     */


		Robot r =new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);

		Clickadd.click();

		Thread.sleep(1000);
		fosave.click(); 
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);


		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", signupload);
		Thread.sleep(1000);
		signupload.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(driver.findElement(By.cssSelector(".upper-canvas"))) //start points x axis and y axis. 

				.moveByOffset(-100,0)

				.clickAndHold()
				.moveByOffset(-50,0) // 2nd points (x1,y1)
				.moveByOffset(20, 50)// 3rd points (x2,y2)
				.moveByOffset(30,0) // 2nd points (x1,y1)
				.moveByOffset(0,-50)// 3rd points (x2,y
				.moveByOffset(60,10)
				.moveByOffset(12,50)
				.moveByOffset(50,0)
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();


		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\AlmeswakYasassiWeb\\src\\test\\resources\\excelYasasiiWeb\\almeswaksheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(11);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(3000);   


	}


	public void encounter(String Provider,String MRNO) throws AWTException, InterruptedException {



		/////////Provider1		


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

	public void	DoctorNote(String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String Provider,String MRNO,String DOCuser,String DOCpassword,String URL,String Site,String providerwidId )throws InterruptedException, AWTException {



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



		Hamberger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
     	EMRhomescreen.click();
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));
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

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(2000); 

		reasonforvisit.click();
		Thread.sleep(1000);
		reasonforvisit.sendKeys("follow");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/typeahead-container[1]/button[1]/span[1]")).click();
		Thread.sleep(1000);
		template.click();
		Thread.sleep(1000);
		template.sendKeys("Dental");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dental Assessment']")).click();
		okay.click();
		Thread.sleep(1000);
		

	    driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		REmarks.click();
		Thread.sleep(1000);
		REmarks.sendKeys("ok");
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//div[contains(text(),'Dental Examination')]")).click();
		Thread.sleep(1000);

     //Selecting thetooth---UpperLeft
		
	  upperLeft.click();


		//driver.findElement(By.xpath("//label[@for='dentalstatus_1_2']//label[@for='dentalstatus_1_2']")).click();
		//Thread.sleep(1000); 
		//driver.findElement(By.xpath("//label[@for='checkbox_bottom_0_2']")).click();
		Thread.sleep(1000); 
		//diag.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='landing-sidebar-container']//div[8]//label[1]//label[1]")).click();
		Thread.sleep(1000); 
		treat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='selectedmodule']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='General Services']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Occlusal splint']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='select_dental-completed-']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='In-Progress']")).click();
		Thread.sleep(1000);

		act.moveToElement(upperLeft).build().perform();
		Thread.sleep(2000);

		//	adddental.click();
		upperLeft.click();

		//	Thread.sleep(1000);




		///UpperRight

		upperRight.click();
		Thread.sleep(1000); 
		Diagnosis.click();	
		Thread.sleep(1000); 
		//diag.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Discolored Tooth ']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//label[@title='Faulty Restoration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Gingival Edema ']")).click();
		Thread.sleep(1000);	
		treat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='selectedmodule']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Orthodontics']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Active removable appliance per arch']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='select_dental-completed-']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='In-Progress']")).click();
		Thread.sleep(1000);
		act.moveToElement(upperRight).build().perform();
		Thread.sleep(2000);
		upperRight.click();

		//	adddental.click();
		Thread.sleep(1000);
		///Lower right

		LOwerRight.click();
		Thread.sleep(1000); 
		Diagnosis.click();	
		Thread.sleep(1000);
		//diag.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Gingivitis ']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//div[@class='landing-sidebar-container']//div[8]//label[1]//label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Root Stump']")).click();
		Thread.sleep(1000);	
		treat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='selectedmodule']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Diagnostic Services']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Biopsy of tissue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='select_dental-completed-']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Planned']")).click();
		Thread.sleep(1000);
		act.moveToElement(LOwerRight).build().perform();
		Thread.sleep(2000);
		LOwerRight.click();
		Thread.sleep(1000);
		adddental.click();
		Thread.sleep(2000);


		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000); 

		DentalPreview.click();
		Thread.sleep(1000);	
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);	
		dentalEdit.click();  
		Thread.sleep(1000);	

		///Lower left 
		LowerLeft.click();
		Thread.sleep(1000); 
		Diagnosis.click();	
		Thread.sleep(1000);
		//diag.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Cracked Tooth ']")).click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//label[@title='Faulty Restoration']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Enamel Hypoplasia']")).click();
		Thread.sleep(1000);	
		treat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='selectedmodule']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Orthodontics']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Partial banding for inter-maxillary elastics (vertical and/or cross elastics)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='select_dental-completed-']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
		Thread.sleep(1000);
		act.moveToElement(LowerLeft).build().perform();
		Thread.sleep(2000);
		LowerLeft.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
		//	adddental.click();
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
		driver.findElement(By.xpath("(//div[@id='listText'])[1]")).click();
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
		driver.findElement(By.xpath("(//div[@id='listText'])[2]")).click();
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
		//Obsteric History
		obsterichistory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Pregnant']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='LMP']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		addobst.click();
		Thread.sleep(1000);
		//Chemotheraphy
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
		addchemo.click();
		Thread.sleep(1000);
		//Radiation
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
		addR.click();
		Thread.sleep(1000);
		//Social History found
		addn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Alcohol Use']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Beer']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		adds.click();
		Thread.sleep(1000);

		//Allergy
		allergytab.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'NKDA')]")).click();
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
		//Clinical
		clinical.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Bleeding Disorders']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")).click();
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
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='fav-icon']//i[@class='ki ki-favourite-fill ng-star-inserted']")).click(); //Favourite uncheck
		//Thread.sleep(1000);
		//searchdiagnosis.click();
	    //Thread.sleep(1000);
		//searchdiagnosis.sendKeys("acute");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);

		//Referral
		refertab.click();
		Thread.sleep(1000);
		providername.click();
		Thread.sleep(1000);
		providername.sendKeys(providerwidId);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+providerwidId+"']")).click();
		Thread.sleep(1000);	
		timeframe.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Urgent']")).click();
		Thread.sleep(1000);
		reason.click();
		Thread.sleep(1000);
		reason.sendKeys("To consult doctor ");
		Thread.sleep(1000);
		addre.click();
		Thread.sleep(1000);   
		//CPOE Service//Procedure reporting	  
		servicetab.click();	  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='btn-service-search']//i[@class='ki ki-favourite-fill']")).click();
		Thread.sleep(1000);
		searchname.click();
		Thread.sleep(1000);
		searchname.sendKeys("Active removable ");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[2]/div[11]/div/app-cpoe-container/div/div/div[1]/div[1]/div/div/div/div[1]/app-cpoe-service-list/div/div[3]/div/div/label[2]")).click();
		Thread.sleep(1000); 
		///driver.findElement(By.xpath("//label[contains(text(),'Active removable appliance')]")).click();
		//Thread.sleep(1000);  
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
	/*	Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(1000);  */
	
		medicineAdd.click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		//Preview
		preview.click();
		Thread.sleep(1000);
		//savenote
		savenote.click();
		Thread.sleep(5000);
		///View Familymembers
		//	family.click();
		//	Thread.sleep(1000);  

		//CPOE Adminstration
		admins.click();
		Thread.sleep(1000);
		icon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='adminstatus']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Patient Refused']")).click();
		Thread.sleep(1000);
		remarks.click();
		Thread.sleep(1000);
		remarks.sendKeys("patient refused");
		Thread.sleep(1000);
		saveadmin.click();
		Thread.sleep(1000);
		icon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='adminstatus']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Executed']")).click();
		Thread.sleep(1000);
		saveadmin.click();
		Thread.sleep(3000);
		driver.findElement (By.xpath("//i[contains(@class,'ki ki-file-log')]")).click();
		Thread.sleep(1000);
		driver.findElement (By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		orderDetails.click();
		Thread.sleep(1000);
		driver.findElement (By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		Orderinformation.click();
		Thread.sleep(1000);
		driver.findElement (By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);




	}


	public void  icdupdation(String MRNO) throws InterruptedException, AWTException {
		Thread.sleep(1000);
		/*	Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		icd.click();
		Thread.sleep(1000);
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);
		icdEdit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		diagnosisRemarks.click();
		Thread.sleep(1000);
		diagnosisRemarks.sendKeys("Using CLI mode, you can generate a CSV (or XML) file containing results and have JMeter generate an HTML report at end of Load Test. JMeter will by default provide a summary of load test while it's running.\r\n"
				+ "You can also have real-time results during your test using Backend Listener.");
		Thread.sleep(1000);
		update.click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		clear.click();
		 

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='EMR HomeScreen']")).click();
		Thread.sleep(2000);
	

		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(600);
		act.moveToElement(Bar).click().build().perform();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='shadow-container']//i[@class='ki ki-ellipsis-v']")).click();
		Thread.sleep(1500);
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();     */
		
		driver.findElement(By.xpath("//label[@class='icon quickview']")).click();
		Thread.sleep(3000);
		adddednote.click();
		Thread.sleep(1000);
		logprint.click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(3000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		///cpoeView

		CpoeView.click();
		Thread.sleep(1000);
		medicine.click();
		Thread.sleep(1000);
		prescriptionPrint.click();
		Thread.sleep(5000);

		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);




	}


	public void Refferal(String URL,String Site,String MRNO,String ReferalDoc ,String DOCpassword ) throws AWTException, InterruptedException {



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
		userid.sendKeys("admin");
		password.click();
		Thread.sleep(1000);
		password.sendKeys("KAmeda123$");
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='MRNo/Name']")));
		Thread.sleep(2000);
		///previousTab
		/*	Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000); */

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);

		DoctorReferal.click();
		Thread.sleep(3000);
		Billing.click();
		Thread.sleep(1000);
		encounter.click();
		Thread.sleep(1000);
		CheckIn.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Add']")).click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);





		///ReferalUser login

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize1 =driver.getWindowHandles().size();
		int windowopen1= Windowsize1-1;
		driver.switchTo().window(tabs1.get(windowopen1));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ReferalDoc);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(DOCpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);


		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='EMR HomeScreen']")).click();
		Thread.sleep(1000);
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);




	}




}





