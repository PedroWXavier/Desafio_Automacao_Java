package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaucedemoSteps {

    private final WebDriver driver = new ChromeDriver();

    @Given("I access saucedemo site")
    public void i_access_saucedemo_site() {
        driver.get("https://www.saucedemo.com");
    }

    @When("I fill login and password")
    public void i_fill_login_and_password() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @When("I press the login button")
    public void i_press_the_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        try {
          driver.findElement(By.id("shopping_cart_container"));
          assert true;
        } catch (Exception e) {
            System.out.println("Elemento nao encontrado apos logar!");
            assert false;
        }
        finally {
            driver.quit();
        }
    }
}