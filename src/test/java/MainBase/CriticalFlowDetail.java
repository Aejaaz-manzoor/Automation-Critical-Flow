package MainBase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import Keymethods.GRCPage;

import Keymethods.NewCRM;

import Keymethods.ScreenShot;
import PageFactory.GRCPageobject;
import PageFactory.HelpdeskPageobject;

import PageFactory.NewCRMPageobject;

public class CriticalFlowDetail extends HelpdeskPageobject {

	JavascriptExecutor js;
	Robot robot;
	ExtentTest testr;

	public CriticalFlowDetail(WebDriver driver, String Helpdeskuserid, String helpdeskpassword, String notesname,
			String notedescrption, String QNameOfCustomer, String qaddress, String qpincode, String Professionalfees,
			String assignedtoName, String BDAgentName, String CrossSaleName, String GRCMobileNumber,
			String CrmUsernames, String CrmUserpassword, String GRCNewCompanyName, String CINNumber,
			ExtentReports extentreport)
			throws InterruptedException, AWTException, ElementClickInterceptedException, IOException {

		SimpleDateFormat dateFormat21 = new SimpleDateFormat("dd");
		String Date12k = dateFormat21.format(new Date());
		int myInteger = Integer.parseInt(Date12k);
		int Date12 = myInteger + 1;

		System.out.println(Date12);

		Robot robot = new Robot();
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("wwyyyyhh");
		String Date12222 = dateFormat2.format(new Date());

		ScreenShot screenshot = new ScreenShot();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		testr = extentreport.createTest("Helpdesk");
		WebDriverWait wait = new WebDriverWait(driver, 100);
		PageFactory.initElements(driver, GRCPageobject.class);
		PageFactory.initElements(driver, NewCRMPageobject.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://helpdesk.vakilsearch.com/login");

		Thread.sleep(10000);
		Username.sendKeys(Helpdeskuserid);
		String text1 = Username.getText();
		String text2 = "testingsa_2_2020@vakilsearch.com";
		System.out.println(text1);
//		if (text1.contains(text2)) {
//			test.log(Status.PASS, "Yes");
//		} else {
//
//			test.log(Status.FAIL, "Username Not same");
//		}

		Password.sendKeys(helpdeskpassword);
		Signin.click();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Helpdesk.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Tickets.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(8000);
		try {
			WebElement element501011 = driver.findElement(By.xpath("//input[@id='search']"));
			JavascriptExecutor executor501011 = (JavascriptExecutor) driver;
			executor501011.executeScript("arguments[0].click();", element501011);
			element501011.sendKeys("91" + Date12222);
			System.out.println(Date12222);
			// driver.findElement(By.xpath("//input[@class='form-control
			// ticket_search']")).sendKeys("9789955331");
			// ticketid.sendKeys(GRCPage.e);
		} catch (Exception Search) {
			System.out.println(Search);

		}

		// Search.click();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Firstservice.click();

		String ReferenceTicketID = driver.findElement(By.xpath("//div[@class='marginZero']/child::h2/child::strong"))
				.getText().substring(1, 8);

		try {

			Thread.sleep(5000);
			CriticalnotesCTA.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			NewCriticalNoteCTA.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(5000);

			TypeCriticalNotes.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(5000);

			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_G);

			ChooseCriticalNoesFile.sendKeys(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\Excel\\sample-aadhaar-card.png");

			employtonotify.click();
			Thread.sleep(1500);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_H);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_U);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_O);

			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);

			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
 
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			screenshot.screenshot21(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot21.png",
					"CriticalNote").build());

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			CriticalNoteSave.click();
			Thread.sleep(5000);

		
		Thread.sleep(3000);

		Thread.sleep(8500);

		String text = RecentNoteVerification.getText();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// RecentNoteVerification);
		System.out.println(text);
		if (text.contains("testing")) {
			Thread.sleep(5000);
			WebElement elementview1 = driver.findElement(
					By.xpath("(//div[@class='panel-collapse collapse1']/child::div)[2]/child::p/child::span"));
			JavascriptExecutor executorview1 = (JavascriptExecutor) driver;
			executorview1.executeScript("arguments[0].click();", elementview1);
			Viewattachment.click();
			Thread.sleep(5000);
			List<String> all29 = new ArrayList<String>(driver.getWindowHandles());

			screenshot.screenshot22(driver, extentreport);
			
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot22.png",
					"Critical Note verification").build());
			driver.switchTo().window(all29.get(1));
			driver.close();
		} else {
			screenshot.screenshot22(driver, extentreport);
		
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot22.png",
					"Critical Note verification").build());
		}
		List<String> all29 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all29.get(0));
		} catch (Exception CriticalNote) {
			screenshot.screenshot21(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot21.png",
					"CriticalNote").build());
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		try {

			PersonalNote.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			NewPersonalNote.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			TypePersonalnote.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_I);
			robot.keyRelease(KeyEvent.VK_I);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyPress(KeyEvent.VK_G);
			robot.keyRelease(KeyEvent.VK_G);
			screenshot.screenshot23(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot23.png",
					"Personal Note").build());
			savepersonalnote.click();

		} catch (Exception PersonalNote) {

			screenshot.screenshot23(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot23.png",
					"Personal Note").build());
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		Thread.sleep(1500);

		try {

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			addnote.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			addnoteattachment.sendKeys(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\Excel\\sample-aadhaar-card.png");
			typeaddnote.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);
			robot.keyPress(KeyEvent.VK_E);
			robot.keyRelease(KeyEvent.VK_E);
			robot.keyPress(KeyEvent.VK_S);
			robot.keyRelease(KeyEvent.VK_S);
			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);

			addnoteTo.click();
			Thread.sleep(1500);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);
			robot.keyPress(KeyEvent.VK_H);
			robot.keyRelease(KeyEvent.VK_H);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_U);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_O);

			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);

			robot.keyPress(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_D);
			robot.keyRelease(KeyEvent.VK_D);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			screenshot.screenshot24(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot24.png",
					"Add Note").build());

			addnotesend.click();

			Thread.sleep(2500);
			/*
			 * addnote.click(); driver.manage().timeouts().implicitlyWait(30,
			 * TimeUnit.SECONDS); driver.findElement(By.
			 * xpath("(//iframe[@class='cke_wysiwyg_frame cke_reset'])[4]")).click();
			 * driver.findElement(By.
			 * xpath("(//iframe[@class='cke_wysiwyg_frame cke_reset'])[4]"))
			 * .sendKeys("Testing Add note CRM"); EmailTo.click(); emailsearchTo.click();
			 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 * emailsearchTo.sendKeys(assignedtoName);
			 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
			 * Thread.sleep(2000); Emailtoaddnote.click();Thread.sleep(1500);
			 * Emailtoaddnote.sendKeys("Testing");
			 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 * 
			 * EmailAddAttachment .sendKeys(
			 * "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\GRCCriticalflow\\\\Excel\\\\Customer.xlsx"
			 * ); EmailButtonSend.click(); driver.manage().timeouts().implicitlyWait(30,
			 * TimeUnit.SECONDS);
			 */

		
		Thread.sleep(3500);
		// js.executeScript("arguments[0].scrollIntoView(true);",
		// RecentNoteVerification);
		String textTo = RecentNoteVerification.getText();
		System.out.println(textTo);
		if (textTo.contains("test")) {

			Viewattachment.click();
			Thread.sleep(5000);
			List<String> all30 = new ArrayList<String>(driver.getWindowHandles());

			screenshot.screenshot25(driver, extentreport);
		
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot25.png",
					"Add Note Verification").build());
			driver.switchTo().window(all30.get(1));
			driver.close();
		} else {
			screenshot.screenshot25(driver, extentreport);
			
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot25.png",
					"Add Note Verification").build());
		}
		List<String> all30 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all30.get(0));
		} catch (Exception AddNote) {
			screenshot.screenshot24(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot24.png",
					"Add Note").build());
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}

		try {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='editBtn']")));
				js.executeScript("arguments[0].scrollIntoView(true);", Editticket);
				Editticket.click();

			} catch (ElementClickInterceptedException elementintercptedEdit) {
				robot.keyPress(KeyEvent.VK_PAGE_UP);
				Thread.sleep(3000);
				robot.keyRelease(KeyEvent.VK_PAGE_UP);
				robot.keyPress(KeyEvent.VK_PAGE_UP);
				robot.keyRelease(KeyEvent.VK_PAGE_UP);
				driver.findElement(By.xpath("//button[contains(text(),'Edit')]")).click();
			}
			Thread.sleep(2500);
			Assignedto.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1500);
			Assignedtoname.click();
			Assignedtoname.sendKeys("Testing automation");

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1500);

			Thread.sleep(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			// driver.findElement(By.xpath("//span[@id='select2-city_filter_edit-container']")).click();
			Thread.sleep(1500);
			// driver.findElement(By.xpath("(//input[@class='select2-search__field'])[3]")).sendKeys("chennai");
			Thread.sleep(1500);

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[9]")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@class='select2-search__field'])[3]"))
					.sendKeys("Apply For Name Change - Minor");
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("//span[@id='select2-city_filter_edit-container']")).click();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//input[@class='select2-search__field'])[3]")).sendKeys("chennai");
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2500);
			try {
				BDagentCTA.click();
				BDagentsearch.sendKeys("Dhrubo BD");
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
			} catch (Exception Bdagent1) {

				System.out.println("No BDAgent Needed");
			}
			screenshot.screenshot20(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot20.png",
					"Editticket").build());
			Thread.sleep(5000);

			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(5000);
			try {
				WebElement element5010 = driver.findElement(By.xpath("(//div[@class='actions']/child::input)[1]"));
				JavascriptExecutor executor5010 = (JavascriptExecutor) driver;
				executor5010.executeScript("arguments[0].click();", element5010);
			} catch (Exception updateedit1) {

				driver.findElement(By.xpath("(//input[@type='submit'])[4]"));

			}
			Thread.sleep(2000);
			wait.until(ExpectedConditions.alertIsPresent()).accept();

		} catch (Exception Editticket1) {

			screenshot.screenshot20(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot20.png",
					"Editticket").build());
			Thread.sleep(5000);
		}

		try {
			MenuDownArrow.click();
		} catch (ElementClickInterceptedException MenuDownArrow1) {
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			WebElement element12 = driver
					.findElement(By.xpath("//span[@class='pull-right glyphicon glyphicon-menu-down']"));
			JavascriptExecutor executor12 = (JavascriptExecutor) driver;
			executor12.executeScript("arguments[0].click();", element12);
			// MenuDownArrow.click();
		}
		Thread.sleep(3500);
		try {

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			CannedResponseCTA.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath("//a[@class='nav-link canned_response_folder_select active']")));
			try {
				cannedAddingaDriector.click();
			} catch (StaleElementReferenceException e02) {
				cannedaddingadirector1.click();
			}

			wait.until(ExpectedConditions
					.elementToBeClickable(By.xpath("(//a[@class='email-tempalte-object template_object_new'])[2]")));
			try {
				cannedFollowingEmail.click();
			} catch (StaleElementReferenceException e03) {
				cannedFollowingEmail1.click();
			}

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			cannedEmailaddattachment.sendKeys(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\Excel\\sample-aadhaar-card.png");
			cannedsubject.sendKeys(notesname);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
			cannedselectdate.click();
			Thread.sleep(2000);
			try {
				WebElement element3 = driver.findElement(By.xpath("(//td[@data-date='" + Date12 + "'])[1]"));
				JavascriptExecutor executor3 = (JavascriptExecutor) driver;
				executor3.executeScript("arguments[0].click();", element3);
				// canned date
			} catch (Exception e04) {
				WebElement element3s = driver.findElement(By
						.xpath("(//td[@class='xdsoft_date xdsoft_day_of_week1 xdsoft_date xdsoft_current true,'])[2]"));
				JavascriptExecutor executor3s = (JavascriptExecutor) driver;
				executor3s.executeScript("arguments[0].click();", element3s);

			}

			Thread.sleep(3000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			cannedDescription.sendKeys("Test1");

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			screenshot.screenshot26(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot26.png",
					"Canned response").build());
			WebElement element441 = driver.findElement(By.xpath("//button[@id='take_action_submit_button']"));
			JavascriptExecutor executor441 = (JavascriptExecutor) driver;
			executor441.executeScript("arguments[0].click();", element441);
			// cannedupdateCTA.click();
		} catch (Exception cannedException) {
			screenshot.screenshot26(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot26.png",
					"Canned response").build());
			driver.navigate().back();
		}

		try {
			robot.keyPress(KeyEvent.VK_CONTROL);

			robot.keyPress(KeyEvent.VK_T);
			robot.keyRelease(KeyEvent.VK_T);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			List<String> CRM = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(CRM.get(1));

			driver.get("https://helpdesk.vakilsearch.com/bd_dashboard");
			try {
				Username.sendKeys("testingautomation@yopmail.com");
				Thread.sleep(1500);
				Password.sendKeys("Vakil@123");
				Thread.sleep(1500);
				Signin.click();
				Thread.sleep(4500);
											
				WebElement element31 = driver.findElement(By.xpath("(//li[@class='text-center '])[11]/child::a/child::div/following-sibling::i"));
				actions.moveToElement(element31).click().build().perform();
				Thread.sleep(2500);
				
				WebElement element3 = driver.findElement(By.xpath("(//td[@data-date='" +Date12+ "'])[1]"));
				actions.moveToElement(element3).click().build().perform();
			
				Thread.sleep(2500);

				String subSequence1 = EventTicketId.getText().substring(1, 8);
				String bd = ReferenceTicketID;
				// if (GRCPage.e.contains(subSequence1)) {
				if (bd.contains(subSequence1)) {
					screenshot.screenshot27(driver, extentreport);
					SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
					String Date1 = dateFormat.format(new Date());
					testr.log(Status.PASS,
							MediaEntityBuilder.createScreenCaptureFromPath(
									"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1
											+ "\\Screenshot27.png",
									"Event TicketID Verified").build());

				} else {
					screenshot.screenshot27(driver, extentreport);
					SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
					String Date1 = dateFormat.format(new Date());
					testr.log(Status.FAIL,
							MediaEntityBuilder.createScreenCaptureFromPath(
									"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1
											+ "\\Screenshot27.png",
									"Event TicketID").build());

				}
				driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
			} catch (Exception EventValidation) {
				screenshot.screenshot28(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot28.png",
						"Event creation and Verification failed").build());

				driver.findElement(By.xpath("//a[@rel='nofollow']")).click();

			}

			driver.close();

		} catch (Exception NewCRM) {
			screenshot.screenshot51(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot51.png",
					"Authentication Verification failed").build());
			driver.close();
		}

		List<String> CRM1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(CRM1.get(0));

		Thread.sleep(2000);

		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
//*****if needed you can take this*****//
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		try {
			Thread.sleep(3000);
			Username.sendKeys(Helpdeskuserid);

			Password.sendKeys(helpdeskpassword);
			Signin.click();
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Helpdesk.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Tickets.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// ticketid.sendKeys(GRCPage.e);
			ticketid.sendKeys(ReferenceTicketID);
			Search.click();
			Firstservice.click();
		} catch (Exception NewsignUp) {
			System.out.println("Helpdesk Login");
		}

		// js.executeScript("arguments[0].scrollIntoView(true);", CreateQuotation);
		try {
			try {

				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
				CreatenewQuotation.click();
				CreateQuotation.click();
				CreateQuotation.click();
			} catch (ElementClickInterceptedException e211) {

				Thread.sleep(1500);
				js.executeScript("arguments[0].scrollIntoView(true);", CreatenewQuotation);

				robot.keyPress(KeyEvent.VK_PAGE_UP);
				robot.keyRelease(KeyEvent.VK_PAGE_UP);
				// CreatenewQuotation.click();
				Thread.sleep(3500);
				CreateQuotation.click();
				CreateQuotation.click();
			}

			// EventCheckbox.click();

			Thread.sleep(5000);
			Set<String> allwindowsid = driver.getWindowHandles();
			List<String> all = new ArrayList<String>(allwindowsid);
			all.addAll(allwindowsid);
			driver.switchTo().window(all.get(1));

			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='name']//child::input)[1]")));
			QNameofthecustomer.click();

			QNameofthecustomer.sendKeys(QNameOfCustomer);
			Qaddress.click();

			Qaddress.sendKeys(qaddress);
			Qpincode.click();
			Qpincode.sendKeys(qpincode);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement QPaymenttypescroll = driver.findElement(By.xpath("//option[contains(text(),'Full Payment')]"));
			js.executeScript("arguments[0].scrollIntoView(true);", QPaymenttypescroll);

			PaymentType.click();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2500);
			screenshot.screenshot29(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot29.png",
					"Quotation Creation").build());
			WebElement Partialamount = driver
					.findElement(By.xpath("(//div[@class='service-sub-title']/child::input)[2]"));

			Partialamount.sendKeys("100");
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			Partialamount.sendKeys("100");

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			// js.executeScript("arguments[0].scrollIntoView(true);", sendquotation);

			Thread.sleep(4500);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement QConfirmquotationScroll = driver.findElement(By.xpath("//a[@class='send confirm_value']"));
			js.executeScript("arguments[0].scrollIntoView(true);", QConfirmquotationScroll);
			try {
				WebElement element44100 = driver.findElement(By.xpath("//input[@class='send quotation_send']"));
				JavascriptExecutor executor44100 = (JavascriptExecutor) driver;
				executor44100.executeScript("arguments[0].click();", element44100);
			} catch (Exception quo) {
				WebElement element44100 = driver.findElement(By.xpath("//a[@class='send confirm_value']"));
				JavascriptExecutor executor44100 = (JavascriptExecutor) driver;
				executor44100.executeScript("arguments[0].click();", element44100);

			}

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

			try {
				DeactivateYES.click();
				Thread.sleep(3500);

				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			} catch (NoSuchElementException deactivate) {
				CreatenewQuotation.click();
				Thread.sleep(2500);
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_CONTROL);

			}
			Thread.sleep(3000);
			Thread.sleep(1500);
			driver.close();

			driver.switchTo().window(all.get(0));
			Thread.sleep(2500);

		} catch (Exception CreatenewQuotation1) {
			System.out.println(CreatenewQuotation1);
			screenshot.screenshot29(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL,
					MediaEntityBuilder
							.createScreenCaptureFromPath("\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\"
									+ Date1 + "\\Screenshot29.png", "Quotation Creation" + CreatenewQuotation1)
							.build());
			System.out.println(CreatenewQuotation1);
			driver.close();

		}
		try {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(2000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"(//td[@style='border-bottom:1px solid #f7f7f7;padding:10px 14px 10px 10px;text-align:right;'])[1]")));
			String AmountValidation1 = driver.findElement(By.xpath(
					"(//td[@style='border-bottom:1px solid #f7f7f7;padding:10px 14px 10px 10px;text-align:right;'])[1]"))
					.getText().substring(2, 4);
			Thread.sleep(3500);
			driver.findElement(By.xpath("(//a[contains(text(),'Pay Now')])[1]")).click();
			Thread.sleep(1500);
			List<String> all32 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(all32.get(1));
			Thread.sleep(6000);
			String PaynowAmountValidation = driver.findElement(By.xpath("//h2[@class='styles_price__px1hT']")).getText()
					.substring(1, 3);
			Thread.sleep(2000);
			if (AmountValidation1.contains(PaynowAmountValidation)) {
				screenshot.screenshot30(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot30.png",
						"Quotation Creation amount verification").build());
			} else {
				screenshot.screenshot30(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot30.png",
						"Quotation Creation amount verification").build());
			}
			driver.close();
			driver.switchTo().window(all32.get(0));
		} catch (Exception QuotationverificationFailed) {

			System.out.println(QuotationverificationFailed);
		}

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		CreatenewQuotation.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			editquoation.click();
			Thread.sleep(2500);
			List<String> all2 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(all2.get(1));
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

			Thread.sleep(2500);

//		Set<String> allwindowsid = driver.getWindowHandles();
//		List<String> all = new ArrayList<String>(allwindowsid);
//		all.addAll(allwindowsid);
//		driver.switchTo().window(all.get(2));
			WebElement Partialamount = driver
					.findElement(By.xpath("(//div[@class='service-sub-title']/child::input)[2]"));
			Partialamount.sendKeys("101");
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			Partialamount.sendKeys("101");

			screenshot.screenshot32(driver, extentreport);
			SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMddyyyy");
			String Date11 = dateFormat1.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date11 + "\\Screenshot32.png",
					"Edit Quotation").build());
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(1500);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(1500);
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			js.executeScript("arguments[0].scrollIntoView(true);", ConfirmquotationEdit);

			JavascriptExecutor java = (JavascriptExecutor) driver;
			java.executeScript("arguments[0].click();", ConfirmquotationEdit);

			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

			JavascriptExecutor java1 = (JavascriptExecutor) driver;
			java1.executeScript("arguments[0].click();", sendquotationedit);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2500);
			driver.close();
			Thread.sleep(2500);
			driver.switchTo().window(all2.get(0));
			;
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			String AmountValidation2 = driver.findElement(By.xpath(
					"(//td[@style='border-bottom:1px solid #f7f7f7;padding:10px 14px 10px 10px;text-align:right;'])[1]"))
					.getText().substring(2, 4);
			driver.findElement(By.xpath("(//a[contains(text(),'Pay Now')])[1]")).click();
			List<String> all33 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(all33.get(1));

			String PaynowAmountValidation2 = driver.findElement(By.xpath("//h2[@class='styles_price__px1hT']"))
					.getText().substring(1, 3);

			if (AmountValidation2.contains(PaynowAmountValidation2)) {
				screenshot.screenshot31(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot31.png",
						"Edit Quotation amount verification").build());

			} else {
				screenshot.screenshot31(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot31.png",
						"Edit Quotation amount verification").build());

			}

			Thread.sleep(2500);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);

			driver.close();
			driver.switchTo().window(all33.get(0));
		} catch (Exception EditQuotation1) {
			screenshot.screenshot32(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot32.png",
					"Edit Quotation").build());
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2500);
		wait.until(ExpectedConditions.elementToBeClickable(CreatenewQuotation));
		CreatenewQuotation.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			Generatequotation.click();
			Thread.sleep(2000);
			List<String> all4 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(all4.get(1));
			Thread.sleep(2000);
			WebElement scrollforquotationview = driver
					.findElement(By.xpath("(//span[@class='glyphicon glyphicon-paperclip'])[2]/child::a"));
			js.executeScript("arguments[0].scrollIntoView(true);", scrollforquotationview);
			screenshot.screenshot33(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot33.png",
					"Generate Quotation").build());
		} catch (Exception GenerateQuotation1) {
			screenshot.screenshot33(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot33.png",
					"Generate Quotation").build());
			testr.log(Status.FAIL, "Generate Quotation Failed");
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<String> all4 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all4.get(1));
		Thread.sleep(2000);

		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(all4.get(0));
		Thread.sleep(2000);
		try {
			deactivateQuotation.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			String AmountValidation3 = driver.findElement(By.xpath(
					"//td[@style='border-bottom:1px solid #f7f7f7;padding:10px 14px 10px 10px;text-align:right;']"))
					.getText();
			driver.findElement(By.xpath("(//a[contains(text(),'Pay Now')])[1]")).click();
			List<String> all35 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(all35.get(1));

			String PaynowAmountValidation3 = driver.findElement(By.xpath("//h3[@class='p-2']/child::b")).getText();

			if ("This quotation has been deactivated.".contains(PaynowAmountValidation3)) {
				screenshot.screenshot34(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot34.png",
						"DeactivateQuotation").build());
			} else {
				screenshot.screenshot34(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot34.png",
						"Deactivate Quotation VERIFICATION").build());
			}
			testr.log(Status.PASS, "DeactivateQuotation success");
			driver.close();
			driver.switchTo().window(all35.get(0));
		} catch (Exception DeactivateQuotation1) {
			testr.log(Status.FAIL, "DeactivateQuotation Failed");
			driver.close();

		}

		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(4000);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2000);
		try {
			LoadmoreMessagesCTA.click();
			screenshot.screenshot35(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot35.png",
					"LoadmoreMessage").build());
		} catch (Exception LoadmoreMessage) {

			screenshot.screenshot35(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot35.png",
					"LoadmoreMessage").build());
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);

//		driver.switchTo().window(all.get(0));
		Thread.sleep(1500);
		System.out.println("Edit section");
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		Thread.sleep(1500);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(1500);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(1500);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);
		robot.keyPress(KeyEvent.VK_ADD);
		robot.keyRelease(KeyEvent.VK_ADD);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		try {
			CrosssaleCTA.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1500);
			Selectcrosssale.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1500);
			Selectcrosssale.sendKeys(CrossSaleName);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1500);
			screenshot.screenshot36(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot36.png",
					"Crosssale").build());
			Createcrosssale.click();
			Thread.sleep(2500);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);

		} catch (Exception Crosssale1) {
			screenshot.screenshot36(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot36.png",
					"Crosssale").build());
		}
		Thread.sleep(10000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(10000);
		try {
			RecentTickets.click();
			Thread.sleep(2500);
			screenshot.screenshot37(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot37.png",
					"RecentTicket").build());
			Recenetfirstticket.click();
			Thread.sleep(5000);

		} catch (Exception RecentTicket1) {
			screenshot.screenshot37(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot37.png",
					"RecentTicket").build());
		}
		String T1 = recentTicketID.getText().substring(1, 8);
		System.out.println(T1);
		driver.navigate().back();

		try {
			driver.findElement(By.xpath("(//button[@class='close'])[3]")).click();
		} catch (NoSuchElementException CLose) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		} catch (ElementNotInteractableException close1) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
		Thread.sleep(4000);
		try {
			try {
				Merge.click();
			} catch (ElementClickInterceptedException Merge34) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_R);
				robot.keyPress(KeyEvent.VK_R);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				Thread.sleep(2500);
				Merge.click();
			}

			try {
				Thread.sleep(2000);
				mergesearchticketId1.click();
			} catch (NoSuchElementException m9ergesearchticketId1) {
				driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
				Thread.sleep(2000);
				mergesearchticketId1.click();
				Thread.sleep(1500);
			}

			robot.keyPress(KeyEvent.VK_3);
			robot.keyRelease(KeyEvent.VK_3);
			robot.keyPress(KeyEvent.VK_BACK_SPACE);
			robot.keyRelease(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(3000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			mergesearchticketId.sendKeys(T1);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1500);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(1500);
			mergeSecondcheckbox.click();
			Thread.sleep(1500);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			screenshot.screenshot38(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot38.png",
					"Merge").build());
			mergesavechanges.click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(2000);
			Thread.sleep(3500);
			driver.switchTo().alert().accept();

		} catch (Exception Merge1) {
			screenshot.screenshot38(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot38.png",
					"Merge").build());
		}
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(text(),'UnMerge')]")).click();
		Thread.sleep(5500);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(2500);
		WebElement unmerg = driver
				.findElement(By.xpath("//p[contains(text(),'This ticket has been unmerged from')]/child::a"));
		// js.executeScript("arguments[0].scrollIntoView(true);", unmerg);
		String substring1 = unmerg.getText().substring(1, 8);
		if (substring1.contains(ReferenceTicketID)) {
			screenshot.screenshot50(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot50.png",
					"UnMerge").build());
		} else {
			screenshot.screenshot50(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot50.png",
					"UnMerge").build());

		}

		try {

			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			robot.keyRelease(KeyEvent.VK_PAGE_UP);
			Magickeycopy.click();

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_C);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3500);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_N);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3500);
			List<String> all6 = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(all6.get(1));
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(3500);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3500);
			String title = driver.getTitle();
			System.out.println(title + " Title");
			String A2 = "GRC | Vakilsearch";
			if (title.contentEquals(A2)) {
				screenshot.screenshot39(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot39.png",
						"Magic Key title").build());

			} else {
				screenshot.screenshot39(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot39.png",
						"Magic Key title").build());
			}

			driver.close();
			driver.switchTo().window(all6.get(0));
			Thread.sleep(5000);
			screenshot.screenshot40(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot40.png",
					"Magic Key").build());
		} catch (Exception magickey1) {
			screenshot.screenshot40(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot40.png",
					"Magic Key").build());
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		try {
			CustomerDashboard.click();
			Thread.sleep(3000);
			screenshot.screenshot41(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot41.png",
					"Customerdashboard").build());
			driver.navigate().back();

		} catch (Exception Customerdashboard1) {
			screenshot.screenshot41(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot41.png",
					"Customerdashboard").build());
		}
		Thread.sleep(3000);

		GRCCTA.click();
		List<String> all3 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all3.get(1));
		Thread.sleep(10000);
		try {

			try {
				WebElement element301 = driver.findElement(
						By.xpath("(//div[@class='styles_backdrop__Ofn4m']/child::div/child::div/child::div)[2]"));
				JavascriptExecutor executor301 = (JavascriptExecutor) driver;
				executor301.executeScript("arguments[0].click();", element301);

			} catch (Exception Closepopup) {
				System.out.println("No popup");
			}

			try {
				GRCPageobject.ProfileMenu.click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[contains(text(),'Sign out')]")).click();
			} catch (ElementClickInterceptedException e290) {
				driver.findElement(By.xpath("//div[contains(text(),'Continue your service request from here ')]"))
						.click();
				Thread.sleep(1500);
				GRCPageobject.ProfileMenu.click();

				Thread.sleep(2000);
				driver.findElement(By.xpath("//p[contains(text(),'Sign out')]")).click();
			} finally {
				System.out.println("GRC");
			}

			screenshot.screenshot42(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.PASS, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot42.png",
					"Grc Redirection").build());
		} catch (Exception Grcredirection1) {
			screenshot.screenshot42(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			testr.log(Status.FAIL, MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\VakilsearchSmokeTesting\\" + Date1 + "\\Screenshot42.png",
					"Grc Redirection").build());

		}
		driver.close();
		driver.switchTo().window(all3.get(0));
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("(//div[@class='collapse navbar-collapse']/child::ul/child::li/child::a)[3]"))
					.click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		} catch (Exception Logout1) {
			System.out.println("already Logout");

		}
		// NewCRM newCRM = new NewCRM();
		// newCRM.newCRM(driver, ReferenceTicketID, CrmUsernames, CrmUserpassword,
		// extentreport);
	}

}
