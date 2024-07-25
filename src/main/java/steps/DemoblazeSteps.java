package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CartPage;
import pages.HomePage;
import pages.ProductPage;

public class DemoblazeSteps {

    private final WebDriver driver = new ChromeDriver();

    @Given("that I access demoblaze site")
    public void that_I_access_demoblaze_site() {
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Given("I create an account")
    public void i_create_an_account() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSign_up();
        homePage.fillSign_username("pewx@hotmail.com");
        homePage.fillSign_password("1234");
        homePage.clickSign_button();
        driver.get("https://www.demoblaze.com/index.html");
    }

    @Given("I do my login")
    public void i_do_my_login() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLog_in();
        homePage.fillLog_in_username("pewx@hotmail.com");
        homePage.fillLog_in_password("1234");
        homePage.clickLog_in_button();
    }

    @When("I add a monitor to my cart")
    public void i_add_a_monitor_to_my_cart() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCategory_monitors();
        homePage.clickMonitor();

        ProductPage productPage = new ProductPage(driver);
        productPage.clickAddToCartButton();
        driver.get("https://www.demoblaze.com/index.html");
    }

    @When("I complete the payment")
    public void i_complete_the_payment() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCart();
        cartPage.clickPlaceOrder();
        cartPage.sendName("John Doe");
        cartPage.sendCountry("United States");
        cartPage.sendCity("New York");
        cartPage.sendCard("1234567890");
        cartPage.sendMonth("01");
        cartPage.sendYear("2023");
        cartPage.clickPurchase();
    }

    @Then("I should validate my purchase")
    public void i_should_validate_my_purchase() {
        CartPage cartPage = new CartPage(driver);
        cartPage.clickOk();
        driver.close();
    }
}
