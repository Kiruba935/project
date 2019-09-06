package casecu.cucase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class csthrcls {
WebDriver driver;
	@Given("user open testmeapp")
	public void user_open_testmeapp() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\kiruba\\chromedriver_win32\\chromedriver.exe");
  		driver =new ChromeDriver();
  		driver.get("http://10.232.237.143:443/TestMeApp/");
  		driver.manage().window().maximize();
  		
	}

	@And("user click on signin option")
	public void user_click_on_signin_option() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}
		
	

	@And("user enter {string} in field")
	public void user_enter_in_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(string);
		
	}

	@And("enter {string}")
	public void enter(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

    @Given("search {string} product")
    public void search_product(String string) {
        
        driver.findElement(By.xpath("//*[@id=\"myInput\"]")).sendKeys(string);
    }

	@Then("find details of a product")
	public void find_details_of_a_product() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	@Then("click on addto cart button")
	public void click_on_addto_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

}
