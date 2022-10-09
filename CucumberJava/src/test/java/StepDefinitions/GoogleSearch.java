package StepDefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
		
	WebDriver driver=null;
	
	@Given("User is on Google Home Page")
	public void user_is_on_google_home_page() {
		
		String path=System.getProperty("user.dir");
		System.out.println("project path:"+path);
		System.setProperty("webdriver.chrome.driver", path+"\\src\\test\\resources\\Drivers\\chromedriver.exe");		
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		System.out.println("User is on Google Home page");
		driver.manage().window().maximize();
	}

	@When("I Enter text in Google Search text box")
	public void i_enter_text_in_google_search_text_box() throws InterruptedException {
		System.out.println("Enter text in Search box");
	    driver.findElement(By.name("q")).sendKeys("Hello World");
	    Thread.sleep(1000);
	}

	@And("Click on Search")
	public void click_on_search() {
		driver.findElement(By.name("btnK")).click();
		System.out.println("Click on Search");
	}

	@Then("Records are Displayed")
	public void records_are_displayed() {
		System.out.println("Records are displayed");
		driver.close();
		driver.quit();
	}


}
