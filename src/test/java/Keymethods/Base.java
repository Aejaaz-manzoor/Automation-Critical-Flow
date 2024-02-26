package Keymethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.tools.ant.taskdefs.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import CriticalFlowRun.Criticalflow;
import MainBase.CriticalFlowDetail;
import PageFactory.HelpdeskPageobject;
import PageFactory.HomescreenPageobject;
import PageFactory.LoginPageobjects;



	public class Base extends HelpdeskPageobject {

		ExtentTest test;

		ScreenShot screenshot = new ScreenShot();
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMddyyyyHHMMSS");
		String Date11 = dateFormat1.format(new Date());
		

		public void Base1(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport,String Date12)
				throws InterruptedException, AWTException, IOException {
			test = extentreport.createTest("Vakilsearch Test");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			

			driver.get("https://vakilsearch.com/");

			PageFactory.initElements(driver, LoginPageobjects.class);
			if (driver.getTitle() != "Online Legal Services for Startups & SMEs in India | Vakil Search") {
				screenshot.screenshot47(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				test.log(Status.PASS,
						MediaEntityBuilder.createScreenCaptureFromPath(
								"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot47.png",
					"VakilSearchURL launched").build());

			} else {   
				screenshot.screenshot47(driver, extentreport);  
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				test.log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(
								"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot47.png",
					"VakilSearchURL").build());
 
			}
 
			// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@datainput='1']")));
			// Thread.sleep(2000);

		}

		public void PrivateLimited(WebDriver driver, String Username, String Mobilenumber, ExtentReports extentreport,String Date12)
				throws IOException, InterruptedException, AWTException {

			test = extentreport.createTest("Private Limited Company");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[contains(text(),'Business Setup')])[1]")));
			LoginPageobjects.Businesssetup.click();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Private Limited Company')])[1]")));
			long start = System.currentTimeMillis();
			LoginPageobjects.Pvtdcompany.click();
			long finish = System.currentTimeMillis();
			long totalTime = finish - start;
			System.out.println("Total Time for page load - " + totalTime);

			System.out.println(driver.getTitle().toString());
			if (driver.getTitle() != "Private Limited (Pvt Ltd) Company Registration Online In India") {
				screenshot.screenshot48(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				test.log(Status.PASS,
						MediaEntityBuilder.createScreenCaptureFromPath(
								"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot48.png",
					"PVT page Launched" + totalTime + "ms").build());

			} else {
				screenshot.screenshot48(driver, extentreport);
				SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String Date1 = dateFormat.format(new Date());
				test.log(Status.FAIL,
						MediaEntityBuilder.createScreenCaptureFromPath(
								"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1 + "\\Screenshot48.png",
					"PVT page Launched").build());

			}
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email']")));
			LoginPageobjects.Email.click();
			if (LoginPageobjects.Email.isEnabled()) {

				test.log(Status.PASS, "Email Username clicked");
			} else {

				test.log(Status.FAIL, "Email Username notfound");
			}
			LoginPageobjects.Email.sendKeys("shakthi" + Date11 + "@yopmail.com");
			Thread.sleep(2500);
			
			WebElement phonenumber1 = driver.findElement(By.xpath("(//input[@id='phone'])[1]"));
			JavascriptExecutor phonenumber2 = (JavascriptExecutor) driver;
			phonenumber2.executeScript("arguments[0].click();", phonenumber1);
		
			if (LoginPageobjects.Phonenumber.isEnabled()) {

				test.log(Status.PASS, " Phonenumber field clicked");
			} else {

				test.log(Status.FAIL, "Phonenumber field notfound");
			}
			LoginPageobjects.Phonenumber.sendKeys("91" + Date12);
			Thread.sleep(5000);

			
			JavascriptExecutor executorview1151 = (JavascriptExecutor) driver;
			executorview1151.executeScript("arguments[0].click();", City);
			
			LoginPageobjects.City.sendKeys("chen");
			if (LoginPageobjects.City.isEnabled()) {

				test.log(Status.PASS, "Select City clicked");
			} else {

				test.log(Status.FAIL, "Select City field notfound");
			}

			Thread.sleep(4000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Chennai, Tamil Nadu')]"))).click();
			
			
			Robot robot = new Robot();

//			if (LoginPageobjects.whatsapptogleoff.isSelected()) {
	//
//				test.log(Status.PASS, "whatsapptogle off");
//			} else {
	//System.out.println("failed");
//				test.log(Status.FAIL, "whatsapptogleoff Failed");
//			}
		
			Thread.sleep(2000);
			wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath("(//button[@type='submit'])[1]")));
			long start1 = System.currentTimeMillis();
			WebElement findElement9 = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
			JavascriptExecutor executorview111 = (JavascriptExecutor) driver;
			executorview111.executeScript("arguments[0].click();", findElement9);
			System.out.println("succes1");

			long finish1 = System.currentTimeMillis();
			long totalTime1 = finish1 - start1;
			System.out.println("Total Time for page load - " + totalTime1);
			Thread.sleep(2000);
			screenshot.screenshot52(driver, extentreport);
			SimpleDateFormat dateFormat1 = new SimpleDateFormat("MMddyyyy");
			String Date11 = dateFormat1.format(new Date());
			test.log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(
							"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date11 + "\\Screenshot52.png",
					"Pvt Login " + totalTime1 + "ms").build());

			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Skip it for now')]")));
			driver.findElement(By.xpath("//span[contains(text(),'Skip it for now')]")).click();
			Thread.sleep(2000);
			LoginPageobjects.Ageofbusiness.click();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// LoginPageobjects.Next.click();

			// .findElement(By.xpath("//button[@class='styles_customBtn__nb6mV
			// styles_next__NvT8q false false ']"))
			// .click();

			long start21 = System.currentTimeMillis();
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Next')]"))).getText();

			long finish21 = System.currentTimeMillis();
			long totalTime21 = finish21 - start21;
			System.out.println("Total Time for page load - " + totalTime21);

			test.log(Status.PASS, "Mobile OTP Redirection " + totalTime21 + "ms");

			long start211 = System.currentTimeMillis();
			driver.findElement(By.xpath("//p[contains(text(),'Next')]")).click();
			wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")));
			driver.findElement(By.xpath("(//span[contains(text(),'Proceed to pay')])[1]")).click();

			long finish2111 = System.currentTimeMillis();
			long totalTime2111 = finish2111 - start211;
			System.out.println("Total Time for page load - " + totalTime21);

			test.log(Status.PASS, "PaymentPage redirection " + totalTime2111 + "ms");
		}
		
		
			
		}
		

