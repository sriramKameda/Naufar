package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_MISReport_AdmissionDischarge_Yasassiweb  extends PageFactoryInitYasasiiWeb{

	public SP5_MISReport_AdmissionDischarge_Yasassiweb(WebDriver driver) {
		super(driver);
	} 

	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	WebElement hamberger;

	@FindBy(xpath="//label[normalize-space()='Modules']")
	WebElement Modules;

	@FindBy(xpath="//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-file']")
	WebElement MisReport;


	@FindBy(xpath="//span[normalize-space()='Reports']")
	WebElement  Reports;

	@FindBy(xpath="//span[normalize-space()='FO']")
	WebElement  Fo;

	@FindBy(xpath="//span[normalize-space()='Admission Report']")
	WebElement  AdmsnReport;

	@FindBy(xpath="//div[4]//div[1]//ki-calendar[1]//div[1]//input[1]")
	WebElement  Admsncalendar;

	@FindBy(xpath="//button[@id='misreportfetch']")
	WebElement Search;

	@FindBy(xpath="//div[@title='Full Screen']")
	WebElement FullScreen;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/div[1]/app-devexp-pdf-viewer[1]/div[1]/dx-report-viewer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]")
	WebElement zoom;

	@FindBy(xpath="//div[@class='dxrd-image-padding dxrd-image-search']//*[name()='svg']")
	WebElement patSearch;

	@FindBy(xpath="//input[@title='Search']")
	WebElement searchBox;

	@FindBy(xpath="//input[@id='undefined']")
	WebElement nationality;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	WebElement resource;

	@FindBy(xpath="//div[@title='Toggle Multipage Mode']")
	WebElement multiplePage;

	@FindBy(xpath="//div[6]//div[1]//ki-calendar[1]//div[1]//input[1]")
	WebElement DisFrom;

	@FindBy(xpath="//div[7]//div[1]//ki-calendar[1]//div[1]//input[1]")
	WebElement DisTo;

	@FindBy(xpath="//div[@title='Zoom In']")
	WebElement zoomin;

	@FindBy(xpath="//div[@title='Zoom Out']")
	WebElement zoomout;

	@FindBy(xpath="//div[@title='Print']")
	WebElement print;

	@FindBy(xpath="//div[@title='Print Page']")
	WebElement printPage;

	@FindBy(xpath="//span[normalize-space()='Discharge Report']")
	WebElement dichargeReport;

	@FindBy(xpath="//a[@class='nav-link relative']//i[@class='ki ki-close']")
	WebElement Admsnclose;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/ki-calendar[1]/div[1]/input[1]")
	WebElement Discfrom;

	@FindBy(xpath="//input[@id='undefined']")
	WebElement bedno;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	WebElement Resource;

	


	public void AdmisssionReport() throws InterruptedException, AWTException {

		Thread.sleep(2000);
		hamberger.click();
		Thread.sleep(1000);
		//Modules.click();
		Thread.sleep(1000);
		MisReport.click();
		Thread.sleep(1000);
		Reports.click();
		Thread.sleep(1000);
		Fo.click();
		Thread.sleep(1000);



		AdmsnReport.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/div[1]/ki-calendar[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[6]/div[1]/ki-calendar[1]/div[1]/span[1]/i[1]")).click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Admission Report']")));
		Admsncalendar.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='1']")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		zoom.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'100%')]")).click();
		Thread.sleep(1000);
		FullScreen.click();
		Thread.sleep(3000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		patSearch.click();
		Thread.sleep(1000);
		searchBox.click();
		Thread.sleep(1000);
		searchBox.sendKeys("Emergency NS", Keys.ENTER);
		Thread.sleep(1000);
		Collection<WebElement> dynamic = driver.findElements(By.xpath("//div[@class='dxrd-preview-search-tab-item-text propertygrid-editor-displayName dxd-text-primary']"));
		Thread.sleep(1000);
		Thread.sleep(1000);
		int j = dynamic.size();
		System.out.println(j);
		Thread.sleep(1000);
		FullScreen.click();
		Thread.sleep(1000);
		for (int i = 1; i <=j; i++) {
			driver.findElement(By.xpath("(//div[@class='dxrd-preview-search-tab-item-text propertygrid-editor-displayName dxd-text-primary'])["+i+"]")).click();
			Thread.sleep(4000);
		}

		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);	
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		nationality.click();
		Thread.sleep(1000);
		nationality.sendKeys("saudi");
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		print.click();
		Thread.sleep(1000);
		for (int i = 0; i <= 1; i++) {

			t.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(800);	
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(1000);
		}
		FullScreen.click();
		Thread.sleep(3000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);	
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")));
		resource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Rohit Sharma(3)']")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		multiplePage.click();
		Thread.sleep(1000);
		FullScreen.click();
		Thread.sleep(2000);
		JavascriptExecutor j1 = (JavascriptExecutor) driver;
		j1.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);	
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		printPage.click();
		for (int i = 0; i <= 5; i++) {

			t.keyPress(KeyEvent.VK_ESCAPE);
			Thread.sleep(800);	
			t.keyRelease(KeyEvent.VK_ESCAPE);
			Thread.sleep(1000);
		}
		DisFrom.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[1]/td[5]/span[1]")).click();
		Thread.sleep(1000);
		DisTo.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-calendar[1]/div[2]/owl-date-time-month-view[1]/table[1]/tbody[1]/tr[3]/td[6]/span[1]")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		zoomin.click();
		Thread.sleep(1000);
		zoomout.click();
		Thread.sleep(1000);
		FullScreen.click();
		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);	
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);

	}

	public void dischargeReport() throws InterruptedException, AWTException {

//		Thread.sleep(2000);
//		hamberger.click();
//		Thread.sleep(1000);
//		//Modules.click();
//		Thread.sleep(1000);
//		MisReport.click();
//		Thread.sleep(1000);
//		Reports.click();
//		Thread.sleep(1000);
//		Fo.click();
//		Thread.sleep(1000);
		
		
		
		dichargeReport.click();
		Admsnclose.click();
		Search.click();
		FullScreen.click();
		Thread.sleep(2000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);	
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		Discfrom.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']//span[@class='owl-dt-control-content owl-dt-control-button-content']//*[name()='svg']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='1']")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		zoom.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'100%')]")).click();
		Thread.sleep(1000);
		FullScreen.click();
		Thread.sleep(3000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		bedno.click();
		Thread.sleep(1000);
		bedno.sendKeys("ans-54");
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		FullScreen.click();
		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);	
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		Resource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Rohit Sharma(3)']")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		FullScreen.click();
		Thread.sleep(2000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(800);	
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		
		
		
	}







}
