package pagesOfYasasiiWeb;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_Inclinic_yasassiWeb extends  PageFactoryInitYasasiiWeb {
	public SP5_Inclinic_yasassiWeb(WebDriver driver) {
		super(driver);
	}

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

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEpharm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement MedicineSearch;

	@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
	public WebElement Orderingreason;


	@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
	public WebElement justification;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[11]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement diagnosischevckbox;

	@FindBy(xpath = "//label[contains(@class,'check-container ng-star-inserted')]//span[contains(@class,'checkmark')]")
	public WebElement inclinicadmin;

	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement medicineAdd;

	@FindBy(xpath = "//input[@name='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//button[normalize-space()='Create New Note']")
	public WebElement CreateNote;

	@FindBy(xpath = "//label[normalize-space()='Active']")
	public WebElement active;

	@FindBy(xpath = "//div[@class='row ng-star-inserted']//div[1]//div[1]//div[1]//label[1]//span[1]")
	public WebElement mediceCheck;

	@FindBy(xpath = "//div[contains(@class,'row ng-star-inserted')]//div[1]//div[1]//div[2]//div[1]//i[1]")
	public WebElement threedot;

	@FindBy(xpath = "//div[normalize-space()='Add as new']")
	public WebElement Addnew;

	@FindBy(xpath = "//label[normalize-space()='Inclinic Prescription']//span[contains(@class,'checkmark')]")
	public WebElement inclinicCheck;

	@FindBy(xpath = "//label[normalize-space()='G91.2 (Idiopathic) normal pressure hydrocephalus']//span[@class='checkmark']")
	public WebElement Diagnosismand;

	@FindBy(xpath = "//div[@class='mbl-pl5 col-lg-5']//div[2]//div[1]//div[1]//label[1]//span[1]")
	public WebElement calpol;

	@FindBy(xpath = "//div[contains(@class,'mbl-pl5 col-lg-5')]//div[contains(@class,'card-body')]//div[3]//div[1]//div[1]//label[1]//span[1]")
	public WebElement urifast;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[12]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement diagnosischevckbox3;

	@FindBy(xpath = "//i[@class='ki ki-file-move']")
	public WebElement moveMultiple;

	@FindBy(xpath = "//label[normalize-space()='In-Active']")
	public WebElement inactive;

	@FindBy(xpath = "//div[@class='vi-card-action']")
	public WebElement righrArrow;


	@FindBy(xpath = "//div[@class='page-container h-100']//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//div[4]//div[1]//div[6]//label[1]//i[1]")
	public WebElement more;

	@FindBy(xpath = "//div[normalize-space()='CPOE View']")
	public WebElement CpoeView;

	@FindBy(xpath = "//span[normalize-space()='Medicine']")
	public WebElement medicine;

	@FindBy(xpath = "//i[@title='Prescription Print']")
	public WebElement prescriptionprint;

	@FindBy(xpath = "//label[@class='icon refresh']")
	public WebElement refresh;

	@FindBy(xpath = "//div[normalize-space()='Inactive Medicines']")
	public WebElement Inactivefilt;

	@FindBy(xpath = "//div[normalize-space()='Antibiotic Medicines']")
	public WebElement antibioticFilt;


	@FindBy(xpath = "//div[normalize-space()='Active Medicines']")
	public WebElement Activefilt;

	@FindBy(xpath = "//label[@class='active-label ellipsis']")
	public WebElement filter;

	@FindBy(xpath = "//i[@class='ki ki-filter-list']")
	public WebElement Groupby;

	@FindBy(xpath = "//div[normalize-space()='Doctor']")
	public WebElement Doctor;

	@FindBy(xpath = "//div[normalize-space()='Department']")
	public WebElement Department;

	@FindBy(xpath = "//div[normalize-space()='Prescription Type']")
	public WebElement prescriptionType;

	@FindBy(xpath = "//div[normalize-space()='Medicine']")
	public WebElement medicine1;

	@FindBy(xpath = "//div[normalize-space()='Provider Visit']")
	public WebElement providervisit;













	public void doctorNote(String MRNO) throws InterruptedException {

		Thread.sleep(3000);
		Search.click();                                                      
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
		//disgnosis.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		CPOEpharm.click();
		Thread.sleep(1000);
		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("Diabeta");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Orderingreason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		justification.click();
		Thread.sleep(1000);
		justification.sendKeys("ok");
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
		Thread.sleep(1000);
		diagnosischevckbox.click();
		Thread.sleep(1000);
		inclinicadmin.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);
		// 
		Thread.sleep(1000);
		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("calpol");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
		Thread.sleep(1000);
		diagnosischevckbox.click();
		Thread.sleep(1000);
		inclinicadmin.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		MedicineSearch.clear();
		Thread.sleep(1000);
		MedicineSearch.sendKeys("urifast");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox3);
		Thread.sleep(1000);
		diagnosischevckbox3.click();
		Thread.sleep(1000);
		inclinicadmin.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("ok");
		Thread.sleep(1000);
		medicineAdd.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000);
	}

	public void newnote() throws InterruptedException {


		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='icon doctornote']")));

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		CreateNote.click();
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
		CPOEpharm.click();
		Thread.sleep(2000);
		act.moveToElement(active).click().build().perform();

		//active.click();
		Thread.sleep(1000);
		mediceCheck.click();
		Thread.sleep(1000);
		threedot.click();
		Thread.sleep(1000);
		Addnew.click();
		Thread.sleep(1000);
		inclinicCheck.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		Diagnosismand.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(2000);
		active.click();
		Thread.sleep(1000);
		calpol.click();
		Thread.sleep(1000);
		urifast.click();
		Thread.sleep(1000);
		moveMultiple.click();
		//Addnew.click();
		Thread.sleep(1000);
		inclinicCheck.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Diagnosismand.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//button[normalize-space()='Ok']//i[contains(@class,'ki ki-check')]")).click();

		Thread.sleep(3000);
		EmrSave.click();
		Thread.sleep(1000);

	}


	public void discontinue() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='icon doctornote']")));

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		CreateNote.click();
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
		CPOEpharm.click();
		Thread.sleep(2000);
		act.moveToElement(active).click().build().perform();
		Thread.sleep(1000);
		inactive.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='row ng-star-inserted']//div[1]//div[1]//div[1]//label[1]//span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='mbl-pl5 col-lg-5']//div[2]//div[1]//div[1]//label[1]//span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='card-body']//div[3]//div[1]//div[1]//label[1]//span[1]")).click();
		Thread.sleep(1000);
		moveMultiple.click();
		Thread.sleep(1000);
		inclinicCheck.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Diagnosismand.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000);


	}



	public void prescriptionPrint() throws InterruptedException, AWTException {

		Thread.sleep(2000);
		righrArrow.click();
		Thread.sleep(1000);
		more.click();
		Thread.sleep(1000);
		CpoeView.click();
		Thread.sleep(1000);
		medicine.click();
		Thread.sleep(1000);
		prescriptionprint.click();
		Thread.sleep(3000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500); 
		t.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(1000);


		/////EMRhome filters


		refresh.click();
		Thread.sleep(1000);
		filter.click();
		Thread.sleep(1000);
		Inactivefilt.click();
		Thread.sleep(1000);
		filter.click();
		Thread.sleep(1000);
		antibioticFilt.click();
		Thread.sleep(1000);
		filter.click();
		Thread.sleep(1000);
		Activefilt.click();
		Thread.sleep(1000);
		Groupby.click();
		Thread.sleep(1000);
		Doctor.click();
		Thread.sleep(1000);
		Groupby.click();
		Thread.sleep(1000);
		Department.click();
		Thread.sleep(1000);
		Groupby.click();
		Thread.sleep(1000);
		prescriptionType.click();
		Thread.sleep(1000);
		Groupby.click();
		Thread.sleep(1000);
		medicine1.click();
		Thread.sleep(1000);
		Groupby.click();
		Thread.sleep(1000);
		providervisit.click();
		Thread.sleep(1000);


	}


public void cpoeAdmin() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@class='icon cpoeadmin']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='adm-xl-header sm-header']//label[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@class='active-due']")).click();
	
	
}




























}