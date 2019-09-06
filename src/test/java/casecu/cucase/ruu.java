package casecu.cucase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ruu {
	WebDriver driver;

	@Given("user enters to TestMeApp")
	public void user_enters_to_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\kiruba\\chromedriver_win32\\chromedriver.exe");
  		driver =new ChromeDriver();
  		driver.get("http://10.232.237.143:443/TestMeApp/");
  		driver.manage().window().maximize();
	}

	@Given("click on signup")
	public void click_on_signup() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath ("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();	
	    }

	@When("user enters username {string} in the field")
	public void user_enters_username_in_the_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
	}

	@When("user enters first name as {string}")
	public void user_enters_first_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(string);
	}

	@When("user enters last name as {string}")
	public void user_enters_last_name_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(string);
	}

	@Then("user enters password as {string}")
	public void user_enters_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@Then("user confirms the password as {string}")
	public void user_confirms_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"pass_confirmation\"]")).sendKeys(string);
	}

	@Then("user enters gender {string}")
	public void user_enters_gender(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='Female']")).click();
	}

	@Then("enters email as {string}")
	public void enters_email_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"emailAddress\"]")).sendKeys(string);
	}

	@Then("enters DOB {string}")
	public void enters_DOB(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[9]/div/div/img")).click();
		   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]/option[3]")).click();
		   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]/option[49]")).click();
		   driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[1]/a")).click();
	}

	@Then("enters address as {string}")
	public void enters_address_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"address\"]")).sendKeys(string);
	}

	@Then("enters security question")
	public void enters_security_question() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Select b=new Select(driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]")));
		   b.selectByIndex(0);
	}

	@Then("enters answer {string}")
	public void enters_answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"answer\"]")).sendKeys(string);
	}

	@Then("user clicks the register button")
	public void user_clicks_the_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
	}


}
