package bonsai_invoice_automation_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class DownloadPdfTestCase {
	DownloadPdfLocators bonsaiInvoiceLocators = new DownloadPdfLocators();
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

		DownloadPdfLocators.emailOrPhone(driver).sendKeys("service_dev@codistan.com");
		DownloadPdfLocators.passWord(driver).sendKeys("IBecameACoder");
		DownloadPdfLocators.loginButton(driver).click();
		DownloadPdfLocators.selectInvoices(driver).click();
		DownloadPdfLocators.clickNewInvoice(driver).click();
		DownloadPdfLocators.clickClient(driver).click();
		DownloadPdfLocators.NewClient(driver).click();
//		BonsaiInvoiceLocators.ClientName(driver).sendKeys("Ali SMITH");
//		BonsaiInvoiceLocators.ClientEmail(driver).sendKeys("alismith34555535@gmail.com");
//		BonsaiInvoiceLocators.NewProjectName(driver).sendKeys("zzSmithProject");
		DownloadPdfLocators.selectOneTime(driver).click();
		DownloadPdfLocators.submitButton(driver).click();
		DownloadPdfLocators.Moreoptions(driver).click();
		DownloadPdfLocators.DownloadPDF(driver).click();
		DownloadPdfLocators.DownloadButton(driver).click();
		
		

		

	}

}
