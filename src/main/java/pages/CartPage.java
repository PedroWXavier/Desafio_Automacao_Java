package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private final WebDriver driver;


    
    @FindBy(css = "button[data-toggle='modal']")
    public WebElement buttonPlaceOrder;

    @FindBy(css = "#name")
    public WebElement inputName;

    @FindBy(css = "#country")
    public WebElement inputCountry;

    @FindBy(css = "#city")
    public WebElement inputCity;

    @FindBy(css = "#card")
    public WebElement inputCard;

    @FindBy(css = "#month")
    public WebElement inputMonth;

    @FindBy(css = "#year")
    public WebElement inputYear;

    @FindBy(css = "button[onclick='purchaseOrder()']")
    public WebElement buttonPurchase;

    @FindBy(xpath = "//button[@tabindex='1']")
    public WebElement buttonOk;

    @FindBy(xpath = "//*[@id='cartur']")
    public WebElement linkCartur;

    @FindBy(css = "body > div.sweet-alert.showSweetAlert.visible > h2")
    public WebElement purchaseText;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCart(){
        linkCartur.click();
    }
    
    public void clickPlaceOrder() {
        buttonPlaceOrder.click();
    }

    public void sendName(String name){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until( e -> inputName.isDisplayed());
        inputName.sendKeys(name);
    }

    public void sendCountry(String country){
        inputCountry.sendKeys(country);
    }

    public void sendCity(String city){
        inputCity.sendKeys(city);
    }

    public void sendCard(String card){
        inputCard.sendKeys(card);
    }

    public void sendMonth(String month){
        inputMonth.sendKeys(month);
    }

    public void sendYear(String year){
        inputYear.sendKeys(year);
    }

    public void clickPurchase(){
        buttonPurchase.click();
    }

    public void clickOk(){
        buttonOk.click();
    }

    public String getPurchaseText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until( e -> purchaseText.isDisplayed());
        return purchaseText.getText();
    }
}
