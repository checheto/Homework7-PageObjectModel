package tests;

import core.BaseTest;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;


public class LoginPageTest extends BaseTest {

    @Test
    public void loginSuccessfullyTest() {
        LoginPage.goToLoginPage();
        LoginPage.writeTextInUsernameInputField("admin");
        LoginPage.writeTextInPasswordInputField("parola123!");
        LoginPage.clickLoginButton();
        DashboardPage.verifyLogoutButtonText("Logout");
    }

}
