package com.hellobonsai.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hellobonsai.actions.BonsaiActions;
import com.hellobonsai.locators.BonsaiLocators;
import com.hellobonsai.setup.BonsaiSetup;


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
	
	bonsaiLocators.clientName(driver).sendKeys("Tetra Smith");
	bonsaiLocators.clientEmail(driver).sendKeys("tetsmith@micro.com");
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
	//driver.findElement(By.xpath("//button[@class='btn btn-danger btn-block']")).click();
	System.out.println(bonsaiLocators.getAlertforInvoiceDelete(driver).getText());
}
@AfterTest
public void closeBrowser() {
	driver.close();
}

}
