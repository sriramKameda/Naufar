package pagesOfYasasiiWeb;

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

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class EnhancedERWorkflow_YasassiWeb  extends PageFactoryInitYasasiiWeb{
	public EnhancedERWorkflow_YasassiWeb (WebDriver driver) {
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

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement regSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOK;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement ENCprvdrName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement EncounterSaveOK;

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

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement IP;


	@FindBy(xpath = "//li[normalize-space()='ER']")
	public WebElement ER;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
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

	@FindBy(xpath = "//input[@placeholder='Search with Favorites']")
	public WebElement medicineSearch;


	@FindBy(xpath = "//body//app-root//app-cpoe-pharmacy-list//img[1]")
	public WebElement uncheckStar;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
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

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-user']")
	public WebElement patientInfo;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement EditInfo;

	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;

	@FindBy(xpath = "//label[normalize-space()='Emergency']//span[@class='checkmark']")
	public WebElement uncheckER;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//button[@id='adddoc']")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-sm sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='updateregistrationbutton']")
	public WebElement RegUpdate;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	@FindBy(xpath = "//label[@class='icon cpoeadmin']")
	public WebElement cpoeAdmin;

	@FindBy(xpath = "//i[@class='ki-user-drug ki']")
	public WebElement iconAdmin;

	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement rejQuant;

	@FindBy(xpath = "//label[@class='addition']")
	public WebElement adminAdd;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement proceedOK;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement adminSave;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement VerifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement Nursepassword;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active'][normalize-space()='OK']")
	public WebElement VerificationOK;

	@FindBy(xpath = "//label[normalize-space()='Service Administration']")
	public WebElement Serviveadmin;

	@FindBy(xpath = "//i[@title='Click To Administration']")
	public WebElement adminIcon;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement ServiceRemark;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement ServiceAdminSave;




	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[contains(@class,'btn btn-link ng-star-inserted')]")
	public WebElement AddnewService;

	@FindBy(xpath = "//div[@class='panel-body card-block card-body']//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement category;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Amount;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement Add;//label[@class='icon-btn btn-dark-green inline']

	@FindBy(xpath = "//span[contains(@class,'pay-style')]")
	public WebElement totalpay;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveOk;


	@FindBy(xpath = "//div[contains(@class,'page-inner-btn-group')]//button[1]")
	public WebElement Save;

	@FindBy(xpath = "//input[@id='IdentifyingDocs']")
	public WebElement idDocs;
	


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement enterMRNo;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement ClickOnSearch;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement SelectPatient;

	@FindBy(xpath = "//div[contains(text(),'ADT')]")
	public WebElement ADT;
	
	@FindBy(xpath = "//input[@id='admittype']")
	public WebElement admissionType;
	
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement Providernamefield;
	
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement RoomCategory;
	
	@FindBy(xpath = "//li[normalize-space()='ROOM']")
	public WebElement SelectRoom;
	
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoomType;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoonType;
	
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BedNo;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBedNo;
	
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement save;
	







	public void  ERpatientAdmit(String TITLE ,String NAME , String AGE , String MBLNO) throws InterruptedException, IOException {

		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+TITLE+"']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);


		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}


		else
		{
			System.out.println("sri");
		}


		//List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		//	
		//	System.out.println(dynamicElement.size());
		//	if(dynamicElement.size() !=0)
		//	{
		//		driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		//
		//	}
		regSave.click();       


		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ki-dialog[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
		System.out.println(mrno);

		String word[]=mrno.split("[ :] ");
		System.out.println("number of words: "+word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}
		System.out.println(word[1]);

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(42);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(4).setCellValue(word[1]);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);
		SaveOK.click();    
	}

	public void  encounter(String ENCdoc,String Site,String Docid , String DOCPassword) throws InterruptedException {
		Thread.sleep(3000);
		ENCprvdrName.click();
		Thread.sleep(2000);
		ENCprvdrName.sendKeys(ENCdoc);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ENCdoc+"')])")).click();
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(2000);
		EncounterSaveOK.click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//i[@class='ki ki-reception-fill']")).click();
		//i[@class='ki ki-reception-fill']
		Thread.sleep(2000);
		Service.click();	
		Thread.sleep(1000);
		AddnewService.click();
		Thread.sleep(1000);
		category.click();
		driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
		servicename.click();
		Thread.sleep(1000);
		servicename.sendKeys("General Advance");
		driver.findElement(By.xpath("//li[normalize-space()='General Advance']")).click();
		Thread.sleep(1000);
		Amount.clear();
		Amount.sendKeys("5000");
		Amount.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",  totalpay);
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
		SaveOk.click();


		////////logout

		username.click();
		logout.click();
		Thread.sleep(2000);
		logoutConfirm.click();

		////////login
		Thread.sleep(3000);
		userid.click();
		userid.sendKeys(Docid);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(DOCPassword);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);



	}
	public void  doctorNote(String MRNo ,String  SERVICE, String medicine) throws InterruptedException {

		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		//driver.findElement(By.xpath("//li[normalize-space()='Search']")).click();

		ER.click();
		Thread.sleep(1000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		//patientSelect.click();
		Thread.sleep(1000);
		//UParrow.click();
		//Lock.click();
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(2000);
		//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
		//		
		//		if(dynamicElement.size() !=0)
		//		{
		//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		//		}
		//		  Thread.sleep(800); 
		cheifComplaint.clear();
		cheifComplaint.sendKeys("fever");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		tempOk.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Diagnosis and Plan')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'(Idiopathic) normal pressure hydrocephalus')]")).click();
		Thread.sleep(1000);
		cpoeService.click();
		Thread.sleep(1000);
		cpoeServiceSearch.click();
		Thread.sleep(1000);
		cpoeServiceSearch.sendKeys(SERVICE);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
		cpoePharmacy.click();
		Thread.sleep(1000);
		//uncheckStar.click();
		Thread.sleep(2000);
		medicineSearch.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys(medicine);
		Thread.sleep(1000);
		medicineSelect.click();
		Thread.sleep(1000);
		Route.click();
		driver.findElement(By.xpath("//li[normalize-space()='Oral']")).click();
		Form.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Capsule']")).click();
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='STAT']")).click();

		// DoseLevel.sendKeys("2");
		Thread.sleep(1000);
		reason.click();
		Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		justification.click();
		justification.sendKeys("FOR ER");
		//Doseunit.click();
		// driver.findElement(By.xpath("//li[normalize-space()='Gm']")).click();
		//  DurationUnit.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		//diagnosis checkbox	
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[11]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
		AddMedicine.click();
		EMRsave.click();
		Thread.sleep(3000);

		////////logout

		username.click();
		Thread.sleep(1000);
		logout1.click();
		Thread.sleep(1000);
		logoutConfirm.click();

	}


	public void admitASip(String MRNo, String ADDRESS ,String AADHAAR,String Site) throws InterruptedException {

		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys("admin");
		Thread.sleep(1000);
		password.click();
		password.sendKeys("kameda321");
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		patientInfo.click();
		Thread.sleep(1000);
		EditInfo.click(); 
		Thread.sleep(1000);
		
		
		
		
		WebElement checkBoxElement = driver.findElement(By.cssSelector("ki-checkbox-control[id='isemergency'] span[class='checkmark']"));
		boolean isSelected = checkBoxElement.isSelected();
				
		//performing click operation if element is not checked
		if(isSelected == false) {
			checkBoxElement.click();
		}
		
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
//		Thread.sleep(1000);
//		if(dynamicElement.size() !=0)
//		{
//			System.out.println("sri");
//		}
//
//		else
//		{          Thread.sleep(1000);
//		driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
//		}
		//uncheckER.click();
		organisation.click();
		organisation.sendKeys("kims");
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();

		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		idDocs.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Passport']")).click();
		Thread.sleep(1000);
		
		//aadharNo.click();
		aadharNo.sendKeys( AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegUpdate.click();
		Thread.sleep(1000);
		SaveSuccess.click();



	}		

	public void admit(String MRNo,String AdmissionType,String doctor,String Prio) throws InterruptedException
	{
		
		Thread.sleep(2000);
		enterMRNo.clear();
		Thread.sleep(800);
		enterMRNo.click();
		Thread.sleep(500);
		enterMRNo.sendKeys(MRNo);
		Thread.sleep(800);
		ClickOnSearch.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(800);
		ADT.click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();

		Thread.sleep(800);
    	driver.findElement(By.xpath("//input[@id='admittype']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey3']//li[contains(text(),'IP')]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(800);

		Thread.sleep(800);
	    Providernamefield.sendKeys(doctor);
		Thread.sleep(800);
		 driver.findElement(By.xpath("//*[contains(text(),'" + doctor + "')]")).click();
		Thread.sleep(800);
		Priority.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + Prio + "')]")).click();
Thread.sleep(1000);
		
		
		{
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
		RoomCategory.click();
		SelectRoom.click();
		Thread.sleep(800);
		RoomType.click();
		 driver.findElement(By.xpath("(//*[contains(text(),'Super Deluxe')])")).click();
		//SelectRoomType.click();
		Thread.sleep(800);
		BedNo.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'lcn-')])[1]")).click();
		//SelectBedNo.click();
		Thread.sleep(800);
		save.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(1500); 
	}







	public void loggingout(String DocID , String DOCPassword, String Site) throws InterruptedException
	{
		username.click();
		Thread.sleep(1000);
		logout1.click();
		Thread.sleep(1000);
		logoutConfirm.click();



		Thread.sleep(5000);
		userid.click();
		userid.sendKeys(DocID);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(DOCPassword);
		Thread.sleep(1000);
		site.click();
		 driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

	}

	public void cpoeAdministration(String MRNO) throws InterruptedException {


		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		IP.click();
		Thread.sleep(1000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		//	patientSelect.click();
		Thread.sleep(1000);
		//	UParrow.click();
		//	Lock.click();
		Thread.sleep(1000);
		cpoeAdmin.click();
		Thread.sleep(2000);
		iconAdmin.click();
		Thread.sleep(2000);
		rejQuant.click();
		rejQuant.clear();
		Thread.sleep(1000);
		rejQuant.sendKeys("0");
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", adminAdd);
		Thread.sleep(2000);
		adminAdd.click();
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		adminSave.click();//button[normalize-space()='Save']


		/////secondNurseVerification
		Thread.sleep(1000);
		VerifiedBy.click();
		VerifiedBy.sendKeys("nur001");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'(nur001)')])")).click();
		Nursepassword.click();
		Thread.sleep(1000);
		Nursepassword.sendKeys("KAmeda123$");
		Thread.sleep(1000);
		VerificationOK.click();
		Thread.sleep(2000);


		///////serviceAdministration
		Thread.sleep(500);
		Serviveadmin.click();
		Thread.sleep(2000);
		adminIcon.click();
		Thread.sleep(1000);
		ServiceRemark.click();
		Thread.sleep(1000);
		ServiceRemark.sendKeys("administration complete");
		Thread.sleep(1000);
		ServiceAdminSave.click();
		Thread.sleep(3000);

	}









}
