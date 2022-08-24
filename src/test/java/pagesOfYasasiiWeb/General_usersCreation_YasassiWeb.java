package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class General_usersCreation_YasassiWeb extends PageFactoryInitYasasiiWeb {
	
	public General_usersCreation_YasassiWeb(WebDriver driver) {

		super(driver);

}

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Menutoggle;
	
	@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-user-privilege-fill']")
	public WebElement Security;
	
	@FindBy(xpath = "//span[normalize-space()='User Creation']")
	public WebElement userCreation;
	
	@FindBy(xpath = "//input[@id='title']")
	public WebElement Title;
	
	@FindBy(xpath = "//li[normalize-space()='Dr']")
	public WebElement SelectTitle;
	
	@FindBy(xpath = "//input[@id='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement LastName;
	
	@FindBy(xpath = "//input[@id='gender']")
	public WebElement gender;
	
	@FindBy(xpath = "//li[normalize-space()='Female']")
	public WebElement SelectGender;
	
	@FindBy(xpath = "//input[@id='phoneno']")
	public WebElement EnterPhoneno;
	
	@FindBy(xpath = "//input[@id='empid']")
	public WebElement UserId;
	
	@FindBy(xpath = "//ki-calendar[@id='doj']//input[@type='text']")
	public WebElement DOJ;
	
	@FindBy(xpath = "//span[@class='owl-dt-calendar-cell-content'][normalize-space()='1']")
	public WebElement selectDOJ;
	
	@FindBy(xpath = "//input[@id='usertypeid']")
	public WebElement UserType;
	
	@FindBy(xpath = "//li[normalize-space()='Doctor']")
	public WebElement SelectUserType;
	
	@FindBy(xpath = "//input[@id='deptname']")
	public WebElement Department;
	
	@FindBy(xpath = "//li[normalize-space()='Cardiology']")
	public WebElement SelectDept;
	
	@FindBy(xpath = "//input[@id='designation']")
	public WebElement Designation;
	
	
	
	@FindBy(xpath = "//input[@id='site']")
	public WebElement AllowedSite;
	
	@FindBy(xpath = "//input[@id='userprofileid']")
	public WebElement userProfile;
	
	@FindBy(xpath = "//button[@title='Add to grid']//i[@class='ki ki-plus']")
	public WebElement add;
	
	@FindBy(xpath = "//span[normalize-space()='User Credentials']")
	public WebElement usercred;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath = "//input[@id='cpassword']")
	public WebElement confirmpassword;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-userregister[1]/div[2]/form[1]/div[1]/div[1]/div[2]/accordion[1]/accordion-group[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/i[1]")
	public WebElement eye;
	
	@FindBy(xpath = "//span[normalize-space()='User Information']")
	public WebElement userinfo;
	
	@FindBy(xpath = "//button[@id='save']")
	public WebElement save;
	
	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement modules;
	
	
	
	public void UserCreation(String firstname ,String userid,String pssword, String Phone, String Dept,String desig,String site,String userProf,String usertype) throws InterruptedException, AWTException
	{
		
		
		Thread.sleep(2000);
		Menutoggle.click();
		Thread.sleep(1000);
		Security.click();
		Thread.sleep(1000);
		userCreation.click();
		Thread.sleep(1000);
	Title.click();
		Thread.sleep(500);
		SelectTitle.click();
		Thread.sleep(500);
		firstName.sendKeys(firstname);
		Thread.sleep(500);
		//LastName.sendKeys("murugan");
		Thread.sleep(500);
		gender.click();
		
		Thread.sleep(500);
		SelectGender.click();
		Thread.sleep(500);
		EnterPhoneno.sendKeys(Phone);
		Thread.sleep(500);
		UserId.sendKeys(userid);
		Thread.sleep(500);
		DOJ.click();
		Thread.sleep(1200);
		
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1200);	
		
		//selectDOJ.click();
		UserType.click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//*[contains(text(),"+usertype+")])")).click();
		//SelectUserType.click();
		Thread.sleep(500);
		Department.sendKeys(Dept);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),"+Dept+")])")).click();
		//SelectDept.click();
		Thread.sleep(500);
		Designation.click();
		Thread.sleep(500);
		Designation.sendKeys(desig);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),"+desig+")])")).click();
		Thread.sleep(500);
		AllowedSite.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),"+site+")])")).click();
		Thread.sleep(500);
		//li[normalize-space()='Kameda Medical Center']
		userProfile.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),"+userProf+")])")).click();
		Thread.sleep(500);
		add.click();
		Thread.sleep(500);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", usercred);
		Thread.sleep(500);
		password.click();
		Thread.sleep(500);
		password.sendKeys(pssword);
		Thread.sleep(500);
		confirmpassword.click();
		Thread.sleep(500);
		confirmpassword.sendKeys(pssword);
		Thread.sleep(500);
		eye.click();
		Thread.sleep(500);
		userinfo.click();
		Thread.sleep(500);
		save.click();
		Thread.sleep(500);
		Menutoggle.click();
		Thread.sleep(500);
		modules.click();
		Thread.sleep(500);
		Menutoggle.click();
		Thread.sleep(500);
	}
	
	
	
	
	
	
	
	
	
}
