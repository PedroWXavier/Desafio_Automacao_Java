package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorSteps {

    private final WebDriver driver = new ChromeDriver();

    @Given("I have entered {int} into the calculator")
    public void i_have_entered_into_the_calculator(Integer number) {
        driver.get("https://www.youtube.com");
        System.out.println("Chrome");
    }

    @When("I press add")
    public void i_press_add() {
        // Implement the step logic here
    }

    @Then("the result should be {int} on the screen")
    public void the_result_should_be_on_the_screen(Integer result) {
        // Implement the step logic here
    }
}