package seleniumprojects1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForSalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Srilakshmi");
		driver.findElement(By.name("UserLastName")).sendKeys("MR");
		driver.findElement(By.name("UserEmail")).sendKeys("shrimr.mr@gmail.com");
		WebElement drop1=driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select drpdown=new Select(drop1);
		drpdown.selectByIndex(4);
		WebElement drop2=driver.findElement(By.name("CompanyEmployees"));
		Select drpdown2=new Select(drop2);
		drpdown2.selectByVisibleText("1 - 15 employees");
		WebElement drop3=driver.findElement(By.name("CompanyCountry"));
		Select drpdown3=new Select(drop3);
		drpdown3.selectByValue("DZ");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("testleaf");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9976545901");
		WebElement opt=driver.findElement(By.xpath("//div[@class='checkbox-ui']"));
		opt.click();
		
	}

}
