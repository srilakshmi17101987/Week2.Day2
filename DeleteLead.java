package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Find Leads").click();
        driver.findElementByXPath("//span[contains(text(),\"Phone\")]").click();
        driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("9440455753");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(2000);
        WebElement leadid=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]");
        String num=leadid.getText();
        System.out.println("The Lead Id is"+num);
        
     WebElement name=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[2]");
     String fname=name.getText();
        System.out.println("the firstname is"+fname);
        driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[2]").click();
        driver.findElementByXPath("//a[@class='subMenuButtonDangerous']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//a[text()='Find Leads']").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//input[@name='id']").sendKeys(num);
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        String msg=driver.findElementByXPath("//div[@class='x-paging-info']").getText();
        System.out.println(msg);
        System.out.println("The record" +num+ "deleted successfully");
        driver.close();
        
	}

}
