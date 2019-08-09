package bonsai_invoice_automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadPdfLocators {
	
	
	public static WebElement element;

	public static WebElement emailOrPhone(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='user[email]']"));

		return element;

	}

	public static WebElement passWord(WebDriver driver) {

		return element = driver.findElement(By.xpath("//input[@name='user[password]']"));

	 // return element;

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
	
	public static WebElement clickClient(WebDriver driver) {
		return element = driver.findElement(By.xpath("//div[@class='css-1hwfws3 Select__value-container']"));
	}
public static WebElement NewClient(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(text(),'Ali SMITH - alismith34555@gmail.com')]"));
		
	}
//	public static WebElement ClientName(WebDriver driver) {
//		
//		return element = driver.findElement(By.xpath("//input[@name='client_organization_name']"));
//	}
//	public static WebElement ClientEmail(WebDriver driver) {
//		
//		return element = driver.findElement(By.xpath("//input[@name='client_organization_email']"));
//	}
//	public static WebElement NewProjectName(WebDriver driver) {
//	
//	return element = driver.findElement(By.xpath("//input[@name='invoice[project_title]']"));
//}
	public static WebElement selectOneTime(WebDriver driver) {
	
	return element = driver.findElement(By.xpath("//div[contains(text(),'One-Time')]"));
}
	public static WebElement submitButton(WebDriver driver) {
		return element = driver.findElement(By.xpath("//button[contains(text(),'Create Invoice')]"));
	}
	public static WebElement Moreoptions(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[@class='btn btn-default invoice-top-action-more-btn']"));
	}
	public static WebElement DownloadPDF(WebDriver driver) {
		return element = driver.findElement(By.xpath("//a[@data-target='#modal-pdf-download']"));
		
	}
	public static WebElement DownloadButton(WebDriver driver) {
		
		try {
			Thread.sleep(5000);

		} catch (Exception e) {
			
		}
		
		return element = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block'][contains(text(),'Download')]"));
	}
}
