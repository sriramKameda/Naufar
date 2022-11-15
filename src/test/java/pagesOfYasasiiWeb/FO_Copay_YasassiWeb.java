package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class FO_Copay_YasassiWeb  extends PageFactoryInitYasasiiWeb{
	
	public FO_Copay_YasassiWeb(WebDriver driver) {
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
	
	@FindBy(xpath = "//i[@title='Add']")
	public WebElement docAdd;
	
	@FindBy(xpath = "//span[normalize-space()='Insurance And Other Information']")
	public WebElement Insurance;
	
	@FindBy(xpath = "//ki-select-control[@formcontrolname='insurancecorporateid']//input[@id='undefined']")
	public WebElement Inscorp;
	
	@FindBy(xpath = "//ki-select-control[@formcontrolname='schemeid']//input[@id='undefined']")
	public WebElement PlanName;
	
	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;
	
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
	
	@FindBy(xpath = "//label[contains(@title,'Add')]")
	public WebElement addEncounter;
	
	@FindBy(xpath = "//i[@title='Expand All']")
	public WebElement ExpandGrid;
	
	@FindBy(xpath = "//span[@class='pay-style']")
	public WebElement payment;
	
	@FindBy(xpath = "//app-billing-card//div[2]//div[1]//div[2]//div[1]//div[1]//div[1]//div[4]//div[1]//i[1]")
	public WebElement GPtaxView;
	
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[1]//div[1]//div[1]//div[4]//div[1]//i[1]")
	public WebElement twoyearTaxView;
	
	@FindBy(xpath = "//button[@id='billingsave']")//button[@id='billingsave']
	public WebElement saveBilling;
	
	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement RefNo;
	
	@FindBy(xpath = "//input[@id='refno']")
	public WebElement number;
	
	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	public WebElement fromDate;
	
	@FindBy(xpath = "//ki-calendar[@formcontrolname='validto']//input[@type='text']")
	public WebElement ToDate;
	
	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement AddLetter;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary sm active')][normalize-space()='OK']")
	public WebElement letterOk;
	
	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement TransactionOK;
	
	@FindBy(xpath = "//input[@id='IdentifyingDocs']")
	public WebElement idDocs;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[2]/accordion[1]/accordion-group[4]/div[1]/div[2]/div[1]/app-insurance[1]/form[1]/div[4]/div[2]/ki-calender-time-military[1]/div[1]/input[1]")
	public WebElement validto;
	
	@FindBy(xpath = "//i[@class='ki ki-user-referral']")
	public WebElement Referenceletterview;
	
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Patient Info']")
	public WebElement patientInfo;
	
	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement edit;
	
	@FindBy(xpath = "//div[@class='ng-star-inserted']//i[@class='ki ki-pencil']")
	public WebElement SchemeEdit;
	
	@FindBy(xpath = "//button[@id='updateregistrationbutton']")
	public WebElement update;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement search;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Billing;
	
	@FindBy(xpath = "//div[@title='Berkshire Hathaway/Berkshire Platinum']")
	public WebElement Scheme;
	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;
	
	@FindBy(xpath = "//li[9]//a[1]//span[1]")
	public WebElement ADT;
	
	@FindBy(xpath = "//span[normalize-space()='Stay Pass']")
	public WebElement Staypass;
	
	@FindBy(xpath = "//label[@class='adv-search-mrn0']//i[@title='Advanced Search']")
	public WebElement AdvanceSearch;
	
	
	@FindBy(xpath = "/html[1]/body[1]/modal-container[2]/div[1]/div[1]/div[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[3]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement AdvNOSearch;


	@FindBy(xpath = "//div[@class='col-md-12 col-11 plt-prt-5']//i[@class='ki ki-search']")
	public WebElement SearchIcon;
	
	@FindBy(xpath = "//button[@id='staypassprint']//i[@class='ki ki-print']")
	public WebElement Print;
	
    @FindBy(xpath = "//tbody/tr[1]/td[9]/i[1]")
	public WebElement currentpassprint;
	
    @FindBy(xpath = "//button[@class='btn btn-danger sm clear'][normalize-space()='Clear']")
	public WebElement Clear;

    @FindBy(xpath = "//button[normalize-space()='Close']//i[@class='ki ki-close-circle']")
  	public WebElement close;
	
    @FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
  	public WebElement adt;
	

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


  
   
   
   
   
 
   
   
   
   
   
   
	
	
	
	
	public void insuranceCopay(String NAME, String AGE, String MBLNO , String ORGANISATION , String ADDRESS  ,String AADHAAR ,String PROVIDER , String REFNO , String MRNO) throws AWTException, InterruptedException, IOException {
		Thread.sleep(2000);
		Title.click();
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		FirstName.click();
		FirstName.sendKeys(NAME);
		age.click();
		age.sendKeys(AGE);
		mobileNo.click();
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		
List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));
		
		if(dynamicElement.size() !=0)
		{
			System.out.println("sri");
		}

		
		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}
		
		Organisation.click();
		Organisation.sendKeys(ORGANISATION);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		aadharNo.click();
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		aadharNo.sendKeys( AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);
		Insurance.click();
		Thread.sleep(1000);
		Inscorp.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Berkshire Hathaway[Corp]']")).click();
		Thread.sleep(1000);
		PlanName.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Berkshire Platinum']")).click();
		Thread.sleep(1000);
		validto.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[normalize-space()='30']")).click();
		Thread.sleep(1000);
		Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(800);
	
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(800);
		
		insAdd.click();
		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
      	Thread.sleep(1000);
		SaveSuccess.click();
		
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

	/*	String word[]=mrno.split("[ :] ");
		System.out.println("number of words: "+word.length);
		for(int i=0;i<word.length;i++)
		{
			System.out.println("word["+i+"]="+word[i]);
		}
		System.out.println(word[1]);  */

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(43);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(8).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);
		
		
	}
	
	public void referenceLetter(String NAME, String AGE, String MBLNO , String ORGANISATION , String ADDRESS  ,String AADHAAR ,String PROVIDER , String REFNO , String MRNO, String ADTprovider,String REFNOIP) throws InterruptedException, AWTException {
		
		
		
		//Encounter
		Thread.sleep(3000);
		providerName.click();
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'" + PROVIDER + "')]")).click();
		Thread.sleep(2000);
		addEncounter.click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Two Years Registration']")));
		Thread.sleep(1000);
		ExpandGrid.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",twoyearTaxView);
		Thread.sleep(2000);
		act.moveToElement(GPtaxView).build().perform();
		Thread.sleep(5000);
		js.executeScript("arguments[0].scrollIntoView();",payment);
		Thread.sleep(1000);
		//js.executeScript("arguments[0].scrollIntoView();",twoyearTaxView);
		act.moveToElement(twoyearTaxView).build().perform();
		Thread.sleep(5000);
		
		
    	//Reference letter
		RefNo.click();
		Thread.sleep(1000);
		number.sendKeys(REFNO);
		//Robot r=new Robot();
		fromDate.click();
		Thread.sleep(1000); 
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		ToDate.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		AddLetter.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(@class,'check-container zero-bottom')]//span[contains(@class,'checkmark')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'check-container zero-bottom')]//span[contains(@class,'checkmark')]")).click();
		
		letterOk.click();
		Thread.sleep(1000);
		saveBilling.click();
		Thread.sleep(3000);
		TransactionOK.click();
		Thread.sleep(2000);
		Referenceletterview.click();
		Thread.sleep(3000);
		
		
		////IP reference letter
		
		adt.click();
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
		driver.findElement(By.xpath("(//*[contains(text(),'Super4K-Room')])")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		/*	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element = driver.findElement(By.xpath("//ul[@id='check']"));

		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}*/

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
		//SelectBed.click();
		driver.findElement(By.xpath("//button[@class='btn-feedback']")).click();
		
		Thread.sleep(1000);
		number.sendKeys(REFNOIP);
		//Robot r=new Robot();
		fromDate.click();
		Thread.sleep(1000); 
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		ToDate.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(800);	
		AddLetter.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[contains(@class,'check-container zero-bottom')]//span[contains(@class,'checkmark')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(@class,'check-container zero-bottom')]//span[contains(@class,'checkmark')]")).click();
		Thread.sleep(2000);
		letterOk.click();
		Thread.sleep(1000);
		SAve.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(2000);
		//Billing.click();
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/label[1]/i[1]")).click();
		Thread.sleep(2000);
		Referenceletterview.click();
		Thread.sleep(3000);
		
		
    	//Scheme renewal
		
		patientInfo.click();
		Thread.sleep(1000);
		edit.click();
		Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", Insurance);
		Insurance.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",Scheme);
		Thread.sleep(1000);
		Scheme.click();
		Thread.sleep(1000);
		SchemeEdit.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",validto);
		validto.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_UP);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
	 	Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);
		insAdd.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",Scheme);
		Thread.sleep(1000);
		Scheme.click();
		Thread.sleep(1000);
		SchemeEdit.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();",validto);
		validto.click();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_RIGHT);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_RIGHT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(800);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(1000);
		insAdd.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();",Scheme);
		Thread.sleep(1000);
		Scheme.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);

		
		///////StayPass
		
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		ADT.click();
		Thread.sleep(1000);
		Staypass.click();
		Thread.sleep(1000);
		AdvanceSearch.click();
		Thread.sleep(1000);
		AdvNOSearch.click();
		Thread.sleep(1000);
		AdvNOSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		Print.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);
		
		///PREVIOUS WINDOW
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("go to window no."+ m);
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(m));
		Thread.sleep(1000);
		
		
		currentpassprint.click();
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
	
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		int Y =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ Y);
		int Z= n-2;
		Thread.sleep(1000);
		System.out.println("go to window no."+ Z);
		Thread.sleep(2000);
		driver.switchTo().window(tabs1.get(Z));
		
		
		Thread.sleep(1000);
		Clear.click();
		Thread.sleep(1000);
		close.click();
		Thread.sleep(1000);
		
		
		
	}
	
	
	
	

}