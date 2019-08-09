package bonsai_invoice_automation_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddImageLocators {

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
	public static WebElement selectOneTime(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//div[contains(text(),'One-Time')]"));
	}
	
	public static WebElement submitButton(WebDriver driver) {
		return element = driver.findElement(By.xpath("//button[contains(text(),'Create Invoice')]"));
	}
	
	
	public static WebElement addImage(WebDriver driver) {
		
		return element = driver.findElement(By.xpath("//*[@id=\"outer-wrapper\"]/div/div[2]/div/div[3]/div/div[1]/div[3]/div/div[2]/div[1]"));
	}
	
	
	
	
	
	
	
}