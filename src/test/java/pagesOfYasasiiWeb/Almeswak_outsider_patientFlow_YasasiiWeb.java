package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Almeswak_outsider_patientFlow_YasasiiWeb  extends PageFactoryInitYasasiiWeb{

	public Almeswak_outsider_patientFlow_YasasiiWeb(WebDriver driver) {

		super(driver);

	} 
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement Registration;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;
	
	@FindBy(xpath = "//i[@class='ki ki-user-plus-fill']")
	public WebElement outsiderIcon;
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;
	
	@FindBy(xpath = "//i[@class='ki ki-user-plus-fill']")
	public WebElement addpatient;
	
	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement age; 
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement title;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")    
	public WebElement firstname;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement phoneno;
	
    @FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;

    @FindBy(xpath = "//i[@class='ki ki-calendar-fill']")
  	public WebElement Appointment;
  	
  	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
  	public WebElement SearchResoaurce;
  	
  	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
  	public WebElement ReportingStatus;
  	
  	@FindBy(xpath = "//textarea[@id='undefined']")
  	public WebElement AppRemarks;
  	
  	@FindBy(xpath = "//button[@id='appointmentsaveid']")
  	public WebElement AppSave;
  	
  	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-reception-fill']")
  	public WebElement Billing;
  	
	@FindBy(xpath = "//input[@id='searchtext']")
  	public WebElement Search;
	
	@FindBy(xpath = "//div[@class='pat-img-container']//img[@class='ng-star-inserted']")
  	public WebElement header;
	
	@FindBy(xpath = "//div[@title='Edit Appointment Resources']//i[@class='ki ki-pencil']")
  	public WebElement AppointmentEdit;
	
	@FindBy(xpath = "//button[@id='appointmentupdateid']")
  	public WebElement updateApp;
	
	@FindBy(xpath = "//li[@class='nav-item disabled ng-star-inserted']")
  	public WebElement EncounterDisable;
	
	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-user']")
  	public WebElement PAtientInfo;
	
	@FindBy(xpath = "//button[@class='btn btn-light-blue']")
  	public WebElement Register;
	
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

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;
	
	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	
	@FindBy(xpath = "//i[@class='ki ki-print']")
	public WebElement AppPrint;
	
	@FindBy(xpath = "//button[normalize-space()='Check-In']")
	public WebElement CheckIn;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;
	
	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement BillPrintUncheck;
	
	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncSave;
	
	
	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement EncSaveSuccess;
	
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
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement provider;
	

	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;
	
	
	
	
	
	
	
	
	
	
	
	
	public void Patreg(String Title,String NAME,String DOB,String MBLNO  ) throws InterruptedException, AWTException, IOException{
		
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		FO.click();
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
		outsiderIcon.click();
		Thread.sleep(600);
		mainCategory.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'Outsider/خارجي')]")).click();
		Thread.sleep(600);
		addpatient.click();
		Thread.sleep(600);
		title.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'"+Title +"')]")).click();
		Thread.sleep(600);
		firstname.sendKeys(NAME);
		Thread.sleep(600);

		age.clear();
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		age.sendKeys(DOB);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);  
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		Thread.sleep(600);
		phoneno.sendKeys(MBLNO);
		Thread.sleep(1000);
		fosave.click();
		Thread.sleep(2000);
		

		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		
		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\AlmeswakYasassiWeb\\src\\test\\resources\\excelYasasiiWeb\\almeswaksheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(10);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(5).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(3000);    
			
		}
	
	
	
	public void Appointment(String NAME,String Provider,String MRNO,String DOCno,String service) throws AWTException, InterruptedException {
		
		
		Appointment.click();
		Thread.sleep(3000);
		SearchResoaurce.click();
		Thread.sleep(1000);
		SearchResoaurce.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-1-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-1-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		ReportingStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		AppRemarks.click();
		Thread.sleep(1000);
		AppRemarks.sendKeys("Regular checkup");
		Thread.sleep(1000);
		AppSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		mainCategory.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'Appointment/موعد')]")).click();
		Thread.sleep(600);
		Search.click();
		Thread.sleep(600);
		Search.sendKeys(NAME);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(600);
		act.moveToElement(header).build().perform();
		Thread.sleep(1000);
		AppointmentEdit.click();
		Thread.sleep(600);
		AppRemarks.clear();
		Thread.sleep(600);
		AppRemarks.sendKeys("AppEdit");
		Thread.sleep(600);
		updateApp.click();
		Thread.sleep(1000);
		
		
		
		Billing.click();
		Thread.sleep(1000);
		EncounterDisable.click();
		Thread.sleep(600);
		act.moveToElement(EncounterDisable).click().build().perform();
		Thread.sleep(600);
		
		
		
	////service bill	
		Thread.sleep(2000);
	//	Service.click();
		Thread.sleep(1000);
		provider.click();
		Thread.sleep(1000);
		provider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(1000);
	    Addnew.click();   
		Thread.sleep(1000);
		servName.click();
		Thread.sleep(1000);
		servName.sendKeys(service);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+service+"']")).click();
		Thread.sleep(1000);
		AddService.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		PAtientInfo.click();
		Thread.sleep(600);
		Register.click();
		Thread.sleep(600);
		middleName.clear();
		Thread.sleep(600);
		middleName.sendKeys("AL");
		Thread.sleep(600);
		LastName.clear();
		Thread.sleep(600);
		LastName.sendKeys("mes");
		Thread.sleep(600);
		
		
		//////////////Enter Document information
		Thread.sleep(600);
		DocumentIdentification.click();
		Thread.sleep(1000);

		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);

		Thread.sleep(600);
		EnterAadhar.sendKeys(Keys.HOME + DOCno );
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

		Thread.sleep(1000);
		fosave.click();
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ki-dialog-common//button[@aria-label='Close'][normalize-space()='No']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Close'][normalize-space()='No']")).click();
		Billing.click();
		Thread.sleep(1000);
	/*	AppPrint.click();
		Thread.sleep(2500);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		Thread.sleep(1000);   */
		CheckIn.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		BillPrintUncheck.click();
		Thread.sleep(1000);
		EncSave.click();
		Thread.sleep(2000);
		EncSaveSuccess.click();
		Thread.sleep(1000);
		
		
	}
	
	

	


}