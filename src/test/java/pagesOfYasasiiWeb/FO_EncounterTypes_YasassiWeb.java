package pagesOfYasasiiWeb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_EncounterTypes_YasassiWeb extends PageFactoryInitYasasiiWeb {
	
	public FO_EncounterTypes_YasassiWeb(WebDriver driver) {
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

	@FindBy(xpath = "//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement EpisodeIcon;
	
	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Encounter;
	
	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;
	
	@FindBy(xpath = "//ki-select-control[contains(@formcontrolname,'encountersubmode')]//input[@id='undefined']")
	public WebElement SubMode;
	
	
	@FindBy(xpath = "//span[normalize-space()='Episode']")
	public WebElement episode;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-encounter-episode-view[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/label[1]/i[1]")
	public WebElement encCancel;
	
	@FindBy(xpath = "//label[@class='table-action-icons pl0 ng-star-inserted']//i[@class='ki ki-close']")
	public WebElement epiCancel;
	
	@FindBy(xpath = "//div[@class='modal ki-dialog fade blockoutside in show']")
	public WebElement header;
	
	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement closedEpi;
	
	@FindBy(xpath = "//label[@class='check-container zero-bottom']//span[@class='checkmark']")
	public WebElement closedEnc;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servName;
	
	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement AddService;
	

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;
	
	@FindBy(xpath = "//ki-textarea-control[@placeholder='Reason']//textarea[@id='undefined']")
	public WebElement Reason;
	
	  @FindBy(xpath = "//input[@id='status']")
		public WebElement Status;

	    @FindBy(xpath = "//textarea[@id='remarks']")
		public WebElement Remarks;

	    @FindBy(xpath = "//span[normalize-space()='Log']")
		public WebElement log;
	  
	    @FindBy(xpath = "(//label[@class='app-info-icons']//i[@class='ki ki-info-circle-fill'])[1]")
	   	public WebElement Appinfo;
	     
	    @FindBy(xpath = "//label[@class='check-container m0']//span[@class='checkmark']")
	   	public WebElement  FreeSlotuncheck;
	
	    @FindBy(xpath= "//input[@placeholder='Search Resource..']")
		WebElement docsearch;

		@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")
		public WebElement appselection;
	
		@FindBy(xpath= "//div[contains(text(),'Appointment')]")
		public WebElement patientappointment;
	
		@FindBy(xpath= "//button[normalize-space()='Update']")
		public WebElement Update;
	
		@FindBy(xpath= "//span[normalize-space()='Status']")
		public WebElement StatusView;
	
		@FindBy(xpath= "//i[@title='Delete']")
		public WebElement delete;
	
		
		
	
	
	
	public void  ERpatientReg(String TITLE ,String NAME , String AGE , String MBLNO) throws InterruptedException, IOException {

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

		System.out.println(dynamicElement.size());
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}
		regSave.click();


		Thread.sleep(3000);
	
		SaveOK.click();  
		Thread.sleep(2000);
	}

	public void  ERencounter(String PROVIDER) throws InterruptedException {
		Thread.sleep(3000);
		ENCprvdrName.click();
		Thread.sleep(1000);
		ENCprvdrName.sendKeys(PROVIDER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+PROVIDER+"')])")).click();
		
		//driver.findElement(By.xpath("//li[normalize-space()='"+ PROVIDER +"']")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		EncounterSaveOK.click();
		Thread.sleep(2000);
		EpisodeIcon.click();
		Thread.sleep(5000);
		Encounter.click();
		Thread.sleep(5000);
		Close.click();
		Thread.sleep(1000);
		
		
		
	}

	
	public void  opencounter(String PROVIDER) throws InterruptedException {
//		Thread.sleep(1000);
//		SubMode.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
//		Thread.sleep(1000);
//     	ENCprvdrName.click();
//		Thread.sleep(1000);
//		ENCprvdrName.sendKeys(PROVIDER);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+PROVIDER+"')])")).click();
//		Thread.sleep(1000);
//		EncounterAdd.click();
//		//driver.findElement(By.xpath("//li[normalize-space()='"+ PROVIDER +"']")).click();
//		Thread.sleep(1000);
//		EncounterSave.click();
//		Thread.sleep(2000);
//		EncounterSaveOK.click();
//		Thread.sleep(2000);
		EpisodeIcon.click();
		Thread.sleep(1000);
		episode.click();
		Thread.sleep(1000);
		epiCancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		header.click();
		Thread.sleep(1000);
		Encounter.click();
		Thread.sleep(3000);
		encCancel.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		Reason.click();
		Thread.sleep(1000);
		Reason.sendKeys("ok");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary active sm mr0 mt0 mb0']")).click();
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green btn-primary sm mr0 mb0 mt0 ng-star-inserted']")).click();
//		encCancel.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
//		
//		episode.click();
//		Thread.sleep(1000);
//		epiCancel.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
//		closedEpi.click();
//		Thread.sleep(2000);
//		Encounter.click();
//		Thread.sleep(2000);
//		closedEnc.click();
//		Thread.sleep(2000);
//		Close.click();
//		Thread.sleep(1000);
		
		
		
	}

	public void closedEncBilling(String PROVIDER) throws InterruptedException {
		Thread.sleep(2000);
		Service.click();
		Thread.sleep(1000);
		EpisodeIcon.click();
		Thread.sleep(1000);
		closedEnc.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//label[@class='check-container zero-bottom']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='radio-container ng-star-inserted']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-dark-green btn-primary sm mr0 mb0 mt0 ng-star-inserted']")).click();
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
		patientappointment.click();
		Thread.sleep(1000);
		docsearch.sendKeys(PROVIDER);
		Thread.sleep(2500);
		appselection.click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[4]/div[1]/span[1]")).click();
        Thread.sleep(1000);
        FreeSlotuncheck.click();
        Thread.sleep(1000);
        Appinfo.click();
		
        Thread.sleep(1000);
        
        List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@title='Edit']"));
    	
    	System.out.println(dynamicElement.size());
    	if(dynamicElement.size() !=0)
    	{
    		Thread.sleep(1000);
    		driver.findElement(By.xpath("//i[@title='Edit']")).click();
    		Thread.sleep(1000);
    		Remarks.clear();
    		Thread.sleep(1000);
        	Remarks.sendKeys("modified remark");
        	Thread.sleep(1000);
        	Update.click();
        	Thread.sleep(1000);
        	log.click();
        	Thread.sleep(2000);
        	StatusView.click();
        	Thread.sleep(1000);
        	delete.click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
        	Thread.sleep(1000);
        	
        	
    	}
        
    	else { 
        
        Status.click();
        Thread.sleep(1000);
    	driver.findElement(By.xpath("//li[normalize-space()='No Show']")).click();
    	Thread.sleep(1000);
    	Remarks.click();
    	Thread.sleep(1000);
    	Remarks.sendKeys("not consulted before againt app");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    	Thread.sleep(1000);
    	log.click();
    	Thread.sleep(2000);
    	StatusView.click();
    	Thread.sleep(1000);
    	delete.click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
    	Thread.sleep(1000);
    	
		
		
    	}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
