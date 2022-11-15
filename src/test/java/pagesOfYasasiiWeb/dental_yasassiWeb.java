package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class dental_yasassiWeb  extends PageFactoryInitYasasiiWeb{
	public dental_yasassiWeb(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Master;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")
	public WebElement  Service;

	@FindBy(xpath="(//span[normalize-space()='Service Master'])[1]")
	public WebElement  ServiceMaster;

	@FindBy(xpath="//input[@id='rootinvcatgeoryser']")
	public WebElement  categoryMaster;

	@FindBy(xpath="//input[@id='servicecategoryser']")
	public WebElement  Subcategory;

	@FindBy(xpath="//input[@id='name']")
	public WebElement  serviceName;
	
	
	
	
	
	@FindBy(xpath="//span[@class='btn btn-link ng-star-inserted'][normalize-space()='Site Mapping']")
	public WebElement SiteMap;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ServiceCheck;

	@FindBy(xpath="//i[@class='ki ki-chevron-double-right']")
	public WebElement MoveRight;

	@FindBy(xpath="//i[@class='fa fa-exclamation-triangle red']")
	public WebElement Triangle;

	@FindBy(xpath="//input[@id='internallabid']")
	public WebElement internalLab;

	@FindBy(xpath="//input[@id='executioncategoryid']")
	public WebElement Executioncategory;
	
	@FindBy(xpath="//label[normalize-space()='Modules']")
	public WebElement modules;
	
	@FindBy(xpath="//input[@id='codetype']")
	public WebElement codetype;
	
	@FindBy(xpath="//input[@id='tempcode']")
	public WebElement code;
	
	@FindBy(xpath="//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")
	public WebElement Add;
	
	@FindBy(xpath="//textarea[@id='description']")
	public WebElement Description;
	
	
	
	
	
	
	
	
	
	
	public void master(String CPTCode,String ServiceName , String BaseCategory , String SubCategory,String ServiceDescription) throws InterruptedException{
		
		Thread.sleep(1500);
		Hamberger.click();
		Thread.sleep(400);
		Master.click();
		Thread.sleep(400);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service );
		Thread.sleep(400);
		Service.click();
		Thread.sleep(400);
		ServiceMaster.click();
		Thread.sleep(400);
		categoryMaster.click();
		Thread.sleep(400);
		categoryMaster.sendKeys(BaseCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+BaseCategory+"']")).click();
	//	driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
		Thread.sleep(400);
		//li[normalize-space()='Laboratory']
		Subcategory.click();
		Thread.sleep(400);
		Subcategory.sendKeys(SubCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+SubCategory+"')]")).click();
		Thread.sleep(400);
		serviceName.click();
		Thread.sleep(400);
		serviceName.sendKeys(ServiceName);
		Thread.sleep(400);
		codetype.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='CPT Code']")).click();
		Thread.sleep(400);
		code.clear();
		Thread.sleep(400);
		code.sendKeys(CPTCode);
		Thread.sleep(400);
		Add.click();
		Thread.sleep(400);
		Description.click();
		Thread.sleep(400);
		Description.clear();
		Thread.sleep(400);
		Description.sendKeys(ServiceDescription);
		Thread.sleep(400);
		
		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		SiteMap.click();
		Thread.sleep(400);
		ServiceCheck.click();
		Thread.sleep(400);
		MoveRight.click();
		Thread.sleep(400);
		Triangle.click();
		Thread.sleep(400);
		//internalLab.click();
		Thread.sleep(400);
		//driver.findElement(By.xpath("//li[normalize-space()='"+InternalLab+"']")).click();
	//	Thread.sleep(400);
		Executioncategory.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@id='servicemastersave']")).click();
		Thread.sleep(1500);
		
		Hamberger.click();
		Thread.sleep(1000);
		modules.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
		
		
		
	}
 

}
