package com.hellobonsai.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hellobonsai.locators.BonsaiLocators;

public class BonsaiTestCases3 {

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

public void Login() throws InterruptedException {
	
	bonsaiLocators.emailOrPhone(driver).sendKeys("service_dev@codistan.com");
	bonsaiLocators.passWord(driver).sendKeys("IBecameACoder");
	bonsaiLocators.loginButton(driver).click();
    
	
}

@Test
public void selectInvoiceToEdit() {
	bonsaiLocators.searchBarForInvoices(driver).sendKeys("Milly Gates");
	
	driver.findElement(By.xpath("//div[contains(text(),'Milly Gates Invoice')]")).click();
}

@Test(dependsOnMethods="selectInvoiceToEdit")
public void enterDataOnInvoice() throws InterruptedException {
	
	bonsaiLocators.itemNameOnInvoice(driver).sendKeys("Hourly Design Rate");
	bonsaiLocators.unitsOnInvoice(driver).sendKeys("3");
	
	bonsaiLocators.rateOnInvoice(driver).sendKeys("075.00");
	bonsaiLocators.taxRateOnInvoice(driver).sendKeys("07");
	bonsaiLocators.discountOnInvoice(driver).sendKeys("025.00");
	
}
	@Test(dependsOnMethods="enterDataOnInvoice")
	public void clickOnAddExpenseLink() {
		WebElement addExpenseLink = driver.findElement(By.xpath("//a[@class='invoice-editor-add-expense-link']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("arguments[0].click();", addExpenseLink);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		
		driver.quit();
	}
}
