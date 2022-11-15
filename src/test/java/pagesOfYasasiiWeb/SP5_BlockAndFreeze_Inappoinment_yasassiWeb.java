package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_BlockAndFreeze_Inappoinment_yasassiWeb extends PageFactoryInitYasasiiWeb {

	public SP5_BlockAndFreeze_Inappoinment_yasassiWeb(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement menu;

	@FindBy(xpath="//span[normalize-space()='Appointment']")
	public WebElement Appointment;

	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement Searchresource;

	@FindBy(xpath = "//div[@title='Rohit Sharma(3)']")
	public WebElement Provider;

	@FindBy(xpath = "//label[@title='Block/Freeze Schedule']//i[@class='ki ki-cog']")
	public WebElement blockfreeze;

	@FindBy(xpath = "//input[@id='fromtime']")
	public WebElement FromTym;

	@FindBy(xpath = "//input[@id='totime']")
	public WebElement Totym;

	@FindBy(xpath = "//ki-calendar[@id='todate']//input[@type='text']")
	public WebElement ToDate;

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Reason;

	@FindBy(xpath = "//button[@id='blockschedulesaveid']")
	public WebElement blockSave;

	@FindBy(xpath = "//ki-calendar[@id='fromdate']//input[@type='text']")
	public WebElement FromDate;

	@FindBy(xpath = "//span[@id='refreshsearch']//i[@class='ki ki-refresh']")
	public WebElement BottomRefresh;

	@FindBy(xpath = "//input[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//button[@id='blockscheduleupdateid']")
	public WebElement BlockUpdate;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement Delete;

	@FindBy(xpath = "//label[normalize-space()='Freeze']")
	public WebElement Freeze;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//tr[@class='row-0-0 ng-star-inserted']//td[@title='VVIP']")
	public WebElement FreezedSlot;

	@FindBy(xpath = "//input[@id='blockorfreeze']")
	public WebElement blockandfreeze;












	public void App() throws InterruptedException, AWTException{
		Thread.sleep(2000);	
		menu.click();
		Thread.sleep(1000);
		Appointment.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-appointment-landing[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]")));

		Thread.sleep(2000);
		Searchresource.clear();
		Thread.sleep(500);
		Searchresource.sendKeys("Rohit sharma");
		Thread.sleep(2000);	

		act.moveToElement(Provider).build().perform();
		Thread.sleep(1000);
		blockfreeze.click();
		Thread.sleep(1000);
		FromTym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			FromTym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		FromTym.sendKeys("00 00");
		Thread.sleep(1000);

		Totym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			Totym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Totym.sendKeys("01 00");
		Thread.sleep(1000);
		
		FromDate.click();
		Thread.sleep(1000);
		
		
		Robot r=new Robot(); 
		
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);

		ToDate.click();
		Thread.sleep(1000);

		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='block']")).click();
		Thread.sleep(1000);
		blockSave.click();
		Thread.sleep(3000);

		BottomRefresh.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("personal reason");
		Thread.sleep(1000);
		BlockUpdate.click();
		Thread.sleep(1000);
		BottomRefresh.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);


		///////////////Freeze

		Thread.sleep(1000);
		Freeze.click();
		Thread.sleep(1000);
		FromTym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			Thread.sleep(1000);
			FromTym.sendKeys( Keys.BACK_SPACE);
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		FromTym.sendKeys("08 00");
		Thread.sleep(1000);

		Totym.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			Totym.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		Totym.sendKeys("09 00");

		FromDate.click();
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Thread.sleep(1000);
		
		
		ToDate.click();

		Thread.sleep(1000);
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		Reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='VVIP']")).click();
		Thread.sleep(1000);
		blockSave.click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(1000);

	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

		Thread.sleep(2000);
		Searchresource.clear();
		Thread.sleep(500);
		Searchresource.sendKeys("Rohit sharma");
		Thread.sleep(2000);	


		/////nextdaySlot
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-appointment-landing[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/div[1]")).click();
		Thread.sleep(1000);
		FreezedSlot.click();
		act.moveToElement(FreezedSlot).build().perform();
		Thread.sleep(1000);
		act.moveToElement(Provider).build().perform();
		Thread.sleep(1000);
		blockfreeze.click();
		Thread.sleep(1000);

		blockandfreeze.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Freeze']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/app-blockschedule[1]/div[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		Delete.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(2000);

		Close.click();
		Thread.sleep(1000);


}


}







