package com.testscenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
public static void main(String[] args) {
	WebDriver driver;
	driver = new FirefoxDriver();
	driver.get("https://fb.com");
}
}
