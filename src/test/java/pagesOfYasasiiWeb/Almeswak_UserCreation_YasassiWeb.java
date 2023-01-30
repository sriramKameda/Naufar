package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Almeswak_UserCreation_YasassiWeb  extends PageFactoryInitYasasiiWeb{

	public Almeswak_UserCreation_YasassiWeb(WebDriver driver) {

		super(driver);

	
	}	


@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
public WebElement Hamberger;

@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-user-privilege-fill']")
public WebElement Security;

@FindBy(xpath = "//span[normalize-space()='User Creation']")
public WebElement UserCreation;

@FindBy(xpath = "//input[@id='firstname']")
public WebElement firstName;

@FindBy(xpath = "//input[@id='middlename']")
public WebElement middleName;

@FindBy(xpath = "//input[@id='lastname']")
public WebElement lastname;

@FindBy(xpath = "//input[@id='gender']")
public WebElement gender;

@FindBy(xpath = "//input[@id='phoneno']")
public WebElement phoneno;

@FindBy(xpath = "//input[@id='empid']")
public WebElement EmployeeId;

@FindBy(xpath = "//ki-calendar[@id='doj']//input[@type='text']")
public WebElement Doj;

@FindBy(xpath = "//input[@id='usertypeid']")
public WebElement usertype;

@FindBy(xpath = "//input[@id='deptname']")
public WebElement department;

@FindBy(xpath = "//input[@id='designation']")
public WebElement designation;

@FindBy(xpath = "//input[@id='site']")
public WebElement Allowedsite;

@FindBy(xpath = "//input[@id='userprofileid']")
public WebElement UserProfile;

@FindBy(xpath = "//button[@title='Add to grid']//i[@class='ki ki-plus']")
public WebElement add;

@FindBy(xpath = "//span[normalize-space()='User Credentials']")
public WebElement Usercredential;

@FindBy(xpath = "//input[@id='password']")
public WebElement Password;

@FindBy(xpath = "//input[@id='cpassword']")
public WebElement confirmpassword;

@FindBy(xpath = "//span[normalize-space()='User Information']")
public WebElement UserInformation;

@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
public WebElement DOb;


@FindBy(xpath = "//span[normalize-space()='Contact Information']")
public WebElement contactInformation;


@FindBy(xpath = "//input[@id='email']")
public WebElement Email;

@FindBy(xpath = "//input[@id='phonenocode']")
public WebElement Phonecode;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[4]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
public WebElement modules;

@FindBy(xpath = "//input[@id='defaultmodule']")
public WebElement defaultmodule;

@FindBy(xpath = "//input[@id='regno']")
public WebElement regnumber;

@FindBy(xpath = "//button[@id='multiselect_user_speciality']")
public WebElement Speciality;

@FindBy(xpath = "//input[@id='defaultspeciality']")
public WebElement DefaultSpeacility;

@FindBy(xpath = "//button[normalize-space()='Login Restriction']")
public WebElement loginrestriction;

@FindBy(xpath = "//a[@role='menuitem']")
public WebElement Selectall;


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

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
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

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
public WebElement ADJpercent;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
public WebElement SponsorAmount;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
public WebElement withoutvat;

@FindBy(xpath = "//span[normalize-space()='Charge - Tax']")
public WebElement ChargeTAx;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
public WebElement tariffBaseCharge;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
public WebElement tariffcontractCharge;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[5]/a[1]/span[1]")
public WebElement RCM;

@FindBy(xpath="//span[normalize-space()='Provider']")
public WebElement Provider;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-auto-complete-pagination[1]/div[1]/input[1]")
public WebElement ProviderName;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[6]/a[1]/span[1]")
public WebElement Resource;

@FindBy(xpath="//span[normalize-space()='Schedule Setting']")
public WebElement ScheduleSetting;

@FindBy(xpath="//input[@id='categoryListId']")
public WebElement Category;

@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='namelistdisplay']")
public WebElement Name;

@FindBy(xpath="//div[@class='form-group ki-dropdown']//input[@id='siteid']")
public WebElement Site;

@FindBy(xpath="//input[@id='session']")
public WebElement Session;

@FindBy(xpath="//input[@id='fromtime']")
public WebElement FromTym;

@FindBy(xpath="//input[@id='totime']")
public WebElement ToTym;

@FindBy(xpath="//button[@id='schedulesettingsave']")
public WebElement ScheduleSetingSave;

@FindBy(xpath = "//span[normalize-space()='Registration']")
public WebElement Registration;

@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
public WebElement PAS;


@FindBy(xpath = "//input[@id='EncBillingproviders']")
public WebElement providerName;

@FindBy(xpath = "//i[@class='ki ki-plus']")
public WebElement EncounterAdd;

@FindBy(xpath = "//button[@id='billingsave']")
public WebElement EncounterSave;

@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
public WebElement SAvesuccess;

@FindBy(xpath = "//label[contains(@class,'check-container zero-label')]")
public WebElement printuncheck;


@FindBy(xpath = "//button[normalize-space()='Clear']")
public WebElement clear;

@FindBy(xpath="//input[@id='searchtext']") 
public WebElement SearchField;








public void userCreation(String FirstName ,String MiddleName,String LastName,String Gender,String PhoneNumber,String userId,String UserType,String Department,String Designation,String allowedSites,String Userprofile,String Passsword,String DOJ ,String emailid, String DOB , String encounterCreation,String modules1,String modules2,String modules3,String modules4,String modules5,String modules6,String modules7,String modules8,String deafultmodule,String RegistrationNO,String Country) throws InterruptedException, AWTException{
	
	
	Thread.sleep(2000);
	Hamberger.click();
	Thread.sleep(500);
   /// driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
	//Thread.sleep(500);
	Security.click();	
	Thread.sleep(500);
	UserCreation.click();
	Thread.sleep(500);
	
	firstName.clear();
	Thread.sleep(500);
	firstName.sendKeys(FirstName);
	Thread.sleep(500);
	middleName.clear();
	Thread.sleep(500);
	middleName.sendKeys(MiddleName);
	Thread.sleep(500);
	lastname.clear();
	Thread.sleep(500);
	lastname.sendKeys(LastName);
	Thread.sleep(500);
	gender.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//*[contains(text(),'"+Gender+"')])[1]")).click();
	Thread.sleep(500);
	
	Phonecode.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//li[normalize-space()='"+Country+"']")).click();
	Thread.sleep(500);
	
	
	phoneno.clear();
	Thread.sleep(500);
	phoneno.sendKeys(PhoneNumber);
	Thread.sleep(500);
	EmployeeId.clear();
	Thread.sleep(500);
	EmployeeId.sendKeys(userId);
	Thread.sleep(500);
	
	DOb.clear();
	Thread.sleep(500);
	Robot t=new Robot();

	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	/*	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	
	Thread.sleep(500);*/
	DOb.sendKeys(DOB);
	Thread.sleep(1000);

	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	/*		t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);  
	Thread.sleep(500);     */
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", contactInformation);
	Thread.sleep(500);
	contactInformation.click();
	Thread.sleep(500);
	Email.clear();
	Thread.sleep(500);
	Email.sendKeys(emailid);
	Thread.sleep(500);
	js.executeScript("arguments[0].scrollIntoView();", Usercredential);
	Thread.sleep(500);
	Usercredential.click();
	Thread.sleep(500);
	js.executeScript("arguments[0].scrollIntoView();", UserInformation);
	Thread.sleep(500);
	UserInformation.click();
	Thread.sleep(500);
	Doj.clear();
	Thread.sleep(500);
	//Robot t=new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);

	Thread.sleep(500);
	Doj.sendKeys(DOJ);
	Thread.sleep(1000);

	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	
	usertype.click();
	Thread.sleep(500);
	driver .findElement(By.xpath("//li[normalize-space()='"+UserType+"']")).click();
	Thread.sleep(500);
	department.clear(); 
	Thread.sleep(500);
	department.sendKeys(Department);
	Thread.sleep(500);
	driver .findElement(By.xpath("//li[normalize-space()='"+Department+"']")).click();
	Thread.sleep(500);
	designation.clear();
	Thread.sleep(500);
	designation.sendKeys(Designation);
	Thread.sleep(500);
	driver .findElement(By.xpath("//li[normalize-space()='"+Designation+"']")).click();
	Thread.sleep(500);
	Allowedsite.click();
	Thread.sleep(500);
	driver .findElement(By.xpath("//li[normalize-space()='"+allowedSites+"']")).click();
	Thread.sleep(500);
	UserProfile.click();
	Thread.sleep(500);
	driver .findElement(By.xpath("//li[normalize-space()='"+Userprofile+"']")).click();
	
	
	////Encounter Creation
	
	if(encounterCreation.equals("1")) {
		Thread.sleep(500);
		driver .findElement(By.xpath("//label[normalize-space()='Encounter Creation Allowed']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		Speciality.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/div[1]/a[3]/span[1]/span[2]")).click();
		Thread.sleep(500);
		DefaultSpeacility.click();
		Thread.sleep(500);
		driver .findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		Thread.sleep(500);
		
		
		
		
		
			}
	
	else {
		Thread.sleep(500);
		System.out.println("sri");
	}
	
	
	
	Thread.sleep(500);
	add.click();
	Thread.sleep(500);
	
	
	js.executeScript("arguments[0].scrollIntoView();", loginrestriction);
	Thread.sleep(500);
	
	
/////////modules selection	
	
	
	modules.click();
	Thread.sleep(500);
	Selectall.click();	
	Thread.sleep(500);
	Selectall.click();	
	
	if(modules1.equals("NO")) {
		Thread.sleep(500);
		System.out.println("Sri");
	}
	
	else {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules1+"']")));
		driver .findElement(By.xpath("//span[@title='"+modules1+"']")).click();
		
	}
	
	if(modules2.equals("NO")) {
		Thread.sleep(500);
		System.out.println("Sri");
	}
	
	else {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules2+"']")));
		driver .findElement(By.xpath("//span[@title='"+modules2+"']")).click();
		
	}
	
	
	if(modules3.equals("NO")) {
		Thread.sleep(500);
		System.out.println("Sri");
	}
	
	
	else {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules3+"']")));
		driver .findElement(By.xpath("//span[@title='"+modules3+"']")).click();
		
	}
	
	if(modules4.equals("NO")) {
		Thread.sleep(500);
		System.out.println("Sri");
	}
	
	else {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules4+"']")));
		driver .findElement(By.xpath("//span[@title='"+modules4+"']")).click();
		
	}	
	
	if(modules5.equals("NO")) {
		Thread.sleep(500);
		System.out.println("Sri");
	}
	
	else {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules5+"']")));
		driver .findElement(By.xpath("//span[@title='"+modules5+"']")).click();
		
	}
	
	if(modules6.equals("NO")) {
		Thread.sleep(500);
		System.out.println("Sri");
	}
	
	else {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules6+"']")));
		driver .findElement(By.xpath("//span[@title='"+modules6+"']")).click();
		
	}
	
	
	if(modules7.equals("NO")) {
		Thread.sleep(500);
		System.out.println("Sri");
	}
	
	else {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules7+"']")));
		driver .findElement(By.xpath("//span[@title='"+modules7+"']")).click();
		
	}
	
	if(modules8.equals("NO")) {
		Thread.sleep(500);
		System.out.println("Sri");
	}
	
	else {
		Thread.sleep(500);
		js.executeScript("arguments[0].scrollIntoView();", driver .findElement(By.xpath("//span[@title='"+modules8+"']")));
		driver .findElement(By.xpath("//span[@title='"+modules8+"']")).click();
		
	}
	Thread.sleep(500);
	
	
	defaultmodule.click();
	Thread.sleep(500);
	driver .findElement(By.xpath("//li[normalize-space()='"+deafultmodule+"']")).click();
	Thread.sleep(500);
	regnumber.click();
	Thread.sleep(500);
	regnumber.sendKeys(RegistrationNO);
	Thread.sleep(500);
	
	js.executeScript("arguments[0].scrollIntoView();", Usercredential);
	Usercredential.click();
	Thread.sleep(500);
	Password.clear();
	Thread.sleep(500);
	Password.sendKeys(Passsword);
	Thread.sleep(500);
	confirmpassword.clear();
	Thread.sleep(500);
	confirmpassword.sendKeys(Passsword);
	Thread.sleep(500);
	driver .findElement(By.xpath("//button[@id='save']")).click();
	Thread.sleep(2000);

	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	
	
	
}


public void tariffSetting(String FirstName) throws InterruptedException {
	
	
	
	Thread.sleep(2000);
	Hamberger.click();
	Thread.sleep(500);
    driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//i[@class='ki ki-cog']")).click();
    Thread.sleep(1000);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", RCM);
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
	driver.findElement(By.xpath("//li[normalize-space()='Consultation']")).click();
	Thread.sleep(1000); 
	baseCAt.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//app-list-item[@id='droplistkey0']//li[contains(text(),'Consultation')]")).click();
	Thread.sleep(1000); 
	ServiceCAt.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//li[normalize-space()='Encounter']")).click();
	Thread.sleep(1000); 
	Servicename.click();
	Thread.sleep(1000); 
	Servicename.sendKeys("encounter");
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//li[normalize-space()='Encounter']")).click();
	Thread.sleep(1000); 
	Coverage.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//li[normalize-space()='Inclusion']")).click();
	Thread.sleep(1000); 
	Provider.click();
	Thread.sleep(1000);
	ProviderName.click();
	Thread.sleep(1000);
	ProviderName.sendKeys(FirstName);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+FirstName+"')])[1]")).click();
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
	js.executeScript("arguments[0].scrollIntoView();", withoutvat);
	Thread.sleep(1000); 
	tariffBaseCharge.click();
	Thread.sleep(1000); 
	tariffBaseCharge.sendKeys("245");
	Thread.sleep(1000); 
	tariffcontractCharge.click();
	Thread.sleep(1000); 
	tariffcontractCharge.sendKeys("245");
	Thread.sleep(1000); 
	ADJpercent.click();
	Thread.sleep(1000); 
	ADJpercent.sendKeys("10.5");
	Thread.sleep(1000); 
	SponsorAmount.click();
	Thread.sleep(1000); 
	SponsorAmount.sendKeys("219.28");
	Thread.sleep(1000); 
	withoutvat.click();
	Thread.sleep(1000); 
	withoutvat.sendKeys("219.28");
	Thread.sleep(1000); 


//	JavascriptExecutor js= (JavascriptExecutor) driver;
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


public void ScheduleSetting(String FirstName,String allowedSites) throws InterruptedException, AWTException {
	

	Thread.sleep(2000); 
	Hamberger.click();
	Thread.sleep(1000);   
	Resource.click();
	Thread.sleep(1000);   
	ScheduleSetting.click();
	Thread.sleep(1000);   
	Category.click();
	Thread.sleep(1000);   
	driver.findElement(By.xpath("//li[normalize-space()='Doctor']")).click();
	Thread.sleep(1000);   
	Name.click();
	Thread.sleep(1000);   
	Name.sendKeys(FirstName);
	Thread.sleep(1000);   
	driver.findElement(By.xpath("(//*[contains(text(),'"+FirstName+"')])[1]")).click();
	Thread.sleep(1000);   
	Site.click();
	Thread.sleep(1000);   
	driver.findElement(By.xpath("//li[normalize-space()='"+allowedSites+"']")).click();
	Thread.sleep(1000);   
	Session.click();
	Thread.sleep(1000);   
	driver.findElement(By.xpath("//li[normalize-space()='Whole Day']")).click();
	Thread.sleep(1000);
	Robot r=new Robot();
	FromTym.click();
	Thread.sleep(1000);
	for (int i = 0; i <=4; i++) {	

		r.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(600);

	}
	
	
	FromTym.sendKeys("00 00" + Keys.HOME);
	Thread.sleep(1000);   
	ToTym.click();
	Thread.sleep(1000); 
	for (int i = 0; i <=4; i++) {	

		r.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(200);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(600);

	}
	
	ToTym.sendKeys("22 00"+Keys.HOME);
	Thread.sleep(1000);   
	driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
	Thread.sleep(1000);  
	ScheduleSetingSave.click();
	Thread.sleep(2000); 
	Robot t=new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	
	
	
}

public void Billing(String FirstName,String provider,String MRNO) throws InterruptedException {

Thread.sleep(3000);
Hamberger.click();
Thread.sleep(600);
driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
Thread.sleep(500);

PAS.click();
Thread.sleep(600);
List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

if(dynamicElement1.size() !=0)
{
	driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
}


else {
	System.out.println("sri");
}

Thread.sleep(600);
Registration.click();


Thread.sleep(1000);
List<WebElement> dynamicElement01=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

if(dynamicElement01.size() !=0)
{
	driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
}


else {
	System.out.println("sri");
}

Thread.sleep(1500);



SearchField.click();
Thread.sleep(1000);
SearchField.sendKeys(MRNO , Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
Thread.sleep(2000);
clear.click();
Thread.sleep(1000);
printuncheck.click();
Thread.sleep(1000);
providerName.click();
Thread.sleep(1000);
providerName.sendKeys(FirstName);
Thread.sleep(1000);
driver.findElement(By.xpath("//*[contains(text(),'"+FirstName+"')]")).click();
Thread.sleep(1000);
EncounterAdd.click();
Thread.sleep(1000);
EncounterSave.click();
Thread.sleep(2000);
SAvesuccess.click();
Thread.sleep(3000);

}


}
