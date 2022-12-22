package com.selenium.home;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tricentis.com/resources/model-based-test-automation-web-apps-demo?utm_source=bing&utm_medium=ppc&utm_campaign=Campaign-PPC-Business-Offensive&utm_adgroup=testautomation&utm_term=testing%20automated%20software&msclkid=28c26b7f4465136db03f08260e4503a5&utm_content=Test%20Automation");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Select role_element = new Select(driver.findElement(By.id("Role__c")));
		role_element.selectByIndex(3);
		WebElement element = driver.findElement(By.xpath("//ul[@class='FooterMenuColumn_column__dy0pm']/a[text()='eBooks & Guides']"));
		JavascriptExecutor jsExecute = (JavascriptExecutor)driver;
		jsExecute.executeScript("arguments[0].scrollIntoView();", element);
		new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		//Actions actions = new Actions(driver);
		//actions.moveToElement(element).click().build().perform();

		//ul[@class='FooterMenuColumn_column__dy0pm']/a[text()='Blog']
	
	
	
	
	}

}
