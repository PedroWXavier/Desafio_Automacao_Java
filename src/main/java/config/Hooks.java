package config;


import io.cucumber.java.*;

public class Hooks {

    @BeforeAll
    public static void beforeAll() {
        Report.initializeReport();
    }

    @Before
    public void setUp(Scenario scenario) {
        Report.startTest(scenario);
    }

    @After
    public void tearDown(Scenario scenario) {
        Driver.quit();
        Report.logStatus(scenario);
    }

    @AfterAll
    public static void afterAll() {
        Report.generateReport();
    }
}
