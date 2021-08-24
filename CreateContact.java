package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         ChromeDriver driver=new ChromeDriver();
         driver.get("http://leaftaps.com/opentaps/control/login");
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
          driver.getTitle();
          driver.findElementById("username").sendKeys("demosalesmanager");
          driver.findElementById("password").sendKeys("crmsfa");
          driver.findElementByClassName("decorativeSubmit").click();
          driver.findElement(By.linkText("CRM/SFA")).click();
          driver.findElementByLinkText("Contacts").click();
          driver.findElementByLinkText("Create Contact").click();
          driver.findElementById("firstNameField").sendKeys("Srilakshmi");
          driver.findElementById("lastNameField").sendKeys("MR");
          driver.findElementById("createContactForm_firstNameLocal").sendKeys("testleaf");
          driver.findElementById("createContactForm_lastNameLocal").sendKeys("sellenium");
          driver.findElementById("createContactForm_departmentName").sendKeys("abcd");
          driver.findElementById("createContactForm_primaryEmail").sendKeys("shrimr123@gmail.com");
          driver.findElementById("createContactForm_description").sendKeys("testleaf171019187");
          driver.findElementById("createContactForm_generalStateProvinceGeoId").sendKeys("Alabama");
          driver.findElementByXPath("//input[@class='smallSubmit']").click();
          driver.findElementByLinkText("Edit").click();
          driver.findElementById("updateContactForm_description").clear();
          driver.findElementById("updateContactForm_importantNote").sendKeys("eductaion is important");
          driver.findElementByXPath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div/form/div/div[2]/table/tbody/tr[8]/td[2]/input").click();
          System.out.println(driver.getTitle());
	}

}
