package com.hellobonsai.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BonsaiLocators {
	public static WebElement element = null;
	
	public WebElement emailOrPhone(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='user[email]']"));

		return element;

	}

	public  WebElement passWord(WebDriver driver) {

		return element = driver.findElement(By.xpath("//input[@name='user[password]']"));

	 

	}

	public WebElement loginButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@type='submit']"));
		
		return element;
 
	}
	
	public WebElement selectInvoices(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[contains(text(),'Invoices')]"));
	}
	
	public WebElement clickNewInvoice(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[@class='btn btn-primary hidden-xs top-action-btn']"));
	}
	public WebElement selectAClient(WebDriver driver) {
		return element = driver.findElement(By.xpath("//div[@class='css-1hwfws3 Select__value-container']"));
		
	}
	
	public WebElement selectANewClient(WebDriver driver) {
		
		  return element = driver.findElement(By.xpath("//div[contains(text(),'+ New Client')]"));
	}
	
	public  WebElement clientName(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='client_organization_name']"));
	}
	
	public  WebElement clientEmail(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='client_organization_email']"));
	}
	
	public  WebElement projectName(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='invoice[project_title]']"));
	}
	
	public WebElement selectOneTime(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(text(),'One-Time')]"));
	}
	public  WebElement clickCreateInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//button[contains(text(),'Create Invoice')]"));
	}
	public WebElement moreOptionsClickOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//a[@class='btn btn-default invoice-top-action-more-btn']"));
	}
	public WebElement selectDeleteInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[@class='invoice-top-action-more-div dropdown-wrap open']//a[contains(text(),'Delete Invoice')]"));
	}
	public WebElement confirmDeleteInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-block']"));
	}
	public WebElement getAlertforInvoiceDelete(WebDriver driver) {
		return element = driver.findElement(By.xpath("//div[contains(@class,'alert')]"));
	}
	//invoice data locators
	
	
	public WebElement itemNameOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//textarea[contains(@placeholder,'Hourly Design Rate')]"));
	}
	public WebElement unitsOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(@class,'invoice-editor-line-col-amount')]//input[contains(@placeholder,'1')]"));
		
	}
	public WebElement rateOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='rate']"));
	}
	public WebElement taxRateOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='tax_percent']"));
	}
	public  WebElement discountOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='invoice[discount_amount]']"));
	}

	public WebElement searchBarForInvoices(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	}
	public WebElement createNewExpenseLink(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//button[contains(text(),'Create New Expense')]"));
	}
	public WebElement nameOfExpense(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[contains(@placeholder,'Travel expenses')]"));
	}
	public WebElement amountOfExpense(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[contains(@placeholder,'200.00')]"));
	}
	public WebElement categoryOfExpense(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(@class,'col-sm-12 mtxl relative')]//div[contains(@class,'css-1hwfws3 Select__value-container')]"));
	}
	public WebElement selectAdvertising(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(@class,'css-10nd86i dropdown-contained')]//div[contains(text(),'Advertising')]"));
	}
	public WebElement expenseDate(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@id='expense_date']"));
	}
	public WebElement createNewExpenseButton(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//button[contains(text(),'Create Expense')]"));
	}
	public WebElement getAlertforExpenseAdd(WebDriver driver) {
		return element = driver.findElement(By.xpath("//div[contains(@class,'alert')]"));
	}
	}

