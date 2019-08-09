package bonsai_invoice_automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddImageTestCase {
	
	
	AddImageLocators addImageLocators = new AddImageLocators();
	WebDriver driver;

	@BeforeTest

	public void startTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://app.hellobonsai.com/users/sign_in");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("This will run before my test case");

	}

	@Test (priority = 2, description = "Add image")

	public void loginTest() {
		
		
		AddImageLocators.emailOrPhone(driver).sendKeys("service_dev@codistan.com");
		AddImageLocators.passWord(driver).sendKeys("IBecameACoder");
		AddImageLocators.loginButton(driver).click();
		AddImageLocators.selectInvoices(driver).click();
		AddImageLocators.clickNewInvoice(driver).click();
		AddImageLocators.clickClient(driver).click();
		AddImageLocators.NewClient(driver).click();
		AddImageLocators.selectOneTime(driver).click();
		AddImageLocators.submitButton(driver).click();
		AddImageLocators.addImage(driver).sendKeys("C:\\orange.png");
	
	}
}
