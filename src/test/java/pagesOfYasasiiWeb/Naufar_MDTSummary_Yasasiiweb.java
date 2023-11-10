package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
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

public class Naufar_MDTSummary_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public Naufar_MDTSummary_Yasasiiweb(WebDriver driver) {

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

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

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

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement DoctorNote;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
	public WebElement Plan;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PlanText;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EmrSave;


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//label[@class='icon nursenote']")
	public WebElement NurseNote;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath="//form[@id='mainhead_form_11']//span[@class='checkmark']")
	public WebElement MDTCheckbox;

	@FindBy(xpath="//label[normalize-space()='Authorize']//span[@class='checkmark']")
	public WebElement Authorize;

	@FindBy(xpath="//input[@id='inchargeproviderid']")
	public WebElement visitList;

	@FindBy(xpath="//div[@class='item-name'][normalize-space()='MDT Recommendation']")
	public WebElement MDTRecom;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement MDTDiscussion;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement MDTTeartPLAn;

	@FindBy(xpath="//div[normalize-space()='Second Opinion']")
	public WebElement SecondOpinion;

	@FindBy(xpath="//label[@title='Users List']//i[@class='ki ki-doctor-fill']")
	public WebElement DoctorList;

	@FindBy(xpath="//input[@id='docsearch']")
	public WebElement DoctorSearch;

	@FindBy(xpath="//span[@class='btn btn-danger clear sm']")
	public WebElement close;

	@FindBy(xpath="//i[@class='fa fa-caret-right']")
	public WebElement visit;

	@FindBy(xpath="//textarea[@id='secondopinionremarkstxt']")
	public WebElement SecondOpinionText;

	@FindBy(xpath="//label[normalize-space()='Send']")
	public WebElement Send;

	@FindBy(xpath="//i[@title='Second opinion request']")
	public WebElement secondOpinionRequest;

	@FindBy(xpath="//div[contains(text(),'Risk Assessment')]")
	public WebElement RiskAssessment;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;


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
		Accomadation.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Other']")).click();
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
		HSSFSheet BirthRegistration=wb.getSheetAt(28);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);


	}




	public void encounter(String Provider ,String Provider1) throws AWTException, InterruptedException {



		/////////Provider1		
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
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


		/////////Provider2


		/*	Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider1+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(2000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);  */

	}



	public void docnote( String User , String Password , String site, String MRNO ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);
		Thread.sleep(1200);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='My OP and IP']")).click();
		Thread.sleep(500);

		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2500);
		//SelectPatient.click();
		/*	Thread.sleep(5000);
		UpArrow.click();
		Thread.sleep(500);
		Lock.click(); */
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(2000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dental Examination and Treatment']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(3000);


		Plan.click();
		Thread.sleep(1000);
		PlanText.click();
		Thread.sleep(1000);
		PlanText.sendKeys("MDT Summary to check auto populating for all user by felix 100435");

		Thread.sleep(1000);

		MDTCheckbox.click();
		Thread.sleep(1000);
		Authorize.click();
		Thread.sleep(1000);


		EmrSave.click();
		Thread.sleep(2000);


	}



	public void NurseNote(String NURSEUser , String Password , String Site,String MRNo ) throws InterruptedException, AWTException{

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize1 =driver.getWindowHandles().size();
		int windowopen1= Windowsize1-1;

		driver.switchTo().window(tabs1.get(windowopen1));
		driver.switchTo().window(tabs1.get(windowopen1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		Thread.sleep(500);
		userid.sendKeys(NURSEUser);
		Thread.sleep(500);
		password.click();
		Thread.sleep(500);
		password.sendKeys(Password);
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

		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(5000);
		/*	UParrow.click();
		Thread.sleep(2000);
		Lock.click();
		Thread.sleep(1000);*/

		///nursenote	
		NurseNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);


		//		visitList.click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		//		Thread.sleep(1000);
		//		



		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='MDT Template']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(10000);


	}



	public void docnote1( String User1 , String Password , String site, String MRNO,String User) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User1);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Thread.sleep(1200);



		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(500);

		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();

		//SelectPatient.click();
		/*	Thread.sleep(5000);
		UpArrow.click();
		Thread.sleep(500);
		Lock.click(); */
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(2000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='MDT Template']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(10000);



		MDTRecom.click();
		Thread.sleep(1000);
		MDTDiscussion.click();
		Thread.sleep(1000);
		MDTDiscussion.sendKeys("We discussed About the reports");
		Thread.sleep(1000);
		MDTTeartPLAn.click();
		Thread.sleep(1000);
		MDTTeartPLAn.sendKeys("Treatment is planned based on the reports");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form[@id='mainhead_form_2']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);


		///Risk Assesment

		RiskAssessment.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='loaderparent ng-star-inserted']//div[1]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='noterightregion']//div[2]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[3]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[4]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[5]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-caret-right']")));
		Thread.sleep(4000);



		visit.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[6]/label[1]/i[1]")).click();
		Thread.sleep(2000);
		System.out.println(User1 +"-User1");
		System.out.println(User+"-User");
		SecondOpinion.click();
		Thread.sleep(1000);
		DoctorList.click();
		Thread.sleep(1000);

		///Adding doctor	

		DoctorSearch.click();
		Thread.sleep(1000);
		DoctorSearch.sendKeys(User);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='Dr. Sultan Essa I Albrahim(100435)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);

		///adding nurse

		DoctorSearch.sendKeys("100413");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='Mrs. Nadia Benaissa(100413)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);

		//Adding non-md


		DoctorSearch.sendKeys("100416");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss. Estelle Emile Atallah(100416)']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);

		close.click();
		Thread.sleep(1000);
		SecondOpinionText.click();
		Thread.sleep(1000);
		SecondOpinionText.sendKeys("Patient is in critical ststus...need ur opinion pls refer the reports");
		Thread.sleep(1000);
		Send.click();
		Thread.sleep(3000);


	}


	public void secondopinion( String User , String Password , String site, String MRNO ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);
		Thread.sleep(1200);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='My Pending Task']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Second Opinion']")).click();
		Thread.sleep(2000);

		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2500);


		visit.click();
		Thread.sleep(500);
		secondOpinionRequest.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='child-list-group']//div[@id='prev_note_0']//label[contains(@title,'Reason for Visit : Fever')][normalize-space()='Fever']")).click();
		Thread.sleep(5000);
		SecondOpinionText.click();
		Thread.sleep(500);
		SecondOpinionText.sendKeys("SecondOpinionText");
		Thread.sleep(500);
		Send.click();
		Thread.sleep(500);
		Thread.sleep(3000);


	}




}