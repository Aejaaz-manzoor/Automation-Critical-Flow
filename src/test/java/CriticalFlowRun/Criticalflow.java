package CriticalFlowRun;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import MainBase.*;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.gson.JsonObject;

import Keymethods.Base;
import Keymethods.Driver;
import Keymethods.GRCPage;
import Keymethods.SendMailSSLWithAttachment;
import Keymethods.slack;
import PageFactory.HomescreenPageobject;
import PageFactory.HelpdeskPageobject;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Criticalflow { 
 
	ExtentReports extentreport;
	ExtentSparkReporter htmlReporter;
	ExtentTest test;
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
	String Date1 = dateFormat.format(new Date());
	String[][] data = null;

	@DataProvider(name = "itemsdata")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getExcelData();
		return data;
	}

	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream(
				"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\Excel\\Items jxl.xls");
		Workbook workbook = Workbook.getWorkbook(excel);
		Sheet sheet = workbook.getSheet("Sheet5");
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();

		String testData[][] = new String[rowCount][columnCount];

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				testData[i][j] = sheet.getCell(j, i).getContents();

			}
		}
		System.out.println(testData.toString());
		return testData;

	}

	WebDriver driver;

	@BeforeSuite
	public void Login() throws InterruptedException, AWTException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
		String Date1 = dateFormat.format(new Date());
		extentreport = new ExtentReports();
		htmlReporter = new ExtentSparkReporter(
				"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\extentreport.html");
		// htmlReporter = new
		// ExtentSparkReporter("C:\\Users\\admit\\git\\Automation-Critical-Flow\\GRCCriticalflow\\Screenshots\\"+Date1+"\\extentreport.html");

		extentreport.attachReporter(htmlReporter);

	}

	@BeforeTest
	public void Max() throws InterruptedException, AWTException {
		// Driver d = new Driver(driver);
		WebDriverManager.chromedriver().setup();
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("incognito");
//
//		option.addArguments("start-maximized");
//		capabilities.setCapability(ChromeOptions.CAPABILITY, option);
//		option.addArguments("--headless");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeClass
	public void url() throws InterruptedException, AWTException {

		PageFactory.initElements(driver, HomescreenPageobject.class);
		PageFactory.initElements(driver, HelpdeskPageobject.class);
		Thread.sleep(3000);

	}

	@Test(dataProvider = "itemsdata")
	public void Customercreation100(String Username, String Mobilenumber, String Helpdeskuserid,
			String helpdeskpassword, String notesname, String notedescrption, String QNameOfCustomer, String qaddress,
			String qpincode, String Professionalfees, String assignedtoName, String BDAgentName, String CrossSaleName,
			String GRCMobileNumber, String GRCNewCompanyName, String CINNumber, String CrmUsernames,
			String CrmUserpassword) throws Exception {
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("wwyyyyhh");
		String Date12 = dateFormat2.format(new Date());

		Base base = new Base();
		base.Base1(driver, CrmUsernames, GRCMobileNumber, extentreport, Date12);
		base.PrivateLimited(driver, CrmUsernames, GRCMobileNumber, extentreport, Date12);
		System.out.println(Date12);
		CriticalFlowDetail Criticalflow = new CriticalFlowDetail(driver, Helpdeskuserid, helpdeskpassword, notesname,
				notedescrption, QNameOfCustomer, qaddress, qpincode, Professionalfees, assignedtoName, BDAgentName,
				CrossSaleName, GRCMobileNumber, CrmUsernames, CrmUserpassword, GRCNewCompanyName, CINNumber,
				extentreport);

	}

	@AfterClass
	public void close() {
		// driver.close();
		System.out.println("The close_up process is completed");

	}

	@AfterTest
	public void Report() {
		extentreport.flush();

		System.out.println("Test completed");

	}

	@AfterSuite
	public void Mail() {
		try {

			Robot robot = new Robot();
			String screenshotLocation = "\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1
					+ "\\ExtentreportScreenshot.png";
			String extentreportLocation = "\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1
					+ "\\extentreport.html";
			String messageInputdata = "CriticalFlow Automation Test Report";
			SendMailSSLWithAttachment Mail = new SendMailSSLWithAttachment();

			Mail.main();

			slack slackmsg = new slack();
			slackmsg.slackMessageTest(driver, screenshotLocation, extentreportLocation, messageInputdata);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			CriticalFlowDetail sendstatus = new CriticalFlowDetail(driver, messageInputdata, messageInputdata,
					messageInputdata, messageInputdata, messageInputdata, messageInputdata, messageInputdata,
					messageInputdata, messageInputdata, messageInputdata, messageInputdata, messageInputdata,
					messageInputdata, screenshotLocation, extentreportLocation, messageInputdata, extentreport);
			sendstatus.sendStatusToGoogleChat("Critical note Automation completed");
		} catch (Exception msg) {
			// Handle exceptions appropriately, log them

			String message = "Mail or slack not sent------" + msg.getMessage().substring(0, 60);
			String k = "https://chat.googleapis.com/v1/spaces/AAAAgosrJz0/messages";
			RestAssured.baseURI = k;
			RequestSpecification httpRequest = RestAssured.given();
			JsonObject requestParams = new JsonObject();
			requestParams.addProperty("text", message);
			httpRequest.queryParam("key", "AIzaSyDdI0hCZtE6vySjMm-WEfRq3CPzqKqqsHI");
			httpRequest.queryParam("token", "IS9TRk_kE3aSPbwA79mtZqk5Z0xcJfjFYs8h6P04Ltw");
			httpRequest.header("Content-Type", "application/json");
			httpRequest.body(requestParams.toString());
			Response response = httpRequest.request(Method.POST);
			System.out.println(response.asPrettyString());

		} finally {
			// Ensure that driver is quit even if there is an exception
			if (driver != null) {
				driver.quit();
			}
		}
	}
}
