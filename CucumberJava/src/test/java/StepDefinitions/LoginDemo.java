package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.en.*;

public class LoginDemo {
	
	WebDriver driver=null;
	
	@Given("User is on HomePage")
	public void user_is_on_home_page() throws InterruptedException {

		String path=System.getProperty("user.dir");
		System.out.println("project path:"+path);
		System.setProperty("webdriver.chrome.driver", path+"\\src\\test\\resources\\Drivers\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("https://dreamcargo.herokuapp.com/");
		System.out.println("User is on Google Home page");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@When("I Enter Valid UserName and Password")
	public void i_enter_valid_user_name_and_password() throws InterruptedException {
		
		
		driver.findElement(By.id("fname")).sendKeys("Santhoshkumarchawa@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("lname")).sendKeys("Wxyz2042");
		Thread.sleep(1000);
	}

	@When("Click on LogOn")
	public void click_on_log_on() throws InterruptedException {

		driver.findElement(By.id("Login")).click();
		Thread.sleep(1000);
	}

	@Then("User is Logged in Successfully")
	public void user_is_logged_in_successfully() {
		
		driver.close();
		driver.quit();

	}


}
