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

public class SP5_Mergedpatient_YasasiiWeb extends PageFactoryInitYasasiiWeb{

	public SP5_Mergedpatient_YasasiiWeb(WebDriver driver) {

		super(driver);

	}  


	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//button[@id='adddoc']//label")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

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


	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEpharm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement MedicineSearch;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement Orderingreason;


	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[11]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
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

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement ServiceSearch;

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

	@FindBy(xpath = "//i[@class='fa ng-star-inserted fa-angle-right']")
	public WebElement FO;

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
	
	
	
	
	
	

	public void patReg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE,String MBLNO2 , String AADHAR2) throws InterruptedException, IOException {


		Thread.sleep(2000);
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME);
		Thread.sleep(1000);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);

		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(3000);
		SaveSuccess.click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(87);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);

		//////Encounter
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();

		Thread.sleep(5000);
		EncounterAdd.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();

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
			MenuToggle.click();
			Thread.sleep(1000);
			//FO.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[normalize-space()='Registration']")).click();
			Thread.sleep(2000);
			Title.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
			Thread.sleep(1000);
			FirstName.click();
			Thread.sleep(1000);
			FirstName.sendKeys(NAME);
			Thread.sleep(1000);
			age.click();
			Thread.sleep(1000);
			age.sendKeys(AGE);
			Thread.sleep(1000);
			mobileNo.click();
			Thread.sleep(1000);
			mobileNo.sendKeys(MBLNO2);//////////////////////////////////////////
			Thread.sleep(1000);
			Organisation.click();
			Thread.sleep(1000);
			Organisation.sendKeys(ORGANISATION);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
			Thread.sleep(1000);
			ContactInformation.click();
			Thread.sleep(1000);
			address.click();
			Thread.sleep(1000);
			address.sendKeys(ADDRESS);
			Thread.sleep(1000);
			DocID.click();
			Thread.sleep(1000);
			for (int i1 = 0; i1 <=15; i1++) {
				aadharNo.sendKeys( Keys.BACK_SPACE);
			}
			//aadharNo.click();
			aadharNo.sendKeys(Keys.HOME + AADHAR2);
			Thread.sleep(1000);
			docAdd.click();
			Thread.sleep(1000);

			Thread.sleep(1000);

			List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

			if(dynamicElement1.size() !=0)
			{

			}

			else
			{
				driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
			}
			Thread.sleep(1000);
			howDidYouKnow.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
			OKhowDidYouKnow.click();
			Thread.sleep(1000);
			RegSave.click();
			Thread.sleep(3000);
			SaveSuccess.click();
			Thread.sleep(3000);
			String mrno1= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
			System.out.println(mrno1);
			Thread.sleep(2000);


			File src1=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
			FileInputStream fis1=new FileInputStream(src1);
			HSSFWorkbook wb1=new HSSFWorkbook(fis1);
			HSSFSheet FOFullRegTest1=wb1.getSheetAt(87);	
			int i1=FOFullRegTest1.getLastRowNum();
			System.out.println("Number of rows: " + i1);		
			FOFullRegTest1.getRow(i1).createCell(14).setCellValue(mrno1);	
			FileOutputStream fout1=new FileOutputStream(src1);	
			wb1.write(fout1);

			Thread.sleep(2000);

			//////Encounter
			Thread.sleep(1000);
			clear.click();
			Thread.sleep(1000);
			providerName.click();
			Thread.sleep(1000);
			providerName.sendKeys(PROVIDER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();

			Thread.sleep(5000);
			EncounterAdd.click();
			WebDriverWait wait1 = new WebDriverWait(driver,30);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
			EncounterSave.click();
			Thread.sleep(1000);
			SAvesuccess.click();
		
		

	}

	public void docnote(String URL, String User , String Password , String site, String MRNO ,String Procedure , String SERVICE) throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
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

		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(500);
		//UpArrow.click();
		Thread.sleep(500);
		//lock.click();
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
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);
		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		////////////////surgery procedure			

		CpoeService. click();
		Thread.sleep(1000);
		ServiceSearch.click();
		Thread.sleep(1000);
		ServiceSearch.sendKeys(Procedure);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Procedure+"')])")).click();
		Thread.sleep(1000);
		General.click();
		Thread.sleep(1000);
		clinicalindication.click();
		Thread.sleep(1000);
		clinicalindication.sendKeys("nil");
		Thread.sleep(1000);
		ReasonforOrder.click();
		Thread.sleep(1000);
		ReasonforOrder.sendKeys("patient in critical");
		Thread.sleep(1000);
		SurgeryDetails.click();
		Thread.sleep(1000);
		WoundClass.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Class I']")).click();
		Thread.sleep(1000);
		Transfustion.click();
		Thread.sleep(1000);
		PostopBed.click();
		Thread.sleep(1000);
		Implants.click();
		Thread.sleep(1000);
		Implants.sendKeys("nil");
		Thread.sleep(1000);
		infectious.click();
		Thread.sleep(1000);
		Equipments.click();
		Thread.sleep(1000);
		Equipments.sendKeys("nil");
		Thread.sleep(1000);
		Anesthiest.click();
		Thread.sleep(1000);
		Addprocedure.click();
		Thread.sleep(2000);
		ServiceSearch.click();
		Thread.sleep(1000);
		ServiceSearch.sendKeys(SERVICE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='"+SERVICE+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='icon-btn btn-dark-green inline min-clear-btm']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		Addprocedure.click();
		Thread.sleep(1000);
		
		/////////medicine
		Thread.sleep(1000);
		CPOEpharm.click();
		Thread.sleep(1000);
		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("Diabeta");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Orderingreason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		justification.click();
		Thread.sleep(1000);
		justification.sendKeys("ok");
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
		Thread.sleep(1000);
		diagnosischevckbox.click();
		Thread.sleep(1000);
		//	inclinicadmin.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(1000);
		Thread.sleep(1000);
		medicineAdd.click();
		
		
		
		
		
		
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000);
	}


	public void merge(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE ,String MBLNO2 , String MRNo2,String AADHAR2,String URL,String site) throws InterruptedException, IOException, AWTException {

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(3000);
		driver.get(URL);
		
		
		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("admin");
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys("kameda321");
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
		
//		
//		
//	///register the patient	
//		MenuToggle.click();
//		Thread.sleep(1000);
//		FO.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[normalize-space()='Registration']")).click();
//		Thread.sleep(2000);
//		Title.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
//		Thread.sleep(1000);
//		FirstName.click();
//		Thread.sleep(1000);
//		FirstName.sendKeys(NAME);
//		Thread.sleep(1000);
//		age.click();
//		Thread.sleep(1000);
//		age.sendKeys(AGE);
//		Thread.sleep(1000);
//		mobileNo.click();
//		Thread.sleep(1000);
//		mobileNo.sendKeys(MBLNO2);//////////////////////////////////////////
//		Thread.sleep(1000);
//		Organisation.click();
//		Thread.sleep(1000);
//		Organisation.sendKeys(ORGANISATION);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
//		Thread.sleep(1000);
//		ContactInformation.click();
//		Thread.sleep(1000);
//		address.click();
//		Thread.sleep(1000);
//		address.sendKeys(ADDRESS);
//		Thread.sleep(1000);
//		DocID.click();
//		Thread.sleep(1000);
//		for (int i = 0; i <=15; i++) {
//			aadharNo.sendKeys( Keys.BACK_SPACE);
//		}
//		//aadharNo.click();
//		aadharNo.sendKeys(Keys.HOME + AADHAR2);
//		Thread.sleep(1000);
//		docAdd.click();
//		Thread.sleep(1000);
//
//		Thread.sleep(1000);
//
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
//
//		if(dynamicElement.size() !=0)
//		{
//
//		}
//
//		else
//		{
//			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
//		}
//		Thread.sleep(1000);
//		howDidYouKnow.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
//		OKhowDidYouKnow.click();
//		Thread.sleep(1000);
//		RegSave.click();
//		Thread.sleep(3000);
//		SaveSuccess.click();
//		Thread.sleep(3000);
//		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
//		System.out.println(mrno);
//		Thread.sleep(2000);
//
//
//		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
//		FileInputStream fis=new FileInputStream(src);
//		HSSFWorkbook wb=new HSSFWorkbook(fis);
//		HSSFSheet FOFullRegTest=wb.getSheetAt(87);	
//		int i=FOFullRegTest.getLastRowNum();
//		System.out.println("Number of rows: " + i);		
//		FOFullRegTest.getRow(i).createCell(14).setCellValue(mrno);	
//		FileOutputStream fout=new FileOutputStream(src);	
//		wb.write(fout);
//
//		Thread.sleep(2000);
//
//		//////Encounter
//		Thread.sleep(1000);
//		clear.click();
//		Thread.sleep(1000);
//		providerName.click();
//		Thread.sleep(1000);
//		providerName.sendKeys(PROVIDER);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();
//
//		Thread.sleep(5000);
//		EncounterAdd.click();
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
//		EncounterSave.click();
//		Thread.sleep(1000);
//		SAvesuccess.click();

		
		
		
		
		
		
		
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
        Appointment.click();
        Thread.sleep(1000);
        EncounterAdd.click();
        Thread.sleep(1000);
        EncounterSave.click();
        Thread.sleep(1000);
        SAvesuccess.click();
        Thread.sleep(2000);
        
        ADT.click();
        Thread.sleep(1000);
        CPOeView.click();
        Thread.sleep(1000);
        ScheduleApp.click();
        Thread.sleep(1000);
        medicineView.click();
        Thread.sleep(1000);
        PrescriptionPrint.click();
        Thread.sleep(1000);

    	Robot t=new Robot();
    	Thread.sleep(1000);
    	t.keyPress(KeyEvent.VK_ESCAPE);
    	t.keyRelease(KeyEvent.VK_ESCAPE);
    	Thread.sleep(1000);
    	Merge.click();
    	Thread.sleep(2000);

	////////////////EMR
    	
    	
    	// previous window
    	int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("CURRENT NO.OF WINDOWS"+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("go to window no."+ m);
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(m));
		Thread.sleep(3000);

    	EnterPatientName.sendKeys(MRNo2);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo2+"')])[1]")).click();
		Thread.sleep(1000);
		 family.click();
		 Thread.sleep(1000);
		 Merged.click();
		 Thread.sleep(1000);
    	
		
	}
		

	


}










