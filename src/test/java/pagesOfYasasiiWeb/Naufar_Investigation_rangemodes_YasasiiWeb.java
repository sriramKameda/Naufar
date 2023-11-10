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

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Naufar_Investigation_rangemodes_YasasiiWeb  extends PageFactoryInitYasasiiWeb{

	public Naufar_Investigation_rangemodes_YasasiiWeb(WebDriver driver) {

		super(driver);

	}
	

@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
public WebElement Title;

@FindBy(xpath = "//i[@id='capture']")
public WebElement signupload;

@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
public WebElement Hamburger;

@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
public WebElement FOModule;

@FindBy(xpath = "//div[normalize-space()='Registration']")
public WebElement Registration;

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

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
public WebElement nationality;

@FindBy(xpath = "//input[@id='maritalstatusid']")
public WebElement maritialStatus;	

@FindBy(xpath = "//button[normalize-space()='Clear']")
public WebElement clear;

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

@FindBy(xpath = "//input[@id='remarksControl']")
public WebElement Reason;

@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
public WebElement ServSave;


@FindBy(xpath = "//input[@id='loginemail']")
public WebElement userid;

@FindBy(xpath = "//input[@id='loginpassword']")
public WebElement Password;

@FindBy(xpath = "//input[@id='loginsite']")
public WebElement site;


@FindBy(xpath = "//i[@class='ki ki-beaker']")
public WebElement Investigation;

@FindBy(xpath = "//input[@id='executionlocid']")
public WebElement Executionlocation;

@FindBy(xpath = "//i[@class='ki ki-search']")
public WebElement Search;

@FindBy(xpath = "//input[@id='mrno']")
public WebElement MRNOSearch;

@FindBy(xpath = "//label[@id='instruction0']//i[@class='ki ki-info-circle-fill']")
public WebElement ServiceDetail1;

@FindBy(xpath = "//label[@id='instruction1']//i[@class='ki ki-info-circle-fill']")
public WebElement ServiceDetail2;

@FindBy(xpath = "//button[@id='onsaveid']")
public WebElement INVSave;

@FindBy(xpath = "//div[normalize-space()='Sample Processing']")
public WebElement sampleProcessing;

@FindBy(xpath = "//i[contains(@title,'Priority')]")
public WebElement PriorityFilter;

@FindBy(xpath = "(//span[@class='checkmark'])[3]")
public WebElement Service1Check;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
public WebElement Service1Opeator;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")
public WebElement Result1;

@FindBy(xpath = "//div[@class='form-container']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[1]//span[1]//label[3]//i[1]")
public WebElement Remark1;

@FindBy(xpath = "//textarea[@id='resultremarks']")
public WebElement Remarks1Text;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
public WebElement Service2Opeator;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/span[1]/ki-input-control[1]/div[1]/input[1]")
public WebElement Result2;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/label[3]/i[1]")
public WebElement Remarks2;

@FindBy(xpath = "//textarea[@id='resultremarks']")
public WebElement Remarks2Text;

@FindBy(xpath = "//button[contains(@class,'m0')]//i[contains(@class,'ki ki-check')]")
public WebElement OKremarks;

@FindBy(xpath = "//label[normalize-space()='Select All']//span[contains(@class,'checkmark')]")
public WebElement SelectAll;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
public WebElement Result3;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
public WebElement Range;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/label[4]/i[1]")
public WebElement Remarks3;

@FindBy(xpath = "//textarea[@id='resultremarks']")
public WebElement Remarks3text;

@FindBy(xpath = "//i[contains(@title,'Category')]")
public WebElement CategoryFilter;

@FindBy(xpath = "//i[contains(@class,'fa fa-remove')]")
public WebElement FilterRemove;

@FindBy(xpath = "//div[normalize-space()='Result Authorization']")
public WebElement resultAuthoroization;

@FindBy(xpath = "//input[@id='status']")
public WebElement Status;

@FindBy(xpath = "//i[@title='Critical result not informed']")
public WebElement criticalCall;

@FindBy(xpath = "//input[@id='callstatusid']")
public WebElement CallStatus;

@FindBy(xpath = "//textarea[@id='feedback']")
public WebElement DoctorFeedback;

@FindBy(xpath = "//button[@id='crcall']")
public WebElement criticalSave;

@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
public WebElement PreviousDetails;


@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[3]/i[1]")
public WebElement SampleDetails;

@FindBy(xpath = "//label[contains(@title,'Critical Description')]//i[contains(@class,'ki ki-file-tasks relative ml5')]")
public WebElement CriticalDescription;

@FindBy(xpath = "//input[@id='srchauthorisation1']")
public WebElement Authorization;

@FindBy(xpath = "//button[@id='preview-load']")
public WebElement Preview;

@FindBy(xpath = "//button[normalize-space()='Close']//i[contains(@class,'ki ki-close-circle')]")
public WebElement close;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/span[2]/span[1]/i[1]")
public WebElement RangeFilter;

@FindBy(xpath = "//i[@class='ki ki-print']")
public WebElement Print;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[6]/span[2]/i[1]")
public WebElement ResultLog;

@FindBy(xpath = "//i[contains(@title,'Home Page')]")
public WebElement Homepage;

@FindBy(xpath = "//button[@class='rounded-1 btn btn-sm btn-red clear']")
public WebElement back;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resultentry[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/i[1]")
public WebElement addendum;

@FindBy(xpath = "//textarea[@id='addendum']")
public WebElement AddendumText;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ki-select-control[1]/div[1]/input[1]")
public WebElement ExecutionLocation;

@FindBy(xpath = "//input[@id='lastname']")
public WebElement Lastname;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
public WebElement PayType;

@FindBy(xpath = "//label[normalize-space()='Select All']//span[@class='checkmark']")
public WebElement Selectall;

@FindBy(xpath = "//input[@id='srchauthorisation1']")
public WebElement Authorization1;

@FindBy(xpath = "//textarea[@id='unauthorizationremarks']")
public WebElement unAuthorizationreason;

@FindBy(xpath = "//i[@class='ki ki-authoization']")
public WebElement BulkAuthorization;

@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
public WebElement Additionalinfo;


public void patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo) throws InterruptedException, AWTException, IOException {
	
	Thread.sleep(1000);
	Hamburger.click();
	Thread.sleep(800);
	FOModule.click();

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
 

	nationality.click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//li[normalize-space()='Indian']")).click();
	
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
	HSSFSheet BirthRegistration=wb.getSheetAt(22);	
	int i=BirthRegistration.getLastRowNum();
	System.out.println("Number of rows: " + i);		
	BirthRegistration.getRow(i).createCell(0).setCellValue(mrno);	
	FileOutputStream fout=new FileOutputStream(src);	
	wb.write(fout);
	Thread.sleep(2000);
	
/*	String word[]=mrno.split("[ :] ");
	System.out.println("number of words: "+word.length);
	for(int i=0;i<word.length;i++)
	{
		System.out.println("word["+i+"]="+word[i]);
	}
	System.out.println(word[1]);  */

	File src1=new File("C:\\Users\\sriram\\eclipse-workspace\\NauferYasassiWeb - 8083\\src\\test\\resources\\excelYasasiiWeb\\NaufarDataSheet8083.xls");
	FileInputStream fis1=new FileInputStream(src1);
	HSSFWorkbook wb1=new HSSFWorkbook(fis1);
	HSSFSheet BirthRegistration1=wb1.getSheetAt(16);	
	int i1=BirthRegistration1.getLastRowNum();
	System.out.println("Number of rows: " + i1);		
	BirthRegistration1.getRow(i1).createCell(7).setCellValue(mrno);	
	FileOutputStream fout1=new FileOutputStream(src1);	
	wb1.write(fout1);
	Thread.sleep(2000);
	
}




public void encounter(String Provider , String service1,String service2,String service3 ) throws AWTException, InterruptedException {



	/////////Provider1		
	Thread.sleep(1000);
	clear.click();
	Thread.sleep(1000);
	printuncheck.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ki-select-control[@formcontrolname='encountersubmode']//input[@id='undefined']")).click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//li[normalize-space()='YP-Female']")).click();
	Thread.sleep(600);
	PayType.click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//li[normalize-space()='Cash']")).click();
	Thread.sleep(600);
	providerName.click();
	Thread.sleep(1000);
	providerName.sendKeys(Provider);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
	Thread.sleep(1000);
	EncounterAdd.click();
	Thread.sleep(2000);
	EncounterSave.click();
	Thread.sleep(1000);
	SAvesuccess.click();
	Thread.sleep(3000);




Thread.sleep(2000);
Service.click();
Thread.sleep(1000);
Addnew.click();   
Thread.sleep(1000);
servName.click();
Thread.sleep(1000);
servName.sendKeys(service1);
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='"+service1+"']")).click();
Thread.sleep(1000);
//ExecutionLocation.click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//li[normalize-space()='Default']")).click();
//Thread.sleep(1000);
AddService.click();
Thread.sleep(1000);
Thread.sleep(1000);
servName.click();
Thread.sleep(1000);
servName.sendKeys(service2);
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='"+service2+"']")).click();
//Thread.sleep(1000);
//ExecutionLocation.click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//li[normalize-space()='Default']")).click();
AddService.click();
Thread.sleep(1000);
servName.click();
Thread.sleep(1000);
servName.sendKeys(service3);
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='"+service3+"']")).click();
//Thread.sleep(1000);
//ExecutionLocation.click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//li[normalize-space()='Default']")).click();
Thread.sleep(1000);
AddService.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
Thread.sleep(1000);
ServSave.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
Thread.sleep(1000);
}


public void investigation(String URL,String User,String password,String Site,String MRNo) throws InterruptedException, AWTException {
	
	
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

	//login
	userid.click();
	Thread.sleep(800);
	userid.sendKeys(User);
	Password.click();
	Thread.sleep(800);
	Password.sendKeys(password);
	Thread.sleep(1000);
	site.click();
	Thread.sleep(1000);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(3000);
	
	
	Hamburger.click();
	Thread.sleep(1000);
	Investigation.click();
	
	Thread.sleep(500);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']"));
	
	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}
	 

	  else {
	System.out.println("sri");
	  }
	Thread.sleep(1000);
	
	Executionlocation.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Sample Collection']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary active sm m0']")).click();
	Thread.sleep(1000);
	MRNOSearch.clear();
	Thread.sleep(800);
	MRNOSearch.sendKeys(MRNo);
	Thread.sleep(800);
	Search.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(800);
	ServiceDetail1.click();
	Thread.sleep(800);
	Close.click();
	Thread.sleep(800);
	ServiceDetail2.click();
	Thread.sleep(800);
	Close.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//label[normalize-space()='Print Barcode']//span[@class='checkmark']")).click();
	Thread.sleep(800);
	
	INVSave.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
	Thread.sleep(2000);

	List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='dailog-btn']//i[@class='ki ki-close-circle']"));
	
	if(dynamicElement1.size() !=0)
	{
		driver.findElement(By.xpath("//div[@class='dailog-btn']//i[@class='ki ki-close-circle']")).click();
	}
	 

	  else {
	System.out.println("sri");
	  }
	Thread.sleep(1000);  
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='menu-toggle change']//div[@class='bar2']")).click();
	//Thread.sleep(2000);
	//Hamburger.click();
	Thread.sleep(1000);
	sampleProcessing.click();
	Thread.sleep(800);
	MRNOSearch.clear();
	Thread.sleep(800);
	MRNOSearch.sendKeys(MRNo);
	Thread.sleep(800);
	Search.click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(800);
	PriorityFilter.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='STAT']")).click();
	Thread.sleep(800);
	PriorityFilter.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Routine']")).click();
	Thread.sleep(800);
	FilterRemove.click();
	Thread.sleep(800);
	
	
	Service1Check.click();
	Thread.sleep(800);
	Service1Opeator.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='>']")).click();
	Thread.sleep(800);
	Result1.click();
	Thread.sleep(800);
	Result1.sendKeys("399");
	Thread.sleep(800);
	Remark1.click();
	Thread.sleep(800);
	Remarks1Text.click();
	Thread.sleep(800);
	Remarks1Text.sendKeys("result is normal");
	Thread.sleep(800);
	
	driver.findElement(By.xpath("//button[contains(@class,'m0')]//i[contains(@class,'ki ki-check')]")).click();
	Thread.sleep(800);
	Service2Opeator.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='<']")).click();
	Thread.sleep(800);
	Result2.click();
	Thread.sleep(800);
	Result2.sendKeys("15");
	Thread.sleep(800);
	Remarks2.click();
	Thread.sleep(800);
	Remarks2Text.click();
	Thread.sleep(800);
	Remarks2Text.sendKeys("result is critical");
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[contains(@class,'m0')]//i[contains(@class,'ki ki-check')]")).click();
	Thread.sleep(800);
	SelectAll.click();
	Thread.sleep(800);
	Result3.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Negative']")).click();
	Thread.sleep(800);
	Range.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Critical']")).click();
	Thread.sleep(800);
	Remarks3.click();
	Thread.sleep(800);
    Remarks3text.click();
	Thread.sleep(800);
	Remarks3text.sendKeys("Result is negative & Critical");
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[contains(@class,'m0')]//i[contains(@class,'ki ki-check')]")).click();
	Thread.sleep(800);
	
	CategoryFilter.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Endocrinology & Immunoassays']")).click();
	Thread.sleep(800);
	CategoryFilter.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Drug Screening']")).click();
	Thread.sleep(800);
	FilterRemove.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[@id='onSaveid']")).click();
	Thread.sleep(2000);
	Status.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Critical Result not informed']")).click();
	Thread.sleep(800);

	MRNOSearch.clear();
	Thread.sleep(800);
	MRNOSearch.sendKeys(MRNo);
	Thread.sleep(800);
	Search.click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(800);
	criticalCall.click();
	Thread.sleep(800);
	CallStatus.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Got the feed back']")).click();
	Thread.sleep(800);
	DoctorFeedback.click();
	Thread.sleep(800);
	DoctorFeedback.sendKeys("Microsoft Excel: XLS, XLSX, XLSB, XLSM, XLT, XLTX, XLTM\r\n"
			+ "OpenOffice: ODS\r\n"
			+ "SpreadsheetML: XML\r\n"
			+ "Text: CSV, TSV, TXT (TabDelimited)\r\n"
			+ "Web: HTML, MHTML");
	Thread.sleep(800);
	criticalSave.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='onSaveid']")).click();
  
    Thread.sleep(1500);
    Status.click();
    Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Critical Result informed']")).click();
	Thread.sleep(800);
	Search.click();

	MRNOSearch.clear();
	Thread.sleep(800);
	MRNOSearch.sendKeys(MRNo);
	Thread.sleep(800);
	Search.click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(800);

	driver.findElement(By.xpath("//i[@title='Critical result informed']")).click();
	Thread.sleep(800);
	PreviousDetails.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//i[@title='Previous result']")).click();
	Thread.sleep(800);
	
	Hamburger.click();
	Thread.sleep(800);
	resultAuthoroization.click();
	Thread.sleep(800);
	Status.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Unauthorized']")).click();
	Thread.sleep(800);
	
	MRNOSearch.clear();
	Thread.sleep(800);
	MRNOSearch.sendKeys(MRNo);
	Thread.sleep(800);
	Search.click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(800);
	SampleDetails.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//i[@class='fa fa-remove']")).click();
	Thread.sleep(800);
	CriticalDescription.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[contains(@class,'m0')]")).click();
	Thread.sleep(800);
	SelectAll.click();
	Thread.sleep(800);
	Authorization.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
	Thread.sleep(800);
	//INVSave.click();
	driver.findElement(By.xpath("//button[@id='onSaveid']")).click();
     Thread.sleep(2000);
	Status.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='First Level Authorized']")).click();
	Thread.sleep(800);
	
	
	
	MRNOSearch.clear();
	Thread.sleep(800);
	MRNOSearch.sendKeys(MRNo);
	Thread.sleep(800);
	Search.click();
	
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(800);
	Preview.click();
	Thread.sleep(5000);
	close.click();
	Thread.sleep(800);
	SelectAll.click();
	Thread.sleep(800);
	Authorization.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
	Thread.sleep(800);
	
	addendum.click();
	Thread.sleep(800);
	AddendumText.click();
	Thread.sleep(800);
	AddendumText.sendKeys("Result Authorized");
	Thread.sleep(800);
	driver.findElement(By.xpath("//button[contains(@class,'m0')]")).click();
	Thread.sleep(800);
	//INVSave.click();
	driver.findElement(By.xpath("//button[@id='onSaveid']")).click();
	Thread.sleep(2000);
	
	Status.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
	Thread.sleep(800);
	MRNOSearch.clear();
	Thread.sleep(800);
	MRNOSearch.sendKeys(MRNo);
	Thread.sleep(800);
	Search.click();
    Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	
	Thread.sleep(800);
	RangeFilter.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
	Thread.sleep(800);
	FilterRemove.click();
	Thread.sleep(800);
	RangeFilter.click();
	Thread.sleep(800);
	driver.findElement(By.xpath("//li[normalize-space()='Critical']")).click();
	Thread.sleep(800);
	FilterRemove.click();
	Thread.sleep(800);
	Print.click();
	Thread.sleep(4800);

	Robot t = new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	
	ResultLog.click();
	Thread.sleep(800);
	Close.click();
	Thread.sleep(800);
	Homepage.click();
	Thread.sleep(4800);
	back.click();

/////////Unauthorization 
	
	
Thread.sleep(800);
Selectall.click();
Thread.sleep(800);
Authorization1.click();
Thread.sleep(800);
driver.findElement(By.xpath("//li[normalize-space()='Unauthorized']")).click();
Thread.sleep(800);
unAuthorizationreason.sendKeys("Roll back");//button[@id='onSaveid']
Thread.sleep(800);
driver.findElement(By.xpath("//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")).click();
Thread.sleep(800);
driver.findElement(By.xpath("//button[@id='onSaveid']")).click();
Thread.sleep(2000);



////////////Bulk Authorization	

Status.click();
Thread.sleep(800);
driver.findElement(By.xpath("//li[normalize-space()='Unauthorized']")).click();
Thread.sleep(800);
MRNOSearch.clear();
Thread.sleep(800);
MRNOSearch.sendKeys(MRNo);
Thread.sleep(800);
Search.click();
Thread.sleep(2000);

BulkAuthorization.click();
Thread.sleep(800);
Search.click();
Thread.sleep(2000);

driver.findElement(By.xpath("//div[@title='Aldosteron']")).click();
Thread.sleep(800);
driver.findElement(By.xpath("//div[@title='Cocaine']")).click();
Thread.sleep(800);
driver.findElement(By.xpath("//div[@title='Vitamin D']")).click();
Thread.sleep(1500);

Selectall.click();
Thread.sleep(800);
Authorization1.click();
Thread.sleep(800);
driver.findElement(By.xpath("//li[normalize-space()='Second Level Authorized']")).click();
Thread.sleep(800);
driver.findElement(By.xpath("//button[@id='onSaveid']")).click();
Thread.sleep(2000);

}






















}