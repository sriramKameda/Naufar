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

public class Almeswak_MergedPatient_YasassiWeb  extends PageFactoryInitYasasiiWeb{

	public Almeswak_MergedPatient_YasassiWeb(WebDriver driver) {

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

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[contains(@class,'btn btn-link ng-star-inserted')]")
	public WebElement AddnewService;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement Saveservice;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOK;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[8]/div[2]/div[1]")
	public WebElement disgnosis;

	@FindBy(xpath = "//label[contains(text(),'CPOE Pharmacy /صيدلية إدخال أوامر الطبيب على البرن')]")
	public WebElement CPOEpharm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement MedicineSearch;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement Orderingreason;


	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;

	@FindBy(xpath = "//div[@class='col-md-11']//span[@class='checkmark']")
	public WebElement diagnosischevckbox;

	@FindBy(xpath = "//label[contains(@class,'check-container ng-star-inserted')]//span[contains(@class,'checkmark')]")
	public WebElement inclinicadmin;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;	

	@FindBy(xpath = "//input[@name='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//label[normalize-space()='No Current Medication']//span[@class='checkmark']")
	public WebElement NoCurrentmed;

	@FindBy(xpath = "//label[@class='check-container no-label']//span[@class='checkmark']")
	public WebElement NoCurrentmedCheck;

	@FindBy(xpath = "//i[@class='ki ki-admission-reconciliation']")
	public WebElement AdmsnReconcile;

	@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
	public WebElement Reconsile;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement DoctorNote;

	@FindBy(xpath = "//label[contains(text(),'CPOE Service / خدمات إدخال أوامر الطبيب على البرنا')]")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement ServiceSearch;
	
	@FindBy(xpath = "//input[@id='cpoeSearchDb']")
	public WebElement ServiceSearch1;
	
	
	
	@FindBy(xpath = "//textarea[@id='clinicalindication']")
	public WebElement clinicalindication;

	@FindBy(xpath = "//textarea[@id='reasonfororder']")
	public WebElement ReasonforOrder;

	@FindBy(xpath = "//span[normalize-space()='Surgery Details']")
	public WebElement SurgeryDetails;

	@FindBy(xpath = "//input[@id='woundclassid']")
	public WebElement WoundClass;

	@FindBy(xpath = "//input[@id='isbloodtrans-1']")
	public WebElement Transfustion;

	@FindBy(xpath = "//input[@id='ispostopicubed-1']")
	public WebElement PostopBed;

	@FindBy(xpath = "//textarea[@id='implantotherdevice']")
	public WebElement Implants;

	@FindBy(xpath = "//input[@id='isinfectiousdesease-1']")
	public WebElement infectious;

	@FindBy(xpath = "//textarea[@id='equipinstramentremark']")
	public WebElement Equipments;

	@FindBy(xpath = "//input[@id='isansethetistinformed-1']")
	public WebElement Anesthiest;

	@FindBy(xpath = "//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement Addprocedure;

	
    @FindBy(xpath = "//i[@class='ki ki-patient-merge-fill']")
	public WebElement Merge;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Mergeadd;

	@FindBy(xpath = "//input[@id='relatedmrno']")
	public WebElement MergeMRNo;

	@FindBy(xpath = "//button[@id='patmergesave']")
	public WebElement MergeSave;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement Searchicon;

	@FindBy(xpath = "//i[@class='ki ki-calendar-fill']")
	public WebElement Appointment;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//i[@class='ki ki-user-computer']")
	public WebElement CPOeView;
	
	@FindBy(xpath = "//i[@title='Schedule Appointment']")
	public WebElement ScheduleApp;
	
	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement PrescriptionPrint;
	
	@FindBy(xpath = "//span[normalize-space()='General']")
	public WebElement General;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Billing;
	
	@FindBy(xpath = "//span[normalize-space()='Encounter']")
	public WebElement Encounter;
	
	@FindBy(xpath = "//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement EpisodeIcon;
	
	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Openenc;
	
	@FindBy(xpath = "//ki-textarea-control[@placeholder='Reason']//textarea[@id='undefined']")
	public WebElement encCancelrEASON;
	
    @FindBy(xpath="//input[@placeholder='Search Resource..']")
	public WebElement DoctorSearch;

	@FindBy(xpath="//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement AppReason;

	@FindBy(xpath="//button[@id='appointmentsaveid']")
	public WebElement AppSave;

	@FindBy(xpath="//span[normalize-space()='Medicine']")
	public WebElement medicineView;
	
	@FindBy(xpath="//label[@class='icon familymenbers']")
	public WebElement family;
	
	@FindBy(xpath="//span[normalize-space()='Merged']")
	public WebElement Merged;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement billprint;
	
	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-reception-fill']")
	public WebElement billing;
	
	@FindBy(xpath="//li[@class='nav-item disabled ng-star-inserted']")
	public WebElement Encountermerged;
	
	
	@FindBy(xpath = "//label[contains(@class,'check-container zero-label')]")
	public WebElement printuncheck;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='duration']")
	public WebElement Duration;
	
	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement DurationUnit;
	
	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UpArrow;
	
	@FindBy(xpath = "//i[@title='Lock/Unlock']")
	public WebElement Lock;
	
	@FindBy(xpath = "//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")
	public WebElement threeDot;
	
	@FindBy(xpath = "//div[normalize-space()='Edit']")
	public WebElement Edit;
	
	@FindBy(xpath = "//textarea[@id='clinicalindication']")
	public WebElement ClicnicalIndication;
	
	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//textarea[@id='remarks']")
	public WebElement serviceRemark;
	
	@FindBy(xpath = "//i[@class='ki ki-upload']")
	public WebElement Update;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;
	
	@FindBy(xpath = "//img[@src='../../../assets/img/header/language-sel.png']")
	public WebElement Language;
	
	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement PAS;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement REmarks;
	
	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement mindose;
	
	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement doseunit;
	

	@FindBy(xpath = "//div[@class='col-md-4']//input[@id='routeid']")
	public WebElement route;
	
	@FindBy(xpath = "//input[@id='formid']")
	public WebElement Form;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void patReg( String Title , String NAME , String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNO ,String Provider ,String MBLNO2 , String DOCno2,String NAme2) throws InterruptedException, IOException, AWTException {


		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		FO.click(); 
		Thread.sleep(1000);
		
		
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		Thread.sleep(1000);
		
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
		Language.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[normalize-space()='English']")).click();
		Thread.sleep(600);
		title.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'"+Title +"')]")).click();
		Thread.sleep(600);
		firstname.sendKeys(NAME);
		Thread.sleep(600);
		Thread.sleep(600);
		middleName.clear();
		Thread.sleep(600);
		middleName.sendKeys("AL");
		Thread.sleep(600);
		LastName.clear();
		Thread.sleep(600);
		LastName.sendKeys("var");
		Thread.sleep(600);
		
			age.clear();
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		age.sendKeys(DOB);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		Thread.sleep(600);
		phoneno.sendKeys(MBLNO);

		Thread.sleep(600);


		//////////////Enter contact information

		Thread.sleep(1000);
		contInformation.click();
		Thread.sleep(1000);
	
		preferedcommunicationid.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[@title='Phone']")).click();
		Thread.sleep(600);
		homeadd1.sendKeys(ADDRESS);
		Thread.sleep(600);





		//////////////Enter Document information

		DocumentIdentification.click();
		Thread.sleep(1000);

		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);


		EnterAadhar.sendKeys(Keys.HOME + DOCno );
		Thread.sleep(600);
		issuedPlace.sendKeys("Chennai");
		Thread.sleep(600);
		IssuedDate.click();

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



		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);

		Clickadd.click();

		Thread.sleep(1000);
		fosave.click();
		Thread.sleep(2000);
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
		HSSFSheet FOFullRegTest=wb.getSheetAt(6);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(3000);    


		//////Encounter
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
		
		
		
		//ServiceAdd
		Thread.sleep(1000);
		// js= (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();",  Service);
		Thread.sleep(2000);
//		Service.click();	
//		Thread.sleep(1000);
//		AddnewService.click();
//		Thread.sleep(2000);
//		servicename.click();
//		Thread.sleep(2000);
//		servicename.sendKeys(SERVICE);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='"+SERVICE+"']")).click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		Add.click();
//		Thread.sleep(2000); 
//		Saveservice.click();
//		Thread.sleep(1000);
//		SaveOK.click();

		///appointment
		
	/*	Thread.sleep(1000);
		Appointment.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(1000);
		DoctorSearch.clear();
		Thread.sleep(1000);
		DoctorSearch.sendKeys("Rohit Sharma");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		AppReason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		AppSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);   */
		
		
		
		///register the patient	

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		Registration.click();
		
		Thread.sleep(1000);
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement2.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		
	   Thread.sleep(1500);
		
		title.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'"+Title +"')]")).click();
		Thread.sleep(600);
		firstname.sendKeys(NAme2);
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
		
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		age.sendKeys(DOB);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		Thread.sleep(600);
		phoneno.sendKeys(MBLNO2);

		Thread.sleep(600);


		//////////////Enter contact information

		Thread.sleep(1000);
		contInformation.click();
		Thread.sleep(1000);
	
		preferedcommunicationid.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[@title='Phone']")).click();
		Thread.sleep(600);
		homeadd1.sendKeys(ADDRESS);
		Thread.sleep(600);





		//////////////Enter Document information

		DocumentIdentification.click();
		Thread.sleep(1000);

		for (int i1 = 0; i1 <=15; i1++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);


		EnterAadhar.sendKeys(Keys.HOME + DOCno2 );
		Thread.sleep(600);
		issuedPlace.sendKeys("Chennai");
		Thread.sleep(600);
		IssuedDate.click();

		for (int i1 = 0; i1 <=7; i1++) {	

			
			r.keyPress(KeyEvent.VK_UP);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_UP);

		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);


		validfrom.click();
		for (int i1 = 0; i1 <=3; i1++) {	


			r.keyPress(KeyEvent.VK_UP);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_UP);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(600);


		validto.click();
		for (int i1 = 0; i1 <=3; i1++) {	

			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(600);

		}



		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);

		Clickadd.click();

		Thread.sleep(1000);
		fosave.click();
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-dialog-common//button[@aria-label='Close'][normalize-space()='No']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Close'][normalize-space()='No']")).click();


		Thread.sleep(3000);
		String mrno1= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno1);

		
		File src1=new File("C:\\Users\\sriram\\eclipse-workspace\\AlmeswakYasassiWeb\\src\\test\\resources\\excelYasasiiWeb\\almeswaksheet.xls");
		FileInputStream fis1=new FileInputStream(src1);
		HSSFWorkbook wb1=new HSSFWorkbook(fis1);
		HSSFSheet FOFullRegTest1=wb1.getSheetAt(6);	
		int i1=FOFullRegTest1.getLastRowNum();
		System.out.println("Number of rows: " + i1);		
		FOFullRegTest1.getRow(i1).createCell(15).setCellValue(mrno1);	
		FileOutputStream fout1=new FileOutputStream(src1);	
		wb1.write(fout1);

		Thread.sleep(3000);    




		Thread.sleep(2000);

		//////Encounter
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

	public void docnote(String URL, String User , String Password , String site, String MRNO , String SERVICE) throws InterruptedException {
		
		
		

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;
		
		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(500);
		UpArrow.click();
		Thread.sleep(500);
		Lock.click();
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(2000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dermatology']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		REmarks.click();
		Thread.sleep(1000);
		REmarks.sendKeys("ok");
		Thread.sleep(1000);
		
		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		////////////////surgery procedure			

		CpoeService.click();
		Thread.sleep(1000);
		ServiceSearch.click();
		Thread.sleep(1000);
         ServiceSearch.sendKeys(SERVICE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='"+SERVICE+"']")).click();
		Thread.sleep(1000);
		threeDot.click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='STAT']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		ClicnicalIndication.click();
		Thread.sleep(1000);
		ClicnicalIndication.sendKeys("highly swallowed");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[contains(text(),'G91.2')]//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		serviceRemark.click();
		Thread.sleep(1000);
		Update.click();
		Thread.sleep(1000);
		
		
		/////////medicine
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
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(1000);
		medicineAdd.click();
		
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000);
	}


	public void merge( String site ,String DOCno,String MRNO , String MRNo2,String URL,String User,String Password) throws InterruptedException, IOException, AWTException {

		

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs11 = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize11 =driver.getWindowHandles().size();
		int windowopen11= Windowsize11-1;
		
		driver.switchTo().window(tabs11.get(windowopen11));
		driver.switchTo().window(tabs11.get(windowopen11));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);
		
	
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("admin");
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);
//		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		int n =driver.getWindowHandles().size();
//		Thread.sleep(1000);
//		System.out.println("CURRENT NO.OF WINDOWS"+ n);
//		int m= n-2;
//		Thread.sleep(1000);
//		System.out.println("go to window no."+ m);
//		Thread.sleep(2000);
//		driver.switchTo().window(tabs.get(m));
//		Thread.sleep(3000);

		//////encounter closing
		
		
		
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		FO.click();
		Thread.sleep(600);
		
List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		Thread.sleep(600);

		
		
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
		
		Thread.sleep(1000);
		EnterPatientName.click();//input[@id='searchtext']
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1000);
		Searchicon.click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
        Thread.sleep(1000);
	   //  Billing.click();
		Thread.sleep(1000);
		Encounter.click();
		Thread.sleep(1000);
		EpisodeIcon.click();
		Thread.sleep(1000);
		Openenc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Close Encounter']//i[@class='ki ki-close']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		encCancelrEASON.click();
		Thread.sleep(1000);
		encCancelrEASON.sendKeys("going to merge");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary active sm mr0 mt0 mb0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green btn-primary sm mr0 mb0 mt0 ng-star-inserted']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		

		
		/////////merge
		EnterPatientName.clear();
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNo2);
		Thread.sleep(1000);
		Searchicon.click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo2+"')])[1]")).click();
        Thread.sleep(1000);
		
		
		Thread.sleep(1000);
    	Merge.click();
    	Thread.sleep(1000);
		MergeMRNo.sendKeys(MRNO);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Search']")).click();
		Thread.sleep(1000);
		Mergeadd.click();
		Thread.sleep(1000);
		MergeSave.click();
		Thread.sleep(1000);
		
		
		EnterPatientName.click();
	    Thread.sleep(1000);
		EnterPatientName.clear();
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1000);
		Searchicon.click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Close'][normalize-space()='No']")).click();
        Thread.sleep(1000);
        act.moveToElement(Appointment).build().perform();
        Thread.sleep(2000);
        Appointment.click();
        Thread.sleep(2000);
        
        
        billing.click();
        Thread.sleep(1000);
        act.moveToElement(Encountermerged).click().build().perform();
        Thread.sleep(2000);
        Encountermerged.click();
        Thread.sleep(2000);
        
      ///  act.moveToElement(ADT).build().perform();
        Thread.sleep(2000);
      //  ADT.click();
        Thread.sleep(1000);
        CPOeView.click();
        Thread.sleep(1000);
        act.moveToElement(ScheduleApp).click().build().perform();
        Thread.sleep(1000);
        ScheduleApp.click();
        Thread.sleep(3000);
        medicineView.click();
        Thread.sleep(1000);
        PrescriptionPrint.click();
        Thread.sleep(3000);

    	Robot t=new Robot();
    	Thread.sleep(1000);
    	t.keyPress(KeyEvent.VK_ESCAPE);
    	t.keyRelease(KeyEvent.VK_ESCAPE);
    	Thread.sleep(1000);
    	Merge.click();
    	Thread.sleep(2000);

	////////////////EMR
    	

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;
		
		System.out.println(Windowsize);
		
		
		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);
		

		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
     	EMRHomeScreen.click();
		Thread.sleep(1200);
		EnterPatientName.click();
		Thread.sleep(1000);
		EnterPatientName.clear();
		Thread.sleep(1000);
    	EnterPatientName.sendKeys(MRNo2);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo2+"')])[1]")).click();
		Thread.sleep(1000);
	    UpArrow.click();
		Thread.sleep(500);
		Lock.click();
		Thread.sleep(500);
		 family.click();
		 Thread.sleep(1000);
		 Merged.click();
		 Thread.sleep(1000);
    	
		
	}
		

	


}


 
	
	
	
	
	


