package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftabButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
         ChromeDriver driver=new ChromeDriver();
driver.get("http://leafground.com/pages/Button.html");
String title=driver.getTitle();
System.out.println(title);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElementById("home").click();
System.out.println(driver.getTitle());
driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img").click();
System.out.println(driver.findElementById("position").getLocation());
System.out.println(driver.findElementById("color").getCssValue("background-color"));
System.out.println(driver.findElementById("size").getSize());

	}

}
