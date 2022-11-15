package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class FO_queueDisplayYasassiweb extends PageFactoryInitYasasiiWeb {
	
	public FO_queueDisplayYasassiweb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//span[normalize-space()='Queue Display']")
	public WebElement QueueMaster;
	
	@FindBy(xpath = "//input[@id='queuetypeid']")
	public WebElement QueueType;
	
	@FindBy(xpath = "//input[@id='queueid']")
	public WebElement QueueName;
	
	@FindBy(xpath = "//button[@class='btn btn-primary sm active']")
	public WebElement ok;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;
	
	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//button[@id='login_spinner']")
	public WebElement login;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]")
	public WebElement patientSelect;
	
	@FindBy(xpath = "//i[@class='ki ki-token-call']")
	public WebElement callcurrentToken;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement ENCprvdrName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement EncounterSaveOK;
	
	
	@FindBy(xpath = "//span[contains(@class,'search-icon')]//i[contains(@class,'ki ki-search')]")
	public WebElement searchIcon;
	
	@FindBy(xpath = "//label[@title='Clear']//i[@class='ki ki-close']")
	public WebElement Clear;
	
	@FindBy(xpath = "//i[@class='ki ki-calendar-fill']")
	public WebElement Appointment;

	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement allSlot;
	
	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement Searchresource;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]")
	public WebElement appselection;


	@FindBy(xpath = "///td[contains(text(),'20:00')]")
	public WebElement appscroll;

	@FindBy(xpath = "//tbody/tr[4]/td[2]/div[2]/label[1]/i[1]")
	public WebElement appaddicon;

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement appsave;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement appok;

	@FindBy(xpath = "//div[@class='item-icon']//i[@class='ki ki-reception-fill']")
	public WebElement Billing;
	
	@FindBy(xpath = "//button[normalize-space()='Check-In']")
	public WebElement checkin;
	
	@FindBy(xpath = "//i[@class='ki ki-arrow-right']")
	public WebElement rightkeyDashboard;
	
	
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

	@FindBy(xpath = "//label[@class='check-container ']//span[@class='checkmark']")
	public WebElement Repeat;
	
	@FindBy(xpath = "//label[normalize-space()='Monthly']")
	public WebElement monthly;
	
	@FindBy(xpath = "//input[@id='weekcount']")
	public WebElement Recurr;
	
	@FindBy(xpath = "//ki-calendar[@id='endDate']//input[@type='text']")
	public WebElement Endtym;
	
	@FindBy(xpath = "//label[normalize-space()='Saturday']//span[@class='checkmark']")
	public WebElement SatDay;
	
	@FindBy(xpath = "//button[@aria-label='Next month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")
	public WebElement RightArrow;
	
	@FindBy(xpath = "//input[@id='monthday']")
	public WebElement day;
	
	@FindBy(xpath = "//input[@id='monthweek']")
	public WebElement Week;
	
	@FindBy(xpath = "//input[@id='monthweekday']")
	public WebElement DayofWeek;
	
	@FindBy(xpath = "//input[@id='repeatMonthsWeek']")
	public WebElement RepeatMonth;
	
	@FindBy(xpath = "//textarea[@id='undefined']")
	public WebElement Remarks;
	
	@FindBy(xpath = "//button[@id='repaeatappointmentbuttonid']")
	public WebElement Continue;
	
	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement AppSave;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void tokenview(String MRNo,String URL , String Queuetype ,String queueName,String ID , String Password, String Site,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO) throws AWTException, InterruptedException, IOException {
	
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
		HSSFSheet FOFullRegTest=wb.getSheetAt(92);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(13).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);
		
//        Thread.sleep(2000);
//		Searchfield.sendKeys(MRNo);
//		Thread.sleep(1000);
//		searchIcon.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();
//		Thread.sleep(1000);
//		//patientSelect.click();
		
		
		Appointment.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		
		Thread.sleep(2000);
		Searchresource.clear();
		Thread.sleep(500);
		Searchresource.sendKeys("Rohit sharma");
		Thread.sleep(2000);
		appselection.click();
		Thread.sleep(5000);
		//List<WebElement> li=new ArrayList<WebElement>();
	//li=driver.findElements(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[4]/div[1]/span[1]"));
     //	Thread.sleep(5000);

	//	List<WebElement> li2=new ArrayList<WebElement>(); 

		WebElement plusDiv=driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']"));
		
		WebElement appointmentPlus=driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']"));
		act.moveToElement(plusDiv).build().perform();
		Thread.sleep(3000);
		act.moveToElement(appointmentPlus).click().build().perform();
		Thread.sleep(3000);
		Repeat.click();
		Thread.sleep(1000);
		monthly.click();
		Thread.sleep(1000);
		day.click();
		Thread.sleep(1000);
		day.sendKeys("1");
		Thread.sleep(1000);
		Week.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Last']")).click();
		Thread.sleep(1000);
		DayofWeek.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Saturday']")).click();
		Thread.sleep(1000);
		RepeatMonth.click();
		Thread.sleep(1000);
		RepeatMonth.sendKeys("1");
		Thread.sleep(1000);
	   Endtym.click();
	   Thread.sleep(1000);
	   RightArrow.click();
	   Thread.sleep(1000);
	   RightArrow.click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[4]/td[7]/span[1]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("For regular Consultation");
		Thread.sleep(1000);
		Continue.click();
		Thread.sleep(1000);
		AppSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(2000);
		
		
	////////Encounter	
		
		
		Billing.click();
		Thread.sleep(2000);
    	Clear.click();
		Thread.sleep(2000);
		ENCprvdrName.click();
		Thread.sleep(1000);
		ENCprvdrName.sendKeys("rohit");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma']")).click();
	//	checkin.click();
		//driver.findElement(By.xpath("//li[normalize-space()='"+ PROVIDER +"']")).click();
		Thread.sleep(2000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		EncounterSaveOK.click();
		Thread.sleep(2000);  
		
	
		///QueueMaster setup
		
		Menutoggle.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[3]/ul[1]/li[5]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		QueueMaster.click();
		Thread.sleep(1000);
		QueueType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Queuetype+"']")).click();
		Thread.sleep(1000);
		QueueName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+queueName+"']")).click();
		Thread.sleep(1000);
		ok.click();
		
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
	}
	
	public void EMR(String MRNo,String URL , String Queuetype ,String queueName,String ID , String Password, String Site,String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO) throws InterruptedException {
		
		
		
		
		
		
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(5000);
		 
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ID);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")));
		
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		login.click();
		Thread.sleep(3000);
		rightkeyDashboard.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNo + "')]")).click();
	//	patientSelect.click();
		Thread.sleep(5000);
		callcurrentToken.click();
		Thread.sleep(5000);
	
		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("CURRENT NO.OF WINDOWS"+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("go to window no."+ m);
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(m));
		Thread.sleep(8000);
		int k=n-1;
		driver.switchTo().window(tabs.get(k));
		Thread.sleep(2000);
//		driver.switchTo().window(tabs.get(1));
//		Thread.sleep(2000);
	}

}