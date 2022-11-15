package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class SP5_LaboratoryService_MastersSetting_Yasasiisweb  extends  PageFactoryInitYasasiiWeb{

	  public SP5_LaboratoryService_MastersSetting_Yasasiisweb(WebDriver driver) {
              super(driver);

	}
	
	@FindBy(xpath="//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement   hamberger;

	@FindBy(xpath="//i[@class='ki ki-cog']")
	public WebElement   Master;
	
	@FindBy(xpath="//main[@class='page-body']//li[2]//a[1]//span[1]")
	public WebElement   Service;
	
	@FindBy(xpath="//span[normalize-space()='Service Master']")
	public WebElement  ServiceMaster;
	
	@FindBy(xpath="//input[@id='rootinvcatgeoryser']")
	public WebElement  categoryMaster;
	
	@FindBy(xpath="//input[@id='servicecategoryser']")
	public WebElement  Subcategory;
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement  serviceName;
	
	@FindBy(xpath="//label[normalize-space()='Profile/Panel/Package']//span[@class='checkmark']")
	public WebElement  profileCheck;
	
	@FindBy(xpath="//label[normalize-space()='POC']//span[@class='checkmark']")
	public WebElement  pOC;
	
	@FindBy(xpath="//input[@id='agefrom']")
	public WebElement  Agefrom;
	
	@FindBy(xpath="//input[@id='agefromunitid']")
	public WebElement  AgefromUnit;
	
	@FindBy(xpath="//input[@id='ageto']")
	public WebElement  Ageto;
	
	@FindBy(xpath="//input[@id='agetounitid']")
	public WebElement  AgetoUnit;
	
	@FindBy(xpath="//label[contains(text(),'Display in EMR')]")
	public WebElement  DisplayEmr;
	
	@FindBy(xpath="//input[@id='codetype']")
	public WebElement Codetype;
	
	@FindBy(xpath="//input[@id='tempcode']")
	public WebElement coDE;
	
	@FindBy(xpath="//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")
	public WebElement CPTAdd;
	
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
	
	@FindBy(xpath="//input[@id='specimenidser']")
	public WebElement specimen;
	
	@FindBy(xpath="//input[@id='containeridser']")
	public WebElement container;
	
	@FindBy(xpath="//form[@class='ng-untouched ng-dirty ng-valid']//div[@class='col-md-12 ta-r rtl-right mb15']//i[@class='ki ki-plus']")
	public WebElement specimenAdd;
	
	@FindBy(xpath="//input[@id='resulttypeid']")
	public WebElement resultType;
	
	@FindBy(xpath="//input[@id='unitser']")
	public WebElement resultUnit;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void LaboratoryService(String BaseCategory,String SubCategory,String ServiceName,String Profile ,String POC,String AgeFrom ,String AgeFromUnit,String AgeTo , String AgeToUnit , String DisplayInEmr , String CodeType , String CODE ,String InternalLab, String ExecutionCategory  ,String ResultType , String ResultUnit , String Specimen ,String Container) throws InterruptedException{
		
		Thread.sleep(2000);
		hamberger.click();
		Thread.sleep(1000);
		Master.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		categoryMaster.click();
		Thread.sleep(1000);
		categoryMaster.sendKeys(BaseCategory);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
		Thread.sleep(1000);
		//li[normalize-space()='Laboratory']
		Subcategory.click();
		Thread.sleep(1000);
		Subcategory.sendKeys(SubCategory);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text(),'"+SubCategory+"')]")).click();
		Thread.sleep(1000);
		serviceName.click();
		Thread.sleep(1000);
		serviceName.sendKeys(ServiceName);
		Thread.sleep(1000);
		
		if(Profile.equals("Yes")) {
			Thread.sleep(1000);
			profileCheck.click();
			Thread.sleep(1000);
		}
		
		else if(Profile.equals("No")) {
			Thread.sleep(1000);
			System.out.println("NO profile information");
		}
		
		
        if(POC.equals("Yes")) {
        	Thread.sleep(1000);
        pOC.click();
			
		}
		
        else if(POC.equals("No")) {
        	Thread.sleep(1000);
			System.out.println("NO pOC information");
		}
        Thread.sleep(1000);
        Agefrom.clear();
        Thread.sleep(1000);
        Agefrom.sendKeys(AgeFrom);
        Thread.sleep(1000);
        
        if(AgeFromUnit.equals("Day(s)")) {
        	Thread.sleep(1000);
        	AgefromUnit.click();
        	Thread.sleep(1000);
        	driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
        	Thread.sleep(1000);
    			
    		}
    		
            else if(AgeFromUnit.equals("Month(s)")) {
    			
            	Thread.sleep(1000);
            	AgefromUnit.click();
            	Thread.sleep(1000);
            	driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
    		}
        
      else if(AgeFromUnit.equals("Year(s)")) {
    	  Thread.sleep(1000);
            	AgefromUnit.click();
            	Thread.sleep(1000);
            	driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
    		}
        
        Thread.sleep(1000);
        
        Ageto.clear();
        Thread.sleep(1000);
        Ageto.sendKeys(AgeTo);
        Thread.sleep(1000);
        
  if(AgeToUnit.equals("Day(s)")) {
	  
	  Thread.sleep(1000);
	  AgetoUnit.click();
	  Thread.sleep(1000);
        	driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
        	Thread.sleep(1000);
    			
    		}
    		
            else if(AgeToUnit.equals("Month(s)")) {
            	Thread.sleep(1000);
            	AgetoUnit.click();
            	Thread.sleep(1000);
            	driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
            	Thread.sleep(1000);
    		}
        
      else if(AgeToUnit.equals("Year(s)")) {
    	  Thread.sleep(1000);
    	  AgetoUnit.click();
    	  Thread.sleep(1000);
            	driver.findElement(By.xpath("//li[contains(text(),'"+AgeFromUnit+"')]")).click();
    		}
  
  
  ////////////      
  
  if(DisplayInEmr.equals("No")) {
	  Thread.sleep(1000);
	  DisplayEmr.click();
	  
	   }
  else if(DisplayInEmr.equals("Yes")) {
	  Thread.sleep(1000);
	  act.moveToElement(DisplayEmr).build().perform();
	  
	  }

  Thread.sleep(1000);
  Codetype.click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//li[contains(text(),'"+CodeType+"')]")).click();
  Thread.sleep(1000);
  coDE.clear();
  Thread.sleep(1000);
  coDE.sendKeys(CODE);
  Thread.sleep(1000);
  CPTAdd.click();
  Thread.sleep(1000);
  SiteMap.click();
  Thread.sleep(1000);
  ServiceCheck.click();
  Thread.sleep(1000);
  MoveRight.click();
  Thread.sleep(1000);
  Triangle.click();
  Thread.sleep(1000);
  internalLab.click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//li[normalize-space()='"+InternalLab+"']")).click();
  Thread.sleep(1000);
  Executioncategory.click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//li[contains(text(),'"+ExecutionCategory+"')]")).click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
  Thread.sleep(1000);
  /////Specimen
  
  if(ServiceName.equals("Bicarbonate (PEPC Method)")) {
	  Thread.sleep(1000);
	  specimen.clear();
	  Thread.sleep(1000);
	  specimen.sendKeys(Specimen);
	  Thread.sleep(1000);
      driver.findElement(By.xpath("//li[contains(text(),'"+Specimen+"')]")).click();
      Thread.sleep(1000);
      container.click();
      Thread.sleep(1000);
      container.sendKeys(Container);
      Thread.sleep(1000);
      driver.findElement(By.xpath("//li[contains(text(),'"+Container+"')]")).click();
      Thread.sleep(1000);
      specimenAdd.click();
      Thread.sleep(1000);
      
      
      
      
      
      
		}
		
    else if(ServiceName.equals("Chloride (ISE Indirect)")) {
    	Thread.sleep(1000);
    	  specimen.clear();
    	  Thread.sleep(1000);
    	  specimen.sendKeys(Specimen);
    	  Thread.sleep(1000);
          driver.findElement(By.xpath("//li[contains(text(),'"+Specimen+"')]")).click();
          Thread.sleep(1000);
          container.click();
          Thread.sleep(1000);
          container.sendKeys(Container);
          Thread.sleep(1000);
          driver.findElement(By.xpath("//li[contains(text(),'"+Container+"')]")).click();
          Thread.sleep(1000);
          specimenAdd.click();
          Thread.sleep(1000);
		}
  
      else if(ServiceName.equals("Potassium (ISE Indirect)")) {
    	  Thread.sleep(1000);
    	  specimen.clear();
    	  Thread.sleep(1000);
    	  specimen.sendKeys(Specimen);
    	  Thread.sleep(1000);
          driver.findElement(By.xpath("//li[contains(text(),'"+Specimen+"')]")).click();
          Thread.sleep(1000);
          container.click();
          Thread.sleep(1000);
          container.sendKeys(Container);
          Thread.sleep(1000);
          driver.findElement(By.xpath("//li[contains(text(),'"+Container+"')]")).click();
          Thread.sleep(1000);
          specimenAdd.click();
          Thread.sleep(1000);
          
		}
  
     else if(ServiceName.equals("Sodium (ISE Indirect)")) {
    	 Thread.sleep(1000);
    	  specimen.clear();
    	  Thread.sleep(1000);
    	  specimen.sendKeys(Specimen);
    	  Thread.sleep(1000);
          driver.findElement(By.xpath("//li[contains(text(),'"+Specimen+"')]")).click();
          Thread.sleep(1000);
          container.click();
          Thread.sleep(1000);
          container.sendKeys(Container);
          Thread.sleep(1000);
          driver.findElement(By.xpath("//li[contains(text(),'"+Container+"')]")).click();
          Thread.sleep(1000);
          specimenAdd.click();
          Thread.sleep(1000);
  	
	}

  Thread.sleep(1000);
  resultType.click();
  Thread.sleep(1000);
  driver.findElement(By.xpath("//li[contains(text(),'"+ResultType+"')]")).click();
  Thread.sleep(1000);
  resultUnit.click();
  Thread.sleep(1000);
  resultUnit.sendKeys(ResultUnit);
  Thread.sleep(1000);
  driver.findElement(By.xpath("//li[contains(text(),'"+ResultUnit+"')]")).click();
  
  
  
  
  
  
  
        
        
        	
	}

}
