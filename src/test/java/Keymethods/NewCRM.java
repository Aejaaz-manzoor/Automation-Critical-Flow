package Keymethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

import PageFactory.GRCPageobject;

public class NewCRM extends GRCPageobject {
	ExtentTest test;
	public void newCRM(WebDriver driver,String ReferenceTicketID, String CrmUsernames, String CrmUserpassword,ExtentReports extentreport) throws InterruptedException, AWTException, IOException {
Robot robot = new Robot();
Thread.sleep(3000);test = extentreport.createTest("NewCRM");
WebDriverWait wait = new WebDriverWait(driver, 100);
ScreenShot screenshot = new ScreenShot();
try {
	driver.get("https://helpdesk.vakilsearch.com/login");
	
		Username.sendKeys("dhruborm@gmail.com");
		Thread.sleep(1500);
		Password.sendKeys("Vakil@123");
		Thread.sleep(1500);
		Signin.click();
		Thread.sleep(1500);
		try {
		driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
		}catch(NoSuchElementException HomeNewcrm) {
			System.out.println(HomeNewcrm);	
			
		}
		driver.findElement(By.xpath("(//li[@class='text-center '])[9]")).click();
		//driver.findElement(By.xpath("(//span[@class='newTicket floatNone'])[1]")).getText().substring(1, 7);
		String InternalNotes = CrmInternalNote.getText().substring(1, 8);
		
		System.out.println(InternalNotes);
		if ( InternalNotes.contains(ReferenceTicketID)) {
			screenshot.screenshot43(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			test.log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(
							"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"+Date1+"\\Screenshot43.png",
							"InternalNotes").build());
		} else {
			screenshot.screenshot43(driver, extentreport);
			SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String Date1 = dateFormat.format(new Date());
			test.log(Status.PASS,
					MediaEntityBuilder.createScreenCaptureFromPath(
							"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"+Date1+"\\Screenshot43.png",
							"InternalNotes").build());
		}
		screenshot.screenshot44(driver, extentreport);
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
		String Date1 = dateFormat.format(new Date());
		test.log(Status.PASS,
				MediaEntityBuilder.createScreenCaptureFromPath(
						"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"+Date1+"\\Screenshot44.png",
						"Note Validation").build());
} catch (Exception Newcrnotevalidation1) {
	screenshot.screenshot44(driver, extentreport);
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
	String Date1 = dateFormat.format(new Date());
	test.log(Status.PASS,
			MediaEntityBuilder.createScreenCaptureFromPath(
					"\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"+Date1+"\\Screenshot44.png",
					"Note Validation").build());
}
	}

}
