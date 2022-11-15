package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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

public class SP5_IPhomeLeave_YasassiWeb extends PageFactoryInitYasasiiWeb{

	public SP5_IPhomeLeave_YasassiWeb(WebDriver driver) {

		super(driver);

	} 


	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Hamburger;
	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement Registration;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;
	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMiss;
	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement EnterFirstNME;
	@FindBy(xpath = "//input[@id='age']")
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
	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement Save;
	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement OK;
	@FindBy(xpath = "//label[normalize-space()='Emergency']//span[@class='checkmark']")
	public WebElement checkbox;



	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;
	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement SelectProviderName;
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoomType;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement Threedot;

	@FindBy(xpath = "//div[contains(text(),'Home Leave/Movement')]")
	public WebElement PatientOnleave;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='leavetypeid']//input[@id='undefined']")
	public WebElement Type;

	@FindBy(xpath = "//ki-calendar[@id='expectedreturndate']//input[@type='text']")
	public WebElement ExpectedDate;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//textarea[@id='remarks']")
	public WebElement remarks;

	@FindBy(xpath = "//div[contains(text(),'Billing')]")
	public WebElement Billing;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servName;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement AddService;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement MenuToggle;
	
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement SelectIP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

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

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement DisRecom;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[contains(@class,'checkmark')]")
	public WebElement Dischargecheckbox;



	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement IP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;

	

	@FindBy(xpath = "//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement EMR;

	@FindBy(xpath = "//span[normalize-space()='White Board']")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;


	@FindBy(xpath = "//i[@class='ki ki-info-circle']")
	public WebElement element;

	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement REadyForDischarge;

	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifyPassword;

	@FindBy(xpath = "//button[@id='verifyuser']")
	public WebElement verifySave;

	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EmrIcon;

	@FindBy(xpath = "//button[normalize-space()='Department Clearance']")//button[normalize-space()='Department Clearance']
	public WebElement Depclearance;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement laboratoryCheckbox;

	@FindBy(xpath = "//tbody/tr[2]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement radiologyCheckbox;

	
	@FindBy(xpath = "//tbody/tr[3]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement medicalclrnceCheckbox;
	
	
	@FindBy(xpath = "//button[normalize-space()='Pharmacy Clearance']")
	public WebElement pharmacyClearance;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOPatientSelect;

   @FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargeStatus;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//i[@class='ki ki-redo']")
	public WebElement RollBack;

	@FindBy(xpath = "//div[contains(text(),'Home Leave/Movement Edit')]")
	public WebElement HomeleaveEdit;

	@FindBy(xpath = "//ki-calendar[@id='actualreturndate']//input[@type='text']")
	public WebElement AdctualReturn;
	
	@FindBy(xpath = "//button[@id='updatepatadtbutton']")
	public WebElement ADTupdate;

	@FindBy(xpath = "//div[contains(text(),'Home Leave/Movement Cancel')]")
	public WebElement homeLeaveCancel;

	@FindBy(xpath = "//textarea[@id='cancelreason']")
	public WebElement CancelReason;

	@FindBy(xpath = "//span[normalize-space()='Normal']")
	public WebElement Category;

	@FindBy(xpath = "//span[@title='Normal']")
	public WebElement normal;
	
	@FindBy(xpath = "//span[@title='VVIP']")
	public WebElement VVIP;
	
	@FindBy(xpath = "//i[@title='MRNo/Name']")
	public WebElement nameicon;
	
	@FindBy(xpath = "//i[@class='ki ki-files']")
	public WebElement docmnt;
	
	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement dischargethreedot;
	
	@FindBy(xpath = "//div[contains(text(),'Discharge Cancel')]")
	public WebElement dischargeCancel;
	
	@FindBy(xpath = "//input[@id='cancelreason']")
	public WebElement dischargeCancelReason;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	public void PATREG(String Name,String AadharNumber,String MRNo,String Provider ,String ADTprovider ) throws InterruptedException, IOException {

		///////////////////Register a female patient

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(1000);
		Registration.click();
		Thread.sleep(500);
		Title.click();
		Thread.sleep(800);
		SelectMiss.click();
		Thread.sleep(800);
		EnterFirstNME.sendKeys(Name);
		Thread.sleep(800);
		EnterAge.sendKeys("25");
		Thread.sleep(800);
		EnterMob.sendKeys("122248789");
		Thread.sleep(800);
		Category.click();
		Thread.sleep(800);
		normal.click();
		Thread.sleep(800);
		VVIP.click();
		Thread.sleep(800);
		EnterOrganisationLetter.sendKeys("Other");
		Thread.sleep(1000);
		SelectOrganisation.click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		EnterAddress.sendKeys("Trivandrum");
		Thread.sleep(1000);
		DocumentIdentification.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		EnterAadhar.sendKeys(AadharNumber );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);
     	List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(800);
		//checkbox.click();
		HowDidYouKnow.click();
		Thread.sleep(800);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='saveregistrationbutton']")).click();
		//	Save.click();
		Thread.sleep(3000);
		OK.click();

		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		/*	String word[]=mrno.split("[ :] ");
			System.out.println("number of words: "+word.length);
			for(int i=0;i<word.length;i++)
			{
				System.out.println("word["+i+"]="+word[i]);
			}
			System.out.println(word[1]);  */

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(86);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(2).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);

		///////////////encounter

		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));

		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		/////Admit the patient
		ADT.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Super Deluxe')])")).click();
		//SelectRoomType.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		/*	{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//ul[@id='check']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}*/

		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		//SelectBed.click();
		SAve.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();

	}


	public void HomeLeave(String service) throws AWTException, InterruptedException {
		Thread.sleep(1000);
		Threedot.click();
		Thread.sleep(1000);
		PatientOnleave.click();
		Thread.sleep(1000);
		Type.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Home Leave']")).click();
		Thread.sleep(1000);
		ExpectedDate.click();
		Thread.sleep(1000);
		Robot r=new Robot();
		for (int i = 0; i < 2; i++) {

			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);

		}
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		remarks.click();
		Thread.sleep(1000);
		remarks.sendKeys("as per patient request");
		Thread.sleep(1000);
		SAve.click();
		Thread.sleep(2000);


		Billing.click();
		Thread.sleep(1000);
		Service.click();
		Thread.sleep(1000);
		Addnew.click();
		Thread.sleep(1000);
		servName.click();
		Thread.sleep(1000);
		servName.sendKeys(service);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		driver.findElement(By.xpath("//li[normalize-space()='"+service+"']")).click();
		Thread.sleep(1000);
		AddService.click();
		Thread.sleep(1000);
		Save.click();//div[@class='page-inner-btn-group']//button[1]
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);



	}


	public void	DoctorNote(String DOCuser ,String DOCpassword,String URL , String Site , String MRNo,String AadharNumber) throws InterruptedException {



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
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



		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		OP.click();
		Thread.sleep(600);
		SelectIP.click();
		Thread.sleep(1000);
		nameicon.click();
		Thread.sleep(1000);
		docmnt.click();
		Thread.sleep(1000);
		
		
		
		EnterPatientName.sendKeys(AadharNumber);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
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

		Thread.sleep(1000);
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
		Thread.sleep(2000);
		DisRecom.click();
		Thread.sleep(1000);
		Dischargecheckbox.click();
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

		NoCurrentmed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		Thread.sleep(1000);
		NoCurrentmedCheck.click();
		Thread.sleep(1000);
		AdmsnReconcile.click();
		Thread.sleep(1000);
		Reconsile.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000);
		}


	public void dischargeApproval(String MRNo , String nurseUser , String  Password ,String URL , String Site) throws InterruptedException, AWTException {
		
		
		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		driver.switchTo().window(tabs.get(2));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(nurseUser);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		 driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


	///	driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(5000);
		Thread.sleep(1000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		
	   js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(3000);
		//act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		//element.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		act.moveToElement(REadyForDischarge).click().build().perform();
		Thread.sleep(2000);
		
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);
		
	////////ROLLBACK	
		
	    js.executeScript("arguments[0].scrollIntoView();", RollBack);
		Thread.sleep(3000);
		act.moveToElement(RollBack).click().build().perform();
		Thread.sleep(2000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);
		
		 js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(3000);
		//act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		//element.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		act.moveToElement(REadyForDischarge).click().build().perform();
		Thread.sleep(2000);
		
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		//openNewTab

	/*	Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));
		driver.switchTo().window(tabs1.get(2));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(depUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		 driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000); */

}

public void laboratoryClearance(String MRNo , String  Password , String nurseUser ) throws InterruptedException {
	
/*	Hamberger.click();
	Thread.sleep(1000);
	EmrIcon.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(2000);
	WhiteBoard.click();  */
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));
	
	
	Thread.sleep(1000);
	NameSearch.clear();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNo);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", Depclearance);
	Thread.sleep(3000);
	act.moveToElement(Depclearance).click().build().perform();
	//Depclearance.click();
	Thread.sleep(1000);
	laboratoryCheckbox.click();
	Thread.sleep(1000);
	radiologyCheckbox.click();
	Thread.sleep(1000);
	medicalclrnceCheckbox.click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(nurseUser);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	Thread.sleep(3000);
	
	//openNewTab

/*	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(3));
	driver.switchTo().window(tabs.get(3));
	Thread.sleep(5000);
	driver.get(URL);
	Thread.sleep(3000);

	//login
	userid.click();
	userid.sendKeys(RADuser);
	password.click();
	password.sendKeys(Password);
	Thread.sleep(1000);
	site.click();
	 driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(5000);    */
	
}
	

public void PharmacyClearance(String MRNo, String nurseUser,String Password , String AdminUser , String AdminPassword,String URL , String Site) throws InterruptedException {
	
/*	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(2000);
	WhiteBoard.click();
	Thread.sleep(1000);  */
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));
	Thread.sleep(1000);
	NameSearch.clear();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNo);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(1000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();",  pharmacyClearance);
	Thread.sleep(3000);
	act.moveToElement( pharmacyClearance).click().build().perform();

	Thread.sleep(1000);
	
	Thread.sleep(1000);
	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(nurseUser);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	
	//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(3));
		driver.switchTo().window(tabs.get(3));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	
}

public void ADTAppoval(String MRNo ) throws InterruptedException {
	Thread.sleep(3000);
	FOSearchField.click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	FOSearchField.sendKeys(MRNo);
	Thread.sleep(1000);
	FOSearchField.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(1000);
	ADT.click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);
	
	
	Thread.sleep(2000);
	dischargeStatus.click();//input[@id='dischargestatus']
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
	Thread.sleep(1000);
	disposition.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Discharged Home']")).click();
	Thread.sleep(1000);
	 ADTSave.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	
}


public void homeleaveCancel() throws AWTException, InterruptedException {
	
	Thread.sleep(800);
	Threedot.click();
	Thread.sleep(800);
	HomeleaveEdit.click();
	Thread.sleep(800);
	AdctualReturn.click();
	Thread.sleep(800);
	Robot r=new Robot();
	Thread.sleep(800);
	r.keyPress(KeyEvent.VK_ENTER);
	Thread.sleep(800);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(800);
	ADTupdate.click();
	
	Thread.sleep(1000);
	Threedot.click();
	Thread.sleep(1000);
	PatientOnleave.click();
	Thread.sleep(1000);
	Type.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Home Leave']")).click();
	Thread.sleep(1000);
	ExpectedDate.click();
	Thread.sleep(1000);
	
	for (int i = 0; i < 2; i++) {

		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);

	}
	Thread.sleep(800);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(800);
	remarks.click();
	Thread.sleep(1000);
	remarks.sendKeys("as per patient request");
	Thread.sleep(1000);
	SAve.click();
	Thread.sleep(2000);

	
	
	homeLeaveCancel.click();
	Thread.sleep(800);
	CancelReason.click();
	Thread.sleep(800);
	CancelReason.sendKeys("as per patient request");
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[@id='adtcancel']")).click();
	Thread.sleep(800);
	
	///ADT Discharge
	
	Thread.sleep(2000);
	dischargeStatus.click();//input[@id='dischargestatus']
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
	Thread.sleep(1000);
	disposition.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Discharged Home']")).click();
	Thread.sleep(1000);
	 ADTSave.click();
	 Thread.sleep(1000);
	// driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	
	
////Rollback	 
	 Thread.sleep(1000);
	 dischargethreedot.click();//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']
	 Thread.sleep(1000);
	 dischargeCancel.click();
	 Thread.sleep(1000);
	 dischargeCancelReason.click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//li[normalize-space()='As per Doctor Request']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@id='adtcancel']")).click();
	 Thread.sleep(1000);
	 
	
	 
	 
	 
	 
	 
	 
	
	
}








}












