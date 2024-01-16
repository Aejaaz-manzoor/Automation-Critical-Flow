package Keymethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class slack {
	

	@Test
	public void slackMessageTest(WebDriver driver,String screenshotLocation,String extentreportLocation,String messageInputdata) throws AWTException, InterruptedException, IOException {
	
		ExtenScreenshot(driver,screenshotLocation,extentreportLocation);
		loginToSlack(driver);
		sendMessageInSlack(driver,screenshotLocation,extentreportLocation,messageInputdata);
		 
		
	}
	
	
	public void loginToSlack(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://slack.com/intl/en-in");
		WebElement signInLink = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'Sign in')])[1]")));
		signInLink.click();
		WebElement signInWithGoogle = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Sign In With Google')]")));
		signInWithGoogle.click();
		// Add login steps here
	}
	private void sendMessageInSlack(WebDriver driver,String screenshotLocation,String extentreportLocation,String messageInputdata) throws InterruptedException, AWTException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		Robot robot = new Robot();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sakthi.priyan@vakilsearch.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']"))).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shakthi_07");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Next')]"))).click();
		// Add your Slack messaging steps here
		try {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'7')]//parent::div//parent::div)[1]")))
			.click();
	
	Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		
		// Add your Slack messaging steps here
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(8000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(text(),'7')]//parent::div//parent::div)[1]")))
				.click();
		
		Thread.sleep(8000);
		}				Set<String> handles = driver.getWindowHandles();
        // Switch to the second tab
        for (String handle : handles) {
            driver.switchTo().window(handle);
        }
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'use Slack in your browser')]")))
				.click();
		Thread.sleep(6000);
		WebElement channelElement = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("(//span[contains(text(),'automation-testing-reports')])[1]/parent::span/parent::div")));
		channelElement.click();
		Thread.sleep(6000);
		WebElement messageInput = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ql-placeholder']")));
	
		messageInput.sendKeys(messageInputdata);
		Thread.sleep(7000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(6000);
		// Add dynamic file path or make it configurable
		
		// Perform file upload actions using Robot class
		uploadFileWithRobot(robot, screenshotLocation);
//		WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
//				"//button[@class='c-button-unstyled c-icon_button c-icon_button--size_small c-wysiwyg_container__button c-wysiwyg_container__button--send c-wysiwyg_container__button--disabled c-button--disabled c-icon_button--default']")));
//		sendButton.click();
	
		
			Thread.sleep(4000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_U);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(7000);
	

		// Add dynamic file path or make it configurable
		
		// Perform file upload actions using Robot class
		uploadFileWithRobot1(robot, extentreportLocation);
		WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
			"//button[@aria-label='Send now']")));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		//sendButton.click();
	}
	private void uploadFileWithRobot(Robot robot, String screenshotLocation) throws InterruptedException {
		for (char c : screenshotLocation.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);
			
		}
		Thread.sleep(8000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
	}
	private void uploadFileWithRobot1(Robot robot, String extentreportLocation) throws InterruptedException {
		for (char c : extentreportLocation.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);
			
		}
		Thread.sleep(8000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
	}
	public void ExtenScreenshot(WebDriver driver,String screenshotLocation ,String extentreportLocation) throws InterruptedException, IOException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		driver.get(extentreportLocation);
		Thread.sleep(8000);
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='fa fa-bar-chart']")))
				.click();
		TakesScreenshot screenshot1 = ((TakesScreenshot) driver);
		File srcFile1 = screenshot1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1,
				new File(screenshotLocation));
		
	}
}