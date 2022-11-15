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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_Careteam_YasasiiWeb  extends PageFactoryInitYasasiiWeb{

	public SP5_Careteam_YasasiiWeb(WebDriver driver) {

		super(driver);

	}

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement   hamberger;

	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement   Master;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
	public WebElement Resource;

	@FindBy(xpath="//span[normalize-space()='Resource Master']")
	public WebElement ResourceMaster;

	@FindBy(xpath="//input[@id='resourcecategoryid']")
	public WebElement ResourceCat;

	@FindBy(xpath="//input[@id='name1']")
	public WebElement name;

	@FindBy(xpath="//button[@id='resourcemastersave']")
	public WebElement Save;

	@FindBy(xpath="//span[normalize-space()='Resource Mapping']")
	public WebElement ResourceMapping;

	@FindBy(xpath="//div[@class='col-md-4']//input[@id='resourcecategoryid']")
	public WebElement MainCategory;

	@FindBy(xpath="//input[@id='resourcemasterlist']")
	public WebElement NameList;

	@FindBy(xpath="//div[@class='col-md-7']//input[@id='resourcecategoryid']")
	public WebElement SubCategory;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-dutyroster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/fieldset[1]/form[1]/div[1]/div[2]/div[1]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement Todate;

	@FindBy(xpath="(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[3]")
	public WebElement rightArrow;

	@FindBy(xpath="//input[@id='fromtime']")
	public WebElement FromTym;

	@FindBy(xpath="//input[@id='totime']")
	public WebElement Totym;

	@FindBy(xpath="//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath="//button[@id='dutyrostsaveid']")
	public WebElement MappingSave;

	@FindBy(xpath="//span[normalize-space()='Schedule Setting']")
	public WebElement SheduleSetting;

	@FindBy(xpath="//input[@id='categoryListId']")
	public WebElement Category;

	@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='namelistdisplay']")
	public WebElement SheduleName;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-schedulesetting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement Todate1;

	@FindBy(xpath="//input[@id='session']")
	public WebElement Session;



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

	@FindBy(xpath = "//input[@id='nationality']")
	public WebElement nationality;

	@FindBy(xpath = "//span[normalize-space()='English']")
	public WebElement preferlang;

	@FindBy(xpath = "//input[@id='preferedlanguageid']")
	public WebElement Defaultlang;

	@FindBy(xpath = "//label[@class='btn-feedback']")
	public WebElement Adtlinfo;

	@FindBy(xpath = "//input[@id='careteamid']")
	public WebElement careTeam;

	@FindBy(xpath = "//input[@id='clinicalleadid']")
	public WebElement clinicalLead;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[2]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Category1;

	@FindBy(xpath = "//i[@class='ki ki-calendar-fill']")
	public WebElement Appointment;

	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement allSlot;
	
	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement Searchresource;

	@FindBy(xpath = "//tbody[1]/tr[2]/td[4]/div[1]")
	public WebElement appselection;


	@FindBy(xpath = "///td[contains(text(),'20:00')]")
	public WebElement appscroll;

	@FindBy(xpath = "//tbody/tr[4]/td[2]/div[2]/label[1]/i[1]")
	public WebElement appaddicon;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement appsave;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement appok;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/i[1]")
	public WebElement encountericon; 


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/i[1]")
	public WebElement DeleteAppoinment;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Reason;

	@FindBy(xpath = "//li[normalize-space()='Patient Request']")
	public WebElement SelectReason;

	@FindBy(xpath = "//button[normalize-space()='Cancel Appointment']")
	public WebElement CancelAppoinment;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement Search;

	@FindBy(xpath = "//li[normalize-space()='Appointment']")
	public WebElement Appoinmt;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement entermrno;
	
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[2]/div[1]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")
	public WebElement DateRange;

	@FindBy(xpath = "//span[@class='owl-dt-calendar-cell-content owl-dt-calendar-cell-today']")
	public WebElement SelectDate;

	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;
	
	@FindBy(xpath = "//div[@title='Cancel Appointment']//i[@class='ki ki-close']")
	public WebElement cancelApp;
	
	@FindBy(xpath = "//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement cancelreason;
	
	@FindBy(xpath = "//label[normalize-space()='Week']")
	public WebElement Week;
	
	
	@FindBy(xpath = "//label[normalize-space()='Day']")
	public WebElement Day;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/label[1]")
	public WebElement ResourceName;
	
	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-user']")
	public WebElement Patientinfo;
	
	@FindBy(xpath = "//i[@class='ki ki-user-card-fill']")
	public WebElement PatientCard;
	
	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;
	//button[@id='billingsave']

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[2]/li[5]/a[1]/img[1]")
	public WebElement langSelect;
	
	@FindBy(xpath = "//input[@id='militaryserviceid']")
	public WebElement militaryService;
	
	@FindBy(xpath = "//input[@id='highestlevelofeducationid']")
	public WebElement highereducation;
	
	@FindBy(xpath = "//input[@id='ethinicityid']")
	public WebElement ethinicity;
	
	@FindBy(xpath = "//input[@id='legalstatusid']")
	public WebElement legal;
	
	@FindBy(xpath = "//input[@id='patientelectedtypeid']")
	public WebElement parentType;
	
	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement livesin;
	
	@FindBy(xpath = "//input[@id='housingstatusliveswithid']")
	public WebElement livesWith;
	
	


	public void mastersSetting(String CareTeamName) throws InterruptedException {

		Thread.sleep(2000);
		hamberger.click();
		Thread.sleep(1000);
		Master.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		Resource.click();
		Thread.sleep(1000);
		ResourceMaster.click();
		Thread.sleep(1000);
		ResourceCat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Care Team']")).click();
		Thread.sleep(1000);

		name.click();
		Thread.sleep(1000);
		name.sendKeys(CareTeamName);
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")));

		Thread.sleep(5000);
		hamberger.click();
		Thread.sleep(1000);
		ResourceMapping.click();
		Thread.sleep(1000);
		MainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Care Team']")).click();
		Thread.sleep(1000);
		NameList.click();
		Thread.sleep(1000);
		NameList.sendKeys(CareTeamName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-dutyroster[@class='ng-star-inserted']//li[1]")).click();
		Thread.sleep(1000);
		SubCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Nurse']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'Ganga(nur001)')]")).click();
		Thread.sleep(1000);
		Todate.click();
		Thread.sleep(1000);
		rightArrow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='30']")).click();
		Thread.sleep(1000);
		FromTym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			FromTym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		FromTym.sendKeys( Keys.HOME + "00 00");
		Thread.sleep(1000);
		Totym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			Totym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Totym.sendKeys(Keys.HOME + "22 00");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		MappingSave.click();
		Thread.sleep(2000);


		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")));
		Thread.sleep(2000);
		
		hamberger.click();
		Thread.sleep(1000);
		SheduleSetting.click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Care Team']")).click();
		Thread.sleep(1000);
		SheduleName.click();
		Thread.sleep(1000);
		SheduleName.sendKeys(CareTeamName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-schedulesetting[@class='ng-star-inserted']//li[1]")).click();
		Thread.sleep(1000);
		Todate1.click();
		Thread.sleep(1000);
		rightArrow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='30']")).click();
		Thread.sleep(1000);
		Session.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Whole Day']")).click();
		Thread.sleep(1000);
		FromTym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			FromTym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		FromTym.sendKeys(Keys.HOME + "00 00");
		Thread.sleep(1000);
		Totym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			Totym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Totym.sendKeys(Keys.HOME + "22 00");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='schedulesettingsave']")).click();
		Thread.sleep(1000);

	}


	public void REgister(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR ,String CareTeamName , String MRNO , String PROVIDER) throws InterruptedException, IOException, AWTException {





		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-chevron-down']")).click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Registration']")).click();
		Thread.sleep(2000);

		
//		
//		Thread.sleep(1000);
//		langSelect.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[normalize-space()='Arabic']")).click();
//		Thread.sleep(1000);
//		//div[normalize-space()='Arabic']
		
		
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

		nationality.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Indian']")).click();
		Thread.sleep(1000);
		preferlang.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='English']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Arabic']")).click();
		Thread.sleep(1000);
		Defaultlang.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[normalize-space()='Arabic']")).click();
		
		Thread.sleep(1000);


		Category1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='VIP']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Normal']")).click();
		Thread.sleep(1000);



JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("arguments[0].scrollIntoView();", Adtlinfo);
		Adtlinfo.click();
		Thread.sleep(1000);
		careTeam.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" + CareTeamName + "')]")).click();
		Thread.sleep(1000);
		clinicalLead.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Ganga(nur001)']")).click();
		Thread.sleep(1000);
		militaryService.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='National Guard']")).click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", highereducation);
		highereducation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Graduate (Bachelor)']")).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", ethinicity);
		ethinicity.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Caucasian']")).click();
		Thread.sleep(1000);
		legal.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Case Pending']")).click();
		Thread.sleep(1000);
		parentType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Directed']")).click();
		Thread.sleep(1000);
		livesin.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Own Home']")).click();
		Thread.sleep(1000);
		livesWith.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Both Parents']")).click();
		Thread.sleep(1000);
		
		
		
		
		js.executeScript("arguments[0].scrollIntoView();", ContactInformation);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		
		js.executeScript("arguments[0].scrollIntoView();", DocID);
		DocID.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		Thread.sleep(1000);
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
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
		Thread.sleep(1000);
		OKhowDidYouKnow.click();
		Thread.sleep(2000);
		RegSave.click();
		Thread.sleep(3000);
		
		SaveSuccess.click();
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(88);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);
		
		
		Thread.sleep(1000);
		clear.click();
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
		
		
		
		
		
		
		
		
	}
	
	public void patientcard() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		Patientinfo.click();
		Thread.sleep(1000);
		PatientCard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='print']")).click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("CURRENT NO.OF WINDOWS"+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("go to window no."+ m);
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(m));
		Thread.sleep(1000);
		
}
	
	
	
	
	
	
	
	
	
	public void appointment(String CareTeamName , String MRNO) throws InterruptedException, AWTException	{
		Appointment.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		driver.findElement(By.xpath("//label[@title='Doctor']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[normalize-space()='Care Team']")).click();
		Thread.sleep(500);
		Week.click();
		Thread.sleep(2000);
		ResourceName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")).click();
		Thread.sleep(1000);
         Day.click();
         Thread.sleep(2000);
       	allSlot.click();
		Thread.sleep(2000);
		Searchresource.clear();
		Thread.sleep(500);
		Searchresource.sendKeys(CareTeamName);
		Thread.sleep(2000);
		appselection.click();
		Thread.sleep(5000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[4]/div[1]/span[1]"));
     	Thread.sleep(5000);

		List<WebElement> li2=new ArrayList<WebElement>(); 

		WebElement plusDiv=driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']"));
		WebElement appointmentPlus=driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']"));
		act.moveToElement(plusDiv).build().perform();
		Thread.sleep(5000);
		act.moveToElement(appointmentPlus).click().build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		appsave.click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'OK')]")));
		Thread.sleep(3000);
		appok.click();
		Thread.sleep(500);
		//////////////Edit the appoinment
		Search.click();
		Thread.sleep(500);
		Appoinmt.click();
		Thread.sleep(1000);
		DateRange.click();
		Thread.sleep(800);
		//driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		//    	WebElement textbox=driver.findElement(By.xpath("//tbody/tr[3]/td[3]/span[1]"));
		//    	Thread.sleep(800);
		//    	textbox.click();
		//    	Thread.sleep(800);
		//    	textbox.sendKeys(Keys.ARROW_RIGHT,Keys.ENTER);
		//    	Thread.sleep(800);

		Set.click();
		Thread.sleep(800);
		entermrno.clear();
		Thread.sleep(800);
		entermrno.sendKeys(MRNO);
		Thread.sleep(2000);
    	WebElement patNO = driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]"));
		//SelectthePatient.click();
    	act.moveToElement(patNO).build().perform();
		Thread.sleep(1000);
		cancelApp.click();
		Thread.sleep(800);
		cancelreason.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor in Procedure']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Cancel Appointment']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		
		
	}


	

}
