package config;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Inicializando Hooks");
    }

    @After
    public void tearDown() {
        Driver.quit();
    }
}
