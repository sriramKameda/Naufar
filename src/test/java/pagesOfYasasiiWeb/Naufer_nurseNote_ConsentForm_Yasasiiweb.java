package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
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

public class Naufer_nurseNote_ConsentForm_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public Naufer_nurseNote_ConsentForm_Yasasiiweb(WebDriver driver) {

		super(driver);

	}


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;

	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;

	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMr;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement EnterFirstNME;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement EnterAge;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement EnterMob;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement EnterOrganisationLetter;

	@FindBy(xpath = "//li[contains(text(),'Others')]")
	public WebElement SelectOrganisation;

	@FindBy(xpath = "//span[contains(text(),'Contact Information')]")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement EnterAddress;

	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement HowDidYouKnow;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[3]/div[1]/label[1]/span[1]")
	public WebElement TV;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement Ok;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Save;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

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

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement nationality;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//label[@class='icon nursenote']")
	public WebElement NurseNote;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Subjective;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement objective;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Assesement;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='History']")
	public WebElement History;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

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
	@FindBy(xpath="//div[@class='item-name'][normalize-space()='Allergy']")
	public WebElement allergytab;
	@FindBy(xpath="//input[@id='drugclassname']")
	public WebElement classname;
	@FindBy(xpath="//button[@id='drugallergyaddbtn']")
	public WebElement durgadd;

	///Clinicalwarning
	@FindBy(xpath="//div[contains(text(),'Clinical Warning')]")
	public WebElement clinical;

	//Vitals&Measurements
	@FindBy(xpath="//div[contains(text(),'Vital Signs')]")
	public WebElement vitals;
	@FindBy(xpath="//input[@id='vital000']")
	public WebElement Height;
	@FindBy(xpath="//input[@id='vital010']")
	public WebElement weight;

	@FindBy(xpath="//input[@title='General']")
	public WebElement general;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Insertion']")
	public WebElement Insertion;

	@FindBy(xpath = "//input[@id='insertion']")
	public WebElement Insertion_Implant;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-insertion[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Site1;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	public WebElement ADD;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-insertion[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]")
	public WebElement ThreeDot;

	@FindBy(xpath = "//div[normalize-space()='Edit']")
	public WebElement Edit;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//input[@id='template']")
	public WebElement ConsentTemplate;

	@FindBy(xpath = "//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")
	public WebElement Close;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral']")
	public WebElement Referal;

	@FindBy(xpath = "//div[contains(text(),'Plan')]")
	public WebElement plan;

	@FindBy(xpath = "//textarea[@id='dynamic_textarea_HTF1003574']")
	public WebElement PLantext;

	@FindBy(xpath = "//label[normalize-space()='Authorize']//span[@class='checkmark']")
	public WebElement Authorizecheckbox;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement emrsave;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")
	public WebElement note;

	@FindBy(xpath = "//i[@title='More']")
	public WebElement More;

	@FindBy(xpath = "//div[normalize-space()='Log']")
	public WebElement Log;

	@FindBy(xpath = "//i[@class='ki ki-print']")
	public WebElement Print;

	@FindBy(xpath = "//label[@class='icon discharesum']")
	public WebElement VisitSummary;

	@FindBy(xpath = "//input[@id='undefined']")
	public WebElement list;

	@FindBy(xpath = "//li[normalize-space()='Mortality Report']")
	public WebElement MortalityReport;

	@FindBy(xpath = "//input[@id='undefined']")
	public WebElement Category;

	@FindBy(xpath = "//div[contains(text(),'Preview')]")
	public WebElement Preview;

	@FindBy(xpath = "//label[contains(@class,'check-container')]//span[@class='checkmark']")
	public WebElement Authorize;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement save;

	@FindBy(xpath = "//div[@class='form-group zero-bottom ng-star-inserted']//input[@type='text']")
	public WebElement DOD;

	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement Today;

	@FindBy(xpath = "//textarea[@id='summary']")
	public WebElement mortalitySummary;

	@FindBy(xpath = "//input[@id='icd']")
	public WebElement ICD;

	@FindBy(xpath = "//input[@id='remarksa']")
	public WebElement A;

	@FindBy(xpath = "//input[@id='remarksb']")
	public WebElement B;

	@FindBy(xpath = "//input[@id='remarksc']")
	public WebElement C;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement mortalityRemarks;

	@FindBy(xpath = "//button[normalize-space()='Add']")
	public WebElement mortalityAdd;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='undefined']")
	public WebElement ICDcategory;

	@FindBy(xpath = "//button[normalize-space()='Log']")
	public WebElement log;

	@FindBy(xpath = "//button[@class='btn btn-danger sm clear']")
	public WebElement close;

	@FindBy(xpath = "//i[@class='ki ki-plus-circle']")
	public WebElement ConsentAdd;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/label[1]/span[2]")
	public WebElement AttendanceReport;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[7]/div[1]/label[1]/span[2]")
	public WebElement PeriodicReports;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/label[1]/span[2]")
	public WebElement MedicalCertificate;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[7]/div[1]/label[1]/span[2]")
	public WebElement deatiledmedical;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[15]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Witness;

	@FindBy(xpath = "//button[@id='addbtn']")
	public WebElement Add; 

	@FindBy(xpath = "//i[@class='ki ki-notes']")
	public WebElement Consentview;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[12]/div[1]/div[4]/img[1]")
	public WebElement consentSignature;

	@FindBy(xpath = "//button[@class='btn btn-red sm clear']")
	public WebElement viewclose; 

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement consentEdit; 

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Name; 

	@FindBy(xpath = "//a[@class='has-arrow']")
	public WebElement Arrow;

	@FindBy(xpath = "//button[normalize-space()='Print']")
	public WebElement consentPrint;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[12]/div[1]/span[1]/i[1]")
	public WebElement SignatureAdd; 

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[10]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement ReasonForRequest;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[3]/i[1]")
	public WebElement consentDelete; 

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath="//button[normalize-space()='Preview']")
	public WebElement ReportsPreview;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement PayType;

	@FindBy(xpath="//input[@id='subcategory']")
	public WebElement SubCategory;

	@FindBy(xpath = "//i[@class='ki ki-arrow-right']")
	public WebElement Expandedview;

	@FindBy(xpath = "//div[normalize-space()='Appointment']")
	public WebElement Appointment;

	@FindBy(xpath = "//i[@title='Click to change view as Grid View']")
	public WebElement Gridview;

	@FindBy(xpath = "//div[contains(text(),'Risk Assessment')]")
	public WebElement RiskAssessment;

	@FindBy(xpath = "//input[@id='occupation']")
	public WebElement Occupation;

	@FindBy(xpath = "//input[@id='employmentstatus']")
	public WebElement EmployeeStatus;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;
	
	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;
	
	@FindBy(xpath = "//input[@id='highestlevelofeducationid']")
	public WebElement highestedu;
	
	@FindBy(xpath = "//input[@id='paidemptime']")
	public WebElement paidEmployment;
	

	@FindBy(xpath = "//div[@id='HTF1007608']//span[@class='editable'][normalize-space()='No']")
	public WebElement Pregnancy;
	
	
	
	
//	@FindBy(xpath = "//input[@id='employmentstatus']")
//	public WebElement EmployeeStatus;

	
	
	
	
	
	


	public void Patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String provider) throws InterruptedException, IOException, AWTException {

		///////////////////Register a female patient

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();

		Thread.sleep(500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		Thread.sleep(1000);
		Registration.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+title+"']")).click();
		Thread.sleep(500);
		EnterFirstNME.sendKeys(Name);
		Thread.sleep(500);

		lastname.sendKeys(Lastname);
		EnterAge.click();
		Thread.sleep(500);


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		EnterAge.sendKeys(Dob);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		nationality.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Indian']")).click();

		Thread.sleep(600);
		EnterMob.sendKeys(MobNo);
		Thread.sleep(500);
		maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		Thread.sleep(500);


		Occupation.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Other']")).click();
		Thread.sleep(500);
		EmployeeStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Unknown']")).click();
		Thread.sleep(500);

	////Additional information
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Additionalinfo);
		Thread.sleep(500); 
		Additionalinfo.click();
		Thread.sleep(500);
		Accomadation.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Other']")).click();
		Thread.sleep(500);	
		driver.findElement(By.xpath("//input[@id='refferalsourceid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Unknown']")).click();
		Thread.sleep(500);

		
		
		Thread.sleep(500);	
		driver.findElement(By.xpath("//input[@id='refferalsourceid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Unknown']")).click();
		Thread.sleep(500);
		
		
		ContactInformation.click();
		Thread.sleep(1000);
		EnterAddress.sendKeys(Address);
		Thread.sleep(1000);
		DocumentIdentification.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		EnterAadhar.sendKeys(DocID );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);
		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(3000);

//		JavascriptExecutor js= (JavascriptExecutor) driver;
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
				.moveByOffset(100,10)
				.moveByOffset(12,70)
				.moveByOffset(50,6)
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\NauferYasassiWeb - 8083\\src\\test\\resources\\excelYasasiiWeb\\NaufarDataSheet8083.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(23);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);

		///Encounter	

		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-select-control[@formcontrolname='encountersubmode']//input[@id='undefined']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='YP-Female']")).click();
		Thread.sleep(600);
		PayType.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Cash']")).click();
		Thread.sleep(600);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+provider+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(2000);
		SAvesuccess.click();
		Thread.sleep(3000);





	}



	public void NurseNote(String URL, String User , String Password , String Site,String MRNo ) throws InterruptedException, AWTException{

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize1 =driver.getWindowHandles().size();
		int windowopen1= Windowsize1-1;

		driver.switchTo().window(tabs1.get(windowopen1));
		driver.switchTo().window(tabs1.get(windowopen1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(User);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);



		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);

		//Viewing Appointment Reason and remarks	
		Thread.sleep(1000);
		Expandedview.click();
		//Thread.sleep(2000);
		//Gridview.click();
		Thread.sleep(1000);
		Thread.sleep(1000);


		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(5000);
		/*	UParrow.click();
		Thread.sleep(2000);
		Lock.click();
		Thread.sleep(1000);*/

		///nursenote	
		NurseNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Nurse Note']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);

		Subjective.clear();
		Subjective.sendKeys("at com.websystique.testng.Calculator.divide(Calculator.java:10)\r\n"
				+ "    at com.websystique.testng.TestNGDependsOnMethodsExample.testDivide(TestNGDependsOnMethodsExample.java:31)\r\n"
				+ "    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n"
				+ " ");

		objective.clear();
		objective.sendKeys("We use cookies to personalize content and ads, to provide the best browsing experience possible, to provide social media features and to analyse our traffic. We also share information about your USAGE OF OUR SITE with our social media, advertising and analytics partners. We do not store any user details. When user contacts us using contact-form");

		Assesement.clear();
		Assesement.sendKeys("TesNG expectedExceptions example\r\n"
				+ "TestNG Suites Example\r\n"
				+ "TestNG enabled example");
		Thread.sleep(1000);
		Pregnancy.click();
		
		
		
		
		

		////History


		/*	History.click();
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
		driver.findElement(By.xpath("//li[contains(text(),'Mother')]")).click();
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
		Robot r=new Robot(); 
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
		classname.sendKeys("Aminoglycosides");
		Thread.sleep(1000);
		classname.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='list0']")).click();
		Thread.sleep(1000);
		durgadd.click();
		Thread.sleep(1000);
		//Clinical
		clinical.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/app-clinicalwarning[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[4]/div[2]/span[1]")).click();
		Thread.sleep(1000);  */


		//Vital&Measurements
		vitals.click();
		Thread.sleep(1000);
		//general.click();
		Thread.sleep(1000);
		Height.clear();
		Thread.sleep(1000);
		Height.sendKeys("165");
		Thread.sleep(1000);
		weight.clear();
		Thread.sleep(1000);
		weight.sendKeys("70");
		Thread.sleep(1000);  

		//Insertion

		/*	Insertion.click();
		Thread.sleep(1000);
		Insertion_Implant.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='CVLLUMEN']")).click();
		Thread.sleep(1000);
		Site1.click();
		Thread.sleep(1000);
		Site1.sendKeys("%");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Femoral(L)']")).click();
		Thread.sleep(1000);
		ADD.click();
		Thread.sleep(1000);

			ThreeDot.click();
		Thread.sleep(1000);
		act.moveToElement(ThreeDot).click().build().perform();
		Thread.sleep(1000);
	//	ThreeDot.click();
	//	Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Insertion Remarks Entered");
		Thread.sleep(1000);
		ADD.click();
		Thread.sleep(1000);
		act.moveToElement(ThreeDot).click().build().perform();
		Thread.sleep(1000);
		Preview.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();  */
		Thread.sleep(1000);

		///Risk	
		RiskAssessment.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='loaderparent ng-star-inserted']//div[1]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='noterightregion']//div[2]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[3]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[4]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click(); 
		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[5]/div[1]/div[4]/div[2]/div[1]/div[1]/label[1]/span[2]")).click(); 
		Thread.sleep(1000);	




		///////Plan
		plan.click();
		Thread.sleep(1000);
		PLantext.click();
		Thread.sleep(1000);
		PLantext.sendKeys("PLantext");
		Thread.sleep(1000);
		Authorizecheckbox.click();
		Thread.sleep(1000);
	
		emrsave.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")));
		Thread.sleep(3000);
		/////noteview

		note.click();
		Thread.sleep(1000);
		More.click();
		Thread.sleep(1000);
		Log.click();
		Thread.sleep(1000);
		Print.click();
		Thread.sleep(3000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);   


		//////////VisistSummary
		Thread.sleep(3000);
		VisitSummary.click();
		Thread.sleep(1000);
		list.click();  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Medical Report']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/span[1]/div[1]/table[1]/tbody[1]/tr[7]/td[2]")).sendKeys("Submit to higher offcials");
		Thread.sleep(1000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/span[1]/div[1]/table[1]/tbody[1]/tr[8]/td[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//li[normalize-space()='Early Recovery Phase']")).click();
		//		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-red mb5 ml10 clear ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[normalize-space()='Preview']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-print']")).click();
		Thread.sleep(3000);
		Robot t1=new Robot();
		t1.keyPress(KeyEvent.VK_ESCAPE);
		t1.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);



		///Mortality

		/*	MortalityReport.click();
        Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mortality Report']")).click();
		Thread.sleep(1000);
		DOD.click();
		Thread.sleep(1000);
		Today.click();
		Thread.sleep(1000);
		mortalitySummary.click();
		Thread.sleep(1000);
		mortalitySummary.sendKeys("Testing Needs\r\n"
				+ "Actionable Insights, Tips, & Tutorials delivered in your Inbox");
		Thread.sleep(1000);
		ICD.click();
		Thread.sleep(1000);
		ICD.sendKeys("normal pressure hydrocephalus" , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'normal pressure hydrocephalus')]")).click();
		Thread.sleep(1000);
		A.sendKeys("Feature file – Contains code written in Gherkin (plain English text)");
		Thread.sleep(1000);
		B.sendKeys("Step definition file – Contains the actual code written by the developer");
		Thread.sleep(1000);
		C.sendKeys("Cucumber is used to execute automated acceptance tests written in the “Gherkin” language.");
		Thread.sleep(1000);

		mortalityRemarks.click();
		Thread.sleep(1000);
		mortalityRemarks.sendKeys("mortalityAdd");
		Thread.sleep(1000);
		mortalityAdd.click();
		Thread.sleep(2500);
		ICDcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Part 2']")).click();
		Thread.sleep(1000);
		ICD.click();
		Thread.sleep(1000);
		ICD.sendKeys("normal pressure hydrocephalus" , Keys.ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[contains(text(),'normal pressure hydrocephalus')]")).click();
		Thread.sleep(1000);
		mortalityRemarks.click();
		Thread.sleep(1000);
		mortalityRemarks.sendKeys("mortalityAdd");
		Thread.sleep(1000);
		mortalityAdd.click();
		Thread.sleep(1000);
		ReportsPreview.click();

		Thread.sleep(2000);
		Authorize.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(2000);    
		log.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
/*		Print.click();
		Thread.sleep(1000);
     //	Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);  */


		///Consent Form

		list.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Consent Form']")).click();
		Thread.sleep(1000);
		ConsentAdd.click();
		Thread.sleep(1000);
		AttendanceReport.click();
		Thread.sleep(1000);
		PeriodicReports.click();
		Thread.sleep(1000);
		deatiledmedical.click();
		Thread.sleep(1000);
		MedicalCertificate.click();
		Thread.sleep(1000);

		//	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Witness);
		Thread.sleep(1000);
		Witness.click();
		Thread.sleep(1000);
		Witness.sendKeys("08-Oct-2018 — Handovers are an essential part of every shift. Download our free handover template and use our tips for effective delivery.");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Consentview.click();
		Thread.sleep(1000);
		consentPrint.click();
		Thread.sleep(1000);
		//	Robot t=new Robot();
		t1.keyPress(KeyEvent.VK_ESCAPE);
		t1.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		viewclose.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
		consentEdit.click();
		Thread.sleep(1000);
		Name.click();
		Thread.sleep(1000);
		Name.sendKeys("Sri Ram");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
		log.click();
		Thread.sleep(2000);
		//Arrow.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		consentDelete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		ConsentAdd.click();
		Thread.sleep(1000);
		ConsentTemplate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'Discharge against Medical Advice Form/نموذج الخروج')]")).click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView();", consentSignature);
		Thread.sleep(1000);
		consentSignature.click();
		Thread.sleep(1000);
		SignatureAdd.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(driver.findElement(By.cssSelector(".upper-canvas"))) //start points x axis and y axis. 

				.moveByOffset(-100,0)
				.clickAndHold()
				.moveByOffset(-50,0) // 2nd points (x1,y1)
				.moveByOffset(20, 50)// 3rd points (x2,y2)
				.moveByOffset(30,0) // 2nd points (x1,y1)
				.moveByOffset(0,-50)// 3rd points (x2,y
				.moveByOffset(100,10)
				.moveByOffset(12,70)
				.moveByOffset(50,6)
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		ReasonForRequest.click();
		Thread.sleep(1000);
		ReasonForRequest.sendKeys(" understand I can change my mind at any time and return for treatment in Residential Unit as per policies and procedures of Naufar Center.");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Consentview.click();
		Thread.sleep(1000);
		consentPrint.click();
		Thread.sleep(1000);
		//	Robot t=new Robot();
		t1.keyPress(KeyEvent.VK_ESCAPE);
		t1.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		viewclose.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);


	}
}