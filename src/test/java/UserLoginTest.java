import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;


public class UserLoginTest extends TestBase{
    DashboardPage dashboardPageObj ;
    LoginPage loginPageObj ;
    String loginEmail = "test8ss7.Testing@gmail.com";
    String loginPassword = "test963544";


    @BeforeClass
    public void initPageObject(){
        dashboardPageObj        = new DashboardPage(driver);
        loginPageObj            = new LoginPage(driver);
    }


    @Test(priority = 0 , description = " Sign in with already Registered mail" )
    public void SignInWithRegisteredEmail(){
        loginPageObj.clickOnSignIn();
        loginPageObj.signInWithEmailAndPassword(loginEmail, loginPassword);
    }

    @Test( priority = 1 , description = "Shops two dresses then proceed to checkout and confirm order")
    public void userSelectTwoDressesThenProceedToCheckout(){


        dashboardPageObj.selectTwoDreeses();
        dashboardPageObj.confirmOrder();

    }

}
