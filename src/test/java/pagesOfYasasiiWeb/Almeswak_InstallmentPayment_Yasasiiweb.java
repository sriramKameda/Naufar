package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class Almeswak_InstallmentPayment_Yasasiiweb   extends PageFactoryInitYasasiiWeb {

	public Almeswak_InstallmentPayment_Yasasiiweb(WebDriver driver) {
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
	public WebElement Code;

	@FindBy(xpath="//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath="//textarea[@id='description']")
	public WebElement Description;

	@FindBy(xpath="(//span[contains(text(),'RCM')])[1]")
	public WebElement RCM;

	@FindBy(xpath="//span[normalize-space()='Installment Tariff']")
	public WebElement installmentTariff;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-installment-tariff-setting[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement INSCorp;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-installment-tariff-setting[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement plan;

	@FindBy(xpath="//input[@placeholder='Search Service Name...']")
	public WebElement ServiceSearch;


	@FindBy(xpath="//i[@title='Charge Info']")
	public WebElement ChargeInfo;

	@FindBy(xpath="//span[@class='btn btn-danger sm clear']//i[@class='ki ki-close-circle']")
	public WebElement Close;

	@FindBy(xpath="//input[@id='invmastservicename']")
	public WebElement InstallmentService;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-installment-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement BAseCharge;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-installment-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement contractCharge;

	@FindBy(xpath="//i[@class='ki ki-plus']")
	public WebElement ADD;

	@FindBy(xpath="//button[@id='installmentTariffSave']")
	public WebElement Save;


	@FindBy(xpath="//span[normalize-space()='Tariff Setting']")
	public WebElement TariffSetting;

	@FindBy(xpath="//input[@placeholder='Search...']")
	public WebElement SchemeSearch;

	@FindBy(xpath="//div[normalize-space()='Edit']")
	public WebElement Edit;


	@FindBy(xpath="//span[normalize-space()='Services']")
	public WebElement Services;

	@FindBy(xpath="//ki-select-control[@formcontrolname='servicetypeid']//input[@id='undefined']")
	public WebElement ServiceType;

	@FindBy(xpath="//input[@id='basecategoryid']")
	public WebElement baseCAt;

	@FindBy(xpath="//ki-select-control[@formcontrolname='servicecategoryid']//input[@id='undefined']")
	public WebElement ServiceCAt;

	@FindBy(xpath="//input[@id='serviceidBilling']")
	public WebElement Servicename;

	@FindBy(xpath="//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement Coverage;

	@FindBy(xpath="//label[@class='check-container zero-bottom']//span[@class='checkmark']")
	public WebElement PriceByUser;

	@FindBy(xpath="//span[normalize-space()='Charge Parameter']")
	public WebElement chargingParameter;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement SubMode;

	@FindBy(xpath="//i[@class='ki ki-plus']")
	public WebElement tariffAdd;

	@FindBy(xpath="//input[@placeholder='Service Name']")
	public WebElement ServiceSearch1;

	@FindBy(xpath="//th[@class='code']")
	public WebElement TableClick;

	@FindBy(xpath="//th[normalize-space()='Final Amt.']")
	public WebElement FinalAmount;

	@FindBy(xpath="//button[normalize-space()='Update']")
	public WebElement Update;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffBaseCharge;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffcontractCharge;


	@FindBy(xpath = "//textarea[@id='clinicalindication']")
	public WebElement ClicnicalIndication;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//textarea[@id='remarks']")
	public WebElement serviceRemark;

	@FindBy(xpath = "//i[@class='ki ki-upload']")
	public WebElement Update1;

	@FindBy(xpath = "//label[contains(text(),'CPOE Service / خدمات إدخال أوامر الطبيب على البرنا')]")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;


	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;


	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;


	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UpArrow;

	@FindBy(xpath = "//i[@title='Lock/Unlock']")
	public WebElement Lock;

	@FindBy(xpath = "//div[@class='order-details']//i[@class='fa fa-ellipsis-v']")
	public WebElement threeDot;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement DoctorNote;

	@FindBy(xpath = "//span[@class='search-icon']//i[@class='ki ki-search']")
	public WebElement Searchicon;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//span[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Servicebill;

	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;

	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceNAme;

	@FindBy(xpath = "//i[@title='Add Installment']")
	public WebElement AddInstallment;

	@FindBy(xpath = "//i[@title='Price Agreement']")
	public WebElement PriceAgreement;

	@FindBy(xpath = "//i[@title='Add Installment']")
	public WebElement AddInstall;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='servicename']//input[@id='undefined']")
	public WebElement installmentType;

	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement ServiceSave;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ADJpercent;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement SponsorAmount;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement withoutvat;

	@FindBy(xpath = "//span[normalize-space()='Charge - Tax']")
	public WebElement ChargeTAx;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printuncheck;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[2]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement REmarks;








	public void master(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory,String ServiceDescription) throws InterruptedException, AWTException{


		Thread.sleep(500);
		Hamberger.click();
		Thread.sleep(400);
		Master.click();
		Thread.sleep(400);
		
	
		List<WebElement> dynamicElement01=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement01.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(600);
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service );


		Thread.sleep(1000);
		Service.click();
		Thread.sleep(400);
		ServiceMaster.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();


		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
		}

		else {
			System.out.println("sri");

		}
		//	  Thread.sleep(800); 
		categoryMaster.clear();
		Thread.sleep(400);
		categoryMaster.click();
		Thread.sleep(400);
		categoryMaster.sendKeys(BaseCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+BaseCategory+"']")).click();
		Thread.sleep(400);
		Subcategory.clear();
		Thread.sleep(400);
		Subcategory.clear();
		Thread.sleep(400);
		Subcategory.click();
		Thread.sleep(400);
		Subcategory.sendKeys(SubCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+SubCategory+"')]")).click();
		Thread.sleep(400);
		serviceName.clear();
		Thread.sleep(400);
		serviceName.click();
		Thread.sleep(400);
		serviceName.sendKeys(ServiceName);
		Thread.sleep(400);
		codetype.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+codeType +"']")).click();
		Thread.sleep(400);
		Code.clear();
		Thread.sleep(400);
		Code.sendKeys(code);
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
		Thread.sleep(400);
		Executioncategory.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
		Thread.sleep(400);       
		driver.findElement(By.xpath("//button[@id='servicemastersave']")).click();
		Thread.sleep(1000); 


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);



	}




	public void TariffSetting( String SubCategory, String ServiceName) throws InterruptedException {

     	Thread.sleep(2000); 
		Hamberger.click();
		Thread.sleep(1000);   
		RCM.click();
		Thread.sleep(1000); 
		TariffSetting.click();
		Thread.sleep(1000); 
		SchemeSearch.click();
		Thread.sleep(1000); 
		SchemeSearch.sendKeys("default" , Keys.ENTER);
		Thread.sleep(1000); 
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000); 
		//.click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(2000); 
		Services.click();
		Thread.sleep(1000); 
		ServiceType.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Procedure']")).click();
		Thread.sleep(1000); 
		baseCAt.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Procedure']")).click();
		Thread.sleep(1000); 
		ServiceCAt.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='"+SubCategory+"']")).click();
		Thread.sleep(1000); 
		Servicename.click();
		Thread.sleep(1000); 
		Servicename.sendKeys(ServiceName);
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='"+ServiceName+"']")).click();
		Thread.sleep(1000); 
		Coverage.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Inclusion']")).click();
		Thread.sleep(1000); 
		chargingParameter.click();
		Thread.sleep(1000); 
		SubMode.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//span[@title='OP']")).click();
		Thread.sleep(1000); 
		chargingParameter.click();
		Thread.sleep(1000); 
		ChargeTAx.click();
		Thread.sleep(1000); 
		tariffBaseCharge.click();
		Thread.sleep(1000); 
		tariffBaseCharge.sendKeys("24500");
		Thread.sleep(1000); 
		tariffcontractCharge.click();
		Thread.sleep(1000); 
		tariffcontractCharge.sendKeys("24500");
		Thread.sleep(1000); 
		ADJpercent.click();
		Thread.sleep(1000); 
		ADJpercent.sendKeys("0");
		Thread.sleep(1000); 
		SponsorAmount.click();
		Thread.sleep(1000); 
		SponsorAmount.sendKeys("24500");
		Thread.sleep(1000); 
		withoutvat.click();
		Thread.sleep(1000); 
		withoutvat.sendKeys("24500");
		Thread.sleep(1000); 


		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", tariffAdd);

		tariffAdd.click();
		Thread.sleep(2500); 
		//		ServiceSearch1.click();
		//		Thread.sleep(1000); 
		//		ServiceSearch1.sendKeys(ServiceName);
		//		Thread.sleep(1000); 
		//		TableClick.click();
		//		Thread.sleep(1000);
		//		JavascriptExecutor js= (JavascriptExecutor) driver;
		//		js.executeScript("arguments[0].scrollIntoView();", FinalAmount);
		//		FinalAmount.click();
		//		Thread.sleep(1000); 
		Update.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 


	}

	
	public void installmenttariff(String ServiceName ,String SubCategory) throws InterruptedException {


		Thread.sleep(2000); 
		Hamberger.click();
		Thread.sleep(1000); 
		//	RCM.click();
		Thread.sleep(1000); 
		installmentTariff.click();
		Thread.sleep(1000); 
		INSCorp.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-installment-tariff-setting[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[2]/div[1]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(1000); 
		plan.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='Default Non Tax Scheme']")).click();
		Thread.sleep(1000); 
		ServiceSearch.clear();
		Thread.sleep(1000); 
		ServiceSearch.sendKeys(ServiceName , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='"+ServiceName+"']")).click();
		Thread.sleep(1000); 
		//Edit.click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-pencil']")).click();
		Thread.sleep(1000);
		ChargeInfo.click();
		Thread.sleep(1000); 

		String amount=driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/span[1]/div[11]/p[2]/span[2]")).getText();

		System.out.println(amount);



		Close.click();
		Thread.sleep(1000); 
		InstallmentService.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='100% Payment']")).click();
		Thread.sleep(1000); 
		BAseCharge.clear();
		Thread.sleep(1000); 
		BAseCharge.sendKeys(amount); 
		Thread.sleep(1000); 
		contractCharge.clear();
		Thread.sleep(1000); 
		contractCharge.sendKeys(amount);
		Thread.sleep(1000); 
		ADD.click();
		Thread.sleep(1000); 

		//converting string into int 

		double i = new Double(amount);

		//int i = Integer.parseInt(amount);
		double DV =  (i/2); 
		System.out.println(DV);

		//converting double into int

		int Rupee = (int)Math.round (DV) ;

		//converting int into String

		String fiftyperAmount = String.valueOf(Rupee);

		Thread.sleep(1000); 
		InstallmentService.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='50% Payment']")).click();
		Thread.sleep(1000); 
		BAseCharge.clear();
		Thread.sleep(1000); 
		BAseCharge.sendKeys(fiftyperAmount);
		Thread.sleep(1000); 
		contractCharge.clear();
		Thread.sleep(1000); 
		contractCharge.sendKeys(fiftyperAmount);
		Thread.sleep(1000); 
		ADD.click();
		Thread.sleep(1000); 

		//converting string into int 

		double i1 = new Double(amount);
		//	int j = Integer.parseInt(amount);
		double DV1 =  (i1/4); 
		System.out.println(DV1);

		//converting double into int

		int Rupee1 = (int)Math.round (DV1) ;

		//converting int into String

		String twentyfiveperAmount = String.valueOf(Rupee1);

		Thread.sleep(1000); 
		InstallmentService.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//li[normalize-space()='25% Payment']")).click();
		Thread.sleep(1000); 
		BAseCharge.clear();
		Thread.sleep(1000); 
		BAseCharge.sendKeys(twentyfiveperAmount);
		Thread.sleep(1000); 
		contractCharge.clear();
		Thread.sleep(1000); 
		contractCharge.sendKeys(twentyfiveperAmount);
		Thread.sleep(1000); 
		ADD.click();
		Thread.sleep(1000); 

		Save.click();
		Thread.sleep(1000); 
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000); 


	}

	public void Doctornote( String URL, String User ,String Password , String Site,String MRNO,String ServiceName) throws InterruptedException {



		//openNewTab

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		//login
		userid.click();
		Thread.sleep(500); 
		userid.sendKeys(User);
		Thread.sleep(500);
		password.click();
		Thread.sleep(500);
		password.sendKeys(Password);
		Thread.sleep(500);;
		site.click();
		Thread.sleep(500);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		
		MenuToggle.click();  
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		EnterPatientName.clear();
		Thread.sleep(600);
		EnterPatientName.click();
		Thread.sleep(600);
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();

		//SelectPatient.click();
		Thread.sleep(1000);
		UpArrow.click();
		Thread.sleep(500);
		Lock.click();
		Thread.sleep(1000);
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(2000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
	//	Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Dermatology']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);
		//	disgnosis.click();
		//	Thread.sleep(1000);
		//	driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		REmarks.click();
		Thread.sleep(1000);
		REmarks.sendKeys("ok");
		Thread.sleep(1000);
		
		////////////////installment procedure			

		CpoeService.click();
		Thread.sleep(1000);
		CpoeServiceSearch.click();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys(ServiceName);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='"+ServiceName+"']")).click();
		Thread.sleep(1000);
		threeDot.click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='STAT']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		ClicnicalIndication.click();
		Thread.sleep(1000);
		ClicnicalIndication.sendKeys("highly swallowed");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/app-cpoe-service-orderdetails[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/div[3]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		serviceRemark.click();
		Thread.sleep(1000);
		serviceRemark.sendKeys("ok");
		Thread.sleep(1000);
		Update1.click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000);


	}

	public void Billing( String URL, String AdminUser ,String adminPassword , String Site ,String MRNO ) throws InterruptedException, AWTException {


		//openNewTab


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);



		//login
		userid.click();
		Thread.sleep(500); 
		userid.sendKeys(AdminUser);
		Thread.sleep(500);
		password.click();
		Thread.sleep(500);
		password.sendKeys(adminPassword);
		Thread.sleep(500);;
		site.click();
		Thread.sleep(500);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(600);
		FO.click();
		Thread.sleep(600);
		List<WebElement> dynamicElement01=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement01.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Registration.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}

		Thread.sleep(1500);

    	WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));
		Thread.sleep(1500);
		EnterPatientName.click();
		Thread.sleep(1000);
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1000);
		Searchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);


		Thread.sleep(1000);
		Servicebill.click();
		Thread.sleep(3000);

		PriceAgreement.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='agreementsave']")).click();
		Thread.sleep(1000);
		AddInstall.click();
		Thread.sleep(1000);
		installmentType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='50% Payment']")).click();
		Thread.sleep(1000);
		ADD.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		ServiceSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1500);

		AddInstall.click();
		Thread.sleep(1000);
		installmentType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='25% Payment']")).click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		ADD.click();
		Thread.sleep(1000);
		ServiceSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1500);

		AddInstall.click();
		Thread.sleep(1000);
		installmentType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='25% Payment']")).click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		ADD.click();
		Thread.sleep(1000);
		ServiceSave.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1500);



		//AddInstallment.click();






















	}



}