package seleniumprojects1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftabCheckbox {

	private static int WebElement;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//label[text()='Select the languages that you know?']//following::input[1]").click();
		driver.findElementByXPath("//label[text()='Select the languages that you know?']//following::input[5]").click();
        driver.findElementByXPath("//label[text()='Select the languages that you know?']//following::input[4]").click();
        driver.findElementByXPath("//label[text()='Select the languages that you know?']//following::input[3]").click();
        WebElement chk=driver.findElementByXPath("");
        if(chk.isSelected() == true)
        {
        	System.out.println("The option is selcted");
        }
       WebElement chk1= driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input");
       if (chk1.isSelected() == true)
       {
    	   driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input").click();
    	   System.out.println("The option is deselected");
       }
       
      List<WebElement> chkselect=driver.findElementsByXPath("//label[contains(text(),'Select all below checkboxes')]//following::input"); 
      
       Thread.sleep(5000);
      
       for(int i=0;i<chkselect.size();i++)
       {
    	   chkselect.get(i).click();
       }
       
	}

}
