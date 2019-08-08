package com.hellobonsai.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hellobonsai.locators.BonsaiLocators;
import org.testng.Assert;


public class BonsaiTestCases2 {
	WebDriver driver;
	
	BonsaiLocators bonsaiLocators = new BonsaiLocators();
	
	
	
@BeforeTest
	
	public void setUp() {
	
	
		System.setProperty("webdriver.chrome.driver", "/Users/sengulkilicaslan/Desktop/CODISTAN_NEW/chromedriver");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		driver.get("https://app.hellobonsai.com/users/sign_in");
		
	}
@Test

public void Login() {
	
	bonsaiLocators.emailOrPhone(driver).sendKeys("service_dev@codistan.com");
	bonsaiLocators.passWord(driver).sendKeys("IBecameACoder");
	bonsaiLocators.loginButton(driver).click();
    
}
@Test

public void selectInvoices() {
	bonsaiLocators.selectInvoices(driver).click();
	
}

@Test(dependsOnMethods="selectInvoices")
public void clickNewInvoice() {
	
	bonsaiLocators.clickNewInvoice(driver).click();
	
}

@Test(dependsOnMethods="clickNewInvoice")
public void selectANewClient() throws InterruptedException {
	Thread.sleep(5000);
	bonsaiLocators.selectAClient(driver).click();
	bonsaiLocators.selectANewClient(driver).click();//new client
	
	//existing client
	
	//driver.findElement(By.xpath("//div[contains(text(),'zeliha - zeliha2110@hotmail.com')]")).click();
}

@Test(dependsOnMethods="selectANewClient")
public void enterClientInfo() {
	
	bonsaiLocators.clientName(driver).sendKeys("yetra Smith");
	bonsaiLocators.clientEmail(driver).sendKeys("yetsmith@micro.com");
	bonsaiLocators.projectName(driver).sendKeys("Testing Web Application");
	bonsaiLocators.selectOneTime(driver).click();
	bonsaiLocators.clickCreateInvoice(driver).click();
	
}

@Test(dependsOnMethods="enterClientInfo")
public void moreOptionsClick() {
	
	bonsaiLocators.moreOptionsClickOnInvoice(driver).click();
	
}
@Test(dependsOnMethods="moreOptionsClick")
public void deleteInvoice() {
	bonsaiLocators.selectDeleteInvoice(driver).click();
	
}

@Test(dependsOnMethods="deleteInvoice")
public void confirmDeleteInvoice( ) {
	bonsaiLocators.confirmDeleteInvoice(driver).click();
	String actual = bonsaiLocators.getAlertforInvoiceDelete(driver).getText();
	Assert.assertEquals("Your invoice has been successfully deleted.", actual);
}
@AfterTest
public void closeBrowser() {
	driver.quit();
}

}
