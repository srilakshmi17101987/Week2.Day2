package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftapEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.get("http://leafground.com/pages/Edit.html");
     System.out.println(driver.getTitle());
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.findElement(By.id("email")).sendKeys("shrimr.mr@gmail.com");
     driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input").sendKeys("sample text",Keys.TAB);
     String we=driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input").getAttribute("value");
     System.out.println(we);
     driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input").clear();
     if (driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input").isDisplayed())
     {
    	 System.out.println("The fieldd is disabled");
     }
     else
     {
    	 System.out.println("Hi");
     }
     //System.out.println(we.getAttribute("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
	}

}
//*[@id="contentblock"]/section/div[2]/div/div/i"nput