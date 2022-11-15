package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_DialysisNote_yasasiiWeb  extends PageFactoryInitYasasiiWeb{

	public SP5_DialysisNote_yasasiiWeb(WebDriver driver) {

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

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//button[@id='adddoc']//label")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;


	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamberger;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement cpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement cpoeSearch;

	@FindBy(xpath = "//button[@class='icon-btn btn-dark-green inline min-clear-btm']//i[@class='ki ki-plus']")
	public WebElement Plus;

	@FindBy(xpath = "//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")
	public WebElement Add;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//i[@class='ki ki-plus-circle']")
	public WebElement DialysisNote;

	@FindBy(xpath = "//ki-calender-time//input[@type='text']")
	public WebElement ExcTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[2]/div[4]/ki-select-control[1]/div[1]/input[1]")
	public WebElement hptltype;

	@FindBy(xpath = "//div[@class='col-md-12']//div[2]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")
	public WebElement diabetic;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/label[1]/span[2]")
	public WebElement permath;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/label[4]/span[2]")
	public WebElement jagular;

	@FindBy(xpath = "//div[4]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")
	public WebElement starttymcheck;

	@FindBy(xpath = "//div[@class='sectioncontainer']//div[@class='element-container removespace']//ki-time-picker//input[@type='text']")
	public WebElement starttym;

	@FindBy(xpath = "//button[@aria-label='Minus a hour']//span[@class='owl-dt-control-button-content']//*[name()='svg']")
	public WebElement minusHour;

	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;

	@FindBy(xpath = "//div[@class='sectioncontainer']//div[2]//div[1]//label[1]//span[2]")
	public WebElement endtymcheck;

	@FindBy(xpath = "//div[@class='sectioncontainer']//div[2]//div[2]//div[4]//ki-time-picker[1]//div[1]//input[1]")
	public WebElement endtym;

	@FindBy(xpath = "//span[normalize-space()='Current Time']")
	public WebElement currentTym;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[7]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement assesmentdoc;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/div[4]/div[2]/div[1]/div[1]/div[3]/label[3]/span[2]")
	public WebElement Headache;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tubesReused;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[2]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement dialyserUsed;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[8]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement machineNo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[9]/div[1]/div[3]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement lastpostwt;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[9]/div[1]/div[3]/div[2]/div[2]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement prediawt;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[9]/div[1]/div[3]/div[2]/div[3]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement PostdiaWt;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[9]/div[1]/div[3]/div[2]/div[4]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement removedfluid;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-dialysis-note[1]/div[1]/div[2]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[10]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement comment;

	@FindBy(xpath = "//button[@class='btn btn-primary sm ml15 ng-star-inserted']")
	public WebElement DialysisAdd;

	@FindBy(xpath = "//i[@class='ki ki-eye']")
	public WebElement Eye;

	@FindBy(xpath = "//i[@class='fa fa-caret-right']")
	public WebElement Rightkey;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]")
	public WebElement dialysisnote;

	@FindBy(xpath = "//div[@class='child-list-group']//div[1]//div[1]//div[2]//div[1]//div[4]//div[1]//div[6]//label[1]//i[1]")
	public WebElement more;

	@FindBy(xpath = "//div[normalize-space()='Edit']")
	public WebElement edit;

	@FindBy(xpath = "//label[@class='table-action-icons']//i[@class='ki ki-edit-log']")
	public WebElement logindv;

	@FindBy(xpath = "//span[@class='btn btn-danger sm clear']")
	public WebElement close;

	@FindBy(xpath = "//label[@class='icon-btn icon-edit']//i[@class='ki ki-edit-log']")
	public WebElement logoveall;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement noteEdit;

	@FindBy(xpath = "//button[normalize-space()='Update']")
	public WebElement update;

	@FindBy(xpath = "//div[@class='dialysis-table relative']//div[1]//div[1]//div[3]//label[2]//i[1]")
	public WebElement Delete;

	@FindBy(xpath = "//textarea[@id='deletedreason']")
	public WebElement deleteReason;

	@FindBy(xpath = "//span[@class='btn btn-primary sm active']")
	public WebElement ReasonSave;






















	public void PatReg(String NAME,String AGE, String MBLNO , String ORGANISATION, String ADDRESS , String AADHAAR , String PROVIDER) throws InterruptedException, IOException {

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
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);

		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(3000);
		SaveSuccess.click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(84);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(11).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);

		//////Encounter
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();

		Thread.sleep(5000);
		EncounterAdd.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(1000);


	}


	public void DialysisNote(String URL, String User,String Password,String site, String MRNO,String Service) throws InterruptedException {

		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.get(URL);


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


	//	Hamberger.click();
		Thread.sleep(1000);
		
		Search.clear();                                                      
		Thread.sleep(1000);
		Search.sendKeys(MRNO);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		Thread.sleep(1000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);
		cpoeService.click();
		Thread.sleep(1000);
		cpoeSearch.clear();
		Thread.sleep(1000);
		cpoeSearch.sendKeys(Service);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Service+"')]")).click();
		Thread.sleep(1000);
		Plus.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='icon doctornote']")));
		DoctorNote.click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		Thread.sleep(1000);
		Thread.sleep(800); 
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dialysis Note']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(3000);
		DialysisNote.click();
		Thread.sleep(1000);
		ExcTime.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(1000);
		hptltype.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Done from Inside']")).click();
		Thread.sleep(1000);
		diabetic.click();
		Thread.sleep(1000);
		permath.click();
		Thread.sleep(1000);
		jagular.click();
		Thread.sleep(1000);
		starttymcheck.click();
		Thread.sleep(1000);
		starttym.click();
		Thread.sleep(1000);
		minusHour.click();
		Thread.sleep(1000);
		minusHour.click();
		Thread.sleep(1000);
		Set.click();
		Thread.sleep(1000);
		endtymcheck.click();
		Thread.sleep(1000);
		endtym.click();
		Thread.sleep(1000);
		currentTym.click();
		Thread.sleep(1000);
		assesmentdoc.click();
		Thread.sleep(1000);
		assesmentdoc.sendKeys("patient is normal");
		Thread.sleep(1000);
		Headache.click();
		Thread.sleep(1000);
		tubesReused.click();
		Thread.sleep(1000);
		tubesReused.sendKeys("2");
		Thread.sleep(1000);
		dialyserUsed.click();
		Thread.sleep(1000);
		dialyserUsed.sendKeys("2");
		Thread.sleep(1000);
		machineNo.click();
		Thread.sleep(1000);
		machineNo.sendKeys("2");
		Thread.sleep(1000);
		lastpostwt.click();
		Thread.sleep(1000);
		lastpostwt.sendKeys("48");
		Thread.sleep(1000);
		prediawt.click();
		Thread.sleep(1000);
		prediawt.sendKeys("46");
		Thread.sleep(1000);
		PostdiaWt.click();
		PostdiaWt.sendKeys("48");
		Thread.sleep(1000);
		removedfluid.click();
		Thread.sleep(1000);
		removedfluid.sendKeys("1");
		Thread.sleep(1000);
		comment.click();
		Thread.sleep(1000);
		comment.sendKeys("patient need medication");
		Thread.sleep(1000);
		DialysisAdd.click();
		Thread.sleep(1000);
		Eye.click();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(3000);
		Rightkey.click();
		Thread.sleep(1000);
		dialysisnote.click();
		Thread.sleep(2000);
		more.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(2000);
		logindv.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(1000);
		logoveall.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		noteEdit.click();
		Thread.sleep(2000);
		update.click();
		Thread.sleep(2000);
		EmrSave.click();
		Thread.sleep(2000);
		Rightkey.click();
		Thread.sleep(1000);
		dialysisnote.click();
		Thread.sleep(2000);
		more.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
		DialysisNote.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		ExcTime.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(1000);
		hptltype.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Done from Inside']")).click();
		Thread.sleep(1000);
		diabetic.click();
		Thread.sleep(1000);
		permath.click();
		Thread.sleep(1000);
		jagular.click();
		Thread.sleep(1000);
		starttymcheck.click();
		Thread.sleep(1000);
		starttym.click();
		Thread.sleep(1000);
		minusHour.click();
		Thread.sleep(1000);
		minusHour.click();
		Thread.sleep(1000);
		Set.click();
		Thread.sleep(1000);
		DialysisAdd.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialysis-table relative']//div[1]//div[1]//div[3]//label[1]//i[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']")).click();
		Thread.sleep(1000);
		Delete.click();
		Thread.sleep(1000);
		deleteReason.click();
		Thread.sleep(1000);
		deleteReason.sendKeys("test note");
		Thread.sleep(1000);
		ReasonSave.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(2000);
		/////forPCTS
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		












	}




}






