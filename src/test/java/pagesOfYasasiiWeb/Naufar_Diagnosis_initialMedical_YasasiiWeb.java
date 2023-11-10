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
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Naufar_Diagnosis_initialMedical_YasasiiWeb  extends PageFactoryInitYasasiiWeb {

	public Naufar_Diagnosis_initialMedical_YasasiiWeb(WebDriver driver) {
		super(driver);
	}








	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
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

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement HistoryoFpresentillness;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[2]/div[4]/ki-select-control[1]/div[1]/input[1]")
	public WebElement FirstSubstance;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[3]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement SubstanceAge;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/ki-select-control[1]/div[1]/input[1]")
	public WebElement SubstanceUsedNow;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[3]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AgeOf1stUse;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[4]/ki-select-control[1]/div[1]/input[1]")
	public WebElement secondChoice;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[3]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AgeofSecondUse;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[3]/div[2]/div[4]/ki-select-control[1]/div[1]/input[1]")
	public WebElement thirrdChoice;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[3]/div[3]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Ageof3rduse;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[5]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement SubstanceUseHistory;

	@FindBy(xpath = "//div[@id='HTF100679']//span[@class='editable'][normalize-space()='Yes']")
	public WebElement PsychatricHistory;

	@FindBy(xpath = "//div[@id='HTF100681']//span[@class='editable'][normalize-space()='Yes']")
	public WebElement PreviousDiagnosisHistory;

	@FindBy(xpath = "//div[@id='HTF100683']//span[@class='editable'][normalize-space()='Yes']")
	public WebElement PreviousPsychatricHistory;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[12]/div[2]/div[4]/label[2]")
	public WebElement PreviousSurgicalHistory;

	@FindBy(xpath = "//div[@id='HTF1007592']//label[1]//span[2]")
	public WebElement HIV;

	@FindBy(xpath = "//div[@id='HTF1007593']//label[1]//span[2]")
	public WebElement HEPB;	

	@FindBy(xpath = "//div[@id='HTF1007594']//label[1]//span[1]")
	public WebElement HEPC;	

	@FindBy(xpath = "//div[@id='HTF100687']//label[1]//span[2]")
	public WebElement Seizures;	

	@FindBy(xpath = "//div[@id='HTF100688']//label[2]//span[2]")
	public WebElement Trauma;	

	@FindBy(xpath = "//div[@id='HTF100689']//span[@class='editable'][normalize-space()='No']")
	public WebElement Diabetis;

	@FindBy(xpath = "//div[@id='HTF100690']//label[1]//span[2]")
	public WebElement HyperTesnsion;

	@FindBy(xpath = "//div[@id='HTF1006158']//label[2]//span[2]")
	public WebElement BloodBorne;

	@FindBy(xpath = "//div[@id='HTF1006159']//label[1]//span[2]")
	public WebElement ForensicHistory;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[23]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement FamilyHistory;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[24]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PersonalHistory;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[25]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement SocialHistory;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[26]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement MentalStatus;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement Diagnosis;

	@FindBy(xpath = "//div[normalize-space()='Add Note']")
	public WebElement AddNote;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-diagnosis-template[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[3]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Onset;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-diagnosis-template[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[2]/div[3]/ki-select-control[1]/div[1]/input[1]")
	public WebElement duration;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-diagnosis-template[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[3]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement Remarks;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
	public WebElement PLAN;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[11]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PlanText;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EMRSave;

	@FindBy(xpath = "//div[contains(text(),'Risk Assessment')]")
	public WebElement RiskAssesment;

	@FindBy(xpath = "//span//i[@class='ki ki-chevron-down']")
	public WebElement ActiveProblems;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-patient-icd-info[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement ActiveProblems2;

	@FindBy(xpath = "//button[@class='btn btn-danger sm clear']")
	public WebElement Close;

	@FindBy(xpath = "//label[contains(text(),'Problems')]")
	public WebElement Problems;

	@FindBy(xpath = "//div[@class='hsc-md-header']//span//i[@class='ki ki-chevron-down']")
	public WebElement DownArrow;

	@FindBy(xpath = "//div[@class='modal-footer']//button[@class='btn btn-danger sm clear'][normalize-space()='Close']")
	public WebElement Close1;
	
	@FindBy(xpath = "//label[@title='Schedule View']")
	public WebElement ScheduleView;

	@FindBy(xpath = "//div[normalize-space()='Active Problems']")
	public WebElement ActiveProblems1;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement templatelog;

	









	public void Patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider ) throws InterruptedException, IOException, AWTException {

		///////////////////Register a female patient

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(1000);
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
		Thread.sleep(500);
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastname);
		Thread.sleep(500);
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


		Thread.sleep(600);
		EnterMob.sendKeys(MobNo);
		Thread.sleep(500);
		maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);



		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\NauferYasassiWeb - 8083\\src\\test\\resources\\excelYasasiiWeb\\NaufarDataSheet8083.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(37);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);

		///////////////encounter

		billing.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		printUnckeck.click();
		Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);


	}


	public void	DoctorNote(String DOCuser ,String DOCpassword, String Site , String MRNo,String ADTProvider ) throws InterruptedException, AWTException, IOException {


		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
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
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));


		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

/*		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(700);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Initial Medical Assessment.']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);

		HistoryoFpresentillness.click();
		Thread.sleep(700);
		HistoryoFpresentillness.sendKeys("This data will pre-populate into the next note template.");
		Thread.sleep(700);
		FirstSubstance.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Heroin']")).click();
		Thread.sleep(1000);
		SubstanceAge.sendKeys("34");
		Thread.sleep(700);
		SubstanceUsedNow.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Heroin']")).click();
		Thread.sleep(1000);

		AgeOf1stUse.sendKeys("6");
		Thread.sleep(700);
		secondChoice.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Cannabis']")).click();
		Thread.sleep(1000);
		AgeofSecondUse.sendKeys("9");
		Thread.sleep(700);
		thirrdChoice.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Synthetic Cannabinoids']")).click();
		Thread.sleep(1000);
		Ageof3rduse.sendKeys("5");
		Thread.sleep(700);
		SubstanceUseHistory.click();
		Thread.sleep(700);
		SubstanceUseHistory.sendKeys("In the 4th Asian Para Games, India will send its biggest-ever contingent to the Asian Para Games 2023, which will take place between October 22-28 in Hangzhou, China. A total of 309 athletes from India including 196 men ");
		Thread.sleep(700);
		PsychatricHistory.click();
		Thread.sleep(700);
		PreviousDiagnosisHistory.click();
		Thread.sleep(700);
		PreviousPsychatricHistory.click();
		Thread.sleep(700);
		PreviousSurgicalHistory.click();
		Thread.sleep(700);

		HIV.click();
		Thread.sleep(700);
		HEPB.click();
		Thread.sleep(700);
		HEPC.click();
		Thread.sleep(700);

		Seizures.click();
		Thread.sleep(700);
		Trauma.click();
		Thread.sleep(700);
		Diabetis.click();
		Thread.sleep(700);
		HyperTesnsion.click();
		Thread.sleep(700);
		BloodBorne.click();
		Thread.sleep(700);
		

		js.executeScript("arguments[0].scrollIntoView();",ForensicHistory );
		Thread.sleep(2000);
		ForensicHistory.click();
		Thread.sleep(700);

		FamilyHistory.sendKeys("The Para Asian Games 2023 are still ongoing, so the medal tally is subject to change. However, as of today, October 23, 2023, the top 5 countries on the medal tally are:");
		Thread.sleep(700);
		PersonalHistory.sendKeys("The Para Asian Games 2023 are still ongoing, so the medal tally is subject to change. However, as of today, October 23, 2023, the top 5 countries on the medal tally are:");
		Thread.sleep(700);
		SocialHistory.sendKeys("Adda247 provides you best compilation of Sports Current Affairs & News. Sports Current Affairs includes National and International sports and tournaments, and awards related to cricket, football, tennis, and other sports. This article covers all the important Current Affairs related to Sports News & Events.");
		Thread.sleep(700);
		MentalStatus.sendKeys("//div[contains(text(),'Diagnosis and Plan')]");
		Thread.sleep(700);


		Diagnosis.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-diagnosis-plan[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);

	
		driver.findElement(By.xpath("(//i[@class='fa fa-ellipsis-v'])[2]")).click();
		Thread.sleep(1000);

		AddNote.click();
		Thread.sleep(700);
		Onset.sendKeys("5");
		Thread.sleep(700);
		duration.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Days']")).click();
		Thread.sleep(1000);
		Remarks.sendKeys("Adda247 provides you best compilation of Sports Current Affairs & News. Sports Current Affairs includes National and International sports and tournaments, and awards related to cricket, football, tennis, and other sports. This article covers all the important Current Affairs related to Sports News & Events. Sports Current Affairs");
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='modal-footer ng-star-inserted']//button[1]")).click();
		Thread.sleep(1000);


		RiskAssesment.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[79]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[113]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[129]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[148]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='checkmark'])[178]")).click();
		Thread.sleep(1000);
		
		
		PLAN.click();
		Thread.sleep(700);
		PlanText.sendKeys("Sports Current Affairs 2023 Read all the latest Sports Current Affairs Updates for 2023 at CurrentAffairs Adda247. This is the right place to get quick updates on the Latest Sports Current Affairs 2023 and events not only for the competitive exam but also for the interview.\r\n"
				+ "Sports\r\n"
				+ "Pakistan National Cricket Team, Players Name List\r\n"
				+ "Sports Current Affairs 2023 Daily, Weekly & Monthly_50.1\r\n"
				+ "");
		Thread.sleep(700);
 
		EMRSave.click();    */
		Thread.sleep(3000);

		ActiveProblems.click();
		Thread.sleep(700);
		ActiveProblems1.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='cat-list ng-star-inserted']//div[1]//div[2]//div[1]//i[1]")).click();
		Thread.sleep(3000);
		Close.click();
		driver.findElement(By.xpath("//div[@id='hpl-problem']//div[2]//div[2]//div[1]//i[1]")).click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(1700);
		
		
		Problems.click();
		Thread.sleep(2000);
		DownArrow.click();
		Thread.sleep(2000);
		ActiveProblems2.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-patient-icd-info[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/i[1]")).click();
		Thread.sleep(3000);
		Close1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='hpu-problem']//div[2]//div[2]//div[1]//i[1]")).click();
		Thread.sleep(3000);
		act.moveToElement(templatelog).click().build().perform();
		Thread.sleep(3000);
		
		Close1.click();
		Thread.sleep(1000);
		
		
	}

}
