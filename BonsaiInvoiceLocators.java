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

	 // return element;

	}

	public static WebElement loginButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@type='submit']"));
		
		return element;
 
	}

}
