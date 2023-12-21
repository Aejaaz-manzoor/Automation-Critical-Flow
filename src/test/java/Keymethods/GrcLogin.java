package Keymethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import MainBase.CriticalFlowDetail;
import PageFactory.GRCPageobject;

public class GrcLogin {

	ExtentTest test;

	public GrcLogin(WebDriver driver, String GRCMobileNumber) throws InterruptedException {
		PageFactory.initElements(driver, GRCPageobject.class);

		GRCPageobject.GRCUsername.sendKeys(GRCMobileNumber);
		GRCPageobject.GRCPhonenumberConfirm.click();
		Thread.sleep(15000);
//		GRCPageobject.GRCOTP1.sendKeys("0");
//		GRCPageobject.GRCOTP2.sendKeys("0");
//		GRCPageobject.GRCOTP3.sendKeys("0");
//		GRCPageobject.GRCOTP4.sendKeys("0");
		GRCPageobject.GRCOTPConfirm.click();
		Thread.sleep(1500);
		GRCPageobject.GRCMailId0.click();
		GRCPageobject.GRCMailIdConfirm.click();


		
	}
	
}
