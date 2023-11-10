package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Naufar_GroupTheraphy_YasassiWeb extends PageFactoryInitYasasiiWeb{

	public Naufar_GroupTheraphy_YasassiWeb(WebDriver driver) {

		super(driver);

	}


	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement   hamberger;

	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement   Master;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='Resource']")
	public WebElement Resource;

	@FindBy(xpath="//div[normalize-space()='Resource Master']")
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


	@FindBy(xpath="//div[contains(text(),'Resource Mapping')]")
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

	@FindBy(xpath="//div[normalize-space()='Schedule Setting']")
	public WebElement SheduleSetting;

	@FindBy(xpath="//input[@id='categoryListId']")
	public WebElement Category;

	@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='namelistdisplay']")
	public WebElement SheduleName;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-schedulesetting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ki-calendar[1]/div[1]/input[1]")
	public WebElement Todate1;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;


	@FindBy(xpath = "//div[normalize-space()='Patient Group']")
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

	@FindBy(xpath = "//tbody[1]/tr[2]/td[2]/div[1]")
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

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Slot;
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/label[1]/div[1]/label[1]/i[1]")
	public WebElement Iview1;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/div[1]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/label[1]/div[1]/label[1]/i[1]")
	public WebElement Iview2;

	@FindBy(xpath = "//span[normalize-space()='Resource Details']")
	public WebElement resourceDetails;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='prefcardordertyperefid']//input[@id='undefined']")
	public WebElement resource;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement resourceType;

	@FindBy(xpath = "//input[@id='dept']")
	public WebElement Dept;

	@FindBy(xpath = "//input[@id='itemid']")
	public WebElement resourceName;

	@FindBy(xpath = "//button[@id='subresourceaddid']//i[@class='ki ki-plus']")
	public WebElement resourceAdd;

	@FindBy(xpath = "//input[@id='session']")
	public WebElement ScheduleSession;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[normalize-space()='Group Note']")
	public WebElement GroupNote;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchGrup;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement Password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//input[@id='patappstatusid-0']")
	public WebElement Pat1;

	@FindBy(xpath = "//input[@id='patappstatusid-1']")
	public WebElement Pat2;

	@FindBy(xpath = "//input[@id='patgroupremarks-0']")
	public WebElement remarks1;

	@FindBy(xpath = "//input[@id='patgroupremarks-1']")
	public WebElement Remarks2;

	@FindBy(xpath = "//th[@class='sticky-col third-col']")
	public WebElement header;

	@FindBy(xpath = "//th[normalize-space()='Participation']")
	public WebElement participation;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-patient-grp-app-landing[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[7]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Checkbox1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-patient-grp-app-landing[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[8]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement Checkbox2;

	@FindBy(xpath = "//div[@role='textbox']//p")
	public WebElement GroupnoteText;

	@FindBy(xpath = "//div[@class='dx-show-invalid-badge dx-htmleditor-toolbar-format dx-header-format dx-selectbox dx-textbox dx-texteditor dx-dropdowneditor-button-visible dx-editor-filled dx-widget dx-dropdowneditor dx-dropdowneditor-field-clickable dx-state-hover']//input[@role='combobox']")
	public WebElement TextType;

	@FindBy(xpath = "//div[contains(text(),'Heading 3')]")
	public WebElement Heading3;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-bold']")
	public WebElement Bold;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-blockquote']")
	public WebElement Quote;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement GroupnoteSave;
	
	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement GroupnoteUpload;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/i[1]")
	public WebElement PAtHomepage1;
	
	@FindBy(xpath = "//div[@id='prev_note_0']//div[@class='chief-complaint']")
	public WebElement Groupnote;

	@FindBy(xpath = "//i[@title='Print']")
	public WebElement NotePrint;	
	
	@FindBy(xpath ="//input[@id='maincategory']")
	public WebElement maincategory;	
	
	@FindBy(xpath ="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/i[1]")
	public WebElement StatusIcon;	
	
	@FindBy(xpath ="//span[normalize-space()='Status']")
	public WebElement Status;	
	
	@FindBy(xpath ="//input[@id='searchtext']")
	public WebElement Searchname;	
	
	@FindBy(xpath ="//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")
	public WebElement close;	
	
	@FindBy(xpath ="//span[normalize-space()='Log']")
	public WebElement Log;	
	
	

public void mastersSetting(String GroupIncharge , String GroupCalender , String Groupprogram, String resource ) throws InterruptedException, AWTException	{

		Thread.sleep(2000);
		hamberger.click();
		Thread.sleep(1000);
		Master.click();
		Thread.sleep(1000);
		
		Thread.sleep(500);
    	List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		Thread.sleep(1000);
		
		
		
		
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		Resource.click();

		Thread.sleep(1000);
		ResourceMaster.click();
		Thread.sleep(1000);
	/*	ResourceCat.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Group Incharge']")).click();
		Thread.sleep(1000);
		name.click();
		Thread.sleep(1000);
		Providerincharge.click();
		Thread.sleep(1000);
		Providerincharge.sendKeys(GroupIncharge);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[2]")).click();
		//name.sendKeys(groupThearapyincharge);
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
		Thread.sleep(3000);      */
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
		Thread.sleep(5000);
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(45));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='resourcecategoryid']")));
		Thread.sleep(5000);
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
	//	Applicable.click();
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//a[@role='menuitem']")).click();
	//	Thread.sleep(1000);
		Save.click();
		Thread.sleep(5000);
		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		
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
		Thread.sleep(2000);
		SubCategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
		//driver.findElement(By.xpath("//li[normalize-space()='Group Incharge']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(text(),'"+GroupIncharge+"')]")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		MappingSave.click();
		Thread.sleep(2000);

		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")));
		Thread.sleep(5000);
		Thread.sleep(2000);
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
		Thread.sleep(3000);
		
		//Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		

	}

	public void groupCreation(String groupname , String MRNO1,String MRNO2 , String MRNO3 , String MRNO4 ,String GroupCalender,String Groupprogram) throws InterruptedException, AWTException {


		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-chevron-down']")).click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);	
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Registration']")).click();
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		
		Thread.sleep(1000);
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
		Thread.sleep(2000);
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		t.keyPress(KeyEvent.VK_ESCAPE);
		
		
		
	/*	Thread.sleep(1000);
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
		Close.click();  */
		Thread.sleep(1000);
		SubCategoryFO.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Group']")).click();
		Thread.sleep(1000);
		FOsearch.click();
		Thread.sleep(1000);
		FOsearch.sendKeys(groupname , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'" + groupname + "')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//i[@class='ki ki-filter-list']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='type']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Group Therapy Calendar']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='providerSearchDb']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='providerSearchDb']")).sendKeys("Schedule" + Keys.ENTER);		
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@title='"+GroupCalender+"']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='bg-overlay']")).click();
		Thread.sleep(500);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")));
		Thread.sleep(2000);
		calenderResource.click();
		Thread.sleep(1000);
		calenderResource.sendKeys(GroupCalender);
		Thread.sleep(1000);

		appselection.click();
		Thread.sleep(3000);
		List<WebElement> li=new ArrayList<WebElement>();
		li=driver.findElements(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-appointment-landing[1]/div[1]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]"));
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
		driver.findElement(By.xpath("//li[normalize-space()='Family Therapy']")).click();
		Thread.sleep(800);
		Slot.clear();
		Thread.sleep(800);
		Slot.sendKeys("1");
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
		resourceDetails.click();
		Thread.sleep(1000);
		resource.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		Thread.sleep(1000);
		resourceType.click();
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Non MD']")).click();
		Thread.sleep(1000);
		Dept.click();
		Thread.sleep(1000);
		Dept.sendKeys("Diet");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dietetics']")).click();
		Thread.sleep(1000);
		resourceName.click();
		Thread.sleep(1000);
		resourceName.sendKeys("%");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Racil Houssari(100195)']")).click();
		Thread.sleep(1000);
		resourceAdd.click();
		Thread.sleep(1000);
		appsave.click();
	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='OK']")));
		Thread.sleep(800);
		
		appok.click();
		Thread.sleep(3000);
		
		
	///Group Appointment Status and log view
		
		
		Thread.sleep(700);
		maincategory.click();
		Thread.sleep(700);
		driver.findElement(By.xpath("//li[normalize-space()='Appointment']")).click();
		Thread.sleep(700);
		
		Searchname.clear();
		Thread.sleep(700);
		Searchname.sendKeys(groupname ,Keys.ENTER);
		Thread.sleep(700);
		
		driver.findElement(By.xpath("(//span[contains(text(),'"+groupname+"')])[1]")).click();
		Thread.sleep(1000);
		
		StatusIcon.click();
		Thread.sleep(2000);
		
        Status.click();
        Thread.sleep(700);
		Log.click();
		Thread.sleep(2000);
		close.click();
		Thread.sleep(1000);
		
		
		
		
	
	}

	public void GroupNote(String User,String password,String Site, String groupname) throws InterruptedException, AWTException {
		
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;
		
		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		Thread.sleep(800);
		userid.sendKeys(User);
		Password.click();
		Thread.sleep(800);
		Password.sendKeys(password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		
		Hamberger.click();
		Thread.sleep(800);
     	GroupNote.click();
     	Thread.sleep(800);
		SearchGrup.click();
		Thread.sleep(800);
		SearchGrup.sendKeys(groupname);
		Thread.sleep(800);
		driver.findElement(By.xpath("//*[contains(text(),'" + groupname + "')]")).click();
		Thread.sleep(800);
		Pat1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No Show']")).click();
		Thread.sleep(800);
		Pat2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Excused']")).click();
		Thread.sleep(800);
		remarks1.click();
		Thread.sleep(800);
		remarks1.sendKeys("Patient refused");
		Thread.sleep(800);
		Remarks2.click();
		Thread.sleep(800);
		Remarks2.sendKeys("patient  is in unconcious");
		Thread.sleep(800);
		header.click();
		Thread.sleep(800);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", participation);
	    Thread.sleep(1000);
	    Checkbox1.click();
	    Thread.sleep(800);
	    Checkbox2.click();
	    Thread.sleep(800);
	    GroupnoteText.click();
	    Thread.sleep(800);
	    GroupnoteText.sendKeys("This component is in a detailed, narrative format and describes the patient's self-report of their current status in terms of their current condition/complaint, function, activity level, disability, symptoms, social history, family history, employment status, and environmental history. It may also include information from the family or caregivers and if exact phrasing is used, should be enclosed in quotation marks. The patient's goals and prior response to treatment intervention are also included. Medical information obtained from the patient's chart can also be included the therapist has not directly observed these findings.[6]\r\n"
	    		+ "\r\n"
	    		+ "It allows the therapist to document the patient's perception of their condition as it relates to their progress in rehabilitation, functional performance, or quality of life.\r\n"
	    		+ "\r\n"
	    		+ "");
	    Thread.sleep(800);
	/*    TextType.click();
	    Thread.sleep(800);
	    Heading3.click();
	    Thread.sleep(800);  */

		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(800); 
	    Bold.click();
	    Thread.sleep(800);
	    r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(800);	    
		Quote.click();
		Thread.sleep(800);
	    r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		GroupnoteUpload.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']//i[@class='ki ki-check']")).click();
		Thread.sleep(800);
		PAtHomepage1.click(); 
		Thread.sleep(800);
		Groupnote.click();
		Thread.sleep(800);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
