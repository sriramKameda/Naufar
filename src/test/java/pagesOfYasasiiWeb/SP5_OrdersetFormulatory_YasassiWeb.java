package pagesOfYasasiiWeb;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_OrdersetFormulatory_YasassiWeb  extends  PageFactoryInitYasasiiWeb {
	public SP5_OrdersetFormulatory_YasassiWeb (WebDriver driver) {
		super(driver);
	}



	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement search;

	//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement hamberger;

	@FindBy(xpath="//a[@class='sidebar-link no-hover ng-star-inserted']//span[contains(text(),'EMR')]")
	public WebElement EMR;

	@FindBy(xpath="//span[normalize-space()='Order Set']")
	public WebElement Orderset;

	@FindBy(xpath="//input[@id='name']")
	public WebElement OrdersetNAme;

	@FindBy(xpath="//button[normalize-space()='Add Order']")
	public WebElement AddOrder;

	@FindBy(xpath="//input[@id='displaytext']")
	public WebElement medicineName;

	@FindBy(xpath="//textarea[@id='description']")
	public WebElement comments;

	@FindBy(xpath="//button[@title='Add Recommend Dose Here']")
	public WebElement RecommendDose;

	@FindBy(xpath="//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath="//button[@id='updatePharmacy']")
	public WebElement recomAdd;

	@FindBy(xpath="//button[@class='btn btn-dark-green active mob-mb5']")
	public WebElement Add;


	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement Save;

	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;

	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement master;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")
	public WebElement pharmacy;

	@FindBy(xpath="//span[normalize-space()='Formulary Master']")
	public WebElement formulatorymaster;

	@FindBy(xpath="//tr[contains(@class,'ng-star-inserted')]//i[contains(@class,'ki ki-file')]")
	public WebElement siteview;

	@FindBy(xpath="//button[@id='saveSite']")
	public WebElement SaveSite;

	@FindBy(xpath="//span[normalize-space()='EMR HomeScreen']")
	public WebElement Homescreen;

	@FindBy(xpath="//label[@class='icon doctornote']")
	public WebElement DoctorNote;


	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template1;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//label[normalize-space()='CPOE Orderset']")
	public WebElement cpoeOrderSet;

	@FindBy(xpath = "//div[@class='btn-pharmacy-search custom-search']//input[@placeholder='Search With Favorites']")
	public WebElement medicineSearch;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;

	@FindBy(xpath = "//button[@id='ordersetAdd']//i[@class='ki ki-plus icon-plus']")
	public WebElement AddOrderset;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-cpoe-diagnosis-list[1]/div[2]/div[2]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement DiagnosisCheckbox;


	@FindBy(xpath = "//div[@class='modal-dialog modal-md']//div[@class='modal-footer']//button[@aria-label='Close']")
	public WebElement formulatoryblockOK;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orderset-container[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement ordersetSearch;

	@FindBy(xpath = "//i[@class='ki ki-trash']")
	public WebElement delete;

	@FindBy(xpath = "//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok']")
	public WebElement yes;

	public void orderset(String ORDERNAME,String URL , String User ,String Password,String sitename, String MRNO , String medicine) throws InterruptedException {


		///orderSet
		Thread.sleep(2000);
		hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		Orderset.click();
		Thread.sleep(1000);
		OrdersetNAme.click();
		Thread.sleep(1000);
		OrdersetNAme.sendKeys(ORDERNAME);
		Thread.sleep(1000);
		AddOrder.click();
		Thread.sleep(1000);
		medicineName.click();
		Thread.sleep(1000);
		medicineName.sendKeys(medicine , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-orderset-container[1]/div[2]/div[2]/div[1]/app-orderset-add[1]/div[1]/div[2]/div[4]/div[1]/ki-input-control[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		comments.sendKeys("ok");
		Thread.sleep(1000);
		RecommendDose.click();
		Thread.sleep(1000);
		Frequency.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		Thread.sleep(1000);
		recomAdd.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(2000);

		//master formulatory

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
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+sitename+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+sitename+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		hamberger.click();
		Thread.sleep(1000);
		master.click();
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", pharmacy);
		Thread.sleep(1000);
		pharmacy.click();
		Thread.sleep(1000);
		formulatorymaster.click();
		Thread.sleep(1000);
		search.click();
		Thread.sleep(1000);
		search.sendKeys(medicine, Keys.ENTER);
		Thread.sleep(1000);//Combitide 125Mcg Inhaler
		siteview.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-site-view[1]/form[1]/div[1]/table[1]/tbody[1]/tr[11]/td[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		SaveSite.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);
		int n =driver.getWindowHandles().size();
		Thread.sleep(1000);
		System.out.println("window handles no."+ n);
		int m= n-2;
		Thread.sleep(1000);
		System.out.println("go to window no."+ m);
		Thread.sleep(2000);
		Thread.sleep(1000);
		driver.switchTo().window(tabs.get(m));
		Thread.sleep(3000);

		////doctornote
		driver.findElement(By.xpath("//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")).click();
		Thread.sleep(1000);
		Homescreen.click();
		
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(1000);
		search.sendKeys(MRNO ,Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 
		cheifComplaint.clear();
		Thread.sleep(800); 
		cheifComplaint.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Template1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		tempOk.click();
		Thread.sleep(1000);
		diagnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);
		

		Thread.sleep(1000); 
		cpoeOrderSet.click();
		Thread.sleep(1000);
		medicineSearch.click();
		Thread.sleep(1000);
		medicineSearch.sendKeys(ORDERNAME, Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ORDERNAME+"')])[1]")).click();
		Thread.sleep(1000);
		AddOrderset.click();
		Thread.sleep(1000);
		DiagnosisCheckbox.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//modal-container[@role='dialog']//button[1]")).click();
		Thread.sleep(3000);
		formulatoryblockOK.click();
		Thread.sleep(2000);
		///orderSet
		hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		Orderset.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok']")).click();
		Thread.sleep(1000);
		ordersetSearch.click();
		Thread.sleep(1000);
		ordersetSearch.sendKeys(ORDERNAME , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ORDERNAME+"')])[1]")).click();
		Thread.sleep(1000);
		delete.click();
		Thread.sleep(1000);
		yes.click();
		Thread.sleep(1000);

		int k=n-1;
		driver.switchTo().window(tabs.get(k));
		Thread.sleep(2000);
		siteview.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/app-site-view[1]/form[1]/div[1]/table[1]/tbody[1]/tr[11]/td[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		SaveSite.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(1000);

	}






}
