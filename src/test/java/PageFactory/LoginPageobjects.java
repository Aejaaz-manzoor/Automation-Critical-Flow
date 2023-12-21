package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageobjects extends HomescreenPageobject {

	@FindBy(xpath = "(//p[contains(text(),'Business Setup')])[1]")
	public static WebElement Businesssetup;

	@FindBy(xpath = "(//a[contains(text(),'Private Limited Company')])[1]")
	public static WebElement Pvtdcompany;

	@FindBy(xpath = "(//div[@class='clib-relative'])[3]/child::input")
	public static WebElement City;

	@FindBy(xpath = "//span[@class='whatsapp_toggles false']//div[@class='switch_bg bg-success']")
	public static WebElement whatsapptogleoff;

	@FindBy(xpath = "//button[@class='fullwidth btn btn-primary']")
	public static WebElement talktoanexpert;

	@FindBy(xpath = "//button[@class='styles_customBtn__nb6mV styles_next__NvT8q false false ']")
	public static WebElement Next;

	@FindBy(xpath = "//input[@id='email']")
	public static WebElement Email;

	@FindBy(xpath = "(//input[@id='phone'])[1]")
	public static WebElement Phonenumber;

	@FindBy(xpath = "//label[contains(@for,'noexistingBusiness')]")
	public static WebElement Q1newbusiness;

	@FindBy(xpath = "(//div[@class='styles_availableStatus__44C8o'])[2]")
	public static WebElement noidonthaveacompany;

	@FindBy(xpath = "//label[contains(text(),'New business')]")
	public static WebElement noidonthaveacompany1;

	@FindBy(xpath = "//button[@class='styles_customBtn__nb6mV styles_next__NvT8q false']")
	public static WebElement next2;

	@FindBy(xpath = "//p[normalize-space()='Software']")
	public static WebElement Software;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/section[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement Ageofbusiness;

}
