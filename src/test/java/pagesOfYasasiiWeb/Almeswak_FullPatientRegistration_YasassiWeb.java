package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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

public class Almeswak_FullPatientRegistration_YasassiWeb extends PageFactoryInitYasasiiWeb {

	public Almeswak_FullPatientRegistration_YasassiWeb(WebDriver driver) {
		super(driver);
	}



	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[2]/i[1]")
	public WebElement camera;

	@FindBy(xpath = "//button[contains(text(),'Take A Snapshot')]")
	public WebElement takeasnap;

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

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[8]/div[1]/div[1]/div[1]/div[1]")
	public WebElement remarks;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement remarksarea;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[7]/div[1]/div[1]/div[1]/div[1]")
	public WebElement documentstab;

	@FindBy(xpath="//input[@id='filecategoryid']")
	public WebElement filecategory;

	@FindBy(xpath="//input[@id='filesubcategoryid']")
	public WebElement subcategory;

	@FindBy(xpath = "//button[contains(text(),'Attach')]")
	public WebElement docatt;

	@FindBy(xpath = "//button[contains(text(),'Capture')]")
	public WebElement doccap;

	@FindBy(xpath = "//label[normalize-space()='Emergency']//span[@class='checkmark']")
	public WebElement checkbox;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/app-camera-component[1]/div[3]/div[1]/input[1]")
	public WebElement doccapname;

	@FindBy(xpath = "//button[contains(text(),'Take A Snapshot')]")
	public WebElement doccapsnapshot;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement howdiduknow;

	@FindBy(xpath = "//label[normalize-space()='Support Groups']//span[@class='checkmark']")
	public WebElement checknewspaper;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement howdiduknowOk;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement saveok;

	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;

	@FindBy(xpath = "//input[@id='IdentifyingDocs']")
	public WebElement idDocs;


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;


	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//span[normalize-space()='Documents']")
	public WebElement Document;

	@FindBy(xpath = "//input[@id='filecategoryid']")
	public WebElement fILECATEGORY;

	@FindBy(xpath = "//input[@id='filesubcategoryid']")
	public WebElement SubCATEGORY;

	@FindBy(xpath = "//button[normalize-space()='Attach']")
	public WebElement Attach;

	@FindBy(xpath = "//i[@class='fa fa-eye']")
	public WebElement Eye;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement close;

	@FindBy(xpath = "//div[normalize-space()='Emergency Contact']")
	public WebElement EmergencyContact;

	@FindBy(xpath = "//label[normalize-space()='Guardian']//span[@class='checkmark']")
	public WebElement Guardian;

	@FindBy(xpath = "//label[normalize-space()='Same as Patient Address']//span[@class='checkmark']")
	public WebElement SameasPatientAddress;


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

	@FindBy(xpath = "//div[contains(text(),'Address Information')]")
	public WebElement AddressInformation;


	@FindBy(xpath = "//div[contains(text(),'Identifying Documents')]")
	public WebElement IDinfo;


	@FindBy(xpath = "//div[contains(text(),'Insurance And Other Information')]")
	public WebElement Insurance;

	@FindBy(xpath = "//div[contains(text(),'Family Members')]")
	public WebElement FamilyMemberInfo;


	@FindBy(xpath = "//div[@class='pat-info-group']//div[@class='pat-info-sub-title']")
	public WebElement Emergencyinfo;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Patient Info']")
	public WebElement PatientInfo;

	@FindBy(xpath = "//i[@class='ki ki-documents-fill']")
	public WebElement DocumentInfo;

	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;


	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement PAS;








	public void PatientReg( String Title ,String myfirstname ,String myage,String myphoneno,String myaltphoneno,String myhomeadd1,String myhomeadd2,String mydocnumber,String MRNo,String familyName,String Organisation,String mail,String relatedMR    ) throws InterruptedException, IOException, AWTException {

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
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
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
		altphoneno.sendKeys(myaltphoneno);
		Thread.sleep(600);




		//////////////Enter Patient information


		familyname.sendKeys(familyName);
		Thread.sleep(600);
		mothermaidenname.sendKeys("Kipa Fernadas");
		Thread.sleep(500);
		bloodgroup.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[contains(text(),'B+')]")).click();
		Thread.sleep(600);
		nationality.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'Indian')]")).click();
		Thread.sleep(600);
		preferedlanguageid.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'English')]")).click();
		Thread.sleep(600);
		organisation.sendKeys(Organisation);
		Thread.sleep(600);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[3]/ul[1]/app-autocompletelist-item[1]/li[1]")).click();
		//vip.click();
		Thread.sleep(600);
		physicallychallenge.click();




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
		homeadd2.sendKeys(myhomeadd2);





		//////////////Enter Document information

		DocumentIdentification.click();
		Thread.sleep(1000);
		//	idDocs.click();
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='Passport']")).click();
		//	Thread.sleep(1000);

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
		Thread.sleep(800);





		//////////////family member


		foRelatedMrnotab.click();
		Thread.sleep(600);
		relatedmrno.sendKeys(relatedMR);
		Thread.sleep(600);
		relatedmrno.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		relation.click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Others/آخر')]")).click();
		Thread.sleep(600);
		add.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[2]/div[1]/app-related-mrno[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/label[1]/i[1]")).click();
		//emcontact.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(600);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", EmergencyContact);


		///Emergeny contact
		Thread.sleep(600);
		EmergencyContact.click();
		Thread.sleep(600);
		Guardian.click();
		Thread.sleep(600);
		SameasPatientAddress.click();
		Thread.sleep(600);

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", documentstab);
		Thread.sleep(800);

		//////////////Enter Document


		/*	Document.click();
		Thread.sleep(1000);
		fILECATEGORY.click();
		driver.findElement(By.xpath("//li[normalize-space()='FO']")).click();
		Thread.sleep(1000);
		SubCATEGORY.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Insurance']")).click();
		Thread.sleep(600);
		Attach.click();
		Thread.sleep(600);


		// copying File path to Clipboard
		StringSelection str = new StringSelection("‪mortal");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(1000);
		// press Contol+V for pasting
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		//	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		//Thread.sleep(1000);

		Eye.click();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);       */


		//////////////Enter remark



		remarks.click();
		Thread.sleep(600);
		remarksarea.sendKeys("Patient is suffering from high fever");
		Thread.sleep(600);
		howdiduknow.click();
		Thread.sleep(600);
		checknewspaper.click();
		Thread.sleep(1000);
		howdiduknowOk.click();
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
		HSSFSheet FOFullRegTest=wb.getSheetAt(0);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(8).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(3000);


	}

	public void PatientInfo(String provider) throws InterruptedException, AWTException {

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
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

		///Patient Info

		PatientInfo.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", AddressInformation);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", Insurance);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", IDinfo);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", FamilyMemberInfo);
		Thread.sleep(2000);

		//js.executeScript("arguments[0].scrollIntoView();", EmergencyContact);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",  Emergencyinfo);
		Thread.sleep(2000);
		/*	DocumentInfo.click();
		Thread.sleep(1000);
		Eye.click();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);  */
















	}




}
