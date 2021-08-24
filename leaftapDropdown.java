package seleniumprojects1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftapDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement drp1 = driver.findElementById("dropdown1");
		Select drop1 = new Select(drp1);
		drop1.selectByIndex(1);

		WebElement drp2 = driver.findElementByName("dropdown2");
		Select drop2 = new Select(drp2);
		drop2.selectByVisibleText("Appium");

		WebElement drp3 = driver.findElementById("dropdown3");
		Select drop3 = new Select(drp3);
		drop3.selectByValue("4");

		WebElement options = driver.findElementByXPath("//select[@class=\"dropdown\"]");
		Select drp4 = new Select(options);
		int size = drp4.getOptions().size();
		System.out.println(drp4.getOptions().size());
		driver.findElementByXPath("//select[@class=\"dropdown\"]").sendKeys("(drp4.getOptions().size())-2");

		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select").sendKeys("Appium");

		WebElement drp5 = driver.findElementByXPath("/html/body/div/div/div[3]/section/div[6]/select");
		Select drop4 = new Select(drp5);
		drop4.selectByVisibleText("UFT/QTP");

	}

}
