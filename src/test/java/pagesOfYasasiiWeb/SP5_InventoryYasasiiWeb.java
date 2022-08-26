package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_InventoryYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public SP5_InventoryYasasiiWeb(WebDriver driver) {

		super(driver);

	}


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")	
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-inventory']")	
	public WebElement inventory;

	@FindBy(xpath = "//input[@id='sublocationid']")	
	public WebElement location;

	@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")	
	public WebElement ok;

	@FindBy(xpath = "//span[normalize-space()='Sublocation Creation']")	
	public WebElement sublocation;

	@FindBy(xpath = "//input[@id='name']")	
	public WebElement subLocName;

	@FindBy(xpath = "//input[@id='referencecode']")	
	public WebElement refcode;	

	@FindBy(xpath = "//input[@id='locationtypeid']")	
	public WebElement sublocType;

	@FindBy(xpath = "//input[@id='reqvaliditydays']")	
	public WebElement validDays;

	@FindBy(xpath = "//div[@class='displaing-item'][normalize-space()='Diabeta']")	
	public WebElement diabeta;


	@FindBy(xpath = "//input[@id='minqty']")	
	public WebElement minQty;

	@FindBy(xpath = "//input[@id='maxqty']")	
	public WebElement maxQty;

	@FindBy(xpath = "//input[@id='rol']")	
	public WebElement rol;

	@FindBy(xpath = "//button[@title='Add']")	
	public WebElement Add;

	@FindBy(xpath = "//button[@id='btnSublocation']")	
	public WebElement subLocSave;

	@FindBy(xpath = "//input[@id='itemname']")	
	public WebElement itemNAme;

	@FindBy(xpath = "//span[normalize-space()='Stock View']")	
	public WebElement stockView;

	@FindBy(xpath = "//input[@id='phsublocationid']")	
	public WebElement Stockloc;

	@FindBy(xpath = "//input[@id='categoryid']")	
	public WebElement Category;

	@FindBy(xpath = "//input[@id='itemtypeid']")	
	public WebElement ItemType;

	@FindBy(xpath = "//button[@id='btnsearch']")	
	public WebElement search;

	@FindBy(xpath = "//label[normalize-space()='Expired']")	
	public WebElement expired;

	@FindBy(xpath = "//label[normalize-space()='Expiring In']")	
	public WebElement expirein;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-stock-view[1]/div[1]/form[1]/div[2]/div[3]/div[1]/ki-input-control[1]/div[1]/input[1]")	
	public WebElement inDays;

	@FindBy(xpath = "//label[normalize-space()='All']")	
	public WebElement All;

	@FindBy(xpath = "//label[normalize-space()='Consolidated']")	
	public WebElement consolidated;

	@FindBy(xpath = "//label[normalize-space()='Detailed']")	
	public WebElement Detailed;

	@FindBy(xpath = "//button[normalize-space()='Print']")	
	public WebElement print;

	@FindBy(xpath = "//a[@title='To view the stock movemen of inventory']")	
	public WebElement StockMovement;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")	
	public WebElement indentGrp;


	@FindBy(xpath = "//input[@id='indgroupname']")	
	public WebElement indgrpNAme;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='phreqlocid']")	
	public WebElement reqloc;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='phisslocid']")	
	public WebElement issloc1;

	@FindBy(xpath = "//input[@id='qty']")	
	public WebElement Qty;

	@FindBy(xpath = "//input[@id='uomid']")	
	public WebElement UOM;

	@FindBy(xpath = "//input[@id='batchno']")	
	public WebElement Batchno;

	//	@FindBy(xpath = "//input[@id='batchno']")	
	//	public WebElement Batchno;
	//	




	public void InventoryHome() throws InterruptedException {

		Hamberger.click();
		Thread.sleep(1000);
		inventory.click(); 
		Thread.sleep(1000);
		location.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Main Pharmacy']")).click();
		Thread.sleep(1000);
		ok.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
		Thread.sleep(1000);

	}


	public void subLocation() throws InterruptedException {

		Hamberger.click();
		Thread.sleep(1000);
		sublocation.click();
		Thread.sleep(1000);
		subLocName.click();
		subLocName.sendKeys("BasePharm1");
		Thread.sleep(1000);
		refcode.click();
		Thread.sleep(1000);
		refcode.sendKeys("Ref002");
		Thread.sleep(1000);
		sublocType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Normal Location']")).click();
		Thread.sleep(1000);
		validDays.click();
		Thread.sleep(1000);
		validDays.sendKeys("120");
		Thread.sleep(1000);
		itemNAme.click();
		Thread.sleep(1000);
		itemNAme.sendKeys("diabeta");
		Thread.sleep(1000);
		itemNAme.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		diabeta.click();
		Thread.sleep(1000);
		minQty.sendKeys("250");
		Thread.sleep(1000);
		maxQty.sendKeys("1000");
		Thread.sleep(1000);
		rol.sendKeys("255");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		subLocSave.click();
		Thread.sleep(1000);

	}

	public void Stockview() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		stockView.click();
		Thread.sleep(1000);
		Stockloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='7th Level Pharmacy']")).click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Capsule/Tablets']")).click();
		Thread.sleep(1000);
		ItemType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(5000);
		expired.click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(5000);
		expirein.click();
		inDays.sendKeys("10");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(5000);
		All.click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(5000);
		itemNAme.click();
		Thread.sleep(1000);
		itemNAme.sendKeys("cal");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(5000);
		expired.click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(5000);
		expirein.click();
		inDays.sendKeys("10");
		search.click();
		Thread.sleep(5000);
		All.click();
		search.click();
		Thread.sleep(5000);
		consolidated.click();
		Thread.sleep(3000);
		Detailed.click();
		Thread.sleep(3000);
		print.click();
		Thread.sleep(3000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);

		Thread.sleep(3000);
	}

	public void StockMovement() throws InterruptedException {

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		StockMovement.click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(1000);
		Batchno.click();
		Thread.sleep(1000);
		Batchno.sendKeys("91001A");
		Thread.sleep(1000);
		search.click();
		Thread.sleep(3000);
		consolidated.click();
		Thread.sleep(2000);
		Detailed.click();
		Thread.sleep(2000);
	}

	public void indentGroup() throws InterruptedException {
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		indentGrp.click();
		Thread.sleep(1000);
		indgrpNAme.click();
		Thread.sleep(2000);
		indgrpNAme.sendKeys("IGN-2");
		Thread.sleep(1000);
		reqloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='7th Level Pharmacy']")).click();
		Thread.sleep(1000);
		issloc1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='BasePharm1']")).click();
		Thread.sleep(1000);
		ItemType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000);
		itemNAme.click();
		Thread.sleep(1000);
		itemNAme.sendKeys("Diabeta");
		Thread.sleep(1000);
		itemNAme.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='displaing-item'][normalize-space()='Diabeta']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("200");
		Thread.sleep(1000);
		UOM.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='No(s)']")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);

		ItemType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Medical Consumable']")).click();
		Thread.sleep(1000);
		itemNAme.click();
		Thread.sleep(1000);
		itemNAme.sendKeys("abdominal");
		Thread.sleep(1000);
		itemNAme.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='displaylistkey0']//div[@class='displaing-item'][contains(text(),'Abdominal Binder')]")).click();
		Thread.sleep(1000);
		Qty.click();	
		Thread.sleep(1000);
		Qty.sendKeys("50");
		Thread.sleep(1000);
		UOM.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='No(s)']")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);

		ItemType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Non Medical Consumable']")).click();
		Thread.sleep(1000);
		itemNAme.click();
		Thread.sleep(1000);
		itemNAme.sendKeys("body");
		Thread.sleep(1000);
		itemNAme.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='displaing-item']")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("20");
		Thread.sleep(1000);
		UOM.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='No(s)']")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);

		ItemType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(1000);
		itemNAme.click();
		Thread.sleep(1000);
		itemNAme.sendKeys("colgate");
		Thread.sleep(1000);
		itemNAme.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Colgate')]")).click();
		Thread.sleep(1000);
		Qty.click();
		Thread.sleep(1000);
		Qty.sendKeys("20");
		Thread.sleep(1000);
		UOM.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='No(s)']")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnIndentGroup']")).click();
		Thread.sleep(1000);


	}






}



