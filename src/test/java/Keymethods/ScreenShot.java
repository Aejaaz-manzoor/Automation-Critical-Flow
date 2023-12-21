package Keymethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
  
public class ScreenShot {
	ExtentTest test;
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
	String Date1 = dateFormat.format(new Date());

	public void screenshot1(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot1 = ((TakesScreenshot) driver);
		File srcFile1 = screenshot1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile1,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot1.png"));

	}

	public void screenshot2(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot2 = ((TakesScreenshot) driver);
		File srcFile2 = screenshot2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile2,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot2.png"));

	}

	public void screenshot3(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot3 = ((TakesScreenshot) driver);
		File srcFile3 = screenshot3.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile3,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot3.png"));

	}

	public void screenshot4(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot4 = ((TakesScreenshot) driver);
		File srcFile4 = screenshot4.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile4,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot4.png"));

	}

	public void screenshot5(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot5 = ((TakesScreenshot) driver);
		File srcFile5 = screenshot5.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile5,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot5.png"));

	}

	public void screenshot6(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot6 = ((TakesScreenshot) driver);
		File srcFile6 = screenshot6.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile6,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot6.png"));

	}

	public void screenshot7(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot7 = ((TakesScreenshot) driver);
		File srcFile7 = screenshot7.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile7,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot7.png"));

	}

	public void screenshot8(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot8 = ((TakesScreenshot) driver);
		File srcFile8 = screenshot8.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile8,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot8.png"));

	}

	public void screenshot9(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot9 = ((TakesScreenshot) driver);
		File srcFile9 = screenshot9.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile9,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot9.png"));

	}

	public void screenshot10(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot10 = ((TakesScreenshot) driver);
		File srcFile10 = screenshot10.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile10,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot10.png"));

	}

	public void screenshot11(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot11 = ((TakesScreenshot) driver);
		File srcFile11 = screenshot11.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile11,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" 
						+ Date1 + "\\\\Screenshot11.png"));

	}

	public void screenshot12(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot12 = ((TakesScreenshot) driver);
		File srcFile12 = screenshot12.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile12,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot12.png"));

	}

	public void screenshot13(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot13 = ((TakesScreenshot) driver);
		File srcFile13 = screenshot13.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile13,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot13.png"));

	}

	public void screenshot14(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot14 = ((TakesScreenshot) driver);
		File srcFile14 = screenshot14.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile14,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot14.png"));

	}

	public void screenshot15(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot15 = ((TakesScreenshot) driver);
		File srcFile15 = screenshot15.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile15,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot15.png"));

	}

	public void screenshot16(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot16 = ((TakesScreenshot) driver);
		File srcFile16 = screenshot16.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile16,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot16.png"));

	}

	public void screenshot17(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot17 = ((TakesScreenshot) driver);
		File srcFile17 = screenshot17.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile17,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot17.png"));

	}

	public void screenshot18(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot18 = ((TakesScreenshot) driver);
		File srcFile18 = screenshot18.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile18,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot18.png"));

	}

	public void screenshot19(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot19 = ((TakesScreenshot) driver);
		File srcFile19 = screenshot19.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile19,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot19.png"));

	}

	public void screenshot20(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot20 = ((TakesScreenshot) driver);
		File srcFile20 = screenshot20.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile20,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot20.png"));

	}
	public void screenshot21(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot21 = ((TakesScreenshot) driver);
		File srcFile21 = screenshot21.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile21,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" 
						+ Date1 + "\\\\Screenshot21.png"));

	}

	public void screenshot22(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot22 = ((TakesScreenshot) driver);
		File srcFile22 = screenshot22.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile22,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot22.png"));

	}

	public void screenshot23(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot23 = ((TakesScreenshot) driver);
		File srcFile23 = screenshot23.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile23,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot23.png"));

	}

	public void screenshot24(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot24 = ((TakesScreenshot) driver);
		File srcFile24 = screenshot24.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile24,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot24.png"));

	}

	public void screenshot25(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot25 = ((TakesScreenshot) driver);
		File srcFile25 = screenshot25.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile25,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot25.png"));

	}

	public void screenshot26(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot26 = ((TakesScreenshot) driver);
		File srcFile26 = screenshot26.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile26,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"  + Date1
						+ "\\Screenshot26.png"));

	}

	public void screenshot27(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot27 = ((TakesScreenshot) driver);
		File srcFile27 = screenshot27.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile27,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot27.png"));

	}

	public void screenshot28(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot28 = ((TakesScreenshot) driver);
		File srcFile28 = screenshot28.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile28,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot28.png"));

	}

	public void screenshot29(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot29 = ((TakesScreenshot) driver);
		File srcFile29 = screenshot29.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile29,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot29.png"));

	}

	public void screenshot30(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot30 = ((TakesScreenshot) driver);
		File srcFile30 = screenshot30.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile30,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot30.png"));

	}
	public void screenshot31(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot31 = ((TakesScreenshot) driver);
		File srcFile31 = screenshot31.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile31,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"
						+ Date1 + "\\\\Screenshot31.png"));

	}

	public void screenshot32(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot32 = ((TakesScreenshot) driver);
		File srcFile32 = screenshot32.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile32,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot32.png"));

	}

	public void screenshot33(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot33 = ((TakesScreenshot) driver);
		File srcFile33 = screenshot33.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile33,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot33.png"));

	}

	public void screenshot34(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot34 = ((TakesScreenshot) driver);
		File srcFile34 = screenshot34.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile34,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot34.png"));

	}

	public void screenshot35(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot35 = ((TakesScreenshot) driver);
		File srcFile35 = screenshot35.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile35,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot35.png"));

	}

	public void screenshot36(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot36 = ((TakesScreenshot) driver);
		File srcFile36 = screenshot36.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile36,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot36.png"));

	}

	public void screenshot37(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot37 = ((TakesScreenshot) driver);
		File srcFile37 = screenshot37.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile37,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot37.png"));

	}

	public void screenshot38(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot38 = ((TakesScreenshot) driver);
		File srcFile38 = screenshot38.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile38,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot38.png"));

	}

	public void screenshot39(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot39 = ((TakesScreenshot) driver);
		File srcFile39 = screenshot39.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile39,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot39.png"));

	}

	public void screenshot40(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot40 = ((TakesScreenshot) driver);
		File srcFile40 = screenshot40.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile40,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot40.png"));


	}
	public void screenshot41(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot41 = ((TakesScreenshot) driver);
		File srcFile41 = screenshot41.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile41,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\"
						+ Date1 + "\\\\Screenshot41.png"));

	}

	public void screenshot42(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot42 = ((TakesScreenshot) driver);
		File srcFile42 = screenshot42.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile42,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot42.png"));

	}

	public void screenshot43(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot43 = ((TakesScreenshot) driver);
		File srcFile43 = screenshot43.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile43,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot43.png"));

	}

	public void screenshot44(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot44 = ((TakesScreenshot) driver);
		File srcFile44 = screenshot44.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile44,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot44.png"));

	}

	public void screenshot45(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot45 = ((TakesScreenshot) driver);
		File srcFile45 = screenshot45.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile45,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot45.png"));

	}

	public void screenshot46(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot46 = ((TakesScreenshot) driver);
		File srcFile46 = screenshot46.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile46,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot46.png"));

	}

	public void screenshot47(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot47 = ((TakesScreenshot) driver);
		File srcFile47 = screenshot47.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile47,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot47.png"));

	}

	public void screenshot48(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot48 = ((TakesScreenshot) driver);
		File srcFile48 = screenshot48.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile48,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot48.png"));

	}

	public void screenshot49(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot49 = ((TakesScreenshot) driver);
		File srcFile49 = screenshot49.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile49,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot49.png"));

	}

	public void screenshot50(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot50 = ((TakesScreenshot) driver);
		File srcFile50 = screenshot50.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile50,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot50.png"));

	}
	public void screenshot51(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot51 = ((TakesScreenshot) driver);
		File srcFile51 = screenshot51.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile51,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot51.png"));

	}
	public void screenshot52(WebDriver driver, ExtentReports extentreport) throws IOException {

		TakesScreenshot screenshot52 = ((TakesScreenshot) driver);
		File srcFile52 = screenshot52.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile52,
				new File("\\\\14.140.167.188\\Vakilsearch\\Vakilsearch_Smoke_Testing\\" + Date1
						+ "\\Screenshot52.png"));

	}
}
