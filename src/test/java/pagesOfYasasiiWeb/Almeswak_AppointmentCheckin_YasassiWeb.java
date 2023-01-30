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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Almeswak_AppointmentCheckin_YasassiWeb  extends PageFactoryInitYasasiiWeb {

	public Almeswak_AppointmentCheckin_YasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement age; 
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement title;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")    
	public WebElement firstname;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement phoneno;

	@FindBy(xpath = "//span[contains(text(),' Contact Information ')]")
	public WebElement contInformation;

	@FindBy(xpath = "//input[@id='personalemail']")
	public WebElement personalemail;

	@FindBy(xpath = "//span[normalize-space()='No Items Selected']")
	public WebElement preferedcommunicationid;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement homeadd1;

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

    @FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement Registration;


	

	
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
	
	@FindBy(xpath = "//label[normalize-space()='Repeat']//span[@class='checkmark']")
	public WebElement Repeat;
	
	@FindBy(xpath = "//input[@id='daycount']")
	public WebElement EveryDAy;
	
	@FindBy(xpath = "//input[@id='repeatCount']")
	public WebElement endAfter;
	
	@FindBy(xpath = "//button[@id='repaeatappointmentbuttonid']")
	public WebElement Continue;
	
	@FindBy(xpath = "//i[@class='ki ki-calendar-check-fill']")
	public WebElement upcomingAppointments;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-upcoming-appt[1]/div[1]/div[3]/div[1]/div[1]/div[1]/img[1]")
	public WebElement patientheadIcon;
	
	@FindBy(xpath = "//input[@id='cancelRemark']")
	public WebElement appCancelremarks;
	
	@FindBy(xpath = "//i[@class='ki ki-medical-kit']")
	public WebElement Encounterbill;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;
	
	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement AddNewOrder;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceName;
	
	@FindBy(xpath = "//label[@title='Add']")
	public WebElement ServiceAdd;
	
	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement ServiceSave;
	
	@FindBy(xpath = "//i[@class='ki ki-cash-transfer']")
	public WebElement AvailedServices;
	
	@FindBy(xpath = "//i[@class='ki ki-search text-white']")
	public WebElement AvailedSearch;
	
	@FindBy(xpath = "//span[normalize-space()='Service View']")
	public WebElement ServiceView;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]")
	public WebElement consultation;
	
	
	@FindBy(xpath = "//tab[@id='2']//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement Taxview;
	
	@FindBy(xpath = "//div[@class='col-md-6 pl0']//i[@title='Adjustment Log']")
	public WebElement AdjustmentView;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement PAS;
    
	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;
	
	@FindBy(xpath = "//label[normalize-space()='Daily']")
	public WebElement daily;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[9]/td[1]/i[1]")
	public WebElement signupload;

	
	
	
	
	
	
	public void patReg( String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber) throws InterruptedException, AWTException, IOException{

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		PAS.click();
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
		Thread.sleep(1500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		Thread.sleep(600);
			title.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[contains(text(),'"+Title +"')]")).click();
		Thread.sleep(600);
		firstname.sendKeys(myfirstname);
		Thread.sleep(600);
		middleName.clear();
		Thread.sleep(600);
		middleName.sendKeys("AL");
		Thread.sleep(600);
		LastName.clear();
		Thread.sleep(600);
		LastName.sendKeys("mes");
		Thread.sleep(600);
        age.clear();
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		age.sendKeys(myage);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		Thread.sleep(600);
		phoneno.sendKeys(myphoneno);

		Thread.sleep(600);


		//////////////Enter contact information

		Thread.sleep(1000);
		contInformation.click();
		Thread.sleep(1000);
	
		preferedcommunicationid.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[@title='Phone']")).click();
		Thread.sleep(600);
		homeadd1.sendKeys(myhomeadd1);
		Thread.sleep(600);





		//////////////Enter Document information

		DocumentIdentification.click();
		Thread.sleep(1000);

		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);


		EnterAadhar.sendKeys(Keys.HOME + mydocnumber );
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


/*		validfrom.click();
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

*/

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_ENTER);

		Clickadd.click();

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='doc-no']")));
		Thread.sleep(1000);
		
	    Thread.sleep(1000);
		fosave.click();
		Thread.sleep(2000);
		
		
		//////consernForm
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);


		JavascriptExecutor js= (JavascriptExecutor) driver;
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
				.moveByOffset(60,10)
				.moveByOffset(12,50)
				.moveByOffset(50,0)
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();

		Thread.sleep(3000);
/*		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		//    	String word[]=mrno.split("[ :] ");
		//		System.out.println("number of words: "+word.length);
		//		for(int i=0;i<word.length;i++)
		//		{
		//			System.out.println("word["+i+"]="+word[i]);
		//		}
		//		System.out.println(word[1]);
		//		
		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\AlmeswakYasassiWeb\\src\\test\\resources\\excelYasasiiWeb\\almeswaksheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(2);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(3000);    */


	}

	
	public void Appointment(String Provider,String service) throws AWTException, InterruptedException {
		
		
		Appointment.click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search Resource..')]")));
		Thread.sleep(2000);
		
		
		SearchResoaurce.click();
		Thread.sleep(1000);
		SearchResoaurce.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//td[@class='app-booking-bar ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
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
		Billing.click();
		Thread.sleep(1000);
		/*AppPrint.click();
		Thread.sleep(2500);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);  */
		
		Thread.sleep(1000);
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
		
		/////upcoming Appointment
		
		Appointment.click(); 
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@placeholder,'Search Resource..')]")));
		Thread.sleep(800);

			
		SearchResoaurce.click();
		Thread.sleep(1000);
		SearchResoaurce.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//td[@class='app-booking-bar ng-star-inserted']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		Repeat.click();
		Thread.sleep(1000);
		daily.click();
		Thread.sleep(1000);
		EveryDAy.click();
		Thread.sleep(1000);
		EveryDAy.sendKeys("2");
		Thread.sleep(1000);
		endAfter.click();
		Thread.sleep(1000);
		endAfter.sendKeys("5");
		Thread.sleep(1000);
		ReportingStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		AppRemarks.click();
		Thread.sleep(1000);
		AppRemarks.sendKeys("Regular checkup");
		Thread.sleep(1000);
		
		Continue.click();
		
		////Cancelling last occurances
		Thread.sleep(2500);
     	driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[5]/div[2]/i[1]")).click();
     	Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[2]/i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[2]/i[1]")).click();
		Thread.sleep(1000);
	
		AppSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		Billing.click();
		Thread.sleep(1000);
		upcomingAppointments.click();
		
		//print app
/*		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-upcoming-appt[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/label[1]/label[1]/i[1]")).click();
		Thread.sleep(2000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);  */
		
		
		//resourceIcon
		driver.findElement(By.xpath("//i[@title='Resource Details']")).click();
		Thread.sleep(2500);
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		 Thread.sleep(1000);
	    act.moveToElement(patientheadIcon).click().build().perform();
	    Thread.sleep(1000);
	    ///delete App
	    driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-upcoming-appt[1]/div[1]/div[3]/div[1]/label[1]/i[1]")).click();
	    Thread.sleep(1000);
	    appCancelremarks.click();
	    Thread.sleep(1000);
		 driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[normalize-space()='Cancel']")).click();
		 Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		  
			Thread.sleep(1000);
		
			Encounterbill.click();
			Thread.sleep(1000);
			Service.click();
			Thread.sleep(1000);
			//printUncheck
			
			 driver.findElement(By.xpath("//label[@class='check-container zero-label']")).click();
		     Thread.sleep(1000);
	        AddNewOrder.click();
			Thread.sleep(1000);
			ServiceName.click();
			Thread.sleep(1000);
			ServiceName.sendKeys(service);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[contains(text(),'"+service+"')]")).click();
			Thread.sleep(1000);
			ServiceAdd.click();
			Thread.sleep(1000);
			
			ServiceSave.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		  Thread.sleep(1000);
		  AvailedServices.click();
		  Thread.sleep(1000);
		  AvailedSearch.click();
		  Thread.sleep(1000);
		  ServiceView.click();
		  Thread.sleep(1000);
		  AvailedSearch.click();
		  Thread.sleep(1000);
		  consultation.click();
		  Thread.sleep(1000);
		//  act.moveToElement(Taxview).build().perform();
	//	  Thread.sleep(1000);
		  AdjustmentView.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		  Thread.sleep(1000);
		  
		}
	
	}