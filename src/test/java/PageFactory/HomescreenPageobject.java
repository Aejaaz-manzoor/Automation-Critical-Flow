package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomescreenPageobject extends NewCRMPageobject {
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[2]/span[1]" )
	public static WebElement MYIntrestCTA;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]" )
	public static WebElement FirstTicketID;
		
	@FindBy(xpath = "//*[contains(text(),'Buy now')]" )
	public static WebElement Firstsericepaynow;
	
	@FindBy(xpath = "(//div[@class='payment_flex'])[4]" )
	public static WebElement Paytm;
	
	@FindBy(xpath = "(//button[@class='btn btn-vs btn-block text-center '])[2]" )
	public static WebElement PAY;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/button[1]/div[1]" )
	public static WebElement Back;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/button[2]" )
	public static WebElement CancelConformYes;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/label[1]/div[1]/p[1]" )
	public static WebElement Cancelreason;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[5]/div[1]/button[2]" )
	public static WebElement Skipfeedback;

	@FindBy(xpath = "(//div[@class='nav-item'])[1]" )
	public static WebElement PaymentModes;
	
	@FindBy(xpath = "(//div[@class='payment-options']/child::div)[2]" )
	public static WebElement PaytmpaymentMode;
	
	@FindBy(xpath = "(//div[@class='border-bottom-upi ']/child::button)[2]" )
	public static WebElement Paynow;
	
	@FindBy(xpath = "//small[contains(text(),'Back')]")
	public static WebElement PhonepayBack ;
	
	@FindBy(xpath = "//button[contains(text(),'YES, CANCEL')]")
	public static WebElement Yestocancel ;
	
}
