package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("C");
		Thread.sleep(4000);
		from.sendKeys(Keys.DOWN);
		from.sendKeys(Keys.ENTER);
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("B");
		Thread.sleep(4000);
		to.sendKeys(Keys.DOWN);
		to.sendKeys(Keys.ENTER);
		driver.findElementById("onward_cal").click();
		Thread.sleep(10000);
		WebElement date = driver.findElement(By.xpath("//td[@class='current day']"));
		Thread.sleep(4000);
		date.click();
		Thread.sleep(4000);
		// driver.navigate().back();

		WebElement search = driver.findElement(By.xpath("//button[text()='Search Buses']"));
		Thread.sleep(4000);
		search.click();
		Thread.sleep(5000);

		System.out.println("Hi");
		driver.getTitle();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		Thread.sleep(7000);
		String str = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println(str);

		// btn.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		// WebElement BusType = driver.findElementByXPath("//div[text()='BUS TYPES']");

		driver.executeScript("window.scrollBy(0,500)");
		WebElement sleeper = driver.findElementByXPath("//label[text()='AC']/preceding::label[text()='SLEEPER']");
		sleeper.click();
		Thread.sleep(5000);

		// Thread.sleep(5000);
		String str1 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("The no of sleeper buses are" + str1);
		driver.executeScript("window.scrollBy(0,500)");
		driver.findElementByXPath("//label[text()='AC']/preceding::label[text()='SLEEPER']").click();
		Thread.sleep(4000);
	
		//driver.findElement(By.xpath("//span[@class=\"set-filter-close\"]")).click();
	
		//Thread.sleep(4000);
		driver.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//label[@for='bt_AC'])[1]")).click();
		Thread.sleep(4000);
		String str2 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("The no of Ac busses are" + str2);
		Thread.sleep(4000);
		driver.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//label[@for='bt_NONAC'])")).click();
		Thread.sleep(4000);
		String str3 = driver.findElementByXPath("//span[@class='f-bold busFound']").getText();
		System.out.println("The no of non ac buses are" + str3);
		
        driver.close(); 
		// Thread.sleep(2000);
		// System.out.println(driver.getTitle());*/
	}

}
