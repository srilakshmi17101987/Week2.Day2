package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getTitle();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("Srilakshmi");
		WebElement btn = driver.findElementByXPath("//button[text()='Find Leads']");
		btn.click();
		driver.findElementByXPath("//a[text()='Srilakshmi']").click();
		System.out.println("The title of the page is: " + driver.getTitle());
		driver.findElementByXPath("//a[text()='Edit']").click();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Edited company name");
		driver.findElementByXPath("//input[contains(@value,'Update')]").click();
		String str = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println("The updated company name is: " + str);
		//driver.close();

	}

}
