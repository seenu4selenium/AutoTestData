package com.testscenarios;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.utilities.ReusableFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;

public class TS_02_Login extends ReusableFunctions {

	@BeforeClass
	@Parameters("browserName")
	public void crossBrowser(@Optional("Chrome") String browserName) {
		if (browserName.equalsIgnoreCase("Chrome")) {
			chromeBrowserLaunch();
		} else if (browserName.equalsIgnoreCase("edge")) {
			edgeBrowserLaunch();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			firefoxBrowserLaunch();
		} else {
			System.out.println("******Please check the browerName******");
		}
	}

	@AfterMethod
	public void afterMethod(ITestResult res) throws Exception {
		screenshotWithStatus(res);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	
	//develop the code from here
	@Test
	public void f() throws Exception {
		
	}

}
