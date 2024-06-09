package StepDefinition;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base;
import Page.Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends Base {
	Page lp=new Page();
	@Given("Open the SauceDemo login page")
	public void open_the_sauce_demo_login_page() {
	   WebDriverManager.firefoxdriver().setup();
	   driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.saucedemo.com" );
	     
	}

	@When("Enter the username & password")
	public void enter_the_username_password() {
		
	    driver.findElement(lp.username).sendKeys("standard_user");
	    driver.findElement(lp.password).sendKeys("secret_sauce");
	    driver.findElement(lp.loginbutton).click();
    
	}
	@Then("Verify the product page")
	public void verify_the_product_page() {
	    String value=driver.findElement(lp.product).getText();
	    System.out.println(value);
	}
	@When("Add three products to the cart")
	public void add_three_products_to_the_cart()  {
		List<WebElement> addToCartButtons = driver.findElements(lp.btninvent);
        for (int i = 0; i < 3; i++) {
            addToCartButtons.get(i).click();
        }
        driver.findElement(lp.cart).click();
	        }


	@When("I remove one item from the cart")
	public void i_remove_one_item_from_the_cart() throws InterruptedException {
		Thread.sleep(2000);
	   driver.findElement(lp.remove).click();
	}

	@When("Verify the cart contains two items")
	public void verify_the_cart_contains_two_items() {
		 List<WebElement> cartItems = driver.findElements(By.className("cart_item"));
	        assertTrue(cartItems.size() == 2);
	       
	}
	@When("Buy two items")
	public void buy_two_items() throws InterruptedException {
	    driver.findElement(lp.checkout).click();
	    driver.findElement(lp.firstname).sendKeys("Anusree");
		Thread.sleep(2000);
	    driver.findElement(lp.lastname).sendKeys("Sreekumar");
		Thread.sleep(2000);
	    driver.findElement(lp.zipcode).sendKeys("M1G3S6");
		Thread.sleep(2000);
	    driver.findElement(lp.cont).click();
	    Thread.sleep(4000);
	    driver.findElement(lp.finish).click();
	   
	}
	@Then("Verify the order message")
	public void verify_the_order_message() {
	    String value=driver.findElement(lp.thanks).getText();
	    System.out.println(value);

}
	
	@When("Add items to the cart with a total value between thirty dollar and sixty dollar")
	public void add_items_to_the_cart_with_a_total_value_between_thirty_dollar_and_sixty_dollar() {
		List<WebElement> products = driver.findElements(lp.inventory);
        double totalValue = 0;
        for (WebElement product : products) {
            String priceText = product.findElement(lp.itemprice).getText();
            double price = Double.parseDouble(priceText.replace("$", ""));
            if (totalValue + price <= 60) {
                product.findElement(lp.btninvent).click();
                totalValue += price;
            }
            if (totalValue >= 30) {
                break;
            }
        }
        driver.findElement(lp.cart).click();
	}
	
	
	@When("Proceed to checkout")
	public void proceed_to_checkout() throws InterruptedException {
	    driver.findElement(lp.checkout).click();
	    driver.findElement(lp.firstname).sendKeys("Anusree");
		Thread.sleep(2000);
	    driver.findElement(lp.lastname).sendKeys("Sreekumar");
		Thread.sleep(2000);
	    driver.findElement(lp.zipcode).sendKeys("M1G3S6");
		Thread.sleep(2000);
	    driver.findElement(lp.cont).click();
	    Thread.sleep(4000);
	    
	    
	}
	@Then("the total value of the order should be between thirty dollar and sixty dollar")
	public void the_total_value_of_the_order_should_be_between_thirty_dollar_and_sixty_dollar() {
		List<WebElement> products = driver.findElements(lp.inventory);
        double totalValue = 0;
        for (WebElement product : products) {
            String priceText = product.findElement(lp.itemprice).getText();
            double price = Double.parseDouble(priceText.replace("$", ""));
            if (totalValue + price <= 60) {
                product.findElement(lp.btninvent).click();
                totalValue += price;
            }
            if (totalValue >= 30) {
                break;
            }
        }
	}
}
