package com.selenium.home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://saucelabs.com/");
		List<WebElement> aLinks =  driver.findElements(By.tagName("a"));
		System.out.println(aLinks.size());
		
		for(WebElement str:aLinks) {
			System.out.println(str.getText());
		}
		driver.close();
	}

}
