
package seleniumprojects1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftapLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Link.html");
System.out.println(driver.getTitle());
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementByXPath("//a[text()='Go to Home Page']").click();
String str=driver.getTitle();
System.out.println(str);
driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img").click();
System.out.println(driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href"));
driver.findElementByXPath("//a[text()='Verify am I broken?']").click();

 
if ((driver.getTitle()=="HTTP Status 404"))
{
	System.out.println("Broken");
	
}
else
{
	System.out.println("working");
}
driver.get("http://leafground.com/pages/Link.html");


driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a").click();
String str1=driver.getTitle();
System.out.println(str1);
if (str1.equals(str))
{
	System.out.println("samelink");
	
}
else
{
	System.out.println("different link");
}
driver.get("http://leafground.com/pages/Link.html");
List<WebElement> links = driver.findElements(By.tagName("a"));
//System.out.println(“The number of links is "+links.size());
System.out.println(links.size());
	}

}
