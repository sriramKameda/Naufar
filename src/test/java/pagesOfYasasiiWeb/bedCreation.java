package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class bedCreation extends PageFactoryInitYasasiiWeb{

	private static final char B = 0;


	public bedCreation(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement Menutoggle;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement mastericon; 


	@FindBy(xpath = "//body/app-root/app-layout/main[@class='page-body']/app-asideleftbar/aside[@class='left-sidebar open']/div[@class='menu-container']/div[@class='child bottom module-list in-down']/ul[@class='sidebarnav ng-star-inserted']/li[6]/a[1]")
	public WebElement resource; 

	@FindBy(xpath = "//span[normalize-space()='Resource Master']")
	public WebElement resourceMaster; 

	@FindBy(xpath = "//input[@id='resourcecategory']")
	public WebElement category; 

	@FindBy(xpath = "//input[@id='roomid']")
	public WebElement ROOMcategory;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public WebElement  deluxRoom;

	@FindBy(xpath = "//i[@class='ki ki-pencil']")
	public WebElement Edit;

	@FindBy(xpath = "//input[@id='bedtype']")
	public WebElement BedType;

	@FindBy(xpath = "//input[@id='nursingstation']")
	public WebElement nurestation;

	@FindBy(xpath = "//input[@id='bedname']")
	public WebElement bedname;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline']")
	public WebElement bedAdd;


	@FindBy(xpath = "//button[@id='resourcemasterupdate']")
	public WebElement update;





	public void bed() throws InterruptedException {

		int a=11;
		char b=72;


		Thread.sleep(2000);
		Menutoggle.click();
		Thread.sleep(1000);
		mastericon.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", resource );
		Thread.sleep(1000);
		resource.click();
		Thread.sleep(1000);
		resourceMaster.click();
		Thread.sleep(2000);
		category.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Bed']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-resourcemaster[1]/div[1]/lib-searchbarlist[1]/div[1]/div[2]/form[1]/div[3]/div[1]/ki-select-control[1]/div[1]/input[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='A7 Block']")).click();
		
		//	ROOMcategory.click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//li[normalize-space()='Super-Delux']")).click();
		Thread.sleep(1000);
		deluxRoom.click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		BedType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		Thread.sleep(1000);
		nurestation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Emergency NS']")).click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"0");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"1");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"2");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"3");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"4");
		Thread.sleep(1000);
		bedAdd.click();
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"5");
		Thread.sleep(1000);
		bedAdd.click();
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"6");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		//nurestation.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//li[normalize-space()='Ward Nure_Nursing station']")).click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"7");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"8");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("ans-"+a+"9");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		//	bedname.sendKeys("ans-40");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		nurestation.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Life care nursing station']")).click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("lcn-1"+b+"");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("lcn-2"+b+"");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("lcn-3"+b+"");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("lcn-4"+b+"");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		update.click();
		Thread.sleep(2000);


		////////////////////Emergency beds
		ROOMcategory.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Room-ER']")).click();
		Thread.sleep(1000);
		deluxRoom.click();
		Thread.sleep(1000);
		Edit.click();
		Thread.sleep(1000);
		BedType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
		Thread.sleep(1000);
		nurestation.click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Emergency NS']")).click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);

		bedname.sendKeys("er-1"+b+"");
		Thread.sleep(1000);
		bedAdd.click();	
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("er-2"+b+"");
		Thread.sleep(1000);
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("er-3"+b+"");
		Thread.sleep(1000);		
		bedAdd.click();
		Thread.sleep(1000);
		bedname.click();
		Thread.sleep(1000);
		bedname.sendKeys("er-4"+b+"");
		Thread.sleep(1000);
		bedAdd.click();
		//input[@id='bedname']
		Thread.sleep(1000);	
		update.click();
		Thread.sleep(2000);





	}


}
