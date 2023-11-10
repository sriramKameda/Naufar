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

public class Naufar_InstructionOrder_Yasasiiweb  extends PageFactoryInitYasasiiWeb {

	public Naufar_InstructionOrder_Yasasiiweb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
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
	public WebElement Savereg;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement nationality;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//label[contains(@class,'check-container zero-label')]")
	public WebElement printuncheck;

	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;


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

	////EMR

	@FindBy(xpath = "//span[@class='user-name']")
	public WebElement username;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//span[@class='item-name '][normalize-space()='Logout']")
	public WebElement logout;

	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[@class='logout list-item ']")
	public WebElement logout1;


	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement logoutConfirm;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

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

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;


	@FindBy(xpath = "//div[contains(text(),'CPOE Service')]")
	public WebElement CPOEService;

	@FindBy(xpath = "//i[@class='ki ki-service-category']")
	public WebElement Instructions;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CPOEServiceSearch;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EMRSave;

	@FindBy(xpath = "//i[@class='ki ki-toggle']")
	public WebElement NoteAdvanceSearch;

	@FindBy(xpath = "//i[@title='Filter By Encounter']")
	public WebElement Filter;

	@FindBy(xpath = "//label[normalize-space()='OP']//span[@class='checkmark']")
	public WebElement OPCheckBox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/label[1]/i[1]")
	public WebElement visitType;


	//instruction order admin

	@FindBy(xpath = "//label[@class='icon cpoeadmin']")
	public WebElement CpoeAdmin;

	@FindBy(xpath = "//label[normalize-space()='Instruction Order']")
	public WebElement InstructionOrder;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//div[@class='header-label']")
	public WebElement PreviousRemarks;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-service-detail-modal[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement Arrow;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//i[@title='Order Details']")
	public WebElement OrderDetails;

	@FindBy(xpath = "//input[@id='adminstatus']")
	public WebElement AdminStatus;

	@FindBy(xpath = "//i[@title='Instruction']")
	public WebElement Instruction;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-instructionorder[1]/div[1]/div[1]/div[1]/span[2]/ki-calendar[1]/div[1]/span[1]/span[1]/span[1]")
	public WebElement Date;
	
	@FindBy(xpath = "//i[@title='Encounter']")
	public WebElement Encounter;
	
	@FindBy(xpath = "//input[@id='name']")
	public WebElement ServiceName;
	

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;

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

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;
	
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement category1;
	
	@FindBy(xpath = "//i[@class='ki ki-arrow-right']")
	public WebElement Expandedview;
	
	@FindBy(xpath = "//div[normalize-space()='Appointment']")
	public WebElement Appointment;
	
	@FindBy(xpath = "//i[@title='Click to change view as Grid View']")
	public WebElement Gridview;
	
	@FindBy(xpath = "(//i[@class='ki ki-info-circle'])[1]")
	public WebElement Remarks1;
	
	@FindBy(xpath = "//div[contains(text(),'Vital Signs')]")
	public WebElement vitals;
	
	@FindBy(xpath = "//input[@title='Risk']")
	public WebElement Risk;
	
	@FindBy(xpath = "//input[@title='Assessment']")
	public WebElement Asssessment;
	
	@FindBy(xpath = "//input[@title='Urine test strips']")
	public WebElement urineTest;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-vitalsigns[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/app-vitalfields[1]/div[1]/div[1]/form[1]/span[1]/i[1]")
	public WebElement AGPAR;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-vitalsigns[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/div[1]/app-vitalfields[1]/div[1]/div[1]/form[1]/span[1]/i[1]")
	public WebElement FALLrisk;
	
	@FindBy(xpath = "//input[@id='score0']")
	public WebElement risk1;
	
	@FindBy(xpath = "//input[@id='score1']")
	public WebElement risk2;
	
	@FindBy(xpath = "//input[@id='score2']")
	public WebElement risk3;
	
	@FindBy(xpath = "//input[@id='score3']")
	public WebElement risk4;
	
	@FindBy(xpath = "//input[@id='vital300']")
	public WebElement AGPARAsssessment;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[1]/app-vitalsigns[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/cdk-virtual-scroll-viewport[1]/div[1]/div[6]/div[2]/div[2]/div[1]/div[1]/div[1]/app-vitalfields[1]/div[1]/div[1]/form[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement FallRiskAsssessment;
	
	@FindBy(xpath = "//div[normalize-space()='Vitals']")
	public WebElement vital;
	
	@FindBy(xpath = "(//label[@class='slot-info ng-star-inserted'])[2]")
	public WebElement RiskDetails2;
	
	@FindBy(xpath = "(//label[@class='slot-info ng-star-inserted'])[1]")
	public WebElement RiskDetails1;
	
	@FindBy(xpath = "//i[contains(@title,'Single Chart')]")
	public WebElement SingleChart;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[3]/div[1]/div[1]/app-patient-service-result[1]/div[2]/div[1]/div[2]/app-service-result-view[1]/div[2]/div[1]/div[1]/a[1]")
	public WebElement Risk1;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[3]/div[1]/div[1]/app-patient-service-result[1]/div[2]/div[1]/div[2]/app-service-result-view[1]/div[2]/div[1]/div[2]/a[1]")
	public WebElement Risk2;
	
	@FindBy(xpath = "//label[@class='ng-star-inserted']//i[@title='Expand View']")
	public WebElement ExpandView;
	
	@FindBy(xpath = "//div[@class='highcharts-container ']")
	public WebElement GraphMARk;
	

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement Remarks2;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/lib-patient-header[1]/div[1]/div[2]/div[1]/label[2]/span[1]/span[1]/i[1]/i[1]")
	public WebElement PatientJourney;

	@FindBy(xpath = "//input[@id='phaseid']")
	public WebElement Phases;

	@FindBy(xpath = "//button[@id='addbtn']")
	public WebElement Save1;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;
	
	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//input[@id='reason']")
	public WebElement DISReason;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Destination;
	
	
	
	
	
	
	public void patreg(String title,String Name,String Lastname ,String Dob, String DocID, String MobNo,String Address,String MRNo , String PROVIDER) throws InterruptedException, AWTException, IOException {

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
		lastname.sendKeys(Lastname);
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
		Savereg.click();
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//Thread.sleep(1000);

		//JavascriptExecutor js= (JavascriptExecutor) driver;
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
		HSSFSheet BirthRegistration=wb.getSheetAt(29);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 



		//////Encounter
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);
	}
	
	

		public void ADT(String  ADTprovider ) throws InterruptedException {


			/////Admit the patient
			ADT.click();
			Thread.sleep(1500);
			EnterProviderName.sendKeys(ADTprovider);
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
			Thread.sleep(1000);
			Priority.click();
			Thread.sleep(2000);
			SelectPriority.click();
			Thread.sleep(1000);
			{

				WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
			BedCategory.click();
			Thread.sleep(1000);
			SelectBedCategory.click();
			Thread.sleep(1000);
			RoomType.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[contains(text(),'Deluxe')])")).click();

			Thread.sleep(1000);
			Bed.click();
			Thread.sleep(500);
			driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
			//SelectBed.click();
			Thread.sleep(500);
			SAve.click();
			Thread.sleep(3000);

		}
		
	

	public void InstructionOrder(String MRNO ,String id, String docpassword , String Site ) throws InterruptedException, AWTException {



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);





		////////login
		Thread.sleep(5000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(id);    
		Thread.sleep(1000);
		password.click();
		password.sendKeys(docpassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


		///Getting Time from DoctorNote

		Thread.sleep(3000);
		String time= driver.findElement(By.xpath("//span[@class='ser-time']")).getText();
		System.out.println(time +"= Time");


		////reg exp for split hours from total tym

		String[] arrOfStr = time.split(":", -2);

		for (String a : arrOfStr)

			System.out.println(a);

		System.out.println(arrOfStr[0]);



		String time1= arrOfStr[0];

		String[] hour  = time1.split(" " );

		for (String c : hour)

			System.out.println(c);

		System.out.println("time " + hour[0]);

		///PM

		String time2= arrOfStr[2];

		String[] AMPM  = time2.split(" " );

		for (String c : AMPM)

			System.out.println(c);

		System.out.println("time " + AMPM[1]);


		///Add 12 For PM      


		//  converting string into int 

		int i = Integer.parseInt(hour[1]);

		System.out.println(i +" - i ");

		String PM = "PM";


	  //Viewing Appointment Reason and remarks	
		Thread.sleep(1000);
		Expandedview.click();
		Thread.sleep(1000);
		Appointment.click();
		Thread.sleep(1000);
		Gridview.click();
		Thread.sleep(1000);
     	act.moveToElement(Remarks1).build().perform();
    	Thread.sleep(1000);

		/////doctornote
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(3000);
		
		category1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);
		
		
	    Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(3000);
		
		

		////Patient journey
		PatientJourney.click();
		Thread.sleep(3000);
		
		Phases.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Engagement Phase']")).click();
		Thread.sleep(500);
		Remarks2.sendKeys("Engagement Phase']");
		Thread.sleep(500);
		Save1.click();
		Thread.sleep(500);
		
		
		Phases.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Stabilization Phase']")).click();
		Thread.sleep(500);
		Remarks2.sendKeys("Stabilization Phase");
		Thread.sleep(500);
		Save1.click();
		Thread.sleep(500);

		Phases.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Early Recovery Phase']")).click();
		Thread.sleep(500);
		Remarks2.sendKeys("Early Recovery Phase']");
		Thread.sleep(500);
		Save1.click();
		Thread.sleep(500);

		Phases.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Sustained Recovery Phase']")).click();
		Thread.sleep(500);
		Remarks2.sendKeys("Stabilization Phase");
		Thread.sleep(500);
		Save1.click();
		Thread.sleep(500);

		Phases.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Discharge from SUD Treatment']")).click();
		Thread.sleep(500);
		Remarks2.sendKeys("Stop");
		Thread.sleep(500);
		DISReason.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Patient transferred (to custody)']")).click();
		Thread.sleep(500);
		Destination.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Unknown']")).click();
		Thread.sleep(500);
		Save1.click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//button[4]//div[2]//span[1]//i[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(500);
		
		
		/*	Thread.sleep(5000);
		UParrow.click();
		Thread.sleep(1000);
		lock.click(); */
		Thread.sleep(2000);
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
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
		driver.findElement(By.xpath("//li[normalize-space()='Dental Examination and Treatment']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Diagnosis and Plan')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);

		
		////Vitals & Risk
		
		vitals.click();
		Thread.sleep(1000);
		//Asssessment.click();
		urineTest.click();
		Thread.sleep(1000);
		Risk.click();
		Thread.sleep(1000);
		
	//----------AGPAR
		
	/*	AGPAR.click();
		Thread.sleep(1000);
		risk1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Slow/Irregular']")).click();
		Thread.sleep(1000);
		risk2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Less than 100']")).click();
		Thread.sleep(1000);
		risk3.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Flexion of extremities']")).click();
		Thread.sleep(1000);
		risk4.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Body pink extremities blue']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal-footer ng-star-inserted')]//button[contains(@class,'btn-primary sm active')][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		act.moveToElement(AGPARAsssessment).build().perform();
		Thread.sleep(2000);
		                               */
		//----------Fall Assesement
		
		FALLrisk.click();
		Thread.sleep(1000);
		risk1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='None in Last 12 months']")).click();
		Thread.sleep(1000);
		risk2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Taking more than two']")).click();
		Thread.sleep(1000);
		risk3.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appears midly affected by one or more']")).click();
		Thread.sleep(1000);
		risk4.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Mildly impaired']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal-footer ng-star-inserted')]//button[contains(@class,'btn-primary sm active')][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		act.moveToElement(FallRiskAsssessment).build().perform();
		Thread.sleep(2000);
		
		
		///service
		CPOEService.click();
		Thread.sleep(1000);
		Instructions.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title=' Instruction']")).click();
		Thread.sleep(1000);
		CPOEServiceSearch.click();
		Thread.sleep(1000);
		CPOEServiceSearch.sendKeys("free text");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='btn-service-search']//i[@class='ki ki-favourite-fill']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='item-name']")).click();
		Thread.sleep(1000);

		///plan 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-name'][normalize-space()='Plan']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")).sendKeys("action need to be taken");
		Thread.sleep(1000);

		EMRSave.click();
		Thread.sleep(3000); 

		NoteAdvanceSearch.click();
		Thread.sleep(1000);
		Filter.click();
		Thread.sleep(1000);
		OPCheckBox.click();
		Thread.sleep(2000);
		OPCheckBox.click();
		Thread.sleep(2000);
		act.moveToElement(visitType).build().perform();   	
		Thread.sleep(2000);  
		
		
	///Risk Graph
		
	/*	vital.click();
		Thread.sleep(1000);
		act.moveToElement(RiskDetails2).build().perform();   	
		Thread.sleep(3000);  */
		vital.click();
		Thread.sleep(1000);
		act.moveToElement(RiskDetails1).build().perform();   
		Thread.sleep(3000);
		SingleChart.click();
		Thread.sleep(1000);
		Risk1.click();
		Thread.sleep(3000);
	/*	Risk2.click();
		Thread.sleep(1000); */
		ExpandView.click();
		Thread.sleep(1000);
		act.moveToElement(GraphMARk).build().perform(); 
		Thread.sleep(3000);
		
		

		////Cpoe Administration

		CpoeAdmin.click();
		Thread.sleep(2000);
		InstructionOrder.click();
		Thread.sleep(2000);


		if(AMPM[1].contains(PM)) {

			int a=i+14;

			System.out.println(a+" pm");

			String slot = String.valueOf(a);

			System.out.println(slot+" -Slot");

			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-instructionorder[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div["+slot+"]")).click();
			Thread.sleep(1000);
			AdminStatus.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Waiting For Approval']")).click();
			Thread.sleep(1000);
			Remarks.click();
			Thread.sleep(1000);
			Remarks.sendKeys("ok");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-instructionorder[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div["+slot+"]")).click();
			Thread.sleep(2000);

			PreviousRemarks.click();
			Thread.sleep(1000);

			js.executeScript("arguments[0].scrollIntoView();", Arrow);
			Thread.sleep(1000);
			Arrow.click();
			Thread.sleep(1000);
			Edit.click();
			
			Thread.sleep(1000);
			Remarks.clear();
			Thread.sleep(1000);
			Remarks.sendKeys("Updated");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
			Thread.sleep(10000);



		}

		else {

			int  a=i+2;
			System.out.println("AM");

			String slot = String.valueOf(a);

			System.out.println("Slot - " + slot);

			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-instructionorder[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div["+slot+"]")).click();
			Thread.sleep(1000);
			AdminStatus.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Waiting For Approval']")).click();
			Thread.sleep(1000);
			Remarks.click();
			Thread.sleep(1000);
			Remarks.sendKeys("ok");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
			Thread.sleep(2500);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-instructionorder[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div["+slot+"]")).click();
			Thread.sleep(1000);

			PreviousRemarks.click();
			Thread.sleep(1000);

			js.executeScript("arguments[0].scrollIntoView();", Arrow);
			Thread.sleep(1000);
			Arrow.click();
			Thread.sleep(1000);

			Edit.click();
			Thread.sleep(1000);
			
			AdminStatus.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//li[normalize-space()='Executed']")).click();
			Thread.sleep(1000);
			
			
			Remarks.clear();
			Thread.sleep(1000);
			Remarks.sendKeys("Updated");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[normalize-space()='Update']")).click();
			Thread.sleep(10000);


		}


		OrderDetails.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'btn btn-danger sm clear')]")).click();
		Thread.sleep(1000);
        act.moveToElement(Instruction).build().perform();
        Thread.sleep(2000);
        
        
    ///Date range
        
        Date.click();
        Robot r=new Robot(); 
    	r.keyPress(KeyEvent.VK_LEFT);
    	Thread.sleep(800);
    	r.keyRelease(KeyEvent.VK_LEFT);
    	Thread.sleep(800);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
    	Thread.sleep(800);	

    	///Reset
    	driver.findElement(By.xpath("//i[@title='Reset']")).click();
    	Thread.sleep(800);
    	
    	//Encounter type
    	
    	
    	Encounter.click();
    	Thread.sleep(800);	
    	driver.findElement(By.xpath("//label[normalize-space()='All']//span[@class='checkmark']")).click();
    	Thread.sleep(1200);	
    	driver.findElement(By.xpath("//label[normalize-space()='All']//span[@class='checkmark']")).click();
    	Thread.sleep(800);
    	
    	
    	///Category
    	
    	driver.findElement(By.xpath("//input[@id='category']")).click();
    	Thread.sleep(800);	
    	driver.findElement(By.xpath("//li[normalize-space()='Instruction']")).click();
    	Thread.sleep(800);	
    	ServiceName.click();
    	ServiceName.sendKeys("siso");
    	
    	///Reset
    	driver.findElement(By.xpath("//i[@title='Reset']")).click();
    	Thread.sleep(800);
    	
    	
    	

	}



}






