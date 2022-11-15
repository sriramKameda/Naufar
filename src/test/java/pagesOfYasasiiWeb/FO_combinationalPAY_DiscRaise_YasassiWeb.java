package pagesOfYasasiiWeb;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class FO_combinationalPAY_DiscRaise_YasassiWeb extends PageFactoryInitYasasiiWeb {

	public FO_combinationalPAY_DiscRaise_YasassiWeb(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement sEARCHfield;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement sEARCHicon;




	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement patientSelect;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//i[@title='Expand All']")
	public WebElement Expand;

	@FindBy(xpath = "//div[@class='icon-inline']//i[@class='ki ki-pencil ng-star-inserted']")
	public WebElement AdjustEdit;//div[@class='icon-inline']//i[@class='ki ki-pencil ng-star-inserted']

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-adjustment[1]/div[1]/div[2]/div[4]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AdjustAmount;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline ml0 ng-star-inserted']")
	public WebElement RaiseRequest;

	@FindBy(xpath = "//label[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Fo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
	public WebElement RCM;

	@FindBy(xpath = "//span[normalize-space()='Approve Request']")//span[normalize-space()='View Request']
	public WebElement viewRequest;

	@FindBy(xpath = "//span[normalize-space()='Adjustment Approval']")
	public WebElement AdjApprove;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement checkrequest;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement Approve;
	//button[normalize-space()='OK']
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement remarks;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement ApproveSuccess;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement Save;

	@FindBy(xpath = "//i[@class='ki ki-debit-card icon-btn-billing btn-dark-green inline']")
	public WebElement debitCard;

	@FindBy(xpath = "//div[@class='row pt-4 ng-star-inserted']//div[@class='col-md-6']//input[1]")
	public WebElement provider;

	@FindBy(xpath = "//input[@id='amountPayType']")
	public WebElement Amount;

	@FindBy(xpath = "//input[@id='cardnoPayType']")
	public WebElement cardNO;

	@FindBy(xpath = "//input[@id='apprnoPayType']")
	public WebElement approveNO;

	@FindBy(xpath = "//label[@class='icon-btn btn-dark-green inline']")
	public WebElement CardAdd;


	@FindBy(xpath = "//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")
	public WebElement CardOK;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-authoriser-request[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement authoriser;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement SearchAuth;

	@FindBy(xpath = "//i[@class='fa fa-times']")
	public WebElement Back;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//textarea[@id='undefined']")
	public WebElement Remarks;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement TransactionDone;

	@FindBy(xpath = "//span[@class='pay-style']")
	public WebElement payment;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active']")
	public WebElement reqOK;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billsave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement billsaveOK;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MRNOSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//i[@title='Collapse All']")
	public WebElement collapse;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement Clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//i[@class='ki ki-cash-transfer']")
	public WebElement AvailedService;

	@FindBy(xpath = "//td[normalize-space()='Card']")
	public WebElement card;


	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement EnterRemarks;

	@FindBy(xpath = "//a[@title='Cancel & Refund Bills']")
	public WebElement cancelRefund;

	@FindBy(xpath = "//span[normalize-space()='Adjustment Apply']")
	public WebElement Adjapply;

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	@FindBy(xpath = "//i[@class='ki ki-chevron-down']")
	public WebElement modules;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[4]/a[1]/span[1]")
	public WebElement rcm;

	@FindBy(xpath = "//span[normalize-space()='Card Master']")
	public WebElement Cardmaster;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement Delete;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-star-inserted ng-valid']//input[@id='undefined']")
	public WebElement ServiceName;

	@FindBy(xpath = "//div[@class='form-group min-clear-bottom billing ki-dropdown']//input[@id='undefined']")
	public WebElement status;

	@FindBy(xpath = "//label[@class='icon-info pl-3 ng-star-inserted']//i[@title='Cancel Request']")
	public WebElement Reqcancel;

	@FindBy(xpath = "//i[@class='ki ki-pencil ng-star-inserted']")
	public WebElement Adjustment;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-availed-services[1]/div[1]/form[1]/div[2]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/app-billing-adjustment[1]/div[1]/div[2]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Adjustmentpercentage;


	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement MrnoSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[9]/label[1]/button[1]")
	public WebElement SearchIcon1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/span[1]/i[1]")
	public WebElement CancelReq;



	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement firstcheckbox;

	@FindBy(xpath = "//button[normalize-space()='Approve']")
	public WebElement SaVe;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement  yes;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[3]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/span[1]/i[1]")
	public WebElement RemarksIcon;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement  checkbox;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/span[1]/i[1]")
	public WebElement RemarksIcon1;


	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks1;






	public void PatReg(String NAME , String AGE , String MBLNO) throws InterruptedException, IOException {


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


		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}

		else
		{
			System.out.println("emergrncy patient");
		}


		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(3000);
		SaveSuccess.click();
		Thread.sleep(2000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(44);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(0).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);

	}

	public void combpay(String MRNO , String PROVIDER ,String ADJAMOUNT , String CARDAMOUNT , String CARDNO , String APPROVENO , String AUTHPERSON , String REMARK1, String REMARK2,String URL) throws InterruptedException {



		//////Encounter
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();
		Thread.sleep(4000);
		// ServiceName.click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='Follow-up Consultation']")).click();
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(1000);
		Expand.click();
		Thread.sleep(1000);
		//EncounterSave.click();
		Thread.sleep(1000);
		//SAvesuccess.click();

		//ServiceAdd
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView();", payment);

		String netAmount= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();

		//Wait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOf(A));

		//String netAmount = A.getAttribute("value");
		//String netAmount1 = A.getAttribute("value");
		// String netAmount = A.getAttribute(textInsideInputBox);

		System.out.println("total payment is " + netAmount);

		double i = new Double(netAmount);


		double j = new Double(ADJAMOUNT);
		System.out.println("Adjustment amount is "+j);

		double  percentage = (int) (j*100)/i;

		System.out.println("percentage of adjustment is "+percentage+"%");

		//int i = Integer.parseInt(A);
		//int intValue = (int) i;
		//double DV =  (i/1.75); 
		//System.out.println(DV);
		//int Rupee = (int)Math.round (DV) ;
		//String ADJamount = String.valueOf(Rupee)
		//System.out.println(ADJamount);


		js.executeScript("arguments[0].scrollIntoView();", collapse );


		AdjustEdit.click();

		Thread.sleep(1000);
		String limit =	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-adjustment[1]/div[1]/div[2]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")).getText();
		System.out.println("Actual Allowed ajdusment limit is "+limit);

		//compare = (netAmount > ADJAMOUNT ) ;
		//double  NetAmount= new Double(netAmount);
		//double adjAmount  = new Double(ADJAMOUNT);	

		//	boolean  compare = (NetAmount >= adjAmount) ;
		boolean  compare = (percentage <= 100 ) ;

		System.out.println(compare);

		Assert.assertTrue(compare);



		Thread.sleep(1000);
		AdjustAmount.click();
		Thread.sleep(1000);
		AdjustAmount.sendKeys(ADJAMOUNT);
		Thread.sleep(1000);
		RaiseRequest.click();
		Thread.sleep(2000);
		Close.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", payment);	
		String netAmount1= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/label[1]")).getText();
		Thread.sleep(1000);
		System.out.println("total payment is " + netAmount1);


		if(percentage <= 50)
		{
			System.out.println("Adjustment within the limit ");
			Thread.sleep(1000);
			debitCard.click();
			provider.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='HDFC Credit Card']")).click();
			Amount.click();
			Thread.sleep(1000);
			Amount.sendKeys(CARDAMOUNT);
			cardNO.click();
			Thread.sleep(1000);
			cardNO.sendKeys(CARDNO);
			approveNO.click();
			approveNO.sendKeys(APPROVENO);
			Thread.sleep(1000);
			CardAdd.click();
			Thread.sleep(3000);
			CardOK.click();
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(2000);
			//billsave.click();
			Thread.sleep(1000);
			billsaveOK.click();
			Thread.sleep(2000);




			/////////	
			Thread.sleep(1000);
			AvailedService.click();
			Thread.sleep(1000);
			List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='ki pointer ki-info-circle']"));
			Thread.sleep(1000);
			int a=dynamicElement.size();
			System.out.println(dynamicElement);
			int b=a-3;
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//i[@class='ki pointer ki-info-circle'])["+b+"]")).click();
			Thread.sleep(1000);
			card.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
			Thread.sleep(1000);
		}

		if(percentage > 50) {
			Thread.sleep(1000);
			System.out.println("Adjustment exceeds the limit ");
			Thread.sleep(1000);
			debitCard.click();
			Thread.sleep(1000);
			provider.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='HDFC Credit Card']")).click();
			Thread.sleep(1000);
			Amount.click();
			Thread.sleep(1000);
			Amount.sendKeys(CARDAMOUNT);
			Thread.sleep(1000);
			cardNO.click();
			Thread.sleep(1000);
			cardNO.sendKeys(CARDNO);
			approveNO.click();
			approveNO.sendKeys(APPROVENO);
			Thread.sleep(1000);
			CardAdd.click();
			Thread.sleep(2000);
			CardOK.click();
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(3000);
			authoriser.click();
			Thread.sleep(1000);
			SearchAuth.sendKeys(AUTHPERSON);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@title='Administrator(admin)']")).click();

			//driver.findElement(By.xpath("//*[contains(text(),'" +AUTHPERSON+ "')]")).click();
			Thread.sleep(1000);
			reqOK.click();
			Thread.sleep(1000);
			Remarks.click();
			Remarks.sendKeys(REMARK1);
			Thread.sleep(2000);
			reqOK.click();
			Thread.sleep(3000);
			//Save.click();
			Thread.sleep(5000);
			TransactionDone.click();
			Thread.sleep(1000);


			/////////	
			Thread.sleep(1000);
			AvailedService.click();
			Thread.sleep(1000);
			status.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
			Thread.sleep(3000);
			Reqcancel.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
			Thread.sleep(1000);
			status.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='All']")).click();
			Thread.sleep(1000);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//label[@class='icon-info pl-3 ng-star-inserted']//span[@class='checkmark']")).click();
			Thread.sleep(1000);
			Adjustment.click();
			Thread.sleep(1000);
			Adjustmentpercentage.click();
			Thread.sleep(1000);
			Adjustmentpercentage.sendKeys("54");
			Thread.sleep(1000);
			RaiseRequest.click();
			Thread.sleep(1000);
			authoriser.click();
			Thread.sleep(1000);
			SearchAuth.sendKeys(AUTHPERSON);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//span[@title='Administrator(admin)']")).click();

			//driver.findElement(By.xpath("//*[contains(text(),'" +AUTHPERSON+ "')]")).click();
			Thread.sleep(1000);
			reqOK.click();
			Thread.sleep(1000);
			Remarks.click();
			Thread.sleep(1000);
			Remarks.sendKeys(REMARK1);
			Thread.sleep(2000);
			reqOK.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();



			List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='ki ki-print']"));
			Thread.sleep(1000);
			int a=dynamicElement.size();
			System.out.println("a=" +a);
			//	int b=a-3;
			//System.out.println("b=" +b);
			//int c=a-2;
			//	System.out.println("c="+c);
			Thread.sleep(4000);
			driver.findElement(By.xpath("//tbody/tr["+a+"]/td[21]/i[1]")).click();
			Thread.sleep(1000);
			card.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
			Thread.sleep(1000);





			//openNewTab

			Thread.sleep(3000);
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(5000);
			driver.get(URL);
			Thread.sleep(3000);

			//login
			userid.click();
			userid.sendKeys("admin");
			password.click();
			password.sendKeys("kameda321");
			Thread.sleep(1000);
			site.click();
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='Kameda Medical Center']")) );
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Kameda Medical Center']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
			Thread.sleep(5000);



			//request approval
			Hamberger.click();
			Thread.sleep(2000);
			Fo.click();
			Thread.sleep(1000);
			RCM.click();
			Thread.sleep(2000);
			viewRequest.click();
			Thread.sleep(1000);
			AdjApprove.click();
			Thread.sleep(1000);
			MRNOSearch.click();
			Thread.sleep(1000);
			MRNOSearch.sendKeys(MRNO);
			Thread.sleep(1000);
			SearchIcon.click();
			Thread.sleep(1000);
			checkrequest.click();
			Thread.sleep(1000);
            remarks.click();
			EnterRemarks.sendKeys(REMARK2);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
			Thread.sleep(1000);
			Approve.click();
			Thread.sleep(2000);
			ApproveSuccess.click();

//////////////Approve Cancel
			
			
			Thread.sleep(1000);
			Status.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
			Thread.sleep(1000);
			MrnoSearch.clear();
			Thread.sleep(1000);
			MrnoSearch.sendKeys(MRNO , Keys.ENTER);
			Thread.sleep(1000);
			SearchIcon1.click();
			Thread.sleep(1000);
			checkbox.click();
			Thread.sleep(1000);
			CancelReq.click();
			Thread.sleep(1000);
			yes.click();
			Thread.sleep(3000);

			Thread.sleep(3000);
			Status.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Requested']")).click();
			Thread.sleep(1000);
			MrnoSearch.clear();
			Thread.sleep(1000);
			MrnoSearch.sendKeys(MRNO , Keys.ENTER);
			Thread.sleep(1000);
			SearchIcon.click();
			Thread.sleep(1000);
			checkbox.click();
			Thread.sleep(1000);
			RemarksIcon1.click();
			Thread.sleep(800);
			Remarks1.click();
			Thread.sleep(1000);
			Remarks1.sendKeys("ok");
			Thread.sleep(800);
			driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-check']")).click();
			Thread.sleep(800);
			SaVe.click();
			Thread.sleep(1000);
			yes.click();
			Thread.sleep(800);

			////////////////////////////////////////////////////////		


			///cancel refund
			Hamberger.click();
			Thread.sleep(2000);
			cancelRefund.click();
			Thread.sleep(2000);
			Adjapply.click();
			Thread.sleep(1000);
			MRNOSearch.click();
			Thread.sleep(1000);
			MRNOSearch.sendKeys(MRNO);
			Thread.sleep(1000);
			SearchIcon.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-request-approval[1]/div[1]/form[1]/tabset[1]/div[1]/div[1]/tab[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			Thread.sleep(2000);




			ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			int Y =driver.getWindowHandles().size();
			Thread.sleep(1000);
			System.out.println("window handles no."+ Y);
			int Z= Y-2;
			Thread.sleep(1000);
			System.out.println("go to window no."+ Z);
			Thread.sleep(2000);
			driver.switchTo().window(tabs1.get(Z));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//tbody/tr["+a+"]/td[21]/i[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
			Thread.sleep(1000);
			Hamberger.click();
			Thread.sleep(2000);
			//modules.click();
			Thread.sleep(3000);
			Masters.click();
			Thread.sleep(1000);
			js.executeScript("arguments[0].scrollIntoView();",rcm);
			Thread.sleep(1000);
			rcm.click();
			Thread.sleep(1000);
			Cardmaster.click();
			Thread.sleep(1000);
			SearchAuth.click();
			Thread.sleep(1000);
			SearchAuth.sendKeys("HDFC",Keys.ENTER);
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-card-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			Edit.click();
			Thread.sleep(1000);
			Delete.click();
			Thread.sleep(2000);
			ApproveSuccess.click();
			Thread.sleep(1000);
			Update.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-card-master[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(1000);
			Delete.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(2000);
			ApproveSuccess.click();
			Thread.sleep(1000);

		}

		System.out.println("running successful");


	}




}
