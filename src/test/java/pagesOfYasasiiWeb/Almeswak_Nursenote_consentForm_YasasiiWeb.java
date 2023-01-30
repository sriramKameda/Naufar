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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Almeswak_Nursenote_consentForm_YasasiiWeb   extends PageFactoryInitYasasiiWeb {

	public Almeswak_Nursenote_consentForm_YasasiiWeb(WebDriver driver) {
		super(driver);
	}  

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath="//input[@id='searchtext']") 
	public WebElement SearchField;

	@FindBy(xpath="//span[normalize-space()='EMR HomeScreen']")
	public WebElement EMRhomescreen;

	@FindBy(xpath="//label[@class='icon nursenote']")
	public WebElement nursenote;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[4]/label[2]/span[1]")
	public WebElement Illness;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[3]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement IllnessDesc;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[4]/div[2]/div[4]/label[2]")
	public WebElement Allergy;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[4]/div[3]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Allergydesc;

	@FindBy(xpath="(//span[@class='editable'][normalize-space()='Yes'])[15]")
	public WebElement SomeoneHelp;

	@FindBy(xpath="//div[@id='HTF1100263']//span[@class='editable'][normalize-space()='Yes']")
	public WebElement nursingCare;
 
	@FindBy(xpath="//input[@id='chiefcomplainttext']")
	public WebElement Cheifcomplaint;


	@FindBy(xpath="(//span[@class='editable'][normalize-space()='Yes'])[19]")
	public WebElement unsafe;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/div[1]/label[9]")
	public WebElement painAssesment;

	@FindBy(xpath="(//span[@class='editable'][normalize-space()='Yes'])[16]")
	public WebElement kicked;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/label[1]/span[1]")
	public WebElement ImmediateCare;


	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/label[2]/span[1]")
	public WebElement treatment;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/div[4]/div[2]/div[2]/div[3]/div[4]/label[1]/span[1]")
	public WebElement NeedsYes;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/div[4]/div[2]/div[5]/div[2]/div[4]/label[1]/span[2]")
	public WebElement FollowupConsultation;

	@FindBy(xpath="//label[@class='icon emrsave']")
	public WebElement emrsave;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]")
	public WebElement vitalSigns;

	@FindBy(xpath="//input[@id='vital000']")
	public WebElement Height;


	@FindBy(xpath="//input[@id='vital010']")
	public WebElement Weight;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]/span[2]")
	public WebElement note;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]/span[2]")
	public WebElement NursenoteLog;

	@FindBy(xpath="//i[@class='fa fa-pencil']")
	public WebElement EditNote;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[3]/div[2]/div[4]/label[2]/span[1]")
	public WebElement infectiousDisease;


	@FindBy(xpath="//i[contains(@class,'ki ki-file-fill')]")
	public WebElement LOg;

	@FindBy(xpath="//i[@class='ki ki-print']")
	public WebElement print;

	@FindBy(xpath="//label[@title='Close']//i[@class='ki ki-close']")
	public WebElement close;


	@FindBy(xpath="//label[contains(@class,'icon discharesum')]")
	public WebElement visitSummary;

	@FindBy(xpath="//input[@id='undefined']")
	public WebElement status;

	@FindBy(xpath="//input[@id='template']")
	public WebElement Template;

	@FindBy(xpath="//li[normalize-space()='Filler Consent Form (English)']")
	public WebElement FillerConsent;

	@FindBy(xpath="//span[contains(@class,'opensignature icon-btn btn-dark-green')]//i[contains(@class,'ki ki-plus')]")
	public WebElement SignatureAdd;

	@FindBy(xpath="//canvas[contains(@class,'upper-canvas')]")
	public WebElement Signature;

	@FindBy(xpath="//span[@class='btn btn-primary sm active']")
	public WebElement signSave;

	@FindBy(xpath="//button[@id='addbtn']")
	public WebElement Add;

	@FindBy(xpath="//i[contains(@class,'ki ki-plus-circle')]")
	public WebElement Addconsent;

	@FindBy(xpath="//i[@class='ki ki-notes']")
	public WebElement viewconsent;

	@FindBy(xpath="//button[normalize-space()='Print']")
	public WebElement ConsentPrint;

	@FindBy(xpath="//button[contains(@class,'btn btn-red sm clear')]//i[contains(@class,'ki ki-close-circle')]")
	public WebElement Close;

	@FindBy(xpath="//i[contains(@class,'ki ki-pencil')]")
	public WebElement EditConsant;

	@FindBy(xpath="//button[normalize-space()='Log']")
	public WebElement ConsentLOg;

	@FindBy(xpath="//button[normalize-space()='Save']")
	public WebElement ConsentSave;

	@FindBy(xpath="//i[@class='ki ki-trash']")
	public WebElement delete;
	
	@FindBy(xpath="//div[contains(text(),'Physical examination')]")
	public WebElement dentalchart;
	
	@FindBy(xpath="//input[@id='emrtemplateid']")
	public WebElement template;
	
	@FindBy(xpath="//input[@id='maincategory']")
	public WebElement MainCategory;
	
	

	@FindBy(xpath="/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[2]/div[1]/div/div/div[1]/div/div/app-custum-template/div/form/div[1]/div/div[4]/div[2]/div[2]/div[2]/div[4]/label[2]/span[1]")
	public WebElement chronic;
	

	@FindBy(xpath="/html/body/app-root/app-layout/main/app-emr-homescreen/div[2]/div/div[1]/app-emrtemplateloader/div[1]/div/div[2]/div[2]/div[1]/div/div/div[1]/div/div/app-custum-template/div/form/div[1]/div/div[4]/div[2]/div[3]/div[2]/div[4]/label[2]/span[1]")
	public WebElement infectious;
	

	@FindBy(xpath="(//span[@class='checkmark'])[35]")
	public WebElement PainAsses;
	

//	@FindBy(xpath="//i[@class='ki ki-trash']")
	//public WebElement delete;
	
	
	
	
	
	
	
	

public void PatientSelect(String MRNO) throws InterruptedException {
	
        	
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		Thread.sleep(600);
		
		MainCategory.click();
		Thread.sleep(800); 
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(800);
		//Selecting the patient
		SearchField.click();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//i[@class='dashboard-lock-arrow ki ki-chevron-up']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//i[@title='Lock/Unlock']")).click();
		Thread.sleep(1000);
		
		
}
		
		public void nursenote() throws InterruptedException, AWTException {
		
		nursenote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(2000);
		Cheifcomplaint.clear();
		Thread.sleep(1000);
		Cheifcomplaint.sendKeys("Toothache");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/typeahead-container[1]/button[1]/span[1]/strong[1]")).click();
		//Thread.sleep(1000);
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='PT-Nursing Assesment']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Ok'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		///nurse assesement
		
		
		chronic.click();
		Thread.sleep(1000);
		infectious.click();
		Thread.sleep(1000);
		Illness.click();
		Thread.sleep(1000);
		IllnessDesc.sendKeys("Gum Disease. Gum disease, also referred to as gingivitis or periodontal disease, is a bacterial infection caused by the accumulation of plaque in your mouth. ...\r\n"
				+ "");
		Thread.sleep(1000);
		Allergy.click();
		Thread.sleep(1000);
		Allergydesc.click();
		Thread.sleep(1000);
		Allergydesc.sendKeys("alloys, followed by rubber materials, polymers and acrylates");
		Thread.sleep(1000);
		PainAsses.click();
		Thread.sleep(1000);
		SomeoneHelp.click(); 
		Thread.sleep(1000);
		nursingCare.click();
		Thread.sleep(1000);
		unsafe.click();
		Thread.sleep(1000);
		kicked.click();
		Thread.sleep(1000);
		ImmediateCare.click();
		Thread.sleep(1000);
		treatment.click();
		Thread.sleep(1000);
		NeedsYes.click();
		Thread.sleep(1000);
		FollowupConsultation.click();
		Thread.sleep(1000);
				
		
		
		dentalchart.click();
		Thread.sleep(1000);
		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(driver.findElement(By.cssSelector(".upper-canvas"))) //start points x axis and y axis. 
				
				.moveByOffset(-100,0)
				
				.clickAndHold()
				.moveByOffset(-50,0) // 2nd points (x1,y1)
				.moveByOffset(20, 50)// 3rd points (x2,y2)
				.moveByOffset(30,0) // 2nd points (x1,y1)
				.moveByOffset(0,-50)// 3rd points (x2,y
				.moveByOffset(25,30)
				.moveByOffset(45,0)
				.moveByOffset(0,-50)
				.moveByOffset(20,30)
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(6000);

		

		///vital signs
		vitalSigns.click();
		Thread.sleep(1000);
		Height.clear();
		Thread.sleep(1000);
		Height.sendKeys("184");
		Thread.sleep(1000);
		Weight.clear();
		Thread.sleep(1000);
		Weight.sendKeys("102.5");
		Thread.sleep(1000);

		
        emrsave.click();
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]/span[2]")));
		Thread.sleep(3000);
		note.click();
		Thread.sleep(1000);
		NursenoteLog.click();
		Thread.sleep(1000);
		EditNote.click();
		Thread.sleep(1000);
		infectiousDisease.click();
		Thread.sleep(1000);
		emrsave.click();
		Thread.sleep(3000);
		note.click();
		Thread.sleep(1000);
		NursenoteLog.click();
		Thread.sleep(1000);
		LOg.click();
		Thread.sleep(1000);
		print.click();
		Thread.sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);

		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);

		Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);

		Thread.sleep(2000);

		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);


		Thread.sleep(1000);
		close.click();
		Thread.sleep(2000);
	}
		
		////////////////Visit Summary
		
public void consentForm() throws AWTException, InterruptedException	{	
		
		
		driver.findElement(By.xpath("//label[@class='icon refresh']")).click();
		Thread.sleep(2000);

		visitSummary.click();
		Thread.sleep(1000);

		status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Consent Form']")).click();
		Thread.sleep(1000);
		Addconsent.click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		FillerConsent.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[21]/div[1]/div[4]/img[1]")));

		Thread.sleep(1000);
		SignatureAdd.click();
		Thread.sleep(1000);
		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(driver.findElement(By.cssSelector(".upper-canvas"))) //start points x axis and y axis. 
				.clickAndHold()
				.moveByOffset(-50, 60) // 2nd points (x1,y1)
				.moveByOffset(-60, -70)// 3rd points (x2,y2)
				.moveByOffset(-80, 60) // 2nd points (x1,y1)
				.moveByOffset(-60, -70)// 3rd points (x2,y
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(6000);


		signSave.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
		viewconsent.click();
		Thread.sleep(1000);
		ConsentPrint.click();
		Thread.sleep(3000);

        Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		Close.click();
		Thread.sleep(1000);
		EditConsant.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(1000);
	/*	ConsentLOg.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger sm clear')]")).click(); */
		Thread.sleep(1000);
		ConsentSave.click();
		Thread.sleep(1000);

	/*	ConsentLOg.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger sm clear')]")).click();
		Thread.sleep(1000);  */

		EditConsant.click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(2000);

	/*	ConsentLOg.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger sm clear')]")).click();
		Thread.sleep(1000); */

		delete.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		ConsentSave.click();
		Thread.sleep(2000);

/*		ConsentLOg.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-danger sm clear')]")).click();
		Thread.sleep(1000);

*/

	}



}
