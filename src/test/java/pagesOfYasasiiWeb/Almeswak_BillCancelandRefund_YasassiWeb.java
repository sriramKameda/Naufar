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

public class Almeswak_BillCancelandRefund_YasassiWeb  extends PageFactoryInitYasasiiWeb {

	public Almeswak_BillCancelandRefund_YasassiWeb(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement title;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")    
	public WebElement firstname;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement gender;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement age;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement phonecode;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement phoneno;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[6]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement altphonecode;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='alternatephone']")
	public WebElement altphoneno;

	@FindBy(xpath = "//input[@id='familyname']")
	public WebElement familyname;

	@FindBy(xpath = "//input[@id='mothermaidenname']")
	public WebElement mothermaidenname;

	@FindBy(xpath = "//input[@id='bloodgroup']")
	public WebElement bloodgroup;

	@FindBy(xpath = "//input[@id='nationality']")
	public WebElement nationality;

	@FindBy(xpath = "//input[@id='preferedlanguageid']")
	public WebElement preferedlanguageid;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement vip;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[7]/div[1]/div[1]/label[2]/ki-checkbox[1]/label[1]/label[1]/span[1]")
	public WebElement physicallychallenge;

	@FindBy(xpath = "//span[contains(text(),' Contact Information ')]")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='personalemail']")
	public WebElement personalemail;

	@FindBy(xpath = "//span[normalize-space()='No Items Selected']")
	public WebElement preferedcommunicationid;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

	@FindBy(xpath = "//input[@id='homeaddress2']")
	public WebElement homeadd2;

	@FindBy(xpath = "//input[@id='homeCountry']")
	public WebElement homeCountry;

	@FindBy(xpath = "//input[@id='homeState']")
	public WebElement homeState;

	@FindBy(xpath = "//input[@id='homeCity']")
	public WebElement homeCity;

	@FindBy(xpath = "//input[@id='homezip']")
	public WebElement homezip;

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

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/app-document-verification[1]/form[1]/div[1]/div[1]/div[4]/div[2]/label[1]/label[1]/i[1]")
	public WebElement attachment;


	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/ki-documentscan[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]")
	public WebElement docattachment;

	@FindBy(xpath = "//button[contains(text(),'Close')]")
	public WebElement docattclose;

	@FindBy(xpath = "//button[@id='adddoc']//label")
	public WebElement Iddocadd;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[1]/div[1]/div[1]")
	public WebElement foRelatedMrnotab;

	@FindBy(xpath = "//input[@id='relatedmrno']")
	public WebElement relatedmrno;

	@FindBy(xpath = "//input[@id='relation']")
	public WebElement relation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[1]/div[3]/div[2]/button[1]/label[1]")
	public WebElement add;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/i[1]")
	public WebElement emcontact;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/ki-dialog-confirm[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement emcontactConfirmation;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[6]/div[1]/div[1]/div[1]/div[1]")
	public WebElement emergencycontact;

	@FindBy(xpath = "//span[contains(text(),'Add')]")
	public WebElement docadd;

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


	@FindBy(xpath = "//i[contains(@class,'ki ki-cash-transfer')]")
	public WebElement AvailedService;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Checkbox;

	@FindBy(xpath = "//i[@title='Request for Advance Refund']")
	public WebElement request;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement auth;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[3]/span[2]/i[2]")
	public WebElement cancel;

	@FindBy(xpath = "//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")
	public WebElement droplist;


	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[3]/ul[1]/li[2]/a[1]/span[1]")
	public WebElement RCM;

	@FindBy(xpath = "//span[normalize-space()='Approve Request']")
	public WebElement ApproveRequest;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement CHECK;

	@FindBy(xpath = "//span[normalize-space()='Advance Approval']")
	public WebElement AdvanceApproval;

	@FindBy(xpath = "//div[@class='row advance-approve ng-star-inserted']//th[@class='amount'][normalize-space()='Net Amount']")
	public WebElement Element;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement AmountEdit;

	@FindBy(xpath = "//input[@id='approvalamount0']")
	public WebElement Amount1;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement remark1;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement APPROVE;

	@FindBy(xpath = "//td[@class='icon-info']//i[@title='Request Approved']")
	public WebElement reqAPPROVE;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement reqSave;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;

	@FindBy(xpath="//span[normalize-space()='Cancellation/Refund']")
	public WebElement cancelrefund;

	@FindBy(xpath="//i[@class='ki ki-medical-kit']")
	public WebElement encounter;

	@FindBy(xpath="//ki-select-control[@formcontrolname='serviceid']//input[@id='undefined']")
	public WebElement ServiceNAme;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterMRNo;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchButton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement patientSearch;

	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MrnoSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/label[1]/button[1]")
	public WebElement SearchIcon1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/i[1]")
	public WebElement CancelReq;



	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement  yes;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/i[1]")
	public WebElement RemarksIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon1;


	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks1;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox1;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon2;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement IssuingBank;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='bankname']//input[@id='undefined']")
	public WebElement RecievingBank;

	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement IBANO;

	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement ChequeAdd;

	@FindBy(xpath = "//i[@title='Delete']")
	public WebElement Delete;

	@FindBy(xpath = "//i[@title='Payment Info']")
	public WebElement PaymentInfo;

	@FindBy(xpath = "//td[@class='info-icon']//i[@title='Adjustment Log']")
	public WebElement adjInfo;

	@FindBy(xpath = "//i[@class='ki ki-cheque icon-btn-billing btn-dark-green inline']")
	public WebElement cheque;

	@FindBy(xpath = "//input[@id='wallet']")
	public WebElement Wallet;

	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement PAS;

	@FindBy(xpath="//input[@id='searchtext']") 
	public WebElement SearchField;

	@FindBy(xpath="//i[@class='ki ki-reception-fill']")
	public WebElement Billing;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[9]/td[1]/i[1]")
	public WebElement signupload;




	public void PatientReg( String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNo,String mail) throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		PAS.click();
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
		List<WebElement> dynamicElement01=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement01.size() !=0)
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
		personalemail.sendKeys(mail);
		Thread.sleep(600);
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

		//    	String word[]=mrno.split("[ :] ");
		//		System.out.println("number of words: "+word.length);
		//		for(int i=0;i<word.length;i++)
		//		{
		//			System.out.println("word["+i+"]="+word[i]);
		//		}
		//		System.out.println(word[1]);
		//		
		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\AlmeswakYasassiWeb\\src\\test\\resources\\excelYasasiiWeb\\almeswaksheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(1);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(3000);


	}

	public void AvailedServices(String provider,String MRNO ,String Authoriser) throws InterruptedException, AWTException {

		////Billing 

		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
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


		///AvailedServices 		


		Thread.sleep(1000);
		AvailedService.click();
		Thread.sleep(1000);
		//AdvanceView.click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//label[@title='Request for Cancellation']"));

		int k =	dynamicElement2.size();
		System.out.println("size of k="+k);

		int i = k-1;
		System.out.println(i);
		Thread.sleep(3000);




		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/label[2]/i[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[3]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		//	driver.findElement(By.xpath("//tbody/tr["+k+"]/td[1]/label[3]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		// Checkbox.click();//tbody/tr[1]/td[1]/label[3]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[@title='Request for Cancellation'])[1]")).click();
		// request.click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		Thread.sleep(1000);
		auth.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+Authoriser+"']")).click();
		Thread.sleep(1000);
		remark.click();
		Thread.sleep(1000);
		remark.sendKeys("Requested");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		droplist.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(2000);

		cancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		//AdvanceView.click();
		Thread.sleep(2000);
		droplist.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Valid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-user-referral']")).click();

		AvailedService.click();
		Thread.sleep(3000);

		//	driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(600);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody/tr[1]/td[1]/label[2]/i[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/label[3]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		// Checkbox.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[3]/span[2]/label[1]/span[1]/i[1]")).click();
		// request.click();
		Thread.sleep(2000);
		auth.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='"+Authoriser+"']")).click();
		Thread.sleep(1000);
		remark.click();
		Thread.sleep(1000);
		remark.sendKeys("Requested");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[3]/div[1]/div[1]/div[1]/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@type='button'][normalize-space()='OK']")).click();

	}

	public void AuthorisingRequest(String URL, String User , String Password , String site,String MRNO ) throws InterruptedException, AWTException {

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int l =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ l);
		int k=l-1;
		System.out.println("window handles no."+ k);
		driver.switchTo().window(tabs.get(k));
		driver.switchTo().window(tabs.get(k));
		Thread.sleep(3000);
		driver.get(URL);


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



		Hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);
		driver.findElement(By.xpath("//*[contains(text(),'RCM')]")).click();
		Thread.sleep(1000);
	
		//	RCM.click();
		Thread.sleep(1000);
		ApproveRequest.click();
		Thread.sleep(1000);
		
		Thread.sleep(600);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		
		Thread.sleep(600);
		//AdvanceApproval.click();
		 

		patientSearch.clear();	
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();	
		//CHECK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")).click();	

		Thread.sleep(1000);
		remark1.click();
		Thread.sleep(1000);
		remark1.sendKeys("approved");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		APPROVE.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();	
		Thread.sleep(1000);

		///////Approve Cancel

		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon1.click();
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		CancelReq.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(3000);

		Thread.sleep(3000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		checkbox1.click();
		Thread.sleep(1000);
		RemarksIcon2.click();
		Thread.sleep(800);
		Remarks1.click();
		Thread.sleep(1000);
		Remarks1.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		SaVe.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(800);

		/////////////////////////////

		Hamberger.click();
		Thread.sleep(1000);
		//FO.click();
		Thread.sleep(1000);
		//RCM.click();
		Thread.sleep(1000);
		cancelrefund.click();
		Thread.sleep(1000);




		Thread.sleep(1000);
		patientSearch.clear();
		Thread.sleep(1000);
		patientSearch.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		String Returnamount =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[1]/table[1]/tbody[1]/tr[1]/td[9]")).getText();
		Thread.sleep(1000);
		System.out.println("returnAmount"+Returnamount);
		Thread.sleep(1000);




		//converting string into int 

		double i = new Double(Returnamount);

		//int i = Integer.parseInt(amount);
		double DV =  (i/2); 
		System.out.println(DV);

		//converting double into int


		int Rupee = (int)Math.round (DV) ;

		//converting int into String


		String amount = String.valueOf(Rupee);


		/////////Converting double to string
		//String amount = Double.toString(DV);

		cheque.click();
		Thread.sleep(600);
		IssuingBank.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(600);
		RecievingBank.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(600);
		IBANO.click();
		Thread.sleep(600);
		IBANO.sendKeys("7875940");
		Thread.sleep(600);
		Amount.click();
		Thread.sleep(600);
		Amount.sendKeys(amount);
		Thread.sleep(600);
		ChequeAdd.click();
		Thread.sleep(600);
		Delete.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//ki-dialog-common//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);



		///////////added again	

		IssuingBank.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(600);
		RecievingBank.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(600);
		IBANO.click();
		Thread.sleep(600);
		IBANO.sendKeys("7875940");
		Thread.sleep(600);
		Amount.click();
		Thread.sleep(600);
		Amount.sendKeys(amount);
		Thread.sleep(600);
		ChequeAdd.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		Wallet.click();
		Thread.sleep(600);
		Wallet.sendKeys(amount);
		Thread.sleep(600);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);


		////previous window	

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
		Site.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


		Hamberger.click();
		Thread.sleep(600);
		PAS.click();
		Thread.sleep(600);
		List<WebElement> dynamicElement01=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement01.size() !=0)
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

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(3000);
		Billing.click();
		Thread.sleep(1000);
		AvailedService.click();
		Thread.sleep(2000);
		//AdvanceView.click();

		driver.findElement(By.xpath("//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")).click();
		Thread.sleep(1000);
	     driver.findElement(By.xpath("//li[normalize-space()='Cancelled']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(1000);


		js.executeScript("arguments[0].scrollIntoView();", PaymentInfo);
		Thread.sleep(1000);
		PaymentInfo.click();
		Thread.sleep(3000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		js.executeScript("arguments[0].scrollIntoView();", adjInfo);
		Thread.sleep(1000);
		adjInfo.click();
		Thread.sleep(3000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(2000);
		droplist.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Cancelled']")).click();
		//Thread.sleep(2000);
		//	driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(2000);

	}




}