package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class = 'login']")
    public WebElement buttonSignIn;


    @FindBy(name = "email")
    public WebElement textSignInEmail;

    @FindBy(id = "passwd")
    public WebElement textSignInPassword;

    @FindBy(id = "SubmitLogin")
    public WebElement submitLogin;



    public void clickOnSignIn()
    {
        clickButton(buttonSignIn);
    }

    public void signInWithEmailAndPassword(String signInEmail , String signInPassword){
        setText(textSignInEmail,signInEmail);
        setText(textSignInPassword , signInPassword);
        clickButton(submitLogin);
    }

}
