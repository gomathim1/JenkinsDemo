package org.automation_learn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Runner extends BaseClass{
	
	@Test
	public void formFill1() {
		setUpBrowser("Edge","https://demo.guru99.com/test/radio.html");
		waits();
		WebElement radio = driver.findElement(By.xpath("//input[@value='Option 1']"));
		radio.click();
		System.out.println(radio.isSelected());
	}

}
