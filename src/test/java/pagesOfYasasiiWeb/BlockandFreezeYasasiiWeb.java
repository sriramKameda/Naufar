package pagesOfYasasiiWeb;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class BlockandFreezeYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public BlockandFreezeYasasiiWeb(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement menu;
	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement masters;
	@FindBy(xpath="//body/app-root/app-layout/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[6]/a[1]/span[1]")
	public WebElement resource;
	@FindBy(xpath="//span[normalize-space()='Block/Freeze Schedule']")
	public WebElement blockandfreeze;
	@FindBy(xpath="//input[@id='resourcecategoryid']")
	public WebElement category;
	@FindBy(xpath="//input[@id='resourcemastername']")
	public WebElement name;
	@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='siteid']")
	public WebElement site;
	@FindBy(xpath="//ki-calendar[@id='fromdate']//input[@type='text']")
	public WebElement fromDate;
	@FindBy(xpath="//ki-calendar[@id='todate']//input[@type='text']")
	public WebElement todate;
	@FindBy(xpath="//input[@id='fromtime']")
	public WebElement fromtime;
	@FindBy(xpath="//body/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-timer[1]/owl-date-time-timer-box[1]/button[1]/span[1]/*[1]")
	public WebElement time;
	@FindBy(xpath="//input[@id='totime']")
	public WebElement totime;
	@FindBy(xpath="//input[@id='reasonid']")
	public WebElement reason;
	@FindBy(xpath="//input[@id='remarks']")
	public WebElement remarks;
	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement save;
	@FindBy(xpath="//span[normalize-space()='Set']")
	public WebElement set;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-radio-list[1]/label[2]/span[1]")
	public WebElement Freeze;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/ki-time-picker[1]/div[1]/input[1]")
	public WebElement time1;
	@FindBy(xpath="//body/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/ki-dialog-confirm[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/button[1]")
	public WebElement yes;
	@FindBy(xpath="//button[normalize-space()='Ok']")
	public WebElement ok;

	@FindBy(xpath="//label[normalize-space()='Freeze']")
	public WebElement freeeze;

	@FindBy(xpath="//input[@id='holidaycategory']")
	public WebElement SelectCategory;

	@FindBy(xpath="//input[@id='blockorfreeze']")
	public WebElement blockORfreeze;

	@FindBy(xpath="//input[@id='holidayresource']")
	public WebElement SelectResource;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement element;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]/span[1]/i[1]")
	public WebElement Edit;

	@FindBy(xpath="//i[@class='ki ki-trash']")
	public WebElement delete;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;


	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement Search;

	@FindBy(xpath="//i[@class='ki ki-calendar-fill']")
	public WebElement Appointment;

	@FindBy(xpath="//input[@placeholder='Search Resource..']")
	public WebElement DoctorSearch;

	@FindBy(xpath="//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement AppReason;

	@FindBy(xpath="//button[@id='appointmentsaveid']")
	public WebElement AppSave;

	@FindBy(xpath="//button[@id='blockscheduleupdateid']")
	public WebElement blockUpdate;

	@FindBy(xpath="//button[@aria-label='Ok'][normalize-space()='OK']//i[@class='ki ki-check']")
	public WebElement RescheduleOK;


	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement Maincategory;

	@FindBy(xpath="//input[@id='subcategory']")
	public WebElement Subcategory;

	@FindBy(xpath="//ki-select-control[@placeholder='Reschedule Reason']//input[@id='undefined']")
	public WebElement REshedulereason;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[2]/div[1]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")
	public WebElement reschedulecalender;

	@FindBy(xpath="//div[@class='searchbar-list date-range list-open']//div[2]//div[1]//div[5]//i[1]")
	public WebElement DeleteApp;

	@FindBy(xpath="//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement DeleteReason;


	@FindBy(xpath="//button[normalize-space()='Cancel Appointment']")
	public WebElement cancelApp;


	@FindBy(xpath="//ki-select-control[@placeholder='Reason/Reporting Status']//input[@id='undefined']")
	public WebElement ReasonREporting;

	public void BlockandFreeze(String User , String Password , String cite , String MRNO) throws InterruptedException, AWTException {




		//////////////////Blocking

		Thread.sleep(1000);
		menu.click();
		Thread.sleep(1000);
		masters.click();
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView();", resource);
		Thread.sleep(1000);  
		resource.click();
		Thread.sleep(1000);
		blockandfreeze.click();
		Thread.sleep(1000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		name.click();
		Thread.sleep(1000);
		name.sendKeys("Rohit Sharma(3)");
		driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma(3)']")).click();
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Kameda Medical Center']")).click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		fromDate.click();
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		todate.click();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		Thread.sleep(1000);

		fromtime.click();
		for (int i = 0; i <=5; i++) {
			fromtime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Thread.sleep(1000);
		fromtime.sendKeys(Keys.HOME + "08 00");
		Thread.sleep(1000);
		totime.click();
		for (int i = 0; i <=5; i++) {
			totime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		totime.sendKeys(Keys.HOME + "08 30");
		reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Leave']")).click();
		Thread.sleep(1000);
		remarks.click();
		Thread.sleep(1000);
		remarks.sendKeys("Absent");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000); 

		//// refreshing the tab
		driver.navigate().refresh();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Thread.sleep(1000);



		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Block']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma(3)']")).click();
		Thread.sleep(1000);
		//	act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		//delete.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(5000);
		driver.get("https://kamedahomecare.in:78/login");
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
		driver.findElement(By.xpath("//li[normalize-space()='"+cite+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));
		Thread.sleep(1000);
		Search.clear();
		Thread.sleep(1000);
		Search.sendKeys(MRNO);
		Thread.sleep(1000);
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Appointment.click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(1000);
		DoctorSearch.clear();
		Thread.sleep(1000);
		DoctorSearch.sendKeys("Rohit Sharma");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		AppReason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		AppSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);



		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("previous Window."+ m);
		Thread.sleep(2000);
		int p  =m+1 ;
		System.out.println("next window."+ p);

		driver.switchTo().window(tabs.get(m));


		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Block']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma(3)']")).click();
		Thread.sleep(1000);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		totime.click();
		for (int i = 0; i <=5; i++) {
			totime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		totime.sendKeys(Keys.HOME + "08 45");
		//delete.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		blockUpdate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		RescheduleOK.click();
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(p));
		Thread.sleep(2000);

		//// refreshing the tab
		driver.navigate().refresh();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='maincategory']")));

		Maincategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment']")).click();
		Thread.sleep(1000);
		Subcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Reschedule']")).click();
		Thread.sleep(1000);
		reschedulecalender.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		set.click();
		Thread.sleep(1000);
		Search.clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Rohit Sharma(3)']")));
		Thread.sleep(1000);
		DoctorSearch.clear();
		Thread.sleep(1000);
		DoctorSearch.sendKeys("Rohit Sharma");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);
		REshedulereason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor on Leave']")).click();
		Thread.sleep(1000);
		ReasonREporting.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);

		AppSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		//// refreshing the tab
		driver.navigate().refresh();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Thread.sleep(1000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='maincategory']")));

		///////cancel the appointment
		Maincategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment']")).click();
		Thread.sleep(1000);
		Subcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='All(Pending)']")).click();
		Thread.sleep(1000);
		reschedulecalender.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		set.click();
		Thread.sleep(1000);
		Search.clear();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		DeleteApp.click();
		Thread.sleep(1000);
		DeleteReason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='docter on leave']")).click();
		Thread.sleep(1000);
		cancelApp.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);

		driver.switchTo().window(tabs.get(m));

		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Block']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma(3)']")).click();
		Thread.sleep(1000);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);



	}

	public void freeze() throws InterruptedException, AWTException {

		//////////////////Freezing

//		Thread.sleep(1000);
//		menu.click();
//		Thread.sleep(1000);
//		masters.click();
//		Thread.sleep(1000);
//		JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		js1.executeScript("arguments[0].scrollIntoView();", resource);
//		Thread.sleep(1000);  
//		resource.click();
//		Thread.sleep(1000);
//
//		blockandfreeze.click();


		Thread.sleep(1000);
		freeeze.click();
		Thread.sleep(1000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		name.click();
		Thread.sleep(1000);
		name.sendKeys("Rohit Sharma(3)");
		driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma(3)']")).click();
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Kameda Medical Center']")).click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-blockschedule[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ki-calendar[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		fromDate.click();
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		todate.click();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		//Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		Thread.sleep(1000);

		fromtime.click();
		for (int i = 0; i <=5; i++) {
			fromtime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Thread.sleep(1000);
		fromtime.sendKeys(Keys.HOME + "08 00");
		Thread.sleep(1000);
		totime.click();
		for (int i = 0; i <=5; i++) {
			totime.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		totime.sendKeys(Keys.HOME + "08 30");
		reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1000);
		remarks.click();
		Thread.sleep(1000);
		remarks.sendKeys("Absent");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(3000); 

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("previous Window."+ m);
		Thread.sleep(2000);
		int p  =m+1 ;
		System.out.println("next window."+ p);

		driver.switchTo().window(tabs.get(p));

		Appointment.click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));
		Thread.sleep(1000);
		DoctorSearch.clear();
		Thread.sleep(1000);
		DoctorSearch.sendKeys("Rohit Sharma");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[3]/div[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);


		driver.switchTo().window(tabs.get(m));
		Thread.sleep(1000);



		SelectCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		Thread.sleep(1000);
		blockORfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Freeze']")).click();
		Thread.sleep(1000);
		SelectResource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma(3)']")).click();
		Thread.sleep(1000);
		act.moveToElement(element).click().build().perform();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);

	}
}