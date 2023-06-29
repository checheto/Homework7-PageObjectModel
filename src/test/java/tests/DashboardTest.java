package tests;

import components.AdminLeftNavigationBar;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardTest {

    @Test
    public void orderListPresentTest() {
        LoginPage.goToLoginPage();
        LoginPage.writeTextInUsernameInputField("admin");
        LoginPage.writeTextInPasswordInputField("parola123!");
        LoginPage.clickLoginButton();
        DashboardPage.verifyLogoutButtonText("Logout");
        AdminLeftNavigationBar.clickOnSalesElement();
        AdminLeftNavigationBar.clickOnOrdersElement();

    }
}
