package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
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

public class SP5_Additive_Outsider_Walkin_billing_yasasiiWeb   extends PageFactoryInitYasasiiWeb{
	public SP5_Additive_Outsider_Walkin_billing_yasasiiWeb(WebDriver driver) {
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

	@FindBy(xpath = "//label[@title='Add']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    //input[@id='chiefcomplainttext']
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeServiceSearch;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement cpoePharmacy;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;


	@FindBy(xpath = "//div[@class='btn-pharmacy-search def-search']//i[@class='ki ki-favourite-fill']")
	public WebElement uncheckStar;

	@FindBy(xpath = "//input[@placeholder='Search Medicines']")
	public WebElement medicineSelect;

	@FindBy(xpath = "//app-cpoe-pharmacy-prescription//ki-select-control[@id='routeid']//input[1]")
	public WebElement Route;

	@FindBy(xpath = "//input[@id='formid']")
	public WebElement Form;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement AddMedicine;

	@FindBy(xpath = "//input[@id='mindose']")
	public WebElement DoseLevel;

	@FindBy(xpath = "//input[@id='doseunitid']")
	public WebElement Doseunit;

	@FindBy(xpath = "//input[@id='durationunitid']")
	public WebElement DurationUnit;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement reason;


	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement EMRsave;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement toggle;

	@FindBy(xpath = "//span[normalize-space()='Pharmacy Panel']")
	public WebElement Pharmacypanel;

	@FindBy(xpath = "//span[normalize-space()='OP Panel']")
	public WebElement opPanel;

	@FindBy(xpath = "//input[@id='locationid']")
	public WebElement pharloc;


	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")
	public WebElement pharlocOK;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;


	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement ADDMedicine;
	@FindBy(xpath="//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")
	public WebElement editpharmacy;
	@FindBy(xpath="//input[@name='remarks']")
	public WebElement remarkedit;
	@FindBy(xpath="//button[@id='updatePharmacy']")
	public WebElement updatepharmacy;
	@FindBy(xpath="//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement yesdeletepharmacy;
	@FindBy(xpath="//input[@id='MedicineName']")
	public WebElement medicinename;
	@FindBy(xpath="//span[@title='Add Additive']//i[@class='ki ki-plus']")
	public WebElement Add;
	@FindBy(xpath="//div[contains(@class,'col-md-12 pr0 ta-r')]//button[contains(@type,'button')][normalize-space()='OK']")
	public WebElement ok;
	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement frequency;
	@FindBy(xpath="//input[@id='ivrate']")
	public WebElement addrate;

	@FindBy(xpath="//input[@id='ivrateunitid']")
	public WebElement idadd;

	@FindBy(xpath = "//span[@class='user-name']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement logout;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[@class='logout list-item ']")
	public WebElement logout1;


	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//input[@id='searchText']")
	public WebElement counterSearch;

	@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
	public WebElement counterSearchicon;

	@FindBy(xpath = "//i[@title='Outsider']")
	public WebElement outsider;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement PatName;

	@FindBy(xpath = "//input[@id='genderid']")
	public WebElement Gender;

	@FindBy(xpath = "//input[@id='genderage']")
	public WebElement Age;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MobileNo;

	@FindBy(xpath = "//input[@id='medicinename']")
	public WebElement ItemName;

	@FindBy(xpath = "//input[@id='qtynew']")
	public WebElement Qty;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement itemadd;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")
	public WebElement medicineInformation1;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/i[1]")
	public WebElement medicineInformation2;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/i[2]")
	public WebElement Stockinformation;

	@FindBy(xpath = "//button[@id='confirmsave']")
	public WebElement Confirm;

	@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
	public WebElement Status;

	@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
	public WebElement medicineCheck;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/i[1]")
	public WebElement threeDot;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[2]/div[1]/div[2]")
	public WebElement PharmistRemarks;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement labelremark;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement stockSave;

	@FindBy(xpath = "//li[normalize-space()='Stock Reservation']")
	public WebElement StockReservation;

	@FindBy(xpath = "//div[normalize-space()='Dispensing']")
	public WebElement Dispensing;

	@FindBy(xpath = "//label[@class='check-wrapper ng-star-inserted']//span[@class='checkmark']")
	public WebElement DispenseCheck;

	@FindBy(xpath = "//i[@class='fa pointer fa-chevron-right ng-star-inserted']")
	public WebElement RightArrow;

	@FindBy(xpath = "//button[@id='billholdsave']")
	public WebElement Dispensed;

	@FindBy(xpath = "//button[@type='button']//i[@class='ki ki-reset']")
	public WebElement Clear;

	@FindBy(xpath = "//div[@class='billing-card ng-star-inserted']//i[@title='Order Information']")
	public WebElement orderInformation;

	@FindBy(xpath = "//span[normalize-space()='Admin View']")
	public WebElement AdminView;


	@FindBy(xpath = "//div[@class='billing-card ng-star-inserted']//i[@title='Stock Information']")
	public WebElement StockInformation;

	@FindBy(xpath = "//div[normalize-space()='Pharmacist Remark']")
	public WebElement PharmasistRemark;

	@FindBy(xpath = "//textarea[@id='note']")
	public WebElement InterventionRemark;

	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement print;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EMRsave1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@title='Lock/Unlock']")
	public WebElement lock;

	@FindBy(xpath = "//i[@title='Walk-In']")
	public WebElement walkin;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement walkinSearch;

	@FindBy(xpath = "//div[normalize-space()='OP Orders']")
	public WebElement OPOrder;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement OPprovider;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-dirty ng-valid']//span[@class='checkmark']")
	public WebElement AdditiveUncheck;






	public void patReg(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO , String PROVIDER) throws InterruptedException, IOException {


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
		HSSFSheet FOFullRegTest=wb.getSheetAt(94);	
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
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER+"']")).click(); 
		Thread.sleep(1000);

		EncounterAdd.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
		EncounterSave.click();
		Thread.sleep(2000);
		SAvesuccess.click();
		Thread.sleep(2000);
	}



	public void doctorNote(String MRNO , String Medicine , String Additive , String Site , String Admin, String ADminPassword,String DocID , String DocPassword) throws InterruptedException, AWTException {



		////////logout
		Thread.sleep(3000);
		username.click();//span[@class='user-name']
		Thread.sleep(1000);
		logout1.click(); 
		Thread.sleep(1000);
		logoutConfirm.click();

		///login
		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(DocID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(DocPassword);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


		/////doctornote
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();

		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='dashboard-lock-arrow ki ki-chevron-up']"));

		System.out.println(dynamicElement.size());
		if(dynamicElement.size() !=0)
		{
			UParrow.click();
			lock.click();

		}



		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		tempOk.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Diagnosis and Plan')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);

		cpoePharmacy.click();
		Thread.sleep(1000);
		uncheckStar.click();
		Thread.sleep(2000);
		medicineSearch.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys(Medicine);
		Thread.sleep(1000);




		driver.findElement(By.xpath("//div[contains(@title,'by Intravenous')]")).click();
		Thread.sleep(1000);
		//mindose1.click();
		///////driver.findElement(By.xpath("//input[@id='frequencyid']")).click();
		Thread.sleep(1000);
		//////driver.findElement(By.xpath("//li[normalize-space()='STAT']")).click();
		Thread.sleep(1000);
		///////////////////
		driver.findElement(By.xpath("//i[@class='ki ki-additive custom-additive']")).click();
		Thread.sleep(1000);
		medicinename.click();
		Thread.sleep(1000);
		medicinename.sendKeys(Additive);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Deriphyllin Inj']")).click();
		Thread.sleep(500);
		Add.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

		//	ok.click();
		Thread.sleep(500);
		frequency.click();
		driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		Thread.sleep(1000);
		//rateadd.click();
		//	rateadd.sendKeys("5");
		Thread.sleep(500);
		addrate.click();
		addrate.sendKeys("100");
		Thread.sleep(500);
		idadd.click();
		driver.findElement(By.xpath("//li[normalize-space()='ml/Hr']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[12]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		ADDMedicine.click();
		//	yesadd.click();
		Thread.sleep(3000);			    
		//Edit-Additivemedicine
		editpharmacy.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Edit']")).click();
		Thread.sleep(1000);
		remarkedit.click();
		Thread.sleep(1000);
		remarkedit.sendKeys("Adding Additive");
		Thread.sleep(1000);
		updatepharmacy.click();
		Thread.sleep(1000);
		EMRsave1.click();




		////////logout
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='user-name']")));
		
		Thread.sleep(3000);
		username.click();//span[@class='user-name']
		Thread.sleep(1000);
		logout1.click(); 
		Thread.sleep(1000);
		logoutConfirm.click();

		///login
		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(Admin);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(ADminPassword);
		site.click();
		Thread.sleep(1000);


		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);







		toggle.click();
		Thread.sleep(1000);
		Pharmacypanel.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		opPanel.click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		pharloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Main Pharmacy']")).click();
		Thread.sleep(1000);
		//	callerID.click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='2nd Level Pharmacy-Caller 1']")).click();
		pharlocOK.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);





		Thread.sleep(1000);
		counterSearch.click();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO,Keys.ENTER);
		Thread.sleep(1000);
		counterSearchicon.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		// patientSearch2.click();
		Thread.sleep(1000);

		medicineCheck.click();
		Thread.sleep(1000);
		StockInformation.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger sm clear')]")).click();
		Thread.sleep(2000);
		orderInformation.click();
		Thread.sleep(1000);
		AdminView.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		Confirm.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(3000);
		medicineCheck.click();
		Thread.sleep(3000);




	act.moveToElement(AdditiveUncheck).build().perform();
	
		Thread.sleep(2000);
		AdditiveUncheck.click();
		Thread.sleep(2000);
		stockSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Information']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);

		
		act.moveToElement(AdditiveUncheck).click().build().perform();
		//js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//label[@class='ml15 mb10']")));
		Thread.sleep(2000);
	//	AdditiveUncheck.click();
		Thread.sleep(1000);
		act.moveToElement(threeDot).build().perform();
		Thread.sleep(1000);
		PharmasistRemark.click();
		Thread.sleep(1000);
		InterventionRemark.click();
		Thread.sleep(1000);
		InterventionRemark.sendKeys("pharmacy2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		stockSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		StockReservation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);



		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		
		
		Dispensing.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);
		Dispensed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		StockInformation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger sm clear')]")).click();
		Thread.sleep(1000);
		OPOrder.click();
		Thread.sleep(1000);








	}


	public void Outsider(String outsiderName1) throws AWTException, InterruptedException {


		Thread.sleep(1000);
		outsider.click();
		Thread.sleep(1000);
		PatName.click();
		Thread.sleep(1000);
		PatName.sendKeys(outsiderName1);
		Thread.sleep(1000);
		Gender.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Male']")).click();
		Thread.sleep(1000);
		Age.click();
		Thread.sleep(1000);
		Age.sendKeys("23");
		Thread.sleep(1000);
		MobileNo.click();
		Thread.sleep(1000);
		MobileNo.sendKeys("779754467");
		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		ItemName.sendKeys("Dolo 650Mg Tab");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dolo 650Mg Tab']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);
		ItemName.clear();
		Thread.sleep(1000);
		ItemName.sendKeys("Calpol 120Mg Suspension 60Ml");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Calpol 120Mg Suspension 60Ml']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);



		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", medicineInformation1);
		Thread.sleep(1000);

		medicineInformation1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		medicineInformation2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		Stockinformation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(1000);
		Confirm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
		Thread.sleep(1000);



		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(outsiderName1 , Keys.ENTER);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+outsiderName1+"')]")).click();
		Thread.sleep(1000);
		medicineCheck.click();
		Thread.sleep(1000);
		act.moveToElement(threeDot).build().perform();
		Thread.sleep(2000);
		PharmistRemarks.click();
		Thread.sleep(1000);
		labelremark.click();
		Thread.sleep(1000);
		labelremark.sendKeys("pharmacy2");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		stockSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		Status.click();
		Thread.sleep(1000);
		StockReservation.click();
		Thread.sleep(1000);

		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(outsiderName1 , Keys.ENTER);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+outsiderName1+"')]")).click();
		Thread.sleep(1000);



		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Dispensing.click();
		Thread.sleep(3000);

		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(outsiderName1 ,Keys.ENTER);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'"+outsiderName1+"')]")).click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		Dispensed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);




	}


	public void walkin(String PROVIDER, String MRNO1) throws InterruptedException {


		Thread.sleep(1000);
		OPOrder.click();
		Thread.sleep(2000);
		walkin.click();
		Thread.sleep(1000);
		walkinSearch.click();
		Thread.sleep(1000);
		walkinSearch.sendKeys(MRNO1, Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[4]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'"+MRNO1+"')]")).click();
		Thread.sleep(1000);
		OPprovider.click();
		Thread.sleep(1000);
		OPprovider.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+PROVIDER+"']")).click(); 
		Thread.sleep(1000);

		Thread.sleep(1000);
		ItemName.click();
		Thread.sleep(1000);
		ItemName.sendKeys("Dolo 650Mg Tab");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dolo 650Mg Tab']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);
		ItemName.clear();
		Thread.sleep(1000);
		ItemName.sendKeys("Calpol 120Mg Suspension 60Ml");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Calpol 120Mg Suspension 60Ml']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("5");
		Thread.sleep(1000);
		itemadd.click();
		Thread.sleep(1000);



		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", medicineInformation1);
		Thread.sleep(1000);

		medicineInformation1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		medicineInformation2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		Stockinformation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(2000);
		Confirm.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed']")).click();
		Thread.sleep(1000);



		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO1);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO1+"')]")).click();
		Thread.sleep(1000);
		medicineCheck.click();
		Thread.sleep(1000);
		act.moveToElement(threeDot).build().perform();
		Thread.sleep(1000);
		PharmistRemarks.click();
		Thread.sleep(1000);
		labelremark.click();
		Thread.sleep(1000);
		labelremark.sendKeys("pharmacy2");
		Thread.sleep(1000);
		//		print.click();
		//		Thread.sleep(2000);
		//		Robot t=new Robot();
		//		t.keyPress(KeyEvent.VK_ESCAPE);
		//		t.keyRelease(KeyEvent.VK_ESCAPE);
		//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		Thread.sleep(3000);
		stockSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		Status.click();
		Thread.sleep(1000);
		StockReservation.click();
		Thread.sleep(1000);

		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO1);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO1+"')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Dispensing.click();
		Thread.sleep(1000);

		counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO1);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO1+"')]")).click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		RightArrow.click();
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		DispenseCheck.click();
		Thread.sleep(1000);
		Dispensed.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);







	}
}

