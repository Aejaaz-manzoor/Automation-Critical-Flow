package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCRMPageobject  {
	
	
	@FindBy (xpath = "//input[@placeholder='Enter email']")
	public static WebElement CrmUsername ;
	
	@FindBy (xpath = "//input[@placeholder='Password']")
	public static WebElement CrmPassword ;
	
	@FindBy (xpath = "//button[contains(text(),'Log In')]")
	public static WebElement CrmLoginCTA ;
	
	@FindBy (xpath = "//parent::a//span[contains(text(),'All')]")
	public static WebElement CrmAllBucket ;
	
	@FindBy (xpath = "//input[@placeholder='Search for tickets ID or subject']")
	public static WebElement CrmSearchforticketsIDorsubject ;
	 
	@FindBy (xpath = "(//ul[@class='ticket-list']/child::li)[1]")
	public static WebElement CrmFirstTicketSelect ;
	
	@FindBy (xpath = "(//span[@class='newTicket floatNone'])[1]")
	public static WebElement CrmInternalNote ;
	
	@FindBy (xpath = "//span[contains(text(),'Follow ups')]")
	public static WebElement FollowupsCTA ;
	
	@FindBy (xpath = "((//div[@class='navbar-collapse collapse'])[2]/child::div[@class='navbar-nav']/child::div)[2]")
	public static WebElement Calenderdropdown ;
	
	@FindBy (xpath = "(//td[@data-date='31'])[1]")
	public static WebElement dateselection ;
	
	@FindBy (xpath = "//span[@class='newTicket floatNone']/child::a")
	public static WebElement EventTicketId ;
	
	@FindBy (xpath = "//button[contains(text(),'Events')]")
	public static WebElement NewCRMEventCTA ;
	
	@FindBy (xpath = "//div[@class='css-1e0g14s']/child::input")
	public static WebElement NewCRMCheckboxunchecked ;
	
	@FindBy (xpath = "//label[@for='eventcheck_0']/child::h6")
	public static WebElement NewCRMDatevalidation ;
	
	
	
}
 