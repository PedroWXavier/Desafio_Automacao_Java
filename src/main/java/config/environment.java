package config;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;

public class environment {

    @BeforeStep
    public void beforeStep() {
        System.out.println("Before");
    }

    @AfterStep
    public void afterStep() {
        System.out.println("After");
    }

}
