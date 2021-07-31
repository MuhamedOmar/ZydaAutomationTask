package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends PageBase{
    Actions action ;
    public DashboardPage(WebDriver driver) {
        super(driver);
        action = new Actions(driver);

    }


    @FindBy(xpath = "//div[@id=\"center_column\"]/h1")
    private WebElement lblTopTitle;

    @FindBy(xpath = "//a[@title= 'Log me out']")
    private WebElement buttonSignOut;

    @FindBy(css = ".sf-menu > li:nth-child(2) > .sf-with-ul")
    private WebElement buttonDresses;

    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//div[@class='product-container']")
    private WebElement firstDressSection;

    @FindBy(xpath = "//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 last-item-of-tablet-line']")
    private WebElement secondDressSection;


    @FindBy(css = ".ajax_block_product:nth-child(1) .button:nth-child(1) > span")
    private WebElement addFirstDress;

    @FindBy(css = ".ajax_block_product:nth-child(2) .button:nth-child(1) > span")
    private WebElement addSecondDress;


    @FindBy(id = "add_to_cart")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//span[@title='Continue shopping']//span[1]")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//span[normalize-space()='Proceed to checkout']")
    private WebElement proceedToCheckoutButton;



    @FindBy(css = ".standard-checkout > span")
    private WebElement goToAddressTab;

    @FindBy(css = ".button:nth-child(4) > span")
    private WebElement goToShippingTab;


    @FindBy(css = ".standard-checkout > span")
    private WebElement goToPaymentTab;

    @FindBy(xpath = "//input[@id='cgv']")
    private WebElement agreeToTerms;

    @FindBy(css = ".bankwire > span")
    private WebElement payByBankWire;


    @FindBy(css = "#cart_navigation span")
    private WebElement confirmOrder;





    public void selectTwoDreeses(){
        clickButton(buttonDresses);

        waitUntilElementVisiable(firstDressSection);
        action.moveToElement(firstDressSection).perform();
        clickButton(addFirstDress);
        clickButton(continueShoppingButton);
        waitUntilElementVisiable(secondDressSection);
        action.moveToElement(secondDressSection).perform();
        clickButton(addSecondDress);
        clickButton(proceedToCheckoutButton);


    }


    public void confirmOrder() {
        clickButton(goToAddressTab);
        clickButton(goToShippingTab);
        clickButton(agreeToTerms);
        clickButton(goToPaymentTab);
        clickButton(payByBankWire);
        clickButton(confirmOrder);

    }




}
