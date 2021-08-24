package seleniumprojects1;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        driver.findElementById("username").sendKeys("demosalesmanager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Find Leads").click();
        driver.findElementByXPath("//span[text()='Email']").click();
        
        driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("shrimr@gmail.com");
        driver.findElementByXPath("//button[text()='Find Leads']").click();
        Thread.sleep(2000);
        
        //leadname.click();
        String str1=driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)").getText();
        
        Thread.sleep(2000);
        //clicking the duplicate tab
        driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
        System.out.println("The title of the page is: "+driver.getTitle());
        Thread.sleep(2000);
        //click create lead to duplicate the lead
        driver.findElementByXPath("//input[@value='Create Lead']").click();
        String str2=driver.findElementById("viewLead_firstName_sp").getText();
        //compare the above the lead and str2
        if(str1.equals(str2))
        {
        	System.out.println("The lead is same");
        }
        else
        {
        	System.out.println("diffrent lead name");
        }
        
        Thread.sleep(2000);
        driver.close();
        }
        
	}


