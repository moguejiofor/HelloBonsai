package bonsai_invoice_automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BonsaiInoviceTestCase {
	BonsaiInvoiceLocators bonsaiInvoiceLocators = new BonsaiInvoiceLocators();
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

	@Test (priority = 2, description = "Verfiy Login")

	public void loginTest() {

		BonsaiInvoiceLocators.emailOrPhone(driver).sendKeys("service_dev@codistan.com");
		BonsaiInvoiceLocators.passWord(driver).sendKeys("IBecameACoder");
		BonsaiInvoiceLocators.loginButton(driver).click();


}}
