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

public class Naufar_EMRhidenote_Yasassiweb  extends PageFactoryInitYasasiiWeb {

	public Naufar_EMRhidenote_Yasassiweb(WebDriver driver) {
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


	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "//div[contains(text(),'CPOE Pharmacy')]")
	public WebElement CPOEpharm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement MedicineSearch;

	@FindBy(xpath = "//label[normalize-space()='G91.2 (Idiopathic) normal pressure hydrocephalus']//span[@class='checkmark']")
	public WebElement diagnosischevckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[11]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement diagnosischevckbox1;

	@FindBy(xpath = "//label[contains(@class,'check-container ng-star-inserted')]//span[contains(@class,'checkmark')]")
	public WebElement inclinicadmin;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;	

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


	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//div[contains(text(),'ADT Info')]")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='admittype']")
	public WebElement AdmissionType;

	@FindBy(xpath = "//input[@id='admittedproviderdisplayname']")
	public WebElement providername;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;

	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;

	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement prescriptionType;

	@FindBy(xpath = "//i[@class='ki ki-discharge-reconciliation']")
	public WebElement DischargeReconcile;

	@FindBy(xpath = "//i[@class='fa fa-print print-size']")
	public WebElement PrescriptionPrintDN;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
	public WebElement Plan;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PlanText;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;

	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;

	@FindBy(xpath="//input[@id='subcategory']")
	public WebElement SubCategory;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement OverRidereason;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='duration']")
	public WebElement duration;

	@FindBy(xpath = "//i[@title='More']")
	public WebElement More;

	@FindBy(xpath = "//div[normalize-space()='Hide Note']")
	public WebElement Hidenote;

	@FindBy(xpath = "//span[@class='btn btn-primary sm mt0 mb0 mr0 active']//i[@class='ki ki-check']")
	public WebElement save;

	@FindBy(xpath = "//textarea[@id='hidedreason']")
	public WebElement HideReason;

	@FindBy(xpath = "//label[normalize-space()='Reason For Hide :']")
	public WebElement reasonForHide;

	@FindBy(xpath = "//textarea[@id='hidedreason']")
	public WebElement UnhideReason;

	@FindBy(xpath = "//label[normalize-space()='Reason For UnHide :']")
	public WebElement reasonForunHide;

	@FindBy(xpath = "//i[@class='ki ki-print']")
	public WebElement Print;

	@FindBy(xpath = "//label[normalize-space()='Visually Impaired']//span[@class='checkmark']")
	public WebElement VisuallyImpaired;

	@FindBy(xpath = "//label[normalize-space()='Speech Impaired']//span[@class='checkmark']")
	public WebElement SpeechImpaired;

	@FindBy(xpath = "//label[@class='icon cpoeadmin']")
	public WebElement CpoeAdmin;

	@FindBy(xpath = "//label[@title='In-Clinic Administration']//span[@class='checkmark']")
	public WebElement inclinic;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/span[2]/label[1]/i[1]")
	public WebElement admin2;

	@FindBy(xpath = "//input[@id='statusid']")
	public WebElement Status;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement AdminAdd;

	@FindBy(xpath = "//textarea[@id='Remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement AdminSave;

	@FindBy(xpath = "(//i[@class='ki ki-info-circle admin-info'])[2]")
	public WebElement AdminInfo2;

	@FindBy(xpath = "//input[@id='quantity']")
	public WebElement Quantity;

	@FindBy(xpath = "//div[@class='modal-content-area']//button[@type='button'][normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//input[@id='recommeddose']")
	public WebElement RecommendedDose;

	@FindBy(xpath = "//input[@id='fav']")
	public WebElement DiagSearch;

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement Diag3dot;

	@FindBy(xpath = "(//i[@class='ki ki-chevron-down'])[3]")
	public WebElement ActiveSubstanceProblems;

	@FindBy(xpath = "(//i[@class='ki-user-drug ki'])[1]")
	public WebElement Admin1;

	@FindBy(xpath = "//input[@id='brand']")
	public WebElement Brand;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement VerifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement Password;

	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement rejectquantity;

	@FindBy(xpath = "//i[@class='ki ki-info-circle admin-info']")
	public WebElement Admin1details;

	@FindBy(xpath = "//i[@title='Order Type']")
	public WebElement Filter;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/ki-checkbox-control[1]/label[1]/label[1]")
	public WebElement ALL;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement OK1;

	@FindBy(xpath = "(//i[@title='Home Dose'])[4]")
	public WebElement HomeDose;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-homedose[1]/div[2]/div[1]/div[1]/div[1]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement Fromdate;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-homedose[1]/div[2]/div[1]/div[1]/div[2]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement Todate;
	
	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set1;
	
	@FindBy(xpath = "//input[@id='receviedby']")
	public WebElement RecieveBy;
	
	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	
	@FindBy(xpath = "//button[normalize-space()='Signature']")
	public WebElement Signature;
	
	

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

		VisuallyImpaired.click();
		Thread.sleep(500);
		SpeechImpaired.click();
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
		//driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//Thread.sleep(1000);

	//	JavascriptExecutor js= (JavascriptExecutor) driver;
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
		HSSFSheet BirthRegistration=wb.getSheetAt(36);	
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


	public void ADT(String  ADTprovider ) throws InterruptedException {


		/////Admit the patient
		ADT.click();
		Thread.sleep(1500);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);

		{

			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));
			JavascriptExecutor js= (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}

		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Deluxe')])")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		//SelectBed.click();
		Thread.sleep(500);
		SAve.click();
		Thread.sleep(3000);

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

		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
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
		driver.findElement(By.xpath("//li[normalize-space()='Dental Examination and Treatment']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);

		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);
		DiagSearch.click();
		Thread.sleep(1000);
		DiagSearch.sendKeys("ICD");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='ICD ']")).click();
		Thread.sleep(2000);




		/////Cpoe Pharmacy


		CPOEpharm.click();
		Thread.sleep(1000);

		//////////Narcotic for second nurse verification

		driver.findElement(By.xpath("//div[@title='Buprenorphine']")).click();
		Thread.sleep(2000);
		RecommendedDose.click();
		driver.findElement(By.xpath("//li[contains(text(),'Subutex 0.4mg SL tab 7s, 1 Tab(s)')]")).click();
		Thread.sleep(2000);
		duration.clear();
		Thread.sleep(1000);
		duration.sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='durationunitid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);


		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
		Thread.sleep(1000);
		diagnosischevckbox.click();
		Thread.sleep(1000); 
		inclinic.click();
		Thread.sleep(1000); 
		medicineAdd.click();
		Thread.sleep(1000);

		/////////////////	

		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("Calpol");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
		Thread.sleep(1000);
		duration.clear();
		Thread.sleep(1000);
		duration.sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='durationunitid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='PRN']")).click();
		Thread.sleep(1000);


		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
		Thread.sleep(1000);
		diagnosischevckbox.click();
		Thread.sleep(1000); 
		inclinic.click();
		Thread.sleep(1000); 
		medicineAdd.click();
		Thread.sleep(1000);


		CPOEpharm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Medicines']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search Medicines']")).sendKeys("dolo");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@title,'by Oral')])[1]")).click();
		Thread.sleep(1000);
		duration.clear();
		Thread.sleep(1000);
		duration.sendKeys("5");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='durationunitid']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Day(s)']")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);

		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox1);
		Thread.sleep(1000);
		diagnosischevckbox1.click();
		Thread.sleep(1000); 
		inclinic.click();
		Thread.sleep(1000); 


		medicineAdd.click();
		Thread.sleep(1000);
		OverRidereason.click();
		Thread.sleep(500);
		OverRidereason.sendKeys("ok");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
		Thread.sleep(500);
		PrescriptionPrintDN.click();
		Thread.sleep(3000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);



		////Plan	
		Thread.sleep(1000);
		Plan.click();
		Thread.sleep(1000);
		PlanText.click();
		Thread.sleep(1000);
		PlanText.sendKeys("There were pretty minor changes in transition from ODF 1.0 to 1.1 versions. The ODF 1.2 version is the latest version for ODF specifications and should be consulted by developers for development of applications related to ODS reading/writing.");
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(3000);


		///////Note hide and unhide


		More.click();
		Thread.sleep(1500);
		Hidenote.click();
		Thread.sleep(700);
		HideReason.click();
		Thread.sleep(700);
		HideReason.sendKeys("Not needed");
		Thread.sleep(700);
		save.click();
		Thread.sleep(1200);

		More.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[normalize-space()='Log']")).click();
		Thread.sleep(700);

		String reasonForHideget = reasonForHide.getText();
		System.out.println(reasonForHideget +"reasonForHideget");
		Thread.sleep(700);

		More.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[normalize-space()='Unhide Note']")).click();
		Thread.sleep(700);
		UnhideReason.click();
		Thread.sleep(700);
		UnhideReason.sendKeys("Reverting Back");
		Thread.sleep(700);
		save.click();
		Thread.sleep(1200);


		More.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[normalize-space()='Log']")).click();
		Thread.sleep(700);

		String reasonForunHideget = reasonForunHide.getText();
		System.out.println(reasonForHideget + "reasonForunHideget");
		Thread.sleep(700);

		Print.click();
		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);


		////////Active Substance

		driver.findElement(By.xpath("//label[@class='icon refresh']")).click();
		Thread.sleep(700);
		Diag3dot.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='items']")).click();
		Thread.sleep(700);

		ActiveSubstanceProblems.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[normalize-space()='Inactive Substance Problems']")).click();
		Thread.sleep(700);

		Diag3dot.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[@class='items']")).click();
		Thread.sleep(700);

		ActiveSubstanceProblems.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[normalize-space()='Active Substance Problems']")).click();
		Thread.sleep(700);

		ActiveSubstanceProblems.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//div[normalize-space()='Active Problems']")).click();
		Thread.sleep(700);

	}


	public void CPOE() throws InterruptedException, AWTException {

		Thread.sleep(700);
		CpoeAdmin.click();
		Thread.sleep(700);


		///////Second nurse verification

		Admin1.click();
		Thread.sleep(700);
		Brand.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Subutex 0.4mg SL tab 7s']")).click();
		Thread.sleep(700);
		rejectquantity.click();
		Thread.sleep(700);
		rejectquantity.sendKeys("0");
		Thread.sleep(700);
		AdminSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(700);
	//	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
	//	Thread.sleep(700);


		VerifiedBy.click();
		Thread.sleep(700);
		VerifiedBy.sendKeys("100413");
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Mrs. Nadia Benaissa(100413)']")).click();
		Thread.sleep(700);
		Password.click();
		Thread.sleep(700);
		Password.sendKeys("KAmeda123$");
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		Thread.sleep(700);

		act.moveToElement(Admin1details).build().perform();
		Thread.sleep(2000);

		////Filter for PRN

		Thread.sleep(700);
		Filter.click();
		Thread.sleep(700);
		ALL.click();
		Thread.sleep(700);
		OK1.click();
		Thread.sleep(700);
		Filter.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//label[@class='check-container prn-fltr']//span[@class='checkmark']")).click();
		Thread.sleep(700);
		ALL.click();
		Thread.sleep(700);
		Filter.click();
		Thread.sleep(700);


		//////////Not Administered		


		admin2.click();
		Thread.sleep(700);
		Status.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Not Administered']")).click();
		Thread.sleep(700);
		AdminAdd.click();
		Thread.sleep(700);
		
		Remarks.click();
		Thread.sleep(700);
		Remarks.sendKeys("patient Not coperating");
		Thread.sleep(700);
		AdminAdd.click();
		Thread.sleep(700);
		Thread.sleep(500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
	
	
		Thread.sleep(700);
		
		AdminSave.click();
		Thread.sleep(700);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		}


		else {
			System.out.println("sri");
		}
	
	
		Thread.sleep(700);
		
		act.moveToElement(AdminInfo2).build().perform();
		Thread.sleep(2000);

		admin2.click();
		Thread.sleep(700);
		Quantity.clear();
		Thread.sleep(700);
		Quantity.sendKeys("2");
		Thread.sleep(700);
		AdminAdd.click();
		Thread.sleep(700);

		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		}


		else {
			System.out.println("sri");
		}
	
	
		Thread.sleep(700);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1200);


		Quantity.clear();
		Thread.sleep(700);
		Quantity.sendKeys("1");
		Thread.sleep(700);
		AdminAdd.click();
		Thread.sleep(700);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		}


		else {
			System.out.println("sri");
		}
	
	
		Thread.sleep(700);	
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/label[3]/i[1]")).click();
		Thread.sleep(1200);
		Close.click();
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-mar-admin[1]/div[3]/div[4]/table[1]/tbody[1]/tr[2]/td[1]/label[3]/i[1]")).click();
		Thread.sleep(1200);
		Close.click();
		Thread.sleep(700);
		AdminSave.click();
		Thread.sleep(2000);

		act.moveToElement(AdminInfo2).build().perform();
		Thread.sleep(1200);
		

	////////Home Dose validation
		
		HomeDose.click();
		Thread.sleep(700);
		Fromdate.click();
		Thread.sleep(1200);
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_RIGHT);
		t.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_RIGHT);
		t.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1200);
		
		
		Set1.click();
		Thread.sleep(1200);
		
		Todate.click();
		Thread.sleep(1200);
		
		for (int i = 0; i < 1; i++) {
			
	
			t.keyPress(KeyEvent.VK_RIGHT);
			t.keyRelease(KeyEvent.VK_RIGHT);
			Thread.sleep(400);
			
		}
		
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1200);
		Set1.click();
		Thread.sleep(1200);
		RecieveBy.click();
		Thread.sleep(600);
		RecieveBy.sendKeys("divya");
		Thread.sleep(600);
		
		Signature.click();
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
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);
		
		
		HomeDose.click();
		Thread.sleep(700);
		
		Todate.click();
		Thread.sleep(1200);
		
		for (int i = 0; i < 3; i++) {
			
	
			t.keyPress(KeyEvent.VK_RIGHT);
			t.keyRelease(KeyEvent.VK_RIGHT);
			Thread.sleep(400);
			
		}
		
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1200);
		Set1.click();
		Thread.sleep(1200);
		RecieveBy.click();
		Thread.sleep(600);
		RecieveBy.sendKeys("divya");
		Thread.sleep(600);
		
		Signature.click();
		Thread.sleep(2000);
		Actions builder1 = new Actions(driver);
		Action drawAction1 = builder1.moveToElement(driver.findElement(By.cssSelector(".upper-canvas"))) //start points x axis and y axis. 

				.moveByOffset(-100,0)
	        	.clickAndHold()
				.moveByOffset(-50,0) // 2nd points (x1,y1)
				.moveByOffset(20,50)// 3rd points (x2,y2)
				.moveByOffset(30,0) // 2nd points (x1,y1)
				.moveByOffset(0,-50)// 3rd points (x2,y
				.moveByOffset(20,90)
				.moveByOffset(50,-65)
				.moveByOffset(50,6)
				.release()
				.build();
		drawAction1.perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		
		
		
	}



}


