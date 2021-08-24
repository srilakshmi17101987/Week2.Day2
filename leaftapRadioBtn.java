package seleniumprojects1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leaftapRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		WebElement radio=driver.findElementByXPath("//input[@id='yes']");
		radio.click();
		
	WebElement radio1=driver.findElementByXPath("//label[@for='Checked']/input");
	if (radio1.isSelected() == true)
	{
		System.out.println("The selected option is: checked ");
	}
	else
	{
		System.out.println("the selected option is uncheked");
	}
	
	WebElement radio3=driver.findElementByXPath("//label[contains(text(),'Select your age group')]/following::input[2]");
	if (radio3.isSelected() == true)
	{
		driver.findElementByXPath("//label[contains(text(),'Select your age group')]/following::input[3]").click();
	}

	
	}

}

