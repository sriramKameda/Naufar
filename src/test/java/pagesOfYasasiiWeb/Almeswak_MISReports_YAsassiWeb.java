package pagesOfYasasiiWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Almeswak_MISReports_YAsassiWeb  extends PageFactoryInitYasasiiWeb {

	public Almeswak_MISReports_YAsassiWeb(WebDriver driver) {
		super(driver);
	} 
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//label[@class='wrap-menu-toggle']")
	public WebElement HAMBERGER;
	
	@FindBy(xpath = "//div[@class='module-icon-wrap ng-star-inserted']//i[@class='ki ki-file']")
	public WebElement MIS;
	
	@FindBy(xpath = "//span[normalize-space()='Reports']")
	public WebElement Reports;
	
	@FindBy(xpath = "//span[normalize-space()='PAS']")
	public WebElement PAS;
	
	@FindBy(xpath = "//span[normalize-space()='Appointment List']")
	public WebElement Appointment;
	
	@FindBy(xpath = "//div[@class='ng-untouched ng-pristine ng-invalid']//input[@id='field']")
	public WebElement resourceCategory;
	
	@FindBy(xpath = "//li[normalize-space()='Doctor']")
	public WebElement Doctor;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement dept;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement source;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-mis-landing[1]/lib-reportviewverlanding[1]/div[2]/ki-dynamic-tabs[1]/ki-dynamic-tab[1]/div[1]/lib-reportcriteria[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement status;
	
	
	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement modules;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void Reports() throws InterruptedException {
	
	int i=0;
	
	while(i<1000)
	{
	Thread.sleep(1000);
	HAMBERGER.click();
	Thread.sleep(600);
	MIS.click();
	Thread.sleep(600);
	Reports.click();
	Thread.sleep(600);
	PAS.click();
	Thread.sleep(600);
	Appointment.click();
	Thread.sleep(600);
	resourceCategory.click();
	Thread.sleep(600);
	Doctor.click();
	Thread.sleep(600);
	dept.click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//span[@title='Cardiology']")).click();
	Thread.sleep(600);
	source.click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//span[@title='Raina S(raina)']")).click();
	Thread.sleep(600);
	status.click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//a[@role='menuitem']")).click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//button[@id='misreportfetch']")).click();
	Thread.sleep(2000);
	HAMBERGER.click();
	Thread.sleep(600);
	modules.click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//i[@class='ki ki-cog']")).click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
	Thread.sleep(600);
	
	
	HAMBERGER.click();
	Thread.sleep(600);
	modules.click();
	Thread.sleep(600);
	driver.findElement(By.xpath("//div[@class='menu-overlay']")).click();
	Thread.sleep(600);
	
	
	
		i++;
		
		System.out.println(i);
	
}
	
}
	

}
