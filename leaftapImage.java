package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftapImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//redirects me to images page
		driver.get("http://leafground.com/pages/Image.html");
		System.out.println(driver.getTitle());
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click on the 1st image - home page
		
		driver.findElementByCssSelector("img[src=\"../images/home.png\"]").click();
		System.out.println(driver.getTitle());
		
		driver.findElementByCssSelector("img[src=\"images/image.png\"]").click();
		System.out.println(driver.getTitle());
        //driver.findElementByCssSelector("src=\"../images/abcd.jpg\"").click();
		
     driver.findElementByCssSelector("img[src=\"../images/keyboard.png\"]").click();
       String str=driver.getTitle();
       System.out.println(str);
       //driver.get("http://leafground.com/pages/Image.html");

	}
	

}
