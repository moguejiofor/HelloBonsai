package bonsai_invoice_automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BonsaiInvoiceLocators {
	
	
	public static WebElement element;

	public static WebElement emailOrPhone(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='user[email]']"));

		return element;

	}

	public static WebElement passWord(WebDriver driver) {

		return element = driver.findElement(By.xpath("//input[@name='user[password]']"));

	 

	}

	public static WebElement loginButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@type='submit']"));
		
		return element;
 
	}
	
	public static WebElement selectInvoices(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[contains(text(),'Invoices')]"));
	}
	
	public static WebElement clickNewInvoice(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[@class='btn btn-primary hidden-xs top-action-btn']"));
	}
	public static WebElement selectAClient(WebDriver driver) {
		return element = driver.findElement(By.xpath("//div[@class='css-1hwfws3 Select__value-container']"));
		
	}
	
	public static WebElement selectANewClient(WebDriver driver) {
		
		  return element = driver.findElement(By.xpath("//div[contains(text(),'+ New Client')]"));
	}
	
	public static WebElement clientName(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='client_organization_name']"));
	}
	
	public static WebElement clientEmail(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='client_organization_email']"));
	}
	
	public static WebElement projectName(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='invoice[project_title]']"));
	}
	
	public static WebElement selectOneTime(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(text(),'One-Time')]"));
	}
	public static WebElement clickCreateInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//button[contains(text(),'Create Invoice')]"));
	}
	public static WebElement moreOptionsClickOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//a[@class='btn btn-default invoice-top-action-more-btn']"));
	}
	public static WebElement selectDeleteInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[@class='invoice-top-action-more-div dropdown-wrap open']//a[contains(text(),'Delete Invoice')]"));
	}
	public static WebElement confirmDeleteInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//button[@class='btn btn-danger btn-block']"));
	}
	//invoice data locators
	public static WebElement itemNameOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(text(),'Hourly Design Rate')]"));
	}
	public static WebElement unitsOnInvoice(WebDriver driver) {
	
		element = driver.findElement(By.xpath("//div[contains(@class,'invoice-editor-line-col-amount')]//div[contains(@class,'ghost-input-wrapper')]//div//div[contains(@class,'ghost-input-toggle-placeholder')][contains(text(),'1')]"));
		return element;
	}
	public static WebElement rateOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='rate']"));
	}
	public static WebElement taxRateOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='tax_percent']"));
	}
	public static WebElement discountOnInvoice(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//input[@name='invoice[discount_amount]']"));
	}

}
