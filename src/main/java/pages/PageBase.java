package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {
    public static WebDriver driver;

    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    // Wait for Element to be visible.
    public static boolean waitUntilElementVisiable(WebElement element)
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    // Method to Click Buttons
    protected static void clickButton(WebElement button) {
        button.click();
    }

    // Method to send text
    protected static void setText(WebElement textElement, String value) {
        waitUntilElementVisiable(textElement);
        textElement.clear();
        textElement.sendKeys(value);
    }




    }

