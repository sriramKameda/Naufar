package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_GroupTheraphy_YasasiiWeb extends PageFactoryInitYasasiiWeb{

	public SP5_GroupTheraphy_YasasiiWeb(WebDriver driver) {

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

	@FindBy(xpath="//span[@class='display-item']")
	public WebElement name;

	@FindBy(xpath="//input[@id='name1']")
	public WebElement name1;

	@FindBy(xpath="//button[@id='resourcemastersave']")
	public WebElement Save;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement Providerincharge;

	@FindBy(xpath="//input[@id='gtsession']")
	public WebElement Session;

	@FindBy(xpath="//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath="//input[@id='gtpurpose']")
	public WebElement Purpose;

	@FindBy(xpath="//i[@class='ki ki-arrow-up-circle']")
	public WebElement Up;

	@FindBy(xpath="//i[@class='ki ki-arrow-down-circle']")
	public WebElement Down;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]/span[1]")
	public WebElement Phase;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[3]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement Applicable;


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
	public WebElement Add1;

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

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;


	@FindBy(xpath = "//a[@title='To create the patients batch for appointment fixing']")
	public WebElement patientGroup;

	@FindBy(xpath = "//input[@id='groupname']")
	public WebElement GroupName;

	@FindBy(xpath = "//input[@id='mrno']")
	public WebElement EnterMRNo;

	@FindBy(xpath = "//ki-input-control[@id='mrno']//i[@title='Search']")
	public WebElement Search;

	@FindBy(xpath = "//ki-calendar[@id='validfrom']//input[@type='text']")
	public WebElement validFrom;

	@FindBy(xpath = "//ki-calendar[@id='validto']//input[@type='text']")
	public WebElement validTo;

	@FindBy(xpath = "//button[@title='Add']//i[@class='ki ki-plus']")
	public WebElement PatientAdd;

	@FindBy(xpath = "//button[@id='batchsave']")
	public WebElement PatientGroupave;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement Searchfield;

	@FindBy(xpath = "//span[@id='common_edit_icon_0']//i[@class='ki ki-pencil']")
	public WebElement Groupedit;

	@FindBy(xpath = "//button[@id='batchpupdate']")
	public WebElement GroupUpdate;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement SubCategoryFO;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOsearch;

	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement calenderResource;

	@FindBy(xpath = "//tbody[1]/tr[2]/td[4]/div[1]")
	public WebElement appselection;


	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement appsave;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement appok;

	@FindBy(xpath = "//input[@id='servicename']")
	public WebElement programname;

	@FindBy(xpath = "//input[@id='daycount']")
	public WebElement Every;

	@FindBy(xpath = "//button[@id='repaeatappointmentbuttonid']")
	public WebElement Continue;

	@FindBy(xpath = "(//i[@class='ki ki-info-circle-fill'])[1]")
	public WebElement Iview1;

	@FindBy(xpath = "(//i[@class='ki ki-info-circle-fill'])[1]")
	public WebElement Iview2;

	@FindBy(xpath = "//span[normalize-space()='Resource Details']")
	public WebElement resourceDetails;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='prefcardordertyperefid']//input[@id='undefined']")
	public WebElement resource;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-dirty ng-invalid']//input[@id='undefined']")
	public WebElement resourceType;

	@FindBy(xpath = "//input[@id='dept']")
	public WebElement Dept;

	@FindBy(xpath = "//input[@id='itemid']")
	public WebElement resourceName;

	@FindBy(xpath = "//button[@id='subresourceaddid']//i[@class='ki ki-plus']")
	public WebElement resourceAdd;

	@FindBy(xpath = "//input[@id='session']")
	public WebElement ScheduleSession;





public void mastersSetting(String GroupIncharge , String GroupCalender , String Groupprogram, String resource ) throws InterruptedException	{

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
//		ResourceCat.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Group Incharge']")).click();
//		Thread.sleep(1000);
//		name.click();
//		Thread.sleep(1000);
//		Providerincharge.click();
//		Thread.sleep(1000);
//		Providerincharge.sendKeys(GroupIncharge);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[2]")).click();
//		//name.sendKeys(groupThearapyincharge);
//		Thread.sleep(1000);
//		Save.click();
//		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='resourcecategoryid']")));
		Thread.sleep(3000);
		ResourceCat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Group Therapy Calendar']")).click();
		Thread.sleep(1000);
		name1.click();
		Thread.sleep(1000);
		name1.sendKeys(GroupCalender);
		//name.sendKeys(groupThearapyincharge);
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='resourcecategoryid']")));
		Thread.sleep(2000);
		ResourceCat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Group Therapy Program']")).click();
		Thread.sleep(1000);
		name1.click();
		Thread.sleep(1000);
		name1.sendKeys(Groupprogram);
		//name.sendKeys(groupThearapyincharge);
		Session.click();
		Thread.sleep(1000);
		Session.sendKeys("Physio-Session-1");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Session.click();
		Thread.sleep(1000);
		Session.sendKeys("Physio-Session-2");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Session.click();
		Thread.sleep(1000);
		Session.sendKeys("Physio-Session-3");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Session.click();
		Thread.sleep(1000);
		Session.sendKeys("Physio-Session-4");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Session.click();
		Thread.sleep(1000);
		Session.sendKeys("Physio-Session-5");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Session.click();
		Thread.sleep(1000);
		Session.sendKeys("Physio-Session-6");
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Purpose.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Life Skills']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")).click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		Down.click();
		Thread.sleep(1000);
		Down.click();
		Thread.sleep(1000);
		Up.click();
		Thread.sleep(1000);
		Up.click();
		Thread.sleep(1000);
		Phase.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		Thread.sleep(1000);
		Applicable.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")));

		Thread.sleep(2000);
		hamberger.click();
		Thread.sleep(1000);
		ResourceMapping.click();
		Thread.sleep(1000);
		MainCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Group Therapy Program']")).click();
		Thread.sleep(1000);

		NameList.click();
		Thread.sleep(1000);
		NameList.sendKeys(Groupprogram);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Groupprogram+"']")).click();
		//driver.findElement(By.xpath("//app-dutyroster[@class='ng-star-inserted']//li[1]")).click();
		Thread.sleep(1000);
		SubCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Nurse']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'"+resource+"')]")).click();
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
		Thread.sleep(5000);

		hamberger.click();
		Thread.sleep(1000);
		SheduleSetting.click();
		Thread.sleep(1000);
		Category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Group Therapy Calendar']")).click();
		Thread.sleep(1000);
		SheduleName.click();
		Thread.sleep(1000);
		SheduleName.sendKeys(GroupCalender);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//app-schedulesetting[@class='ng-star-inserted']//li[1]")).click();
		Thread.sleep(1000);
		Todate1.click();
		Thread.sleep(1000);
		rightArrow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='owl-dt-calendar-cell-content'][normalize-space()='30']")).click();
		Thread.sleep(2000);
		ScheduleSession.click();
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

	public void groupCreation(String groupname , String MRNO1,String MRNO2 , String MRNO3 , String MRNO4 ,String GroupCalender,String Groupprogram) throws InterruptedException, AWTException {


		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-chevron-down']")).click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Registration']")).click();
		Thread.sleep(2000);

		hamberger.click();
		Thread.sleep(1000);
		patientGroup.click();
		Thread.sleep(1000);
		GroupName.click();
		Thread.sleep(1000);
		GroupName.sendKeys(groupname);
		Thread.sleep(1000);
		EnterMRNo.clear();
		Thread.sleep(1000);
		EnterMRNo.sendKeys(MRNO1);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		validFrom.click();
		Thread.sleep(1000);
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);	

		validTo.click();
		Thread.sleep(400);
		for (int i = 0; i <4; i++) {


			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);	
		PatientAdd.click();
		Thread.sleep(1000);

		EnterMRNo.clear();
		Thread.sleep(1000);
		EnterMRNo.sendKeys(MRNO2);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		validFrom.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);	

		validTo.click();
		Thread.sleep(400);
		for (int i = 0; i <4; i++) {


			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);	
		PatientAdd.click();

		Thread.sleep(1000);
		EnterMRNo.clear();
		Thread.sleep(1000);
		EnterMRNo.sendKeys(MRNO3);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		validFrom.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);	

		validTo.click();
		Thread.sleep(400);
		for (int i = 0; i <4; i++) {


			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(400);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);	
		PatientAdd.click();
		Thread.sleep(1000);
		EnterMRNo.clear();
		Thread.sleep(1000);
		EnterMRNo.sendKeys(MRNO4);
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
		validFrom.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);	

		validTo.click();
		Thread.sleep(400);
		for (int i = 0; i <4; i++) {


			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(200);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);	
		PatientAdd.click();
		Thread.sleep(400);
		PatientGroupave.click();
		Thread.sleep(1000);
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(groupname , Keys.ENTER);
		Thread.sleep(2000);
		WebElement grpname=	driver.findElement(By.xpath("//*[contains(text(),'" + groupname + "')]"));
		Thread.sleep(1000);
		act.moveToElement(grpname).build().perform();
		Thread.sleep(2000);
		Groupedit.click();
		Thread.sleep(1000);
		GroupUpdate.click();
		Thread.sleep(1000);
		Close.click();
		Thread.sleep(1000);
		SubCategoryFO.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Group']")).click();
		Thread.sleep(1000);
		FOsearch.click();
		Thread.sleep(1000);
		FOsearch.sendKeys(groupname , Keys.ENTER);
		Thread.sleep(1000);
		//div[@class='form-group min-clear-bottom']//i[@class='ki ki-search']
		driver.findElement(By.xpath("//*[contains(text(),'" + groupname + "')]")).click();
		Thread.sleep(1000);
		calenderResource.click();
		Thread.sleep(1000);
		calenderResource.sendKeys(GroupCalender);
		Thread.sleep(1000);

		appselection.click();
		Thread.sleep(3000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[4]/div[1]/span[1]"));
		Thread.sleep(2000);

		List<WebElement> li2=new ArrayList<WebElement>(); 

		WebElement plusDiv=driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//div[@class='appointment-info']"));
		WebElement appointmentPlus=driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']"));
		act.moveToElement(plusDiv).build().perform();
		Thread.sleep(2000);
		act.moveToElement(appointmentPlus).click().build().perform();
		Thread.sleep(2000);

		programname.click();
		Thread.sleep(1000);
		programname.sendKeys(Groupprogram);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Groupprogram+"']")).click();
		Thread.sleep(1000);
		Every.click();
		Thread.sleep(1000);
		Every.sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(800);
		Continue.click();
		Thread.sleep(800);
		Iview1.click();
		Thread.sleep(800);
		Close.click();
		Iview2.click();
		Thread.sleep(800);
		Close.click();
		Thread.sleep(1000);
//		resourceDetails.click();
//		Thread.sleep(1000);
//		resource.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
//		Thread.sleep(1000);
//		resourceType.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
//		Thread.sleep(1000);
//		Dept.click();
//		Thread.sleep(1000);
//		Dept.sendKeys("Gastroenterology.");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Gastroenterology.']")).click();
//		Thread.sleep(1000);
//		resourceName.click();
//		Thread.sleep(1000);
//		resourceName.sendKeys("Rohit Sharma");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//li[normalize-space()='Rohit Sharma(3)']")).click();
//		Thread.sleep(1000);
//		resourceAdd.click();
		Thread.sleep(1000);
		appsave.click();
		Thread.sleep(2000);
		appok.click();
		Thread.sleep(1000);







	}








}