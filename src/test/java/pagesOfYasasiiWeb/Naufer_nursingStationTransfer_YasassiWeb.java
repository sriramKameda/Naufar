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

public class Naufer_nursingStationTransfer_YasassiWeb extends PageFactoryInitYasasiiWeb{

	public Naufer_nursingStationTransfer_YasassiWeb(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;
	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;
	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;
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

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement threedots;

	@FindBy(xpath = "//div[contains(text(),'Transfer')]")
	public WebElement newtransfer;

	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement roomcategory;

	@FindBy(xpath = "//li[normalize-space()='ROOM']")
	public WebElement selectRoom;	

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement roomtype;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[3]/li[1]")
	public WebElement selectroomtype;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement bedno;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[5]/form[1]/div[1]/div[2]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement selectbed;		

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement sendrequest;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement uparrow;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[2]/i[1]")
	public WebElement lock;

	@FindBy(xpath = "//label[@class='icon adtview']")
	public WebElement adt;

	@FindBy(xpath = "//button[@id='acceptpatadtbutton']")
	public WebElement accept;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement search;

	@FindBy(xpath = "//div[@class='count ng-star-inserted']")
	public WebElement task;	

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement maincategory;	

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;	

	@FindBy(xpath = "//div[@title='Status Update/Group View/Log View']//i[@class='ki ki-info-circle-fill']")
	public WebElement Statusicon;	

	@FindBy(xpath = "//input[@id='status']")
	public WebElement Status;	

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Slots;	

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

	@FindBy(xpath = "//i[@title='Edit']")
	public WebElement Edit;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//i[@title='Delete']")
	public WebElement Delete;

	@FindBy(xpath = "//input[@id='occupation']")
	public WebElement Occupation;

	@FindBy(xpath = "//input[@id='employmentstatus']")
	public WebElement EmployeeStatus;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//input[@id='highestlevelofeducationid']")
	public WebElement highestedu;

	@FindBy(xpath = "//input[@id='paidemptime']")
	public WebElement paidEmployment;


	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-user']")
	public WebElement PatientInfo;

	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;

	@FindBy(xpath = "//ki-calender-time[@id='admiteddate']//input[@type='text']")
	public WebElement AdmissionDate;

	@FindBy(xpath = "//input[@id='patientstatusid']")
	public WebElement PatientStatus;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//i[@title='Click to change view as Card View']")
	public WebElement changetogridview;


	public void Patreg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String ADTprovider ) throws InterruptedException, IOException, AWTException {

		///////////////////Register a female patient

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(1000);
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

		Thread.sleep(600);
		EnterMob.sendKeys(MobNo);
		Thread.sleep(500);

		maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		Thread.sleep(500); 

		Occupation.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Other']")).click();
		Thread.sleep(500);
		EmployeeStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Unknown']")).click();
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

		/*	String word[]=mrno.split("[ :] ");
			System.out.println("number of words: "+word.length);
			for(int i=0;i<word.length;i++)
			{
				System.out.println("word["+i+"]="+word[i]);
			}
			System.out.println(word[1]);  */

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\NauferYasassiWeb - 8083\\src\\test\\resources\\excelYasasiiWeb\\NaufarDataSheet8083.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(1);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
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
		printUnckeck.click();
		Thread.sleep(1000);
		billSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);


	}


	public void ADT(String ADTprovider) throws InterruptedException{



		/////Admit the patient
		ADT.click();
		Thread.sleep(1500);
		//driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		//Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);

		AdmissionDate.click();

		for (int i = 0; i < 5; i++) {

			driver.findElement(By.xpath("//button[@aria-label='Minus a minute']//span[@class='owl-dt-control-button-content']//*[name()='svg']")).click();
			Thread.sleep(400);	

		}

		Set.click();
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
		Thread.sleep(1000);
		Thread.sleep(2000);


		threedots.click();
		Thread.sleep(800);
		newtransfer.click();
		Thread.sleep(800);
		roomcategory.click();
		Thread.sleep(1500);
		selectRoom.click();
		Thread.sleep(1200);
		roomtype.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("(//*[contains(text(),'Deluxe')])[3]")).click();
		//selectroomtype.click();
		Thread.sleep(2000);
		bedno.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'Transfer nursing station')])[1]")).click();
		//selectbed.click();
		Thread.sleep(2000);
		sendrequest.click();
		Thread.sleep(3000); 


	}

	public void Appointment(String MRNo ,String Provider ) throws InterruptedException {



		Appointment.click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
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
		driver.findElement(By.xpath("//li[normalize-space()='Assessment']")).click();
		Thread.sleep(1000);
		AppRemarks.click();
		Thread.sleep(1000);
		AppRemarks.sendKeys("Regular checkup");
		Thread.sleep(1000);

		Slots.clear();
		Thread.sleep(1000);
		Slots.sendKeys("1");
		Thread.sleep(1000);

		AppSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);


		///Changing status

		maincategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='All(Pending)']")).click();
		Thread.sleep(1000);
		Searchfield.clear();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);		
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		Statusicon.click();
		Thread.sleep(1000);
		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Reported']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active ng-star-inserted']")).click();
		Thread.sleep(1000);


		///edit
		Edit.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Reported on tym");
		Thread.sleep(1000);
		Update.click();
		Thread.sleep(2000);

		Delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(2000);



	}





	public void transfer(String MRNo , String URL ,String User , String Password , String Site) throws InterruptedException
	{


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
		userid.sendKeys(User);
		password.click();
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



		Thread.sleep(1000);
		/*	    search.click();
		  	Thread.sleep(1000);
			search.sendKeys(MRNo);
			Thread.sleep(1000); */
		task.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@title='Nursing Station Transfer Request']")).click();

		changetogridview.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(5000);
		/*   uparrow.click();//i[@class='dashboard-lock-arrow ki ki-chevron-up']
			Thread.sleep(800);
			lock.click();
			Thread.sleep(2000); */
		adt.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//i[@class='ki ki-screen-expand']")).click();
		Thread.sleep(1500);
		accept.click();
		Thread.sleep(2000);	


	}


public void PateintStatusEdit(String MRNo) throws InterruptedException {
	
	Thread.sleep(1000);
	Hamburger.click();
	Thread.sleep(800);
	//driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
	Thread.sleep(800);
	FO.click();
	Thread.sleep(1000);
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

	
	Thread.sleep(1000);
	Searchfield.clear();
	Thread.sleep(1000);
	Searchfield.sendKeys(MRNo , Keys.ENTER);
	Thread.sleep(1500);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(1000);
	
	PatientInfo.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
	Thread.sleep(2000);
	act.moveToElement(PatientStatus).build().perform();
	Thread.sleep(2000);
	
	
	
}

}
