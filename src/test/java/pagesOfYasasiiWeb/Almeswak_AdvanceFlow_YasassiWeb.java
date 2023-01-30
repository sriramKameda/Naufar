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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Almeswak_AdvanceFlow_YasassiWeb  extends PageFactoryInitYasasiiWeb {

	public Almeswak_AdvanceFlow_YasassiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;

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

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement age;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//i[@title='Expand All']")
	public WebElement Expand;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement Clear;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

   @FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Service;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providername;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement addneworder;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement servicename;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement plus;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement amount;

	@FindBy(xpath = "//ki-select-control[contains(@formcontrolname,'servicetypeid')]//input[@id='undefined']")
	public WebElement category;

	@FindBy(xpath = "//i[contains(@class,'ki ki-cash-transfer')]")
	public WebElement availedservice;

	@FindBy(xpath = "//span[normalize-space()='Advance View']")
	public WebElement advanceview;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[2]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement selctcheckbox;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement authorizer;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement entername;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement enterremark;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[4]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[3]/i[1]")
	public WebElement Advancerefund;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement fo;

	@FindBy(xpath = "(//span[contains(text(),'RCM')])[1]")
	public WebElement rcm;

	@FindBy(xpath = "//span[normalize-space()='Approve Request']")
	public WebElement refundreq;

	@FindBy(xpath = "//span[normalize-space()='Advance Approval']")
	public WebElement advancerefund;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement yes;

	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MrnoSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/label[1]/button[1]")
	public WebElement SearchIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/i[1]")
	public WebElement CancelReq;

	@FindBy(xpath = "//span[normalize-space()='Advance View']")
	public WebElement AdvanceView;

	@FindBy(xpath = "//td[@class='icon-info']//i[@title='Cancel Approval']")
	public WebElement ReqCancel;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/i[1]")
	public WebElement RemarksIcon;
	
	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement Searchicon;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks;

	@FindBy(xpath = "//i[@title='Advance Transfer']")
	public WebElement AdvanceTransfer;

	@FindBy(xpath = "//input[@id='transferAmount0']")
	public WebElement TransferAmount;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement TransferMRNO;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement Transfer;
	
	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement PrintCheck;
	
	@FindBy(xpath = "//a[@title='Cancel & Refund Bills']")
	public WebElement cancelRefund;
	
	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement IssuingBank;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='bankname']//input[@id='undefined']")
	public WebElement RecievingBank;

	@FindBy(xpath = "//input[@id='cheqnoPayType']")
	public WebElement IBANO;

    @FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement ChequeAdd;


	@FindBy(xpath = "//i[@title='Payment Info']")
	public WebElement PaymentInfo;

	@FindBy(xpath = "//td[@class='info-icon']//i[@title='Adjustment Log']")
	public WebElement adjInfo;

	@FindBy(xpath = "//i[@class='ki ki-cheque icon-btn-billing btn-dark-green inline']")
	public WebElement cheque;
	
	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOSearch;
	
	@FindBy(xpath = "//input[@id='middlename']")
	public WebElement middleName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement PAS;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[9]/td[1]/i[1]")
	public WebElement signupload;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



	public void patReg( String Title ,String myfirstname ,String myage,String myphoneno,String myhomeadd1,String mydocnumber,String MRNo,String mail) throws InterruptedException, AWTException, IOException{

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
		
		Thread.sleep(1000);
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
		personalemail.sendKeys(mail);
		Thread.sleep(600);
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
		
		Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
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
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\AlmeswakYasassiWeb\\src\\test\\resources\\excelYasasiiWeb\\almeswaksheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(8);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(3000);


	}


	public void advance(String PROVIDER ,String service) throws InterruptedException {





		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();
		Thread.sleep(2000);

		EncounterAdd.click();
		Thread.sleep(1000);
		Expand.click();
		Thread.sleep(1000);
		PrintCheck.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

		Service.click();
		Thread.sleep(800);
		
		addneworder.click();
		Thread.sleep(800);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Advance']")).click();
		//	driver.findElement(By.xpath("//*[contains(text(),'" + selectcategory + "')]")).click();	
		Thread.sleep(800);
		servicename.sendKeys(service);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + service + "')]")).click();
		Thread.sleep(800);
		amount.clear();
		Thread.sleep(800);
		amount.sendKeys("1000");
		Thread.sleep(800);
		//amount.sendKeys(Amount);
		Thread.sleep(800);
		plus.click();
     	Thread.sleep(800);
    	PrintCheck.click();
    	Thread.sleep(800);
     	Save.click();
    	Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
	
	
}

	public void advanceview(String authorisername , String remarks ,String URL , String AUTHUser, String AUTHpassword,String Site ,String MRNo) throws InterruptedException
	{
		
		availedservice.click();
		Thread.sleep(1000);
		advanceview.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//label[normalize-space()='Cash']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(1500);
		selctcheckbox.click();
		Thread.sleep(800);
		AdvanceTransfer.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//label[@class='check-container zero-label']//span[@class='checkmark']")).click();
		Thread.sleep(800);
		TransferAmount.click();
		

		for (int i = 0; i <=5; i++) {
			TransferAmount.sendKeys( Keys.RIGHT);
		}
		Thread.sleep(1000);

		for (int i = 0; i <=5; i++) {
			TransferAmount.sendKeys( Keys.BACK_SPACE);
		}
	
		Thread.sleep(800);
		TransferAmount.sendKeys("500");
		Thread.sleep(800);
		TransferMRNO.click();
		Thread.sleep(800);
		TransferMRNO.sendKeys("3000000008");
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@title='Search']")).click();
		Thread.sleep(800);
		Transfer.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(800);
		selctcheckbox.click();
		Thread.sleep(800);
		Advancerefund.click();
		Thread.sleep(800);
		authorizer.click();
		Thread.sleep(800);
		entername.sendKeys(authorisername);
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[@title='"+authorisername+"']")).click();
		Thread.sleep(800);
		enterremark.sendKeys(remarks);
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1500);
		

		//openNewTab


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;
		
		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(AUTHUser);
		password.click();
		password.sendKeys(AUTHpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
		
	////RCm	
		
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(800);
		fo.click();
		Thread.sleep(800);
		rcm.click();
		Thread.sleep(800);
		refundreq.click();
		Thread.sleep(1000);
	
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		
		Thread.sleep(1000);
		
		advancerefund.click();
		Thread.sleep(800);
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		firstcheckbox.click();
		RemarksIcon.click();
		Thread.sleep(800);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		SaVe.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(800);


		/////Approve  cancel

		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		firstcheckbox.click();
		Thread.sleep(1000);
		CancelReq.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(3000);
		Status.click();
		Thread.sleep(1000);
     	driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
		Thread.sleep(1000);
		MrnoSearch.clear();
		Thread.sleep(1000);
		MrnoSearch.sendKeys(MRNo , Keys.ENTER);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		firstcheckbox.click();
		Thread.sleep(1000);
		RemarksIcon.click();
		Thread.sleep(800);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		SaVe.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(800);
		
		
		
		
		///cancel refund
		Hamberger.click();
		Thread.sleep(2000);
		cancelRefund.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Advance Refund']")).click();
		Thread.sleep(1000);
		MRNOSearch.click();
		Thread.sleep(1000);
		MRNOSearch.sendKeys(MRNo,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-search']")).click();
		
		//SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		String Returnamount =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/table[1]/tbody[1]/tr[1]/td[12]")).getText();
		Thread.sleep(1000);
		System.out.println("returnAmount"+Returnamount);
		Thread.sleep(1000);


		Thread.sleep(1000);
		cheque.click();
		Thread.sleep(600);
		IssuingBank.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(600);
		RecievingBank.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='VMKC Bank']")).click();
		Thread.sleep(600);
		IBANO.click();
		Thread.sleep(600);
		IBANO.sendKeys("7875940");
		Thread.sleep(600);
		Amount.click();
		Thread.sleep(600);
		Amount.sendKeys(Returnamount);
		Thread.sleep(600);
		ChequeAdd.click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='OK']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);


		
		
		}

	
	
	
	
	
}
