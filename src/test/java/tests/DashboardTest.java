package tests;

import components.AdminLeftNavigationBar;
import core.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utils.WaitTool;

public class DashboardTest extends BaseTest {

    @Test
    public void orderListPresentTest() {
        LoginPage.goToLoginPage();
        LoginPage.writeTextInUsernameInputField("admin");
        LoginPage.writeTextInPasswordInputField("parola123!");
        LoginPage.clickLoginButton();
        DashboardPage.verifyLogoutButtonText("Logout");
        AdminLeftNavigationBar.clickOnSalesElement();
        AdminLeftNavigationBar.clickOnOrdersElement();
        AdminLeftNavigationBar.verifyPresentsOfOrderList("Order List");
    }

    @Test
    public void shippedOrdersTest() {
        LoginPage.goToLoginPage();
        LoginPage.writeTextInUsernameInputField("admin");
        LoginPage.writeTextInPasswordInputField("parola123!");
        LoginPage.clickLoginButton();
        DashboardPage.verifyLogoutButtonText("Logout");
        AdminLeftNavigationBar.clickOnSalesElement();
        AdminLeftNavigationBar.clickOnOrdersElement();
        AdminLeftNavigationBar.clickOnOrderStatusDropdown();
        AdminLeftNavigationBar.selectShippedDropdownOption("3");
        AdminLeftNavigationBar.clickOnFilterButton();
        AdminLeftNavigationBar.verifyPresentsOfIdNumber("492");


    }
}
