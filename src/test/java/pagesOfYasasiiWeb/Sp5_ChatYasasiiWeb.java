package pagesOfYasasiiWeb;

import java.awt.Desktop.Action;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Sp5_ChatYasasiiWeb extends  PageFactoryInitYasasiiWeb {
	public Sp5_ChatYasasiiWeb(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;
	
//Chat
	@FindBy(xpath="//img[@title='Chat']")
	public WebElement chat;

	
	@FindBy(xpath="//i[@class='ki ki-chat']")
	public WebElement chats;
	
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[2]/li[1]/div[1]/div[1]/lib-chat-video[1]/div[1]/div[1]/lib-leftsidechat[1]/lib-searchlist[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement chatsearch;
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[2]/li[1]/div[1]/div[1]/lib-chat-video[1]/div[1]/div[1]/lib-leftsidechat[1]/lib-searchlist[1]/div[1]/ul[1]/li[1]/div[2]/p[1]")
	public WebElement selectempl;
	@FindBy(xpath="//textarea[@id='message-to-send']")
	public WebElement textarea;
	@FindBy(xpath="//i[@class='fa fa-paper-plane']")
	public WebElement send;
//Group Creation
	
	@FindBy(xpath="//i[@class='ki ki-users']")
	public WebElement users;
	@FindBy(xpath="//button[normalize-space()='Create Group']")
	public WebElement creategroup;
	@FindBy(xpath="//input[@id='createGroupName']")
	public WebElement groupname;
	@FindBy(xpath="//input[@id='createGroupDescription']")
	public WebElement description;
	@FindBy(xpath="//button[normalize-space()='Create Group']")
	public WebElement create;
	@FindBy(xpath="//input[@id='memberName']")
	public WebElement addmembers;
	@FindBy(xpath="//button[normalize-space()='Add Member']")
	public WebElement addmember;
	@FindBy(xpath="//button[normalize-space()='Back']")
	public WebElement back;
	
	@FindBy(xpath="//div[@class='pat-img-container']//img[@class='ng-star-inserted']")
	public WebElement PatIcon;
	
	@FindBy(xpath="//textarea[@id='message-to-send']")
	public WebElement textArea;
	
	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement SearchField;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void ch1(String URL, String User , String Password , String site , String MRNO) throws InterruptedException, IOException {
///Chat
		
		
		
		
		Thread.sleep(2000);
		chat.click();//label[@title='New Chat']
		Thread.sleep(3000);
		chats.click();
		Thread.sleep(2000);
		chatsearch.click();
		Thread.sleep(2000);
		chatsearch.sendKeys("Rohit Sharma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='rs-icon']//i[@class='ki ki-search']")).click();
		Thread.sleep(2000);
		selectempl.click();
		Thread.sleep(2000);
		textarea.click();
		Thread.sleep(2000);
		textarea.sendKeys("Hi Rohit /n how are you ");
		Thread.sleep(2000);
		send.click();
		

		
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		
Point point =textArea .getLocation();
	
	int Xcord = point.getX();
	System.out.println(Xcord);
	int Ycord = point.getY();
	System.out.println(Ycord);
	Thread.sleep(1000);
	
Point point1 =PatIcon .getLocation();
	
	int Xcord1 = point1.getX();
	System.out.println(Xcord1);
	int Ycord1 = point1.getY();
	System.out.println(Ycord1);
	Thread.sleep(1000);
	
	
int	xOffset =(Xcord-Xcord1)+10;
int yOffset=(Ycord-Ycord1)+20;

	
	
	
		SearchField.clear();
		Thread.sleep(1000);
		SearchField.sendKeys(MRNO , Keys.ENTER);
		
		Thread.sleep(1000);
	

		Actions builder = new Actions(driver);

		org.openqa.selenium.interactions.Action dragAndDrop = builder.clickAndHold(PatIcon)
		   .moveToElement(textArea)
		   .release(textArea)
		   .build();

		dragAndDrop.perform();
		
		
//		
//		Thread.sleep(1000);
//		act.dragAndDropBy(PatIcon, xOffset, yOffset).perform();
//		
//		act.clickAndHold(PatIcon).dragAndDropBy(PatIcon, xOffset, yOffset).build().perform();
//		Thread.sleep(1000);
//		
		
		driver.findElement(By.xpath("//button[@class='btn send-btn']")).click();
		Thread.sleep(1000);
}
	
	public void doc(String URL, String User1 , String Password1 , String site) throws InterruptedException {
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		driver.get(URL);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(User1);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password1);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );

		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);
		chat.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[2]/li[2]/div[1]/div[1]/lib-chat-video[1]/div[1]/div[1]/lib-leftsidechat[1]/div[3]/ul[1]/li[1]/div[3]/div[1]")).click();
		Thread.sleep(5000);
		users.click();
		Thread.sleep(2000);
		creategroup.click();
		Thread.sleep(2000);
		groupname.click();
		Thread.sleep(2000);
		groupname.sendKeys("Automation");
		Thread.sleep(2000);
		description.click();
		Thread.sleep(2000);
		description.sendKeys("Testing by Selenium_TestNG");
		Thread.sleep(2000);
		create.click();
		Thread.sleep(2000);
		addmembers.click();
		Thread.sleep(2000);
		addmembers.sendKeys("Administrator");
		Thread.sleep(2000);
	 //   addmembers.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//li[normalize-space()='Mr Administrator(admin)']")).click();
		Thread.sleep(2000);
		addmember.click();
		Thread.sleep(2000);
		back.click();
		Thread.sleep(2000);
		back.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[2]/li[2]/div[1]/div[1]/lib-chat-video[1]/div[1]/div[1]/lib-leftsidechat[1]/div[3]/ul[1]/li[1]/div[2]")).click();
		Thread.sleep(2000);
		textarea.click();
		Thread.sleep(2000);
		textarea.sendKeys("Hi Rohit /n how are you ");
		Thread.sleep(2000);
		send.click();
	}
		public void doc1(String URL, String User , String Password , String site , String MRNO) throws InterruptedException {
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(2));
			driver.switchTo().window(tabs.get(2));
			Thread.sleep(3000);
			driver.get(URL);
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
			Thread.sleep(6000);
			chat.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-header[1]/header[1]/nav[1]/div[2]/ul[2]/li[1]/div[1]/div[1]/lib-chat-video[1]/div[1]/div[1]/lib-leftsidechat[1]/div[3]/ul[1]/li[1]/div[3]")).click();
			Thread.sleep(5000);
			
			
			SearchField.clear();
			SearchField.sendKeys(MRNO , Keys.ENTER);
			act.dragAndDrop(PatIcon, textArea).perform();
			driver.findElement(By.xpath("//button[@class='btn send-btn']")).click();
			
			
			
			
			
			
	}
}