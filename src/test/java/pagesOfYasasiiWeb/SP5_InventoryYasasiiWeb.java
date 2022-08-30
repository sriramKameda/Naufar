package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

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

	@FindBy(xpath = "//input[@placeholder='Indent Group Name']")	
	public WebElement searchIGN;

	@FindBy(xpath = "//i[@class='ki ki-search']")	
	public WebElement Search;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-indent-group[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")	
	public WebElement IGNitem;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")	
	public WebElement Edit;

	@FindBy(xpath = "//input[@title='Update']")	
	public WebElement UPDATE;

	@FindBy(xpath = "//label[@title='Delete']//i[@class='ki ki-trash']")	
	public WebElement Delete;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")	
	public WebElement yes;

	@FindBy(xpath = "//span[normalize-space()='Inventory Indent']")	
	public WebElement INVindent;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")	
	public WebElement IndGrp;

	@FindBy(xpath = "//input[@id='indqty']")	
	public WebElement indqty;

	@FindBy(xpath = "//button[@id='savePharmacyIndent']")	
	public WebElement Saveindent;

	@FindBy(xpath = "//input[@id='statusid']")	
	public WebElement Status;

	@FindBy(xpath = "//i[@title='Search with item name']")	
	public WebElement SearchItem;

	@FindBy(xpath = "//label[normalize-space()='Submit']//span[@class='checkmark']")	
	public WebElement submit;

	@FindBy(xpath = "//span[@class='checkmark ng-star-inserted']")	
	public WebElement verifyCheck;

	@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/label[2]/a[1]/i[1]")	
	public WebElement verifyCommentIcon;

	@FindBy(xpath = "//button[@class='btn btn-dark-green active pull-right design mr-1 mb-1 mt-1 ng-star-inserted']")	
	public WebElement CommentOk;

	@FindBy(xpath = "//span[@class='checkmark ng-star-inserted']")	
	public WebElement ApproveCheck;

	@FindBy(xpath = "//tbody/tr[1]/td[7]/div[1]/label[3]/a[1]/i[1]")	
	public WebElement ApproveCommentIcon;

	@FindBy(xpath = "//textarea[@id='txtverifycomments']")	
	public WebElement verifyComment;

	@FindBy(xpath = "//textarea[@id='txtapprovecomments']")	
	public WebElement ApproveComment;

	@FindBy(xpath = "//input[@id='ddindentstatus']")	
	public WebElement indentStatus;

	@FindBy(xpath = "//input[@id='closecomments']")	
	public WebElement StatusComment;
	
	@FindBy(xpath = "//button[@id='btnpostApproved']")	
	public WebElement SaveCompleted;
	
	@FindBy(xpath = "//a[@title='To create the indent request for patient']//span[contains(text(),'Patient Indent')]")	
	public WebElement PAtientindent;
	
	@FindBy(xpath = "//input[@id='mrno']")	
	public WebElement mrno;
	
	@FindBy(xpath = "//i[@title='Search']")	
	public WebElement patSearch;
	
	@FindBy(xpath = "//i[@title='Advanced Search']")	
	public WebElement AdvSearch;
	
	@FindBy(xpath = "//input[@id='maincategory']")	
	public WebElement mainCat;
	
	@FindBy(xpath = "//input[@id='searchtext']")	
	public WebElement Searchmrno;
	
	@FindBy(xpath = "//input[@id='indenttypeid']")	
	public WebElement indentType;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-patient-indent[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")	
	public WebElement GeneralComment;
	
	@FindBy(xpath = "//i[@title='Verifier Comments']")	
	public WebElement patVerifycmnt;
	
	@FindBy(xpath = "//i[@title='Approver Comments']")	
	public WebElement patApprovecmnt;
	
	
	@FindBy(xpath = "//button[@id='savePatientIndent']")	
	public WebElement patIndentSave;
	
	@FindBy(xpath = "//i[@title='Search with MRNO/ Name']")	
	public WebElement patindSearch;
	
	@FindBy(xpath = "//a[@title='To close the unfinished indentd which are no longer needed in active state']")	
	public WebElement closeIndent;
	
	@FindBy(xpath = "//input[@id='indentcategoryid']")	
	public WebElement indentCat;
	
	@FindBy(xpath = "//span[contains(text(),'Supplier')]")	
	public WebElement supplier;
	
	@FindBy(xpath = "//input[@id='suppliername']")	
	public WebElement supplierName;
	
	@FindBy(xpath = "//input[@id='referencecode']")	
	public WebElement refCode;
	
	@FindBy(xpath = "//input[@id='businessaddress1']")	
	public WebElement Address;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-supplier[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[1]/ki-auto-complete-pagination[1]/div[1]/input[1]")	
	public WebElement country;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-supplier[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[2]/ki-auto-complete-pagination[1]/div[1]/input[1]")	
	public WebElement State;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-supplier[1]/div[2]/form[1]/div[2]/div[1]/div[2]/div[3]/ki-auto-complete-pagination[1]/div[1]/input[1]")	
	public WebElement city;
	
	@FindBy(xpath = "//input[@id='businesszip']")	
	public WebElement pincode;
	
	@FindBy(xpath = "//input[@id='phoneno']")	
	public WebElement mblNo;
	
	@FindBy(xpath = "//input[@id='contactpersonsname']")	
	public WebElement contPerson;
	
	@FindBy(xpath = "//input[@placeholder='Supplier Name']")	
	public WebElement supplierSearch;
	
	@FindBy(xpath = "//input[@id='emailaddress']")	
	public WebElement email;
	
	
	
	
	
	
	
	
	
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


	public void subLocation(String Subloc,String refCode ) throws InterruptedException {

		Hamberger.click();
		Thread.sleep(1000);
		sublocation.click();
		Thread.sleep(1000);
		subLocName.click();
		subLocName.sendKeys(Subloc);//input[@id='name']
		Thread.sleep(1000);
		refcode.click();
		Thread.sleep(1000);
		refcode.sendKeys(refCode);
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

	public void StockMovement(String BAtchno) throws InterruptedException {

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		StockMovement.click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(1000);
		Batchno.click();
		Thread.sleep(1000);
		Batchno.sendKeys(BAtchno);
		Thread.sleep(1000);
		search.click();
		Thread.sleep(3000);
		consolidated.click();
		Thread.sleep(2000);
		Detailed.click();
		Thread.sleep(2000);
	}

	public void indentGroup(String IndGrpName) throws InterruptedException {
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		indentGrp.click();
		Thread.sleep(1000);
		indgrpNAme.click();
		Thread.sleep(2000);
		indgrpNAme.sendKeys(IndGrpName);
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

		///edit
		searchIGN.sendKeys(IndGrpName);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		IGNitem.click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[6]/label[2]/a[1]/i[1]")).click();
		Thread.sleep(1000);
		UPDATE.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='btnIndentGroup']")).click();
		Thread.sleep(1000);

		//Delete
//		IGNitem.click();
//		Thread.sleep(1000);
//		Delete.click();
//		Thread.sleep(1000);
//		Thread.sleep(1000);
//		String name=yes.getText();
//		yes.click();
//		System.out.println(name); 
	}


	public void InventoryIndednt(String IndGrpName) throws InterruptedException {

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		INVindent.click();
		Thread.sleep(1000);
		reqloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='7th Level Pharmacy']")).click();
		Thread.sleep(1000);
		issloc1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='BasePharm1']")).click();
		Thread.sleep(1000);
		IndGrp.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(IndGrpName);
		Thread.sleep(1000);
         driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[2]")).click();
		Thread.sleep(1000);
		ItemType.click();
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000);
		itemNAme.sendKeys("Dolo");
		Thread.sleep(1000);
		itemNAme.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Dolo 500Mg Tab')]")).click();
		Thread.sleep(1000);
		indqty.click();
		Thread.sleep(1000);
		indqty.sendKeys("20");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Saveindent.click();
		Thread.sleep(1000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Created']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[3]/div[1]/div[3]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		Thread.sleep(1000);
		int a =	dynamicElement.size();
		System.out.println("size="+a);
		String indNo =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[2]/div[1]/div[1]/div["+a+"]/div[1]/div[1]/div[2]/div[1]/div[1]")).getText();
		System.out.println(indNo);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		Saveindent.click();
		Thread.sleep(2000);
		
		
		Status.click();
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		int b =	dynamicElement1.size();
		System.out.println("size="+b);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
		Thread.sleep(1000);
		verifyCheck.click();
		Thread.sleep(1000);
		verifyCommentIcon.click();
		Thread.sleep(1000);
		verifyComment.sendKeys("Verified");
		Thread.sleep(1000);
		CommentOk.click();
		Thread.sleep(1000);
		Saveindent.click();
		Thread.sleep(2000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		int c =	dynamicElement2.size();
		System.out.println("size="+c);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
		Thread.sleep(1000);
		ApproveCheck.click();
		Thread.sleep(1000);
		ApproveCommentIcon.click();
		Thread.sleep(1000);
		ApproveComment.sendKeys("ApproveOk");
		Thread.sleep(1000);
		CommentOk.click();
		Thread.sleep(1000);
	    Saveindent.click();
	    Thread.sleep(2000);
	    
	    
	    Status.click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement3=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		int d =	dynamicElement3.size();
		System.out.println("size="+d);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
		Thread.sleep(1000);
		indentStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
		Thread.sleep(1000);
		StatusComment.sendKeys("ok completed");
		Thread.sleep(1000);
		SaveCompleted.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(2000);

		Status.click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement5=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		int e =	dynamicElement5.size();
		System.out.println("size="+e);
		Thread.sleep(1000);
	    String ACTindno =	driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).getText();
	    System.out.println(ACTindno);
	    Thread.sleep(1000);
	    Assert.assertEquals(indNo, ACTindno);
		
	}
		public void indentClosed(String IndGrpName) throws InterruptedException, IOException {
			
		
/////////////////////////////
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		INVindent.click();
		Thread.sleep(1000);
		reqloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='7th Level Pharmacy']")).click();
		Thread.sleep(1000);
		issloc1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='BasePharm1']")).click();
		Thread.sleep(1000);
		IndGrp.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Search...']")).sendKeys(IndGrpName);
		Thread.sleep(1000);
         driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[2]")).click();
		Thread.sleep(1000);
		ItemType.click();
		driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
		Thread.sleep(1000);
		itemNAme.sendKeys("Dolo");
		Thread.sleep(1000);
		itemNAme.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Dolo 500Mg Tab')]")).click();
		Thread.sleep(1000);
		indqty.click();
		Thread.sleep(1000);
		indqty.sendKeys("20");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Saveindent.click();
		Thread.sleep(2000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Created']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[3]/div[1]/div[3]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		Thread.sleep(1000);
		int a =	dynamicElement.size();
		System.out.println("size="+a);
		Thread.sleep(1000);
		String indNo =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-pharmacy-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[2]/div[1]/div[1]/div["+a+"]/div[1]/div[1]/div[2]/div[1]/div[1]")).getText();
		System.out.println(indNo);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(1000);
		Saveindent.click();
		Thread.sleep(2000);
		
		
		Status.click();
		driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		int b =	dynamicElement1.size();
		System.out.println("size="+b);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
		Thread.sleep(1000);
		verifyCheck.click();
		Thread.sleep(1000);
		verifyCommentIcon.click();
		Thread.sleep(1000);
		verifyComment.sendKeys("Verified");
		Thread.sleep(1000);
		CommentOk.click();
		Thread.sleep(1000);
		Saveindent.click();
		Thread.sleep(2000);

		Status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		int c =	dynamicElement2.size();
		System.out.println("size="+c);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
		Thread.sleep(1000);
		ApproveCheck.click();
		Thread.sleep(1000);
		ApproveCommentIcon.click();
		Thread.sleep(1000);
		ApproveComment.sendKeys("ApproveOk");
		Thread.sleep(1000);
		CommentOk.click();
		Thread.sleep(1000);
	    Saveindent.click();
	    Thread.sleep(2000);
	    
	    
	    Status.click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement3=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		int d =	dynamicElement3.size();
		System.out.println("size="+d);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
		Thread.sleep(1000);
		indentStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Closed']")).click();
		Thread.sleep(1000);
		StatusComment.sendKeys("Cancelled");
		Thread.sleep(1000);
		SaveCompleted.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(2000);
		
		Status.click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Closed']")).click();
		Thread.sleep(1000);
		SearchItem.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement5=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
		int e =	dynamicElement5.size();
		System.out.println("size="+e);
		Thread.sleep(1000);
	    String ACTindno =driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).getText();
	    System.out.println(ACTindno);
	    Thread.sleep(2000);
	    
	    
	    File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
	    FileInputStream fis=new FileInputStream(src);
	    HSSFWorkbook wb=new HSSFWorkbook(fis);
	    HSSFSheet FOFullRegTest=wb.getSheetAt(77);	
	    int i=FOFullRegTest.getLastRowNum();
	    System.out.println("Number of rows: " + i);		
	    FOFullRegTest.getRow(i).createCell(7).setCellValue(ACTindno);	
	    FileOutputStream fout=new FileOutputStream(src);	
	    wb.write(fout);
	    Assert.assertEquals(indNo, ACTindno);

	}

public void patientIndent(String MRNo , String MRNo1) throws InterruptedException {
	
	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
	PAtientindent.click();
	Thread.sleep(1000);
	issloc1.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='BasePharm1']")).click();
	Thread.sleep(1000);
	mrno.click();
	Thread.sleep(1000);
	mrno.sendKeys(MRNo);
	Thread.sleep(1000);
	patSearch.click();
	Thread.sleep(1000);
	AdvSearch.click();
	Thread.sleep(1000);
	mainCat.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
	Thread.sleep(1000);
	Searchmrno.sendKeys(MRNo1);
	Thread.sleep(1000);
	//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
	Thread.sleep(1000);
	indentType.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Discharge Medicine']")).click();
	Thread.sleep(1000);
	GeneralComment.click();
	Thread.sleep(1000);

	
	Thread.sleep(1000);
	ItemType.click();
	driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
	Thread.sleep(1000);
	itemNAme.sendKeys("Dolo");
	Thread.sleep(1000);
	itemNAme.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[contains(text(),'Dolo 500Mg Tab')]")).click();
	Thread.sleep(1000);
	indqty.click();
	Thread.sleep(1000);
	indqty.sendKeys("20");
	Thread.sleep(1000);
	Add.click();
	Thread.sleep(1000);
	patIndentSave.click();
	Thread.sleep(1000);

	Status.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Created']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-patient-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[3]/div[1]/div[3]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
	Thread.sleep(1000);
	patindSearch.click();
	Thread.sleep(1000);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
	Thread.sleep(1000);
	int a =	dynamicElement.size();
	System.out.println("size="+a);
	String indNo =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-patient-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[2]/div[1]/div[1]/div["+a+"]/div[1]/div[1]/div[2]/div[1]/div[1]")).getText();
	System.out.println(indNo);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
	Thread.sleep(1000);
	submit.click();
	Thread.sleep(1000);
	patIndentSave.click();
	Thread.sleep(2000);

	
	Status.click();
	driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
	Thread.sleep(1000);
	patindSearch.click();
	Thread.sleep(1000);
	List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
	int b =	dynamicElement1.size();
	System.out.println("size="+b);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
	Thread.sleep(1000);
	verifyCheck.click();
	Thread.sleep(1000);
	patVerifycmnt.click();
	Thread.sleep(1000);
	verifyComment.sendKeys("Verified");
	Thread.sleep(1000);
	CommentOk.click();
	Thread.sleep(1000);
	patIndentSave.click();
	Thread.sleep(2000);

	Status.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
	Thread.sleep(1000);
	patindSearch.click();
	Thread.sleep(1000);
	List<WebElement> dynamicElement2=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
	int c =	dynamicElement2.size();
	System.out.println("size="+c);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
	Thread.sleep(1000);
	ApproveCheck.click();
	Thread.sleep(1000);
	patApprovecmnt.click();
	Thread.sleep(1000);
	ApproveComment.sendKeys("ApproveOk");
	Thread.sleep(1000);
	CommentOk.click();
	Thread.sleep(1000);
	patIndentSave.click();
    Thread.sleep(2000);
    
    
    Status.click();
    Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
	Thread.sleep(1000);
	patindSearch.click();
	Thread.sleep(1000);
	List<WebElement> dynamicElement3=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
	int d =	dynamicElement3.size();
	System.out.println("size="+d);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
	Thread.sleep(1000);
	indentStatus.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
	Thread.sleep(1000);
	StatusComment.sendKeys("closed");
	Thread.sleep(1000);
	SaveCompleted.click();//button[@id='btnpostApproved']
	Thread.sleep(1000);
	yes.click();
	Thread.sleep(2000);

	Status.click();
    Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Completed']")).click();
	Thread.sleep(1000);
	patindSearch.click();
	Thread.sleep(1000);
	List<WebElement> dynamicElement5=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
	int e =	dynamicElement5.size();
	System.out.println("size="+e);
	Thread.sleep(1000);
    String ACTindno =driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).getText();
    System.out.println(ACTindno);
    Thread.sleep(1000);
    Assert.assertEquals(indNo, ACTindno);
	
	
}
		
		
public void patientIndentClosed(String MRNo , String MRNo1) throws InterruptedException, IOException {
	
	
/////////////////////////////

	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
	PAtientindent.click();
	Thread.sleep(1000);
	Thread.sleep(1000);
	issloc1.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='BasePharm1']")).click();
	Thread.sleep(1000);
	mrno.click();
	Thread.sleep(1000);
	mrno.sendKeys(MRNo);
	Thread.sleep(1000);
	patSearch.click();
	Thread.sleep(1000);
	AdvSearch.click();
	Thread.sleep(1000);
	mainCat.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
	Thread.sleep(1000);
	Searchmrno.sendKeys(MRNo1);
	Thread.sleep(1000);
	//driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
	Thread.sleep(1000);
	indentType.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Discharge Medicine']")).click();
	Thread.sleep(1000);
	GeneralComment.click();
	Thread.sleep(1000);
Thread.sleep(1000);
ItemType.click();
driver.findElement(By.xpath("//li[normalize-space()='Medicine']")).click();
Thread.sleep(1000);
Thread.sleep(1000);
itemNAme.sendKeys("Dolo");
Thread.sleep(1000);
itemNAme.sendKeys(Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//div[contains(text(),'Dolo 500Mg Tab')]")).click();
Thread.sleep(1000);
indqty.click();
Thread.sleep(1000);
indqty.sendKeys("20");
Thread.sleep(1000);
Add.click();
Thread.sleep(1000);
patIndentSave.click();
Thread.sleep(2000);

Status.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='Created']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-patient-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[3]/div[1]/div[3]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
Thread.sleep(1000);
patindSearch.click();
Thread.sleep(1000);
List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
Thread.sleep(1000);
int a =	dynamicElement.size();
System.out.println("size="+a);
Thread.sleep(1000);
String indNo =driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-patient-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[2]/div[1]/div[1]/div["+a+"]/div[1]/div[1]/div[2]/div[1]/div[1]")).getText();
System.out.println(indNo);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
Thread.sleep(1000);
submit.click();
Thread.sleep(1000);
patIndentSave.click();
Thread.sleep(2000);


Status.click();
driver.findElement(By.xpath("//li[normalize-space()='Submitted']")).click();
Thread.sleep(1000);
patindSearch.click();
Thread.sleep(1000);
List<WebElement> dynamicElement1=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
int b =	dynamicElement1.size();
System.out.println("size="+b);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
Thread.sleep(1000);
verifyCheck.click();
Thread.sleep(1000);
patVerifycmnt.click();
Thread.sleep(1000);
verifyComment.sendKeys("Verified");
Thread.sleep(1000);
CommentOk.click();
Thread.sleep(1000);
patIndentSave.click();
Thread.sleep(2000);

Status.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='Verified']")).click();
Thread.sleep(1000);
patindSearch.click();
Thread.sleep(1000);
List<WebElement> dynamicElement2=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
int c =	dynamicElement2.size();
System.out.println("size="+c);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
Thread.sleep(1000);
ApproveCheck.click();
Thread.sleep(1000);
patApprovecmnt.click();
Thread.sleep(1000);
ApproveComment.sendKeys("ApproveOk");
Thread.sleep(1000);
CommentOk.click();
Thread.sleep(1000);
patIndentSave.click();
Thread.sleep(2000);


Status.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='Approved']")).click();
Thread.sleep(1000);
patindSearch.click();
Thread.sleep(1000);
List<WebElement> dynamicElement3=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
int d =	dynamicElement3.size();
System.out.println("size="+d);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).click();
Thread.sleep(1000);
indentStatus.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='Closed']")).click();
Thread.sleep(1000);
StatusComment.sendKeys("Cancelled");
Thread.sleep(1000);
SaveCompleted.click();
Thread.sleep(1000);
yes.click();
Thread.sleep(2000);

Status.click();
Thread.sleep(1000);
driver.findElement(By.xpath("//li[normalize-space()='Closed']")).click();
Thread.sleep(1000);
patindSearch.click();
Thread.sleep(1000);
List<WebElement> dynamicElement5=driver.findElements(By.xpath("//div[@class='info-group ng-star-inserted']"));
int e =	dynamicElement5.size();
System.out.println("size="+e);
Thread.sleep(1000);
String ACTindno =driver.findElement(By.xpath("(//*[contains(text(),'"+indNo+"')])")).getText();
System.out.println(ACTindno);

File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
FileInputStream fis=new FileInputStream(src);
HSSFWorkbook wb=new HSSFWorkbook(fis);
HSSFSheet FOFullRegTest=wb.getSheetAt(77);	
int i=FOFullRegTest.getLastRowNum();
System.out.println("Number of rows: " + i);		
FOFullRegTest.getRow(i).createCell(6).setCellValue(ACTindno);	
FileOutputStream fout=new FileOutputStream(src);	
wb.write(fout);

Thread.sleep(1000);
Assert.assertEquals(indNo, ACTindno);

}
		
		
public void closedIndent(String PatcloseNo , String invCloseNo) throws InterruptedException {
	
	////Patient Indent
	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
	closeIndent.click();
	indentCat.click();
	Thread.sleep(1000);
	
//	WebElement DropDown = driver.findElement(By.xpath("//input[@id='indentcategoryid']"));  
//	Select dropdown = new Select(DropDown);
//	dropdown.selectByVisibleText("Patient Indent");  
	driver.findElement(By.xpath("(//*[contains(text(),'Patient Indent')])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-close-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[3]/div[1]/div[5]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
	Thread.sleep(1000);
	Status.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[contains(text(),'Closed')]")).click();
	Thread.sleep(1000);
	Search.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+PatcloseNo+"')])")).click();
	Thread.sleep(3000);
	
	
	////Inventory Indent
	indentCat.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'Inventory Indent')])[2]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-inventory-landing[1]/app-close-indent[1]/div[1]/lib-pharmacyindentsearch[1]/form[1]/div[3]/div[1]/div[5]/div[1]/ki-calender-time-range[1]/div[1]/input[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
	Thread.sleep(1000);
	Status.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[contains(text(),'Closed')]")).click();
	Thread.sleep(1000);
	Search.click();
	Thread.sleep(2000);
   driver.findElement(By.xpath("(//*[contains(text(),'"+invCloseNo+"')])[1]")).click();
	Thread.sleep(3000);
	
	
}



public void supplierCreation(String SuppName ,String supplierCode  ) throws InterruptedException {
	
	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
    supplier.click();
    Thread.sleep(1000);
    supplierName.click();
    Thread.sleep(1000);
    supplierName.sendKeys(SuppName);
    Thread.sleep(1000);
    refCode.click();
    Thread.sleep(1000);
    refCode.sendKeys(supplierCode);
    Thread.sleep(1000);
    Address.sendKeys("e-34,murugan nagar");
    Thread.sleep(1000);
    country.click();
    Thread.sleep(1000);
    country.sendKeys("india");
    Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'India')])[1]")).click();
	Thread.sleep(1000);
	State.click();
	Thread.sleep(1000);
	State.sendKeys("Tamil nadu");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'Tamil Nadu')])[1]")).click();
	Thread.sleep(1000);
	city.click();
	Thread.sleep(1000);
	city.sendKeys("coimbatore");
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'Coimbatore')])[1]")).click();
	Thread.sleep(1000);
	pincode.sendKeys("641009");
	Thread.sleep(1000);
	mblNo.sendKeys("9869641990");
	Thread.sleep(1000);
	contPerson.sendKeys("grish");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='btnsaveSupplier']")).click();
	Thread.sleep(1000);
	supplierSearch.sendKeys(SuppName);
	Thread.sleep(1000);
	Search.click();
	Thread.sleep(1000);
	Edit.click();
	Thread.sleep(1000);
	email.clear();
	Thread.sleep(1000);
	email.sendKeys("1234@amina.com");
	Thread.sleep(1000);
	UPDATE.click();
	Thread.sleep(1000);
	
}

}



