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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_OPconsulationforIP_yasassiWeb extends PageFactoryInitYasasiiWeb{

	public SP5_OPconsulationforIP_yasassiWeb(WebDriver driver) {

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
	@FindBy(xpath = "//li[contains(text(),'Miss')]")
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

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;


	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "(//i[@class='ki ki-trash p0'])[1]")
	public WebElement deleteconsult;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//span[normalize-space()='Encounter']")
	public WebElement encounter;

	@FindBy(xpath = "//label[@title='Clear']//i[@class='ki ki-close']")
	public WebElement clear;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servName;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement AddService;


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterMRNo;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchButton;


	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement category;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement regsave;

	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//div[3]//div[2]//i[1]")
	public WebElement del2yrs;

	@FindBy(xpath = "//label[@title='Add Registration']//i[@class='ki ki-doctor-fill']")
	public WebElement addreg;

	@FindBy(xpath = "(//i[@class='fa fa-ellipsis-v'])[2]")
	public WebElement reg3dot;

	@FindBy(xpath = "//input[@id='regiType']")
	public WebElement regType;
	
	@FindBy(xpath = "//button[@class='btn btn-dark-green active sm']")
	public WebElement Ok1;
	
	@FindBy(xpath = "//i[@class='ki ki-cash-transfer']")
	public WebElement AvailedService;
	
	@FindBy(xpath = "//label[normalize-space()='IP']//span[@class='checkmark']")
	public WebElement IP;
	
    @FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement AvailSearch;
	
    @FindBy(xpath = "//label[normalize-space()='Cash']//span[@class='checkmark']")
   	public WebElement Cash;
	
    @FindBy(xpath = "//label[normalize-space()='OP Credit']//span[@class='checkmark']")
   	public WebElement OPCredit;
	
    @FindBy(xpath = "//i[@class='fa fa-ellipsis-v']")
   	public WebElement threedot;
  
    @FindBy(xpath = "//label[normalize-space()='Last One Month']")
   	public WebElement lastonemonth;
  
    @FindBy(xpath = "//label[normalize-space()='Last Three Months']")
   	public WebElement lastThreemonth;
	
    @FindBy(xpath = "//div[@class='form-group zero-bottom dark-bg ki-dropdown']//input[@id='undefined']")
   	public WebElement episode;
  
    @FindBy(xpath = "//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")
   	public WebElement Status;
  
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[3]/ki-select-control[1]/div[1]/input[1]")
   	public WebElement scheme;
  
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[4]/ki-select-control[1]/div[1]/input[1]")
   	public WebElement Category;
 
    @FindBy(xpath = "//span[@class='close-select ng-star-inserted']//i[@class='fa fa-close']")
   	public WebElement close;
  
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[5]/ki-input-control[1]/div[1]/input[1]")
   	public WebElement servname;
  
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[6]/ki-input-control[1]/div[1]/input[1]")
   	public WebElement providername;
	
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[3]/div[1]/div[7]/ki-input-control[1]/div[1]/input[1]")
   	public WebElement billby;
 


	public void patreg(String Name,String AadharNumber,String MRNo,String Provider ,String ADTprovider ) throws InterruptedException, IOException {



		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(1000);
		Registration.click();
		Thread.sleep(500);
		Title.click();
		SelectMiss.click();
		EnterFirstNME.sendKeys(Name);
		EnterAge.sendKeys("25");
		EnterMob.sendKeys("122248789");
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

		//checkbox.click();
		HowDidYouKnow.click();
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		regsave.click();
		Thread.sleep(3000);
		OK.click();

		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(85);	
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
		Thread.sleep(1000);
		del2yrs.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		addreg.click();
		Thread.sleep(1000);
	    act.moveToElement(reg3dot).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Change Type']")).click();
		Thread.sleep(1000);
		regType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Life Time Registration']")).click();
		Thread.sleep(1000);
		Ok1.click();
		Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")));
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

	public void opConsult(String MRNo , String Provider) throws InterruptedException {


		Thread.sleep(1000);
		billing.click();
		Thread.sleep(1000);
		encounter.click();
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(2000);
		encProvider.clear();
		Thread.sleep(2000);
		encProvider.sendKeys(Provider);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'"+Provider +"')])")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Provider +"')])")).click();
		Thread.sleep(1000);
		add.click();
		Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='GP Consultation']")));
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		Service.click();
		Thread.sleep(1000);
		Addnew.click();
		Thread.sleep(1000);
		servName.click();
		Thread.sleep(1000);
		servName.sendKeys("Sodium");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Sodium (ISE Indirect)']")).click();
		Thread.sleep(1000);
		AddService.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);




		Thread.sleep(1000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1000);
		EnterMRNo.clear();
		Thread.sleep(800);
		EnterMRNo.click();
		Thread.sleep(800);
		EnterMRNo.sendKeys(MRNo);
		Thread.sleep(2000);
		//SearchButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		ADT.click();
		Thread.sleep(2000);
		billing.click();
		Thread.sleep(2000);

}


public  void AvailedServiceFilt(String Provider) throws InterruptedException {
	Thread.sleep(1000);
	AvailedService.click();
	Thread.sleep(1000);
	IP.click();
	Thread.sleep(1000);
	AvailSearch.click();
	Thread.sleep(3000);
	Cash.click();
	Thread.sleep(1000);
	AvailSearch.click();
	Thread.sleep(2000);
	OPCredit.click();
	Thread.sleep(1000);
	AvailSearch.click();
	Thread.sleep(2000);
	act.moveToElement(threedot).build().perform();
	//threedot.click();
	Thread.sleep(1000);
	lastonemonth.click();
	Thread.sleep(1000);
	AvailSearch.click();
	Thread.sleep(2000);
	act.moveToElement(threedot).build().perform();
	Thread.sleep(1000);
	lastThreemonth.click();
	Thread.sleep(2000);
	episode.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
	Thread.sleep(1000);
	AvailSearch.click();
	Thread.sleep(2000);
	episode.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[2]/li[1]")).click();
	Thread.sleep(1000);
	AvailSearch.click();
	Thread.sleep(1000);
	episode.click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[2]/li[1]")).click();
	Thread.sleep(1000);
	close.click();
	Thread.sleep(1000);
	//AvailSearch.click();
	Thread.sleep(2000);
	Status.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='All']")).click();
	Thread.sleep(1000);
	IP.click();
	Thread.sleep(1000);
	Cash.click();
	Thread.sleep(1000);
	OPCredit.click();
	Thread.sleep(1000);
	AvailSearch.click();
	Thread.sleep(1000);
	scheme.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Default/Default Scheme']")).click();
	Thread.sleep(1000);
	Category.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Registration']")).click();
	Thread.sleep(1000);
	Category.click();
	Thread.sleep(1000);
	close.click();
	Thread.sleep(1000);
	Category.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Consultation']")).click();
	Thread.sleep(1000);
	Category.click();
	Thread.sleep(1000);
    close.click();
	Thread.sleep(1000);
	Status.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
	Thread.sleep(1000);
	Category.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Registration']")).click();
	Thread.sleep(1000);
	//close.click();
	Category.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
	Thread.sleep(1000);
	Category.click();
	Thread.sleep(1000);
	close.click();
	Thread.sleep(1000);
	Status.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='All']")).click();
	Thread.sleep(1000);
	AvailSearch.click();
	Thread.sleep(2000);
	servname.clear();
	Thread.sleep(1000);
	servname.sendKeys("Life Time Registration");
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
	Thread.sleep(2000);
	servname.clear();
	servname.sendKeys("GP Consultation");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
	Thread.sleep(2000);
	servname.clear();
	servname.sendKeys("Free Consultation");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
	Thread.sleep(2000);
	servname.clear();
	servname.sendKeys("Sodium (ISE Indirect)");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
	Thread.sleep(2000);
	providername.clear();
	Thread.sleep(1000);
	providername.sendKeys(Provider);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Print']")));
	Thread.sleep(2000);
	servname.clear();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Change Scheme']")));
	Thread.sleep(2000);
	billby.sendKeys("Mr Administrator");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@title='Change Scheme']")));
	Thread.sleep(2000);
	
	
}


}
