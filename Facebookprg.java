package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebookprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title=driver.getTitle();
		 System.out.println(title);
		 driver.manage().window().maximize();
		//driver.findElement(By.id("open-registration-form-button")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.findElement(By.name("firstname")).sendKeys("Sumedha");
			driver.findElement(By.name("lastname")).sendKeys("R");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sumedhavijayraghavan08@gmail.com");
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("sumedhavijayraghavan08@gmail.com");
			driver.findElement(By.id("password_step_input")).sendKeys("password_step_input");
			driver.findElement(By.name("birthday_day")).sendKeys("8");
			driver.findElement(By.name("birthday_month")).sendKeys("Oct");
			driver.findElement(By.name("birthday_year")).sendKeys("1987");
			WebElement radio1=driver.findElement(By.xpath("//input[@class='_8esa']"));
				radio1.click();
			
		 driver.findElement(By.name("websubmit")).click();
	}

}
