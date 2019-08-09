package bonsai_invoice_automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddAtachmentTestCase {
	
	AddImageLocators addImageLocators = new AddImageLocators();
	WebDriver driver;

	@BeforeTest

	public void startTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://app.hellobonsai.com/users/sign_in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

	} 
	 
	
	

	@Test (priority = 2, description = "Add image")

	public void loginTest() {
		
		
		AddAtachmentTestLocator.emailOrPhone(driver).sendKeys("service_dev@codistan.com");
		AddAtachmentTestLocator.passWord(driver).sendKeys("IBecameACoder");
		AddAtachmentTestLocator.loginButton(driver).click();
		AddAtachmentTestLocator.selectInvoices(driver).click();
		AddAtachmentTestLocator.clickNewInvoice(driver).click();
		AddAtachmentTestLocator.clickClient(driver).click();
		AddAtachmentTestLocator.NewClient(driver).click();
		AddAtachmentTestLocator.selectOneTime(driver).click();
		AddAtachmentTestLocator.submitButton(driver).click();
		AddAtachmentTestLocator.selectAttachment(driver).sendKeys("C:\\orange.png");

		
		
	}
//	@Test
//	public void selectAttachment() throws InterruptedException{
//		driver.get("https://app.hellobonsai.com/invoices/347531/edit");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//*[@id=\\\"outer-wrapper\\\"]/div/div[2]/div/div[3]/div/div[9]/div/div/div\"")).click();//("C:\\orange.png");
//	}
	

}
