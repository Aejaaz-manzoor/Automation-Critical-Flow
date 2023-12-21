package Keymethods;

import static org.testng.Assert.expectThrows;
import org.apache.commons.io.FileUtils;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;

import CriticalFlowRun.Criticalflow;
import PageFactory.GRCPageobject;
import PageFactory.HelpdeskPageobject;
import groovyjarjarantlr4.v4.parse.ANTLRParser.element_return;

public class GRCPage extends GRCPageobject {

	ExtentTest test;
	public static String e = "";

	public GRCPage(WebDriver driver, ExtentReports extentreport, String GRCMobileNumber, String GRCNewCompanyName,
			String CINNumber, String Helpdeskuserid, String helpdeskpassword, String assignedtoName)
			throws InterruptedException, AWTException, ElementClickInterceptedException, IOException {

//		Set<String> allwindowsid = driver.getWindowHandles();
//		List<String> all = new ArrayList<>();
//		all.addAll(allwindowsid);
//		driver.switchTo().window(all.get(5));
//		List<String> all7 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(all7.get(1));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		Robot robot = new Robot();
		Actions actions = new Actions(driver);
		test = extentreport.createTest("GRC Test");
		ScreenShot screenshot = new ScreenShot();
		WebDriverWait wait = new WebDriverWait(driver, 60);
		PageFactory.initElements(driver, GRCPageobject.class);
		Actions act = new Actions(driver);
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMddyyyyHHMMSS");
		String Date2 = dateFormat1.format(new Date());
		driver.get("https://grc.vakilsearch.com/grc/login");
		screenshot.screenshot1(driver, extentreport);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
		String Date1 = dateFormat.format(new Date());
		System.out.println(Date1);
		test.log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot1.png",
						"GRC URL").build());
		Thread.sleep(2500);

		GRCUsername.sendKeys(GRCMobileNumber);
		Thread.sleep(2500);
		GRCPhonenumberConfirm.click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//input[@style='width: 1em; text-align: center;'])[1]")));
		GRCOTP1.sendKeys("0");
		GRCOTP2.sendKeys("0");
		GRCOTP3.sendKeys("0");
		GRCOTP4.sendKeys("0");
		Thread.sleep(1500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		try {
			WebElement element301 = driver
					.findElement(By.xpath("//button[contains(text(),'Login')]"));
			JavascriptExecutor executor301 = (JavascriptExecutor) driver;
			executor301.executeScript("arguments[0].click();", element301);

		} catch (NoSuchElementException Login) {
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}

		Thread.sleep(3500);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Closepopup));
			Closepopup.click();
		} catch (Exception Closepopup) {
			System.out.println("No popup");
		}

		Thread.sleep(4000);
		String DashboardURL = driver.getCurrentUrl().substring(0, 37);
		String DashboardURL1 = "https://grc.vakilsearch.com/grc/dashboard";
		if (DashboardURL1.contains(DashboardURL)) {

			screenshot.screenshot2(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot2.png",
					"DashboardURL1").build());

		} else {

			screenshot.screenshot2(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot2.png",
					"DashboardURL1").build());

		}
		Thread.sleep(5000);
		try {
			Closepopup.click();
		} catch (Exception Closepopup) {
			System.out.println("No popup");
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Closehelp1));
			actions.moveToElement(Closehelp1).click().build().perform();
		} catch (Exception NeedClose) {
			wait.until(ExpectedConditions.elementToBeClickable(Closehelp2));
			actions.moveToElement(Closehelp2).click().build().perform();

		}
		Thread.sleep(3000);
		try {
			Closepopup.click();
		} catch (Exception Closepopup) {
			System.out.println("No popup");
		}
		try {

			GRCPage.addnewEntity.click();

		} catch (Exception addnewEntity) {
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("//div[@class='styles_dropdown__kgL4A']/child::button"))).click();
			Thread.sleep(2500);

			AddNewBusiness2.click();

		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn btn-primary']")));
		Letsgo.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='styles_dropdownToggle__oqhXx ']")));
		
		WebElement element41= driver
				.findElement(By.xpath("//div[@class='styles_dropdownToggle__oqhXx ']"));
		JavascriptExecutor executor41 = (JavascriptExecutor) driver;
		executor41.executeScript("arguments[0].click();", element41);
		//ChooseBusinessType.click();
		Thread.sleep(1500);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//li[contains(text(),'Private Limited Company(PVT)')]")));
		PrivateLimitedCompany.click();

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='styles_textInput__k8w0C'])[1]")));

		CompanyName.click();
		CompanyName.sendKeys(GRCNewCompanyName);
		CINNo.click();
		CINNo.sendKeys(CINNumber + Date2);
		Thread.sleep(3500);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Continue')]")));
			Continue.click();
			Thread.sleep(2500);
		} catch (Exception e102) {
			wait.until(ExpectedConditions.elementToBeClickable(Continue));
			actions.moveToElement(Continue).click().build().perform();
		}

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//p[contains(text(),'Business Industry')]")));
		BusinessIndustry.click();
		Thread.sleep(1500);
		AgricultureAndDairyFarming.click();
		Thread.sleep(1500);
		SubIndustry.click();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		Continue2.click();
		Thread.sleep(2500);
		WebElement element4 = driver
				.findElement(By.xpath("//button[contains(text(),'Skip')]/parent::div/child::button"));
		JavascriptExecutor executor4 = (JavascriptExecutor) driver;
		executor4.executeScript("arguments[0].click();", element4);
		// Skip.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Continue')]")));
		LetsGetStartedContinue.click();
		Thread.sleep(2500);
		try {
			Closepopup.click();
		} catch (Exception Closepopup) {
			System.out.println("No popup");
		}
		try {
			Closepopup.click();
		} catch (Exception Closepopup) {
			System.out.println("No popup");
		}
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Closehelp1));
			actions.moveToElement(Closehelp1).click().build().perform();
		} catch (Exception NeedClose) {
			try {

				wait.until(ExpectedConditions.elementToBeClickable(Closehelp2));
				actions.moveToElement(Closehelp2).click().build().perform();
			} catch (Exception NeedClosed2) {
				System.out.println("Need help closed");
			}
		}
		Thread.sleep(2500);
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//button[@class='styles_dropdownBtn__I6_4i']/child::p"))).click();
		Thread.sleep(2500);
		// **just for option
//	OpenEntityList.click();
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("(//div[@class='styles_accountsList__qfPzH']/child::div)[2]"))).click();
		// EntitySelect2.click();
		try {

			Closepopup.click();
		} catch (Exception Closepopup) {
			System.out.println("No popup");
		}

		Thread.sleep(1500);
		ProfileMenu.click();
		Thread.sleep(1500);
		ViewProfile.click();
		Thread.sleep(1500);
		String ProfileInformationURL = driver.getCurrentUrl().substring(0, 44);
		String ProfileInformationURL1 = "https://grc.vakilsearch.com/grc/user-profile";
		if (ProfileInformationURL1.contains(ProfileInformationURL)) {
			screenshot.screenshot3(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot3.png",
					"ProfileInformationURL").build());
			System.out.println(ProfileInformationURL);
		} else {
			screenshot.screenshot3(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot3.png",
					"ProfileInformationURL").build());
			System.out.println(ProfileInformationURL1);
		}

		driver.navigate().back();
		try {

			Closepopup.click();
		} catch (Exception Closepopup) {
			System.out.println("No popup");
		}

		Thread.sleep(2500);
		js1.executeScript("arguments[0].scrollIntoView(true);", Buynowmodule);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);
		robot.keyPress(KeyEvent.VK_MINUS);
		robot.keyRelease(KeyEvent.VK_MINUS);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		WebElement element3 = driver.findElement(By.xpath("(//button[contains(text(),'Buy now')])[1]"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", element3);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(text(),'Buy
		// now')])[1]")))
		// .click();
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		robot.keyPress(KeyEvent.VK_UP);
		robot.keyRelease(KeyEvent.VK_UP);
		// BuyNowService.click();
		Thread.sleep(1500);
		try {
			AreyouintrestedinGST.click();
			Thread.sleep(1500);
			ContinueGST.click();
			Thread.sleep(1500);
			AreyouintrestedinGST.click();
			Thread.sleep(1500);
			GSTRegistrationState.click();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			ContinueGST.click();
			Thread.sleep(1500);
			ContinueGST.click();
		} catch (NoSuchElementException AreyouintrestedinGST) {

			try {
				GSTRegistrationState.click();
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyRelease(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				ContinueGST.click();
				ContinueGST.click();
			} catch (NoSuchElementException AreyouintrestedinGST1) {

				try {

					ContinueGST.click();
				} catch (Exception ContinueGST) {
					System.out.println("TicketID");
				}
			}

		}
		Thread.sleep(2500);
		wait.until(ExpectedConditions.elementToBeClickable(GetServiceID));
		String ServiceID = GetServiceID.getText().substring(1);
		System.out.println(ServiceID + "GRC");
		WebElement element13 = driver.findElement(By.xpath("(//img[@alt='close'])[1]"));
		JavascriptExecutor executor13 = (JavascriptExecutor) driver;
		executor13.executeScript("arguments[0].click();", element13);
//		try {
//			Closepopup.click();
//		} catch (Exception Closepopup1) {
//			System.out.println("No popup");
//		}
		Thread.sleep(2000);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_R);
//		robot.keyRelease(KeyEvent.VK_R);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		Thread.sleep(4000);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(Closehelp1));
			actions.moveToElement(Closehelp1).click().build().perform();
		} catch (Exception NeedClose) {
			try {

				wait.until(ExpectedConditions.elementToBeClickable(Closehelp2));
				actions.moveToElement(Closehelp2).click().build().perform();
			} catch (Exception NeedClosed2) {
				System.out.println("Need help closed");
			}

			Thread.sleep(3000);
		}
		Thread.sleep(2500);
		// actions.click(Needhelp);
		try {
			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//div[@class='styles_btnContainer__sVb_P']//child::div)[1]")))
					.click();
			Thread.sleep(3000);
		} catch (Exception needhelpclick) {
			WebElement element2 = driver
					.findElement(By.xpath("(//div[@class='styles_btnContainer__sVb_P']//child::div)[1]"));
			JavascriptExecutor executor2 = (JavascriptExecutor) driver;
			executor2.executeScript("arguments[0].click();", element2);

		} // Needhelp.click();
		Thread.sleep(1500);
		String NeedHelpURL = driver.getCurrentUrl().substring(0, 36);
		String NeedHelpURL1 = "https://grc.vakilsearch.com/grc/help";
		if (NeedHelpURL1.contains(NeedHelpURL)) {
			screenshot.screenshot4(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot4.png",
					"NeedHelpURL1").build());
		} else {
			screenshot.screenshot4(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot4.png",
					"NeedHelpURL1").build());
			System.out.println(NeedHelpURL1);
		}
		try {
			Thread.sleep(3000);
			WebElement element5 = driver.findElement(By.xpath("//button[@class='styles_closeBtn__ULw05']/child::*"));
			JavascriptExecutor executor5 = (JavascriptExecutor) driver;
			executor5.executeScript("arguments[0].click();", element5);
			// clickVideo.click();
		} catch (Exception Video) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			System.out.println(Video);
		}

		try {
			Thread.sleep(4500);
			WebElement element6 = driver
					.findElement(By.xpath("//div[@class='styles_container__BL2LZ false']/child::div"));
			JavascriptExecutor executor6 = (JavascriptExecutor) driver;
			executor6.executeScript("arguments[0].click();", element6);
		} catch (Exception NeedClose) {
			try {
				WebElement element6 = driver
						.findElement(By.xpath("//div[@class='styles_imgWrapper__uoce0']/child::img"));
				JavascriptExecutor executor6 = (JavascriptExecutor) driver;
				executor6.executeScript("arguments[0].click();", element6);

			} catch (Exception NeedClosed2) {
				System.out.println("Need help closed");
			}
		}
		Thread.sleep(2500);
		try {
			WebElement element7 = driver.findElement(By.xpath("//img[@alt='Settings']/parent::button"));
			JavascriptExecutor executor7 = (JavascriptExecutor) driver;
			executor7.executeScript("arguments[0].click();", element7);

		} catch (Exception e100008) {
			driver.findElement(By.xpath("//img[@alt='Settings']/parent::button")).click();
		}

		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[contains(text(),'Business Profile')]")).click();
		Thread.sleep(10000);
		String BusinessProfileURL = driver.getCurrentUrl().substring(0, 48);
		String BusinessProfileURL1 = "https://grc.vakilsearch.com/grc/business-profile";
		if (BusinessProfileURL1.contains(BusinessProfileURL)) {
			screenshot.screenshot5(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot5.png",
					"BusinessProfileURL").build());
			System.out.println(BusinessProfileURL1);
		} else {
			screenshot.screenshot5(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot5.png",
					"BusinessProfileURL").build());
			System.out.println(BusinessProfileURL);
		}

		driver.navigate().back();
		Thread.sleep(10000);

		// *********

		WebElement element7 = driver.findElement(By.xpath("//img[@alt='Settings']/parent::button"));
		JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		executor7.executeScript("arguments[0].click();", element7);
		Thread.sleep(2500);
		Thread.sleep(10000);

		driver.findElement(By.xpath("//p[contains(text(),'Users & Roles')]")).click();
		Thread.sleep(10000);
		String UsersandRolesURL = driver.getCurrentUrl().substring(0, 42);
		String UsersandRolesURL1 = "https://grc.vakilsearch.com/grc/user_roles";
		if (UsersandRolesURL1.contains(UsersandRolesURL)) {
			screenshot.screenshot6(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot6.png",
					"UsersandRolesURL1").build());
			System.out.println(UsersandRolesURL1);
		} else {
			screenshot.screenshot6(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot6.png",
					"UsersandRolesURL1").build());
			System.out.println(UsersandRolesURL);
		}
		driver.navigate().back();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//button[@class='styles_gearBtn__s6cgl']/child::img")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//p[contains(text(),'Users & Roles')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//Button[contains(text(),'Add users')]")).click();
		Thread.sleep(10000);
		String AddUserURL = driver.getCurrentUrl().substring(0, 42);
		String AddUserURL1 = "https://grc.vakilsearch.com/grc/user_roles";
		if (AddUserURL1.contains(AddUserURL)) {
			screenshot.screenshot7(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot7.png",
					"AddUserURL").build());
			System.out.println(AddUserURL1);
		} else {
			screenshot.screenshot7(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot7.png",
					"AddUserURL1").build());
			System.out.println(AddUserURL);
		}
		// driver.navigate().back();
		driver.navigate().back();
		Thread.sleep(10000);
		// *********
		driver.findElement(By.xpath("//button[@class='styles_gearBtn__s6cgl']/child::img")).click();
		Thread.sleep(7500);
		driver.findElement(By.xpath("//p[contains(text(),'Help')]")).click();
		Thread.sleep(7500);
		String HelpURL = driver.getCurrentUrl().substring(0, 36);
		String HelpURL1 = "https://grc.vakilsearch.com/grc/help";
		if (HelpURL1.contains(HelpURL)) {
			screenshot.screenshot8(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot8.png",
					"HelpURL").build());
			System.out.println(HelpURL1);
		} else {
			screenshot.screenshot8(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot8.png",
					"HelpURL").build());
			System.out.println(HelpURL);
		}
		driver.navigate().back();
		Thread.sleep(5500);
		// **********
		driver.findElement(By.xpath("//button[@class='styles_gearBtn__s6cgl']")).click();
		Thread.sleep(5500);
		driver.findElement(By.xpath("//p[contains(text(),'Support')]")).click();
		Thread.sleep(5500);
		String SupportURL = driver.getCurrentUrl().substring(0, 42);
		String SupportURL1 = "https://grc.vakilsearch.com/grc/contact-us";
		if (SupportURL1.contains(SupportURL)) {
			screenshot.screenshot9(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot9.png",
					"SupportURL1").build());
			System.out.println(SupportURL1);
		} else {
			screenshot.screenshot9(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot9.png",
					"SupportURL1").build());
			System.out.println(SupportURL);
		}
		driver.navigate().back();
		Thread.sleep(8000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Closehelp1));
			actions.moveToElement(Closehelp1).click().build().perform();
		} catch (Exception NeedClose) {
			try {

				wait.until(ExpectedConditions.elementToBeClickable(Closehelp2));
				actions.moveToElement(Closehelp2).click().build().perform();
			} catch (Exception NeedClosed2) {
				System.out.println("Need help closed");
			}
		}
		Thread.sleep(2000);
		// **************
		// driver.findElement(By.xpath("//button[@class='styles_gearBtn__s6cgl']")).click();
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Messages')]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		// driver.findElement(By.xpath("//span[contains(text(),'Messages')]")).click();
		Thread.sleep(2500);
		String MessagesURL = driver.getCurrentUrl().substring(0, 40);
		String MessagesURL1 = "https://grc.vakilsearch.com/grc/messages";
		if (MessagesURL1.contains(MessagesURL)) {
			screenshot.screenshot10(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot10.png",
					"MessagesURL").build());
			System.out.println(MessagesURL1);
		} else {
			screenshot.screenshot10(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot10.png",
					"MessagesURL").build());
			System.out.println(MessagesURL);
		}

		driver.navigate().back();
		Thread.sleep(5500);
		
		// ********

		// driver.findElement(By.xpath("//button[@class='styles_gearBtn__s6cgl']")).click();
		// driver.findElement(By.xpath("//span[contains(text(),'All
		// Services')]")).click();
		WebElement element97 = driver.findElement(By.xpath("//span[contains(text(),'All Services')]"));
		JavascriptExecutor executor97 = (JavascriptExecutor) driver;
		executor97.executeScript("arguments[0].click();", element97);
		Thread.sleep(2500);
		String AllServicesURL = driver.getCurrentUrl().substring(0, 40);
		String AllServicesURL1 = "https://grc.vakilsearch.com/grc/services";
		if (AllServicesURL1.contains(AllServicesURL)) {
			screenshot.screenshot11(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot11.png",
					"AllServicesURL1").build());
			System.out.println(AllServicesURL1);
		} else {
			screenshot.screenshot11(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot11.png",
					"AllServicesURL1").build());
			System.out.println(AllServicesURL);
		}
		driver.navigate().back();
		Thread.sleep(5500);

		driver.findElement(By.xpath("//span[contains(text(),'Payments')]")).click();
		Thread.sleep(2500);
		String PaymentsURL = driver.getCurrentUrl().substring(0, 40);
		String PaymentsURL1 = "https://grc.vakilsearch.com/grc/payments";
		if (PaymentsURL.contains(PaymentsURL1)) {
			screenshot.screenshot12(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot12.png",
					"PaymentsURL").build());
			System.out.println(PaymentsURL1);
		} else {
			screenshot.screenshot12(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot12.png",
					"PaymentsURL").build());
			System.out.println(PaymentsURL);
		}
		driver.navigate().back();
		Thread.sleep(5500);
		// driver.findElement(By.xpath("//button[@class='styles_gearBtn__s6cgl']")).click();
		WebElement element33 = driver.findElement(By.xpath("//span[contains(text(),'Compliance Calendar')]"));
		JavascriptExecutor executor33 = (JavascriptExecutor) driver;
		executor33.executeScript("arguments[0].click();", element33);

		Thread.sleep(2500);
		String ComplianceCalendar = driver.getCurrentUrl().substring(0, 40);
		String ComplianceCalendar1 = "https://grc.vakilsearch.com/grc/calendar";
		if (ComplianceCalendar.contains(ComplianceCalendar1)) {
			screenshot.screenshot13(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot13.png",
					"ComplianceCalendar").build());
			System.out.println(ComplianceCalendar1);
		} else {
			screenshot.screenshot13(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot13.png",
					"ComplianceCalendar").build());
			System.out.println(ComplianceCalendar);
		}

		driver.navigate().back();
		Thread.sleep(5500);
		WebElement element21 = driver.findElement(By.xpath("//span[contains(text(),'Rewards')]"));
		JavascriptExecutor executor21 = (JavascriptExecutor) driver;
		executor21.executeScript("arguments[0].click();", element21);

		Thread.sleep(2500);
		String RewardsURL = driver.getCurrentUrl().substring(0, 39);
		String RewardsURL1 = "https://grc.vakilsearch.com/grc/rewards";
		if (RewardsURL.contains(RewardsURL1)) {
			screenshot.screenshot14(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot14.png",
					"RewardsURL").build());
			System.out.println(RewardsURL1);
		} else {
			screenshot.screenshot14(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot14.png",
					"RewardsURL").build());
			System.out.println(RewardsURL);
		}
		driver.navigate().back();
		Thread.sleep(5500);
		driver.findElement(By.xpath("//span[contains(text(),'My Services')]")).click();
		Thread.sleep(2500);
		String MyServicesURL = driver.getCurrentUrl().substring(0, 43);
		String MyServicesURL1 = "https://grc.vakilsearch.com/grc/my-services";
		if (MyServicesURL.contains(MyServicesURL1)) {
			screenshot.screenshot15(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot15.png",
					"MyServicesURL").build());
			System.out.println(MyServicesURL1);
		} else {
			screenshot.screenshot15(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot15.png",
					"MyServicesURL").build());
			System.out.println(MyServicesURL);
		}
		driver.navigate().back();
		Thread.sleep(3500);

		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'My Interests')]")));
			driver.findElement(By.xpath("//span[contains(text(),'My Interests')]")).click();

		} catch (NoSuchElementException e7) {
			GrcLogin grclogin = new GrcLogin(driver, GRCMobileNumber);
			driver.findElement(By.xpath("//span[contains(text(),'My Interests')]")).click();
		} catch (ElementClickInterceptedException MyintrestIntercepted) {
			Thread.sleep(2500);
			driver.findElement(By.xpath("//div[contains(text(),'Continue your service request from here ')]")).click();
			driver.findElement(By.xpath("//span[contains(text(),'My Interests')]")).click();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		String Ticketid1 = HomescreenPageobject.FirstTicketID.getText().substring(1);
//System.out.println(Ticketid1);

		e = driver.findElement(By.xpath("(//div[@class='styles_ticketDetail__jg4A0']//child::P)[1]")).getText()
				.substring(1);

		String MyInterestURL = driver.getCurrentUrl().substring(0, 44);
		String MyInterestURL1 = "https://grc.vakilsearch.com/grc/my-interests";
		if (MyInterestURL1.contains(MyInterestURL)) {
			screenshot.screenshot16(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot16.png",
					"MyInterestURL").build());
			System.out.println(MyInterestURL);
		} else {
			screenshot.screenshot16(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot16.png",
					"MyInterestURL").build());
			System.out.println(MyInterestURL1);
		}
		if (e.matches(e)) {
			screenshot.screenshot17(driver, extentreport);
			test.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot17.png",
					"LeadCreation").build());
		} else {

			screenshot.screenshot17(driver, extentreport);
			test.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot17.png",
					"LeadCreation").build());
		}

		System.out.println(e);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Payment key = new Payment(driver, test, extentreport);

	}

}
