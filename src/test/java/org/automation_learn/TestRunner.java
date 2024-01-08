package org.automation_learn;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(org.automation_learn.FailedExample.class)
public class TestRunner extends BaseClass{

	/*
	 * @Test public void formFill() { setUpBrowser("Chrome",
	 * "https://testpages.eviltester.com/styled/basic-html-form-test.html");
	 * waits(); WebElement username = driver.findElement(By.name("username"));
	 * username.sendKeys("Test123"); waits(); WebElement password =
	 * driver.findElement(By.xpath("//input[@type='password']"));
	 * password.sendKeys("Password123");
	 * System.out.println("Entered username and password in 1st method"); }
	 */

	@Test
	public void formFill1() throws InterruptedException {
		setUpBrowser("Chrome","https://demo.guru99.com/");
		
		waits();
		WebElement email = driver.findElement(By.name("emailid"));
		email.sendKeys("usermail");
		Thread.sleep(2000);
		/*
		 * System.out.println(radio.isSelected()); Assert.assertTrue(false);
		 */
	}

	/*
	 * @Test public void checkBox() { WebDriverManager.edgedriver().setup(); driver
	 * = new EdgeDriver(); driver.get(
	 * "https://testpages.eviltester.com/styled/basic-html-form-test.html");
	 * WebElement check = driver.findElement(By.xpath("//input[@value='cb1']"));
	 * check.click(); System.out.println(check.isSelected()); }
	 */
	/*
	 * @AfterMethod public void closeBrowser() { driver.quit(); }
	 */

}
