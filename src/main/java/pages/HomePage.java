package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage{

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="signin2")
    WebElement sign_up;

    @FindBy(id="sign-username")
    WebElement sign_username;

    @FindBy(id="sign-password")
    WebElement sign_password;

    @FindBy(xpath = """
            //*[@id="signInModal"]/div/div/div[3]/button[2]""")
    WebElement sign_button;

    @FindBy(id = "login2")
    WebElement log_in;

    @FindBy(id = "loginusername")
    WebElement log_in_username;

    @FindBy(id = "loginpassword")
    WebElement log_in_password;

    @FindBy(xpath = "//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
    WebElement log_in_button;

    @FindBy(id = "nameofuser")
    WebElement user_logged;

    @FindBy(xpath = "/html/body/div[5]/div/div[1]/div/a[4]")
    WebElement category_monitors;

    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a[contains(text(), \"Apple monitor 24\")]")
    WebElement monitor;

    public void clickSign_up(){
        sign_up.click();
    }

    public void fillSign_username(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until( e -> sign_username.isDisplayed());
        sign_username.sendKeys(username);
    }

    public void fillSign_password(String password){
        sign_password.sendKeys(password);
    }

    public void clickSign_button(){
        sign_button.click();
    }

    public void clickLog_in(){
        log_in.click();
    }

    public void fillLog_in_username(String username){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until( e -> log_in_username.isDisplayed());
        log_in_username.sendKeys(username);
    }

    public void fillLog_in_password(String password){
        log_in_password.sendKeys(password);
    }

    public void clickLog_in_button(){
        log_in_button.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until( e -> user_logged.isDisplayed());
    }

    public void clickCategory_monitors(){
        category_monitors.click();
    }

    public void clickMonitor(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until( e -> monitor.isDisplayed());
        monitor.click();
    }
}