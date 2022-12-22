package com.selenium.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://saucelabs.com/");
		driver.findElement(By.xpath("//*[@id=\"headerMainNav\"]/div/nav/ul/li[3]/ul/li[2]/a/span")).click();
		String window = driver.getWindowHandle();
		System.out.println(window);
	}

}
