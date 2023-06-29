package components;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.DashboardPage;

public class AdminLeftNavigationBar extends BasePage {
    @FindBy(css = "#menu-sale > a")
    private static WebElement salesElement;
    @FindBy(xpath = "//*[@id=\"collapse4\"]/li[1]/a")
    private static WebElement ordersElement;

    static {
        PageFactory.initElements(driver, AdminLeftNavigationBar.class);
    }

    public static void clickOnOrdersElement() {
        clickOnElement(ordersElement);
    }

    public static void clickOnSalesElement() {
        clickOnElement(salesElement);
    }
}
