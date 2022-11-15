package pagesOfYasasiiWeb;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Sp5_EMR_FamilyMembersYasasiiWeb extends  PageFactoryInitYasasiiWeb {
	public Sp5_EMR_FamilyMembersYasasiiWeb(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//button[@id='adddoc']//label")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[5]/div[1]/div[1]/div[1]/div[1]")
	public WebElement fm;
	
	@FindBy(xpath="//div[@class='col-md-12']//input[@id='relatedmrno']")
	public WebElement mrno;
	
	@FindBy(xpath="//input[@id='relation']")
	public WebElement relation;
	
	@FindBy(xpath="//button[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement addrelation;
	
	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;


	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;
	
	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement SearchField;
	
	@FindBy(xpath="//label[@class='icon doctornote']")
	public WebElement docnote;
	
	@FindBy(xpath="//input[@id='chiefcomplainttext']")
	public WebElement reasonvisit;
	@FindBy(xpath="//input[@id='emrtemplateid']")
	public WebElement template;
    @FindBy(xpath="//button[@aria-label='Ok'][normalize-space()='OK']")
    public WebElement OK;
   @FindBy(xpath="//label[@class='icon familymenbers']")
   public WebElement family;
	

	




	public void familyM(String NAME , String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO,String FM1,String FM2,String FM3,String FM4,String FM5,String PROVIDER) throws InterruptedException, IOException {


		Thread.sleep(2000);
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME);
		Thread.sleep(1000);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);

		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		Thread.sleep(1000);
		
		fm.click();
		Thread.sleep(2000);
//1
		mrno.click();
		Thread.sleep(2000);
		mrno.sendKeys(FM1);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-12']//i[@title='Search']")).click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-chevron-down arrow ng-star-inserted'])[25]")));
		
		relation.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Brother']")).click();
		Thread.sleep(2000);
		addrelation.click();
		Thread.sleep(2000);
//2		
		mrno.click();
		Thread.sleep(2000);
		mrno.sendKeys(FM2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-12']//i[@title='Search']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-chevron-down arrow ng-star-inserted'])[25]")));
		relation.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Daughter']")).click();
		Thread.sleep(2000);
		addrelation.click();
		Thread.sleep(2000);
//3
		mrno.click();
		Thread.sleep(2000);
		mrno.sendKeys(FM3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-12']//i[@title='Search']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-chevron-down arrow ng-star-inserted'])[25]")));
		relation.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Daughter']")).click();
		Thread.sleep(2000);
		addrelation.click();
		Thread.sleep(2000);
//4		
		mrno.click();
		Thread.sleep(2000);
		mrno.sendKeys(FM4);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-12']//i[@title='Search']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-chevron-down arrow ng-star-inserted'])[25]")));
		relation.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Daughter']")).click();
		Thread.sleep(2000);
		addrelation.click();
		Thread.sleep(2000);
//5
		mrno.click();
		Thread.sleep(2000);
		mrno.sendKeys(FM5);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-md-12']//i[@title='Search']")).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='fa fa-chevron-down arrow ng-star-inserted'])[25]")));
		relation.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Daughter']")).click();
		Thread.sleep(2000);
		addrelation.click();
		Thread.sleep(2000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(3000);
		SaveSuccess.click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(2000);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(101);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(6).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(2000);

		//////Encounter
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();

		Thread.sleep(5000);
		EncounterAdd.click();
		WebDriverWait wait1 = new WebDriverWait(driver,30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);
	


	}

	public void emrf(String URL, String User , String Password , String site, String MRNO) throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.get(URL);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );

		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(5000);
		docnote.click();
		Thread.sleep(5000);
		reasonvisit.click();
		Thread.sleep(2000);
		reasonvisit.sendKeys("Fever");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(2000);
		template.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(2000);
		OK.click();
		Thread.sleep(2000);
		family.click();
		Thread.sleep(10000);


	}

}
