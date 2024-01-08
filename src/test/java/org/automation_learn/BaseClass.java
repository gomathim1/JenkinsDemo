package org.automation_learn;


import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 static WebDriver driver;

	public void setUpBrowser(String browserName, String Url) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(Url);
		} else {
			WebDriverManager.edgedriver().setup();
			EdgeOptions option = new EdgeOptions();
			option.addArguments("inprivate");
			driver = new EdgeDriver(option);
			driver.get(Url);
		}

	}

	public void waits() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void click(WebElement element) {
		element.click();
	}

	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	public String getText(WebElement element) {
		return element.getText();
	}

	
	/*public void failed_screenshot(ITestResult result) {
		if (ITestResult.FAILURE == result.getStatus()) {

			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File(
						"C:\\Users\\hp\\eclipse-workspace\\automation\\src\\main\\resources\\Screenshot_Failed\\screenshot.png"));
			} catch (IOException e) { // TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/

	//}

}
