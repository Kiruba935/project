package casecu.cucase;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class csfre {

	WebDriver driver;
	@Given("user visit to homepage")
	public void user_visit_to_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\kiruba\\chromedriver_win32\\chromedriver.exe");
  		driver =new ChromeDriver();
  		driver.get("http://10.232.237.143:443/TestMeApp/");
  		driver.manage().window().maximize();
  		
	}

	@And("search for product {string}")
	public void search_for_product(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
	}

	@When("user clicks find detail button")
	public void user_clicks_find_detail_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@And("click addtocarts")
	public void click_addtocarts() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("login page displayed")
	public void login_page_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

}
