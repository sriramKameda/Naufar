package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_genderRestrictionRoom_YasasiiWeb  extends PageFactoryInitYasasiiWeb{

	public  SP5_genderRestrictionRoom_YasasiiWeb(WebDriver driver) {

		super(driver);

	}


	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon; 


	@FindBy(xpath = "//body/app-root/app-layout/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[6]/a[1]")
	public WebElement resource; 

	@FindBy(xpath = "//span[normalize-space()='Resource Master']")
	public WebElement resourceMaster; 

	@FindBy(xpath = "//input[@id='resourcecategory']")
	public WebElement category; 

	@FindBy(xpath = "//input[@id='roomid']")
	public WebElement ROOMcategory;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement  deluxRoom;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement PatientSearch;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;
	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement SelectProviderName;
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectRoomType;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBed;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;

	@FindBy(xpath = "//div[@class='multi-action']//i[@class='ki ki-ellipsis-v']")
	public WebElement Threedot;

	@FindBy(xpath = "//div[contains(text(),'Admission Cancel')]")
	public WebElement Admissioncancel;

	@FindBy(xpath = "//input[@id='cancelreason']")
	public WebElement Reason;

	@FindBy(xpath = "//button[normalize-space()='OK']//i[@class='ki ki-check']")
	public WebElement RestrictOK;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement SearchIcon;




	
















	public void genderRestrict(String Male ,String Female , String  ADTprovider) throws InterruptedException {


		// masters bed Setup



		Thread.sleep(2000);
		Menutoggle.click();
		Thread.sleep(1000);
		mastericon.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", resource );
		Thread.sleep(1000);
		resource.click();
		Thread.sleep(1000);
		resourceMaster.click();
		Thread.sleep(2000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Bed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='A10 Block']")).click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='Super-Delux']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'GENDER restrict room sri')])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='common_edit_icon_1']//i[@class='ki ki-pencil']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='A5 Block']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'for male')])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='common_edit_icon_0']//i[@class='ki ki-pencil']")).click();
		Thread.sleep(1000);

		//////
		Thread.sleep(1000);
		Menutoggle.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		Registration.click();
		Thread.sleep(1000);
		PatientSearch.clear();
		Thread.sleep(1000);
		PatientSearch.sendKeys(Female);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Female+"')])[1]")).click();
		Thread.sleep(1000);

		ADT.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{
			
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Super Deluxe')])")).click();
		//SelectRoomType.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'new male-')])[1]")).click();
		Thread.sleep(3000);
		RestrictOK.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'GR-')])[1]")).click();
		Thread.sleep(1000);
		SAve.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();
		Thread.sleep(1000);
		Threedot.click();
		Thread.sleep(1000);
		Admissioncancel.click();
		Thread.sleep(1000);
		Reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='As per Doctor Request']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='adtcancel']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);





		//////male

		Thread.sleep(1000);
		PatientSearch.clear();
		Thread.sleep(1000);
		PatientSearch.sendKeys(Male);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Male+"')])[1]")).click();
		Thread.sleep(1000);
		ADT.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{

			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));

			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Super Deluxe')])")).click();
		//SelectRoomType.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'GR-')])[1]")).click();
		Thread.sleep(3000);
		RestrictOK.click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'new male-')])[1]")).click();
		Thread.sleep(1000);
		SAve.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();

		Thread.sleep(1000);
		Threedot.click();
		Thread.sleep(1000);
		Admissioncancel.click();
		Thread.sleep(1000);
		Reason.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='As per Doctor Request']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='adtcancel']//i[@class='ki ki-check']")).click();
		Thread.sleep(1000);
		











	}







}
